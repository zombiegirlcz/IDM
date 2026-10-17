package org.jmrtd.protocol;

import j6.a;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.smartcards.APDUWrapper;
import net.sf.scuba.smartcards.CardService;
import net.sf.scuba.smartcards.CardServiceException;
import net.sf.scuba.smartcards.CommandAPDU;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ResponseAPDU;
import net.sf.scuba.util.Hex;
import org.jmrtd.APDULevelReadBinaryCapable;

/* JADX INFO: loaded from: classes14.dex */
public class ReadBinaryAPDUSender implements APDULevelReadBinaryCapable {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd.protocol");
    private SecureMessagingAPDUSender secureMessagingSender;
    private CardService service;

    public ReadBinaryAPDUSender(CardService cardService) {
        this.service = cardService;
        this.secureMessagingSender = new SecureMessagingAPDUSender(cardService);
    }

    private static void checkStatusWordAfterFileOperation(CommandAPDU commandAPDU, ResponseAPDU responseAPDU) throws CardServiceException {
        if (responseAPDU == null) {
            throw new CardServiceException("No response APDU");
        }
        byte[] data = responseAPDU.getData();
        short sw10 = (short) responseAPDU.getSW();
        String str = "CAPDU = " + Hex.bytesToHexString(commandAPDU.getBytes()) + ", RAPDU = " + Hex.bytesToHexString(responseAPDU.getBytes());
        if ((sw10 & ISO7816.SW_WRONG_LENGTH) == 26368 && (data == null || data.length == 0)) {
            throw new CardServiceException(a.q("Wrong length, ", str), sw10);
        }
        if (sw10 != -28672) {
            if (sw10 == 25218) {
                if (data == null || data.length == 0) {
                    throw new CardServiceException(a.q("End of file, ", str), sw10);
                }
            } else {
                if (sw10 != 27010) {
                    if (sw10 == 27266) {
                        throw new CardServiceException(a.q("File not found, ", str), sw10);
                    }
                    if (sw10 != 27013 && sw10 != 27014) {
                        throw new CardServiceException(a.q("Error occured, ", str), sw10);
                    }
                }
                throw new CardServiceException(a.q("Access to file denied, ", str), sw10);
            }
        }
    }

    private static byte[] getResponseData(ResponseAPDU responseAPDU, boolean z) throws CardServiceException {
        if (responseAPDU == null) {
            return null;
        }
        byte[] data = responseAPDU.getData();
        if (data == null) {
            throw new CardServiceException("Malformed read binary long response data");
        }
        if (!z) {
            return data;
        }
        if (data[0] != 83) {
            throw new CardServiceException("Malformed read binary long response data");
        }
        int i = data[1];
        int i2 = (((byte) (i & 128)) == -128 ? (i & 15) + 1 : 1) + 1;
        int length = data.length - i2;
        byte[] bArr = new byte[length];
        System.arraycopy(data, i2, bArr, 0, length);
        return bArr;
    }

    @Override // org.jmrtd.APDULevelReadBinaryCapable
    public synchronized byte[] sendReadBinary(APDUWrapper aPDUWrapper, int i, int i2, int i3, boolean z, boolean z3) throws CardServiceException {
        CommandAPDU commandAPDU;
        int i5;
        int sw10;
        ResponseAPDU responseAPDUTransmit = null;
        if (i3 == 0) {
            return null;
        }
        byte b4 = (byte) ((65280 & i2) >> 8);
        byte b5 = (byte) (i2 & 255);
        try {
            if (z3) {
                int i6 = i3 < 128 ? i3 + 2 : i3 < 256 ? i3 + 3 : i3;
                int i21 = i6 > 256 ? 256 : i6;
                commandAPDU = new CommandAPDU(0, -79, 0, 0, new byte[]{84, 2, b4, b5}, i21);
                i5 = i21;
            } else {
                commandAPDU = z ? new CommandAPDU(0, -80, (byte) i, b5, i3) : new CommandAPDU(0, -80, b4, b5, i3);
                i5 = i3;
            }
            try {
                responseAPDUTransmit = this.secureMessagingSender.transmit(aPDUWrapper, commandAPDU);
                sw10 = responseAPDUTransmit.getSW();
            } catch (CardServiceException e) {
                if (this.service.isConnectionLost(e)) {
                    throw e;
                }
                LOGGER.log(Level.FINE, "Exception during READ BINARY", (Throwable) e);
                sw10 = e.getSW();
            }
            short s2 = (short) sw10;
            byte[] responseData = getResponseData(responseAPDUTransmit, z3);
            if (responseData == null || responseData.length == 0) {
                LOGGER.warning("Empty response data: response APDU bytes = " + Arrays.toString(responseData) + ", le = " + i5 + ", sw = " + Integer.toHexString(s2));
            }
            checkStatusWordAfterFileOperation(commandAPDU, responseAPDUTransmit);
            return responseData;
        } catch (Throwable th10) {
            throw th10;
        }
    }

    @Override // org.jmrtd.APDULevelReadBinaryCapable
    public synchronized void sendSelectApplet(APDUWrapper aPDUWrapper, byte[] bArr) throws CardServiceException {
        if (bArr == null) {
            throw new IllegalArgumentException("AID cannot be null");
        }
        CommandAPDU commandAPDU = new CommandAPDU(0, -92, 4, 12, bArr);
        checkStatusWordAfterFileOperation(commandAPDU, this.secureMessagingSender.transmit(aPDUWrapper, commandAPDU));
    }

    @Override // org.jmrtd.APDULevelReadBinaryCapable
    public synchronized void sendSelectFile(APDUWrapper aPDUWrapper, short s2) throws CardServiceException {
        CommandAPDU commandAPDU = new CommandAPDU(0, -92, 2, 12, new byte[]{(byte) ((s2 >> 8) & 255), (byte) (s2 & 255)}, 0);
        ResponseAPDU responseAPDUTransmit = this.secureMessagingSender.transmit(aPDUWrapper, commandAPDU);
        if (responseAPDUTransmit == null) {
            return;
        }
        checkStatusWordAfterFileOperation(commandAPDU, responseAPDUTransmit);
    }

    @Override // org.jmrtd.APDULevelReadBinaryCapable
    public synchronized void sendSelectMF() throws CardServiceException {
        CommandAPDU commandAPDU = new CommandAPDU(0, -92, 0, 12, new byte[]{63, 0});
        checkStatusWordAfterFileOperation(commandAPDU, this.secureMessagingSender.transmit(null, commandAPDU));
    }
}
