package org.jmrtd.protocol;

import com.youTransactor.uCube.rpc.Constants;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.smartcards.APDUWrapper;
import net.sf.scuba.smartcards.CardService;
import net.sf.scuba.smartcards.CardServiceException;
import net.sf.scuba.smartcards.CommandAPDU;
import net.sf.scuba.smartcards.ResponseAPDU;
import net.sf.scuba.tlv.TLVUtil;
import org.jmrtd.APDULevelEACCACapable;

/* JADX INFO: loaded from: classes14.dex */
public class EACCAAPDUSender implements APDULevelEACCACapable {
    private static final byte INS_BSI_GENERAL_AUTHENTICATE = -122;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd.protocol");
    private SecureMessagingAPDUSender secureMessagingSender;

    public EACCAAPDUSender(CardService cardService) {
        this.secureMessagingSender = new SecureMessagingAPDUSender(cardService);
    }

    @Override // org.jmrtd.APDULevelEACCACapable
    public synchronized byte[] sendGeneralAuthenticate(APDUWrapper aPDUWrapper, byte[] bArr, boolean z) throws CardServiceException {
        return sendGeneralAuthenticate(aPDUWrapper, bArr, 256, z);
    }

    @Override // org.jmrtd.APDULevelEACCACapable
    public synchronized void sendMSEKAT(APDUWrapper aPDUWrapper, byte[] bArr, byte[] bArr2) throws CardServiceException {
        try {
            byte[] bArr3 = new byte[bArr.length + (bArr2 != null ? bArr2.length : 0)];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            if (bArr2 != null) {
                System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
            }
            short sw10 = (short) this.secureMessagingSender.transmit(aPDUWrapper, new CommandAPDU(0, 34, 65, Constants.TAG_PAYMENT_APP_CLESS_VERSION, bArr3)).getSW();
            if (sw10 != -28672) {
                throw new CardServiceException("Sending MSE KAT failed", sw10);
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0007, B:8:0x0010, B:9:0x0023, B:16:0x003b, B:26:0x006f, B:27:0x0076, B:20:0x0064, B:15:0x0032, B:17:0x004e), top: B:32:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f A[Catch: all -> 0x002d, TRY_ENTER, TryCatch #1 {, blocks: (B:5:0x0007, B:8:0x0010, B:9:0x0023, B:16:0x003b, B:26:0x006f, B:27:0x0076, B:20:0x0064, B:15:0x0032, B:17:0x004e), top: B:32:0x0007, inners: #0 }] */
    @Override // org.jmrtd.APDULevelEACCACapable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void sendMSESetATIntAuth(net.sf.scuba.smartcards.APDUWrapper r7, java.lang.String r8, java.math.BigInteger r9) throws net.sf.scuba.smartcards.CardServiceException {
        /*
            r6 = this;
            monitor-enter(r6)
            r3 = 65
            r4 = 164(0xa4, float:2.3E-43)
            if (r9 == 0) goto L4e
            java.math.BigInteger r0 = java.math.BigInteger.ZERO     // Catch: java.lang.Throwable -> L2d
            int r0 = r9.compareTo(r0)     // Catch: java.lang.Throwable -> L2d
            if (r0 >= 0) goto L10
            goto L4e
        L10:
            byte[] r8 = org.jmrtd.Util.toOIDBytes(r8)     // Catch: java.lang.Throwable -> L2d
            byte[] r9 = org.jmrtd.Util.i2os(r9)     // Catch: java.lang.Throwable -> L2d
            r0 = 132(0x84, float:1.85E-43)
            byte[] r9 = net.sf.scuba.tlv.TLVUtil.wrapDO(r0, r9)     // Catch: java.lang.Throwable -> L2d
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L2d
            r1.<init>()     // Catch: java.lang.Throwable -> L2d
            r1.write(r8)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            r1.write(r9)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            r1.close()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            goto L3b
        L2d:
            r0 = move-exception
            r7 = r0
            goto L77
        L30:
            r0 = move-exception
            r8 = r0
            java.util.logging.Logger r9 = org.jmrtd.protocol.EACCAAPDUSender.LOGGER     // Catch: java.lang.Throwable -> L2d
            java.util.logging.Level r0 = java.util.logging.Level.WARNING     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = "Exception"
            r9.log(r0, r2, r8)     // Catch: java.lang.Throwable -> L2d
        L3b:
            net.sf.scuba.smartcards.CommandAPDU r0 = new net.sf.scuba.smartcards.CommandAPDU     // Catch: java.lang.Throwable -> L2d
            byte[] r5 = r1.toByteArray()     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            r2 = 34
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L2d
            org.jmrtd.protocol.SecureMessagingAPDUSender r8 = r6.secureMessagingSender     // Catch: java.lang.Throwable -> L2d
            net.sf.scuba.smartcards.ResponseAPDU r7 = r8.transmit(r7, r0)     // Catch: java.lang.Throwable -> L2d
            goto L60
        L4e:
            net.sf.scuba.smartcards.CommandAPDU r0 = new net.sf.scuba.smartcards.CommandAPDU     // Catch: java.lang.Throwable -> L2d
            byte[] r5 = org.jmrtd.Util.toOIDBytes(r8)     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            r2 = 34
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L2d
            org.jmrtd.protocol.SecureMessagingAPDUSender r8 = r6.secureMessagingSender     // Catch: java.lang.Throwable -> L2d
            net.sf.scuba.smartcards.ResponseAPDU r7 = r8.transmit(r7, r0)     // Catch: java.lang.Throwable -> L2d
        L60:
            if (r7 != 0) goto L64
            r7 = -1
            goto L69
        L64:
            int r7 = r7.getSW()     // Catch: java.lang.Throwable -> L2d
            short r7 = (short) r7
        L69:
            r8 = -28672(0xffffffffffff9000, float:NaN)
            if (r7 != r8) goto L6f
            monitor-exit(r6)
            return
        L6f:
            net.sf.scuba.smartcards.CardServiceException r8 = new net.sf.scuba.smartcards.CardServiceException     // Catch: java.lang.Throwable -> L2d
            java.lang.String r9 = "Sending MSE AT failed"
            r8.<init>(r9, r7)     // Catch: java.lang.Throwable -> L2d
            throw r8     // Catch: java.lang.Throwable -> L2d
        L77:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2d
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.protocol.EACCAAPDUSender.sendMSESetATIntAuth(net.sf.scuba.smartcards.APDUWrapper, java.lang.String, java.math.BigInteger):void");
    }

    public synchronized byte[] sendGeneralAuthenticate(APDUWrapper aPDUWrapper, byte[] bArr, int i, boolean z) throws CardServiceException {
        byte[] data;
        try {
            byte[] bArrWrapDO = TLVUtil.wrapDO(124, bArr);
            ResponseAPDU responseAPDUTransmit = this.secureMessagingSender.transmit(aPDUWrapper, new CommandAPDU(z ? 0 : 16, -122, 0, 0, bArrWrapDO, i));
            short sw10 = (short) responseAPDUTransmit.getSW();
            if (sw10 == 26368) {
                responseAPDUTransmit = this.secureMessagingSender.transmit(aPDUWrapper, new CommandAPDU(z ? 0 : 16, -122, 0, 0, bArrWrapDO, 256));
            }
            if (sw10 != -28672) {
                throw new CardServiceException("Sending general authenticate failed", sw10);
            }
            data = responseAPDUTransmit.getData();
            try {
                data = TLVUtil.unwrapDO(124, data);
            } catch (Exception e) {
                LOGGER.log(Level.WARNING, "Could not unwrap response to GENERAL AUTHENTICATE", (Throwable) e);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return data;
    }
}
