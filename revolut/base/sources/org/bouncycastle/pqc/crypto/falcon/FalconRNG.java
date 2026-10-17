package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
class FalconRNG {

    /* JADX INFO: renamed from: bd, reason: collision with root package name */
    byte[] f228794bd = new byte[512];
    int ptr = 0;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    byte[] f228795sd = new byte[256];

    private void QROUND(int i, int i2, int i3, int i5, int[] iArr) {
        int i6 = iArr[i] + iArr[i2];
        iArr[i] = i6;
        int i21 = i6 ^ iArr[i5];
        iArr[i5] = i21;
        int i22 = (i21 >>> 16) | (i21 << 16);
        iArr[i5] = i22;
        int i32 = iArr[i3] + i22;
        iArr[i3] = i32;
        int i33 = iArr[i2] ^ i32;
        iArr[i2] = i33;
        int i43 = (i33 >>> 20) | (i33 << 12);
        iArr[i2] = i43;
        int i59 = iArr[i] + i43;
        iArr[i] = i59;
        int i66 = iArr[i5] ^ i59;
        iArr[i5] = i66;
        int i74 = (i66 >>> 24) | (i66 << 8);
        iArr[i5] = i74;
        int i92 = iArr[i3] + i74;
        iArr[i3] = i92;
        int i96 = iArr[i2] ^ i92;
        iArr[i2] = i96;
        iArr[i2] = (i96 >>> 25) | (i96 << 7);
    }

    public long prng_get_u64() {
        int i = this.ptr;
        if (i >= this.f228794bd.length - 9) {
            prng_refill();
            i = 0;
        }
        this.ptr = i + 8;
        return Pack.littleEndianToLong(this.f228794bd, i);
    }

    public byte prng_get_u8() {
        byte[] bArr = this.f228794bd;
        int i = this.ptr;
        int i2 = i + 1;
        this.ptr = i2;
        byte b4 = bArr[i];
        if (i2 == bArr.length) {
            prng_refill();
        }
        return b4;
    }

    public void prng_init(SHAKEDigest sHAKEDigest) {
        sHAKEDigest.doOutput(this.f228795sd, 0, 56);
        prng_refill();
    }

    public void prng_refill() {
        FalconRNG falconRNG = this;
        int[] iArr = {1634760805, 857760878, 2036477234, 1797285236};
        int[] iArr2 = new int[16];
        long jLittleEndianToLong = Pack.littleEndianToLong(falconRNG.f228795sd, 48);
        for (int i = 0; i < 8; i++) {
            System.arraycopy(iArr, 0, iArr2, 0, 4);
            Pack.littleEndianToInt(falconRNG.f228795sd, 0, iArr2, 4, 12);
            int i2 = (int) jLittleEndianToLong;
            iArr2[14] = iArr2[14] ^ i2;
            int i3 = (int) (jLittleEndianToLong >>> 32);
            iArr2[15] = iArr2[15] ^ i3;
            int i5 = 0;
            while (i5 < 10) {
                falconRNG.QROUND(0, 4, 8, 12, iArr2);
                falconRNG = this;
                falconRNG.QROUND(1, 5, 9, 13, iArr2);
                falconRNG.QROUND(2, 6, 10, 14, iArr2);
                falconRNG.QROUND(3, 7, 11, 15, iArr2);
                falconRNG.QROUND(0, 5, 10, 15, iArr2);
                falconRNG.QROUND(1, 6, 11, 12, iArr2);
                falconRNG.QROUND(2, 7, 8, 13, iArr2);
                falconRNG.QROUND(3, 4, 9, 14, iArr2);
                i5++;
                i3 = i3;
            }
            int i6 = i3;
            for (int i21 = 0; i21 < 4; i21++) {
                iArr2[i21] = iArr2[i21] + iArr[i21];
            }
            for (int i22 = 4; i22 < 14; i22++) {
                iArr2[i22] = Pack.littleEndianToInt(falconRNG.f228795sd, (i22 * 4) - 16) + iArr2[i22];
            }
            iArr2[14] = iArr2[14] + (Pack.littleEndianToInt(falconRNG.f228795sd, 40) ^ i2);
            iArr2[15] = iArr2[15] + (Pack.littleEndianToInt(falconRNG.f228795sd, 44) ^ i6);
            jLittleEndianToLong++;
            for (int i32 = 0; i32 < 16; i32++) {
                Pack.intToLittleEndian(iArr2[i32], falconRNG.f228794bd, (i << 2) + (i32 << 5));
            }
        }
        Pack.longToLittleEndian(jLittleEndianToLong, falconRNG.f228795sd, 48);
        falconRNG.ptr = 0;
    }
}
