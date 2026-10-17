package org.bouncycastle.pqc.crypto.mlkem;

import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
class CBD {
    public static void eta2(Poly poly, byte[] bArr) {
        for (int i = 0; i < 32; i++) {
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i * 4);
            int i2 = (iLittleEndianToInt & 1431655765) + ((iLittleEndianToInt >>> 1) & 1431655765);
            for (int i3 = 0; i3 < 8; i3++) {
                int i5 = i3 * 4;
                poly.setCoeffIndex((i * 8) + i3, (short) (((short) ((i2 >>> i5) & 3)) - ((short) ((i2 >>> (i5 + 2)) & 3))));
            }
        }
    }

    public static void eta3(Poly poly, byte[] bArr) {
        for (int i = 0; i < 64; i++) {
            int iLittleEndianToInt24 = Pack.littleEndianToInt24(bArr, i * 3);
            int i2 = (iLittleEndianToInt24 & 2396745) + ((iLittleEndianToInt24 >>> 1) & 2396745) + ((iLittleEndianToInt24 >>> 2) & 2396745);
            for (int i3 = 0; i3 < 4; i3++) {
                int i5 = i3 * 6;
                poly.setCoeffIndex((i * 4) + i3, (short) (((short) ((i2 >>> i5) & 7)) - ((short) ((i2 >>> (i5 + 3)) & 7))));
            }
        }
    }
}
