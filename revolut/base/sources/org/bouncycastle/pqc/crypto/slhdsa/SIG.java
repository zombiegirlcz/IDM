package org.bouncycastle.pqc.crypto.slhdsa;

/* JADX INFO: loaded from: classes14.dex */
class SIG {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final byte[] f228865r;
    private final SIG_FORS[] sig_fors;
    private final SIG_XMSS[] sig_ht;

    public SIG(int i, int i2, int i3, int i5, int i6, int i21, byte[] bArr) {
        byte[] bArr2 = new byte[i];
        this.f228865r = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
        this.sig_fors = new SIG_FORS[i2];
        int i22 = i;
        for (int i32 = 0; i32 != i2; i32++) {
            byte[] bArr3 = new byte[i];
            System.arraycopy(bArr, i22, bArr3, 0, i);
            i22 += i;
            byte[][] bArr4 = new byte[i3][];
            for (int i33 = 0; i33 != i3; i33++) {
                byte[] bArr5 = new byte[i];
                bArr4[i33] = bArr5;
                System.arraycopy(bArr, i22, bArr5, 0, i);
                i22 += i;
            }
            this.sig_fors[i32] = new SIG_FORS(bArr3, bArr4);
        }
        this.sig_ht = new SIG_XMSS[i5];
        for (int i43 = 0; i43 != i5; i43++) {
            int i59 = i21 * i;
            byte[] bArr6 = new byte[i59];
            System.arraycopy(bArr, i22, bArr6, 0, i59);
            i22 += i59;
            byte[][] bArr7 = new byte[i6][];
            for (int i66 = 0; i66 != i6; i66++) {
                byte[] bArr8 = new byte[i];
                bArr7[i66] = bArr8;
                System.arraycopy(bArr, i22, bArr8, 0, i);
                i22 += i;
            }
            this.sig_ht[i43] = new SIG_XMSS(bArr6, bArr7);
        }
        if (i22 != bArr.length) {
            throw new IllegalArgumentException("signature wrong length");
        }
    }

    public byte[] getR() {
        return this.f228865r;
    }

    public SIG_FORS[] getSIG_FORS() {
        return this.sig_fors;
    }

    public SIG_XMSS[] getSIG_HT() {
        return this.sig_ht;
    }
}
