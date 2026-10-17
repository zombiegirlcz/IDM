package org.bouncycastle.pqc.crypto.saber;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes14.dex */
class Utils {
    private final int SABER_EP;
    private final int SABER_ET;
    private final int SABER_KEYBYTES;
    private final int SABER_L;
    private final int SABER_N;
    private final int SABER_POLYBYTES;
    private final boolean usingEffectiveMasking;

    public Utils(SABEREngine sABEREngine) {
        this.SABER_N = sABEREngine.getSABER_N();
        this.SABER_L = sABEREngine.getSABER_L();
        this.SABER_ET = sABEREngine.getSABER_ET();
        this.SABER_POLYBYTES = sABEREngine.getSABER_POLYBYTES();
        this.SABER_EP = sABEREngine.getSABER_EP();
        this.SABER_KEYBYTES = sABEREngine.getSABER_KEYBYTES();
        this.usingEffectiveMasking = sABEREngine.usingEffectiveMasking;
    }

    private void BS2POLq(byte[] bArr, int i, short[] sArr) {
        short s2 = 0;
        if (this.usingEffectiveMasking) {
            while (s2 < this.SABER_N / 2) {
                short s3 = (short) (s2 * 2);
                int i2 = ((short) (s2 * 3)) + i;
                int i3 = bArr[i2] & UnsignedBytes.MAX_VALUE;
                byte b4 = bArr[i2 + 1];
                sArr[s3] = (short) (i3 | ((b4 & 15) << 8));
                sArr[s3 + 1] = (short) (((bArr[i2 + 2] & UnsignedBytes.MAX_VALUE) << 4) | ((b4 >> 4) & 15));
                s2 = (short) (s2 + 1);
            }
            return;
        }
        while (s2 < this.SABER_N / 8) {
            short s4 = (short) (s2 * 8);
            int i5 = ((short) (s2 * 13)) + i;
            int i6 = bArr[i5] & UnsignedBytes.MAX_VALUE;
            byte b5 = bArr[i5 + 1];
            sArr[s4] = (short) (i6 | ((b5 & Ascii.US) << 8));
            int i21 = ((b5 >> 5) & 7) | ((bArr[i5 + 2] & UnsignedBytes.MAX_VALUE) << 3);
            byte b7 = bArr[i5 + 3];
            sArr[s4 + 1] = (short) (i21 | ((b7 & 3) << 11));
            int i22 = (b7 >> 2) & 63;
            byte b13 = bArr[i5 + 4];
            sArr[s4 + 2] = (short) (i22 | ((b13 & Ascii.DEL) << 6));
            int i32 = ((b13 >> 7) & 1) | ((bArr[i5 + 5] & UnsignedBytes.MAX_VALUE) << 1);
            byte b15 = bArr[i5 + 6];
            sArr[s4 + 3] = (short) (i32 | ((b15 & 15) << 9));
            int i33 = ((b15 >> 4) & 15) | ((bArr[i5 + 7] & UnsignedBytes.MAX_VALUE) << 4);
            byte b17 = bArr[i5 + 8];
            sArr[s4 + 4] = (short) (i33 | ((b17 & 1) << 12));
            int i43 = (b17 >> 1) & CertificateBody.profileType;
            byte b40 = bArr[i5 + 9];
            sArr[s4 + 5] = (short) (i43 | ((b40 & 63) << 7));
            int i59 = ((b40 >> 6) & 3) | ((bArr[i5 + 10] & UnsignedBytes.MAX_VALUE) << 2);
            byte b61 = bArr[i5 + 11];
            sArr[s4 + 6] = (short) (i59 | ((b61 & 7) << 10));
            sArr[s4 + 7] = (short) (((bArr[i5 + 12] & UnsignedBytes.MAX_VALUE) << 5) | ((b61 >> 3) & 31));
            s2 = (short) (s2 + 1);
        }
    }

    private void POLp2BS(byte[] bArr, int i, short[] sArr) {
        for (short s2 = 0; s2 < this.SABER_N / 4; s2 = (short) (s2 + 1)) {
            short s3 = (short) (s2 * 4);
            int i2 = ((short) (s2 * 5)) + i;
            short s4 = sArr[s3];
            bArr[i2] = (byte) (s4 & 255);
            short s6 = sArr[s3 + 1];
            bArr[i2 + 1] = (byte) (((s4 >> 8) & 3) | ((s6 & 63) << 2));
            int i3 = (s6 >> 6) & 15;
            short s11 = sArr[s3 + 2];
            bArr[i2 + 2] = (byte) (i3 | ((s11 & 15) << 4));
            short s27 = sArr[s3 + 3];
            bArr[i2 + 3] = (byte) (((s11 >> 4) & 63) | ((s27 & 3) << 6));
            bArr[i2 + 4] = (byte) ((s27 >> 2) & 255);
        }
    }

