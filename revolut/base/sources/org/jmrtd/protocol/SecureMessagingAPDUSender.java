package org.jmrtd.protocol;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.smartcards.APDUEvent;
import net.sf.scuba.smartcards.APDUListener;
import net.sf.scuba.smartcards.APDUWrapper;
import net.sf.scuba.smartcards.CardService;
import net.sf.scuba.smartcards.CardServiceException;
import net.sf.scuba.smartcards.CommandAPDU;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ResponseAPDU;
import net.sf.scuba.util.Hex;
import org.jmrtd.Util;
import org.jmrtd.WrappedAPDUEvent;

/* JADX INFO: loaded from: classes14.dex */
public class SecureMessagingAPDUSender {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd.protocol");
    private int apduCount = 0;
    private CardService service;

    public SecureMessagingAPDUSender(CardService cardService) {
        this.service = cardService;
    }

    private byte[] continueSendingUsingResponseChaining(APDUWrapper aPDUWrapper, short s2, byte[] bArr) throws CardServiceException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            if ((65280 & s2) != 24832) {
                break;
            }
            try {
                try {
                    byteArrayOutputStream.write(bArr);
                    int i = s2 & 255;
                    if (i <= 0) {
                        break;
                    }
                    ResponseAPDU responseAPDUTransmit = transmit(aPDUWrapper, new CommandAPDU(0, -64, 0, 0, i));
                    byte[] data = responseAPDUTransmit.getData();
                    s2 = (short) responseAPDUTransmit.getSW();
                    bArr = data;
                } catch (IOException e) {
                    throw new CardServiceException("Could not write to stream", e, s2);
                }
            } finally {
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException e2) {
            LOGGER.log(Level.FINE, "Error closing stream", (Throwable) e2);
            return byteArray;
        }
    }

    private List<ResponseAPDU> sendUsingCommandChaining(CommandAPDU commandAPDU, int i) throws CardServiceException {
        List<byte[]> listPartition = Util.partition(i, commandAPDU.getData());
        ArrayList arrayList = new ArrayList(listPartition.size());
        int i2 = 0;
        for (byte[] bArr : listPartition) {
            i2++;
            boolean z = i2 >= listPartition.size();
            int cla2 = commandAPDU.getCLA();
            if (!z) {
                cla2 |= 16;
            }
            arrayList.add(this.service.transmit(new CommandAPDU(cla2, commandAPDU.getINS(), commandAPDU.getP1(), commandAPDU.getP2(), bArr, commandAPDU.getNe())));
        }
        return arrayList;
    }

    public void addAPDUListener(APDUListener aPDUListener) {
        this.service.addAPDUListener(aPDUListener);
    }

    public boolean isExtendedAPDULengthSupported() {
        return this.service.isExtendedAPDULengthSupported();
    }

    public void notifyExchangedAPDU(APDUEvent aPDUEvent) {
        Collection<APDUListener> aPDUListeners = this.service.getAPDUListeners();
        if (aPDUListeners == null || aPDUListeners.isEmpty()) {
            return;
        }
        Iterator<APDUListener> it8 = aPDUListeners.iterator();
        while (it8.hasNext()) {
            it8.next().exchangedAPDU(aPDUEvent);
        }
    }

    public void removeAPDUListener(APDUListener aPDUListener) {
        this.service.removeAPDUListener(aPDUListener);
    }

    public ResponseAPDU transmit(APDUWrapper aPDUWrapper, CommandAPDU commandAPDU) throws Throwable {
        CommandAPDU commandAPDUWrap = aPDUWrapper != null ? aPDUWrapper.wrap(commandAPDU) : commandAPDU;
        ResponseAPDU responseAPDUTransmit = this.service.transmit(commandAPDUWrap);
        short sw10 = (short) responseAPDUTransmit.getSW();
        if (aPDUWrapper == null) {
            int i = this.apduCount + 1;
            this.apduCount = i;
            notifyExchangedAPDU(new APDUEvent(this, "PLAIN", i, commandAPDUWrap, responseAPDUTransmit));
            return responseAPDUTransmit;
        }
        if ((sw10 & ISO7816.SW_WRONG_LENGTH) == 26368) {
            String type = aPDUWrapper.getType();
            int i2 = this.apduCount + 1;
            this.apduCount = i2;
            notifyExchangedAPDU(new WrappedAPDUEvent(this, type, i2, commandAPDU, responseAPDUTransmit, commandAPDUWrap, responseAPDUTransmit));
            return responseAPDUTransmit;
        }
        try {
            try {
                if (responseAPDUTransmit.getBytes().length <= 2) {
                    throw new CardServiceException("Exception during transmission of wrapped APDU, C=" + Hex.bytesToHexString(commandAPDU.getBytes()), sw10);
                }
                try {
                    ResponseAPDU responseAPDUUnwrap = aPDUWrapper.unwrap(responseAPDUTransmit);
                    String type2 = aPDUWrapper.getType();
                    int i3 = this.apduCount + 1;
                    this.apduCount = i3;
                    notifyExchangedAPDU(new WrappedAPDUEvent(this, type2, i3, commandAPDU, responseAPDUUnwrap, commandAPDUWrap, responseAPDUTransmit));
                    return responseAPDUUnwrap;
                } catch (CardServiceException e) {
                    e = e;
                } catch (Exception e2) {
                    e = e2;
                    throw new CardServiceException("Exception during transmission of wrapped APDU, C=" + Hex.bytesToHexString(commandAPDU.getBytes()), e, sw10);
                } catch (Throwable th10) {
                    th = th10;
                    responseAPDUTransmit = responseAPDUTransmit;
                    Throwable th11 = th;
                    String type3 = aPDUWrapper.getType();
                    int i5 = this.apduCount + 1;
                    this.apduCount = i5;
                    notifyExchangedAPDU(new WrappedAPDUEvent(this, type3, i5, commandAPDU, responseAPDUTransmit, commandAPDUWrap, responseAPDUTransmit));
                    throw th11;
                }
            } catch (Throwable th12) {
                th = th12;
            }
        } catch (CardServiceException e4) {
            e = e4;
        } catch (Exception e5) {
            e = e5;
        }
        throw e;
    }
}
