/*
 * Copyright © 2004-2025 L2J Server
 * 
 * This file is part of L2J Server.
 * 
 * L2J Server is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * L2J Server is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.l2jserver.loginserver.network.loginserverpackets;

import com.l2jserver.commons.network.BaseSendablePacket;

/**
 * Initialize Login Server packet.
 * 
 * <pre>
 * C ID 0x00
 * D key size
 * B key
 * </pre>
 * 
 * @author -Wooden-
 * @author Zoey76
 * @version 2.6.1.0
 */
public class InitLS extends BaseSendablePacket {
	
	public InitLS(byte[] publicKey) {
		writeC(0x00);
		writeD(publicKey.length);
		writeB(publicKey);
	}
	
	@Override
	public byte[] getContent() {
		return getBytes();
	}
}