    private void POLq2BS(byte[] bArr, int i, short[] sArr) {
        short s2 = 0;
        if (this.usingEffectiveMasking) {
            while (s2 < this.SABER_N / 2) {
                short s3 = (short) (s2 * 2);
                int i2 = ((short) (s2 * 3)) + i;
                short s4 = sArr[s3];
                bArr[i2] = (byte) (s4 & 255);
                short s6 = sArr[s3 + 1];
                bArr[i2 + 1] = (byte) (((s4 >> 8) & 15) | ((s6 & 15) << 4));
                bArr[i2 + 2] = (byte) ((s6 >> 4) & 255);
                s2 = (short) (s2 + 1);
            }
            return;
        }
        while (s2 < this.SABER_N / 8) {
            short s11 = (short) (s2 * 8);
            int i3 = ((short) (s2 * 13)) + i;
            short s27 = sArr[s11];
            bArr[i3] = (byte) (s27 & 255);
            short s37 = sArr[s11 + 1];
            bArr[i3 + 1] = (byte) (((s27 >> 8) & 31) | ((s37 & 7) << 5));
            bArr[i3 + 2] = (byte) ((s37 >> 3) & 255);
            int i5 = (s37 >> 11) & 3;
            short s51 = sArr[s11 + 2];
            bArr[i3 + 3] = (byte) (i5 | ((s51 & 63) << 2));
            int i6 = (s51 >> 6) & CertificateBody.profileType;
            short s60 = sArr[s11 + 3];
            bArr[i3 + 4] = (byte) (i6 | ((s60 & 1) << 7));
            bArr[i3 + 5] = (byte) ((s60 >> 1) & 255);
            int i21 = (s60 >> 9) & 15;
            short s61 = sArr[s11 + 4];
            bArr[i3 + 6] = (byte) (i21 | ((s61 & 15) << 4));
            bArr[i3 + 7] = (byte) ((s61 >> 4) & 255);
            int i22 = (s61 >> 12) & 1;
            short s67 = sArr[s11 + 5];
            bArr[i3 + 8] = (byte) (i22 | ((s67 & 127) << 1));
            int i32 = (s67 >> 7) & 63;
            short s73 = sArr[s11 + 6];
            bArr[i3 + 9] = (byte) (i32 | ((s73 & 3) << 6));
            bArr[i3 + 10] = (byte) ((s73 >> 2) & 255);
            short s100 = sArr[s11 + 7];
            bArr[i3 + 11] = (byte) (((s73 >> 10) & 7) | ((s100 & 31) << 3));
            bArr[i3 + 12] = (byte) ((s100 >> 5) & 255);
            s2 = (short) (s2 + 1);
        }
    }

    public void BS2POLT(byte[] bArr, int i, short[] sArr) {
        int i2 = this.SABER_ET;
        short s2 = 0;
        if (i2 == 3) {
            while (s2 < this.SABER_N / 8) {
                short s3 = (short) (s2 * 8);
                int i3 = ((short) (s2 * 3)) + i;
                byte b4 = bArr[i3];
                sArr[s3] = (short) (b4 & 7);
                sArr[s3 + 1] = (short) ((b4 >> 3) & 7);
                byte b5 = bArr[i3 + 1];
                sArr[s3 + 2] = (short) (((b4 >> 6) & 3) | ((b5 & 1) << 2));
                sArr[s3 + 3] = (short) ((b5 >> 1) & 7);
                sArr[s3 + 4] = (short) ((b5 >> 4) & 7);
                byte b7 = bArr[i3 + 2];
                sArr[s3 + 5] = (short) (((b5 >> 7) & 1) | ((b7 & 3) << 1));
                sArr[s3 + 6] = (short) ((b7 >> 2) & 7);
                sArr[s3 + 7] = (short) ((b7 >> 5) & 7);
                s2 = (short) (s2 + 1);
            }
            return;
        }
        if (i2 == 4) {
            while (s2 < this.SABER_N / 2) {
                short s4 = (short) (s2 * 2);
                byte b13 = bArr[i + s2];
                sArr[s4] = (short) (b13 & 15);
                sArr[s4 + 1] = (short) ((b13 >> 4) & 15);
                s2 = (short) (s2 + 1);
            }
            return;
        }
        if (i2 == 6) {
            while (s2 < this.SABER_N / 4) {
                short s6 = (short) (s2 * 4);
                int i5 = ((short) (s2 * 3)) + i;
                byte b15 = bArr[i5];
                sArr[s6] = (short) (b15 & 63);
                byte b17 = bArr[i5 + 1];
                sArr[s6 + 1] = (short) (((b15 >> 6) & 3) | ((b17 & 15) << 2));
                int i6 = (b17 & UnsignedBytes.MAX_VALUE) >> 4;
                byte b40 = bArr[i5 + 2];
                sArr[s6 + 2] = (short) (i6 | ((b40 & 3) << 4));
                sArr[s6 + 3] = (short) ((b40 & UnsignedBytes.MAX_VALUE) >> 2);
                s2 = (short) (s2 + 1);
            }
        }
    }

    public void BS2POLVECp(byte[] bArr, short[][] sArr) {
        for (byte b4 = 0; b4 < this.SABER_L; b4 = (byte) (b4 + 1)) {
            BS2POLp(bArr, ((this.SABER_EP * this.SABER_N) / 8) * b4, sArr[b4]);
        }
    }

    public void BS2POLVECq(byte[] bArr, int i, short[][] sArr) {
        for (byte b4 = 0; b4 < this.SABER_L; b4 = (byte) (b4 + 1)) {
            BS2POLq(bArr, (this.SABER_POLYBYTES * b4) + i, sArr[b4]);
        }
    }

    public void BS2POLmsg(byte[] bArr, short[] sArr) {
        for (byte b4 = 0; b4 < this.SABER_KEYBYTES; b4 = (byte) (b4 + 1)) {
            for (byte b5 = 0; b5 < 8; b5 = (byte) (b5 + 1)) {
                sArr[(b4 * 8) + b5] = (short) ((bArr[b4] >> b5) & 1);
            }
        }
    }

    public void BS2POLp(byte[] bArr, int i, short[] sArr) {
        for (short s2 = 0; s2 < this.SABER_N / 4; s2 = (short) (s2 + 1)) {
            short s3 = (short) (s2 * 4);
            int i2 = ((short) (s2 * 5)) + i;
            int i3 = bArr[i2] & UnsignedBytes.MAX_VALUE;
            byte b4 = bArr[i2 + 1];
            sArr[s3] = (short) (i3 | ((b4 & 3) << 8));
            byte b5 = bArr[i2 + 2];
            sArr[s3 + 1] = (short) (((b4 >> 2) & 63) | ((b5 & 15) << 6));
            int i5 = (b5 >> 4) & 15;
            byte b7 = bArr[i2 + 3];
            sArr[s3 + 2] = (short) (i5 | ((b7 & 63) << 4));
            sArr[s3 + 3] = (short) (((bArr[i2 + 4] & UnsignedBytes.MAX_VALUE) << 2) | ((b7 >> 6) & 3));
        }
    }

    public void POLT2BS(byte[] bArr, int i, short[] sArr) {
        int i2 = this.SABER_ET;
        short s2 = 0;
        if (i2 == 3) {
            while (s2 < this.SABER_N / 8) {
                short s3 = (short) (s2 * 8);
                int i3 = ((short) (s2 * 3)) + i;
                int i5 = (sArr[s3] & 7) | ((sArr[s3 + 1] & 7) << 3);
                short s4 = sArr[s3 + 2];
                bArr[i3] = (byte) (i5 | ((s4 & 3) << 6));
                int i6 = ((s4 >> 2) & 1) | ((sArr[s3 + 3] & 7) << 1) | ((sArr[s3 + 4] & 7) << 4);
                short s6 = sArr[s3 + 5];
                bArr[i3 + 1] = (byte) (i6 | ((s6 & 1) << 7));
                bArr[i3 + 2] = (byte) (((sArr[s3 + 7] & 7) << 5) | ((s6 >> 1) & 3) | ((sArr[s3 + 6] & 7) << 2));
                s2 = (short) (s2 + 1);
            }
            return;
        }
        if (i2 == 4) {
            while (s2 < this.SABER_N / 2) {
                short s11 = (short) (s2 * 2);
                bArr[i + s2] = (byte) (((sArr[s11 + 1] & 15) << 4) | (sArr[s11] & 15));
                s2 = (short) (s2 + 1);
            }
            return;
        }
        if (i2 == 6) {
            while (s2 < this.SABER_N / 4) {
                short s27 = (short) (s2 * 4);
                int i21 = ((short) (s2 * 3)) + i;
                int i22 = sArr[s27] & 63;
                short s37 = sArr[s27 + 1];
                bArr[i21] = (byte) (i22 | ((s37 & 3) << 6));
                short s51 = sArr[s27 + 2];
                bArr[i21 + 1] = (byte) (((s37 >> 2) & 15) | ((s51 & 15) << 4));
                bArr[i21 + 2] = (byte) (((sArr[s27 + 3] & 63) << 2) | ((s51 >> 4) & 3));
                s2 = (short) (s2 + 1);
            }
        }
    }

    public void POLVECp2BS(byte[] bArr, short[][] sArr) {
        for (byte b4 = 0; b4 < this.SABER_L; b4 = (byte) (b4 + 1)) {
            POLp2BS(bArr, ((this.SABER_EP * this.SABER_N) / 8) * b4, sArr[b4]);
        }
    }

    public void POLVECq2BS(byte[] bArr, short[][] sArr) {
        for (byte b4 = 0; b4 < this.SABER_L; b4 = (byte) (b4 + 1)) {
            POLq2BS(bArr, this.SABER_POLYBYTES * b4, sArr[b4]);
        }
    }

    public void POLmsg2BS(byte[] bArr, short[] sArr) {
        for (byte b4 = 0; b4 < this.SABER_KEYBYTES; b4 = (byte) (b4 + 1)) {
            for (byte b5 = 0; b5 < 8; b5 = (byte) (b5 + 1)) {
                bArr[b4] = (byte) (bArr[b4] | ((sArr[(b4 * 8) + b5] & 1) << b5));
            }
        }
    }
}
