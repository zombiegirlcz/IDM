package org.bouncycastle.pqc.legacy.sphincsplus;

import com.google.common.base.Ascii;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes14.dex */
class HarakaSXof extends HarakaSBase {
    public HarakaSXof(byte[] bArr) {
        byte[] bArr2 = new byte[640];
        update(bArr, 0, bArr.length);
        doFinal(bArr2, 0, 640);
        this.haraka512_rc = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 10, 8);
        this.haraka256_rc = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 10, 8);
        for (int i = 0; i < 10; i++) {
            interleaveConstant32(this.haraka256_rc[i], bArr2, i << 5);
            interleaveConstant(this.haraka512_rc[i], bArr2, i << 6);
        }
    }

    public int doFinal(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.buffer;
        int i3 = this.f228930off;
        bArr2[i3] = (byte) (bArr2[i3] ^ Ascii.US);
        bArr2[31] = (byte) (bArr2[31] ^ 128);
        int i5 = i2;
        while (i5 >= 32) {
            haraka512Perm(this.buffer);
            System.arraycopy(this.buffer, 0, bArr, i, 32);
            i += 32;
            i5 -= 32;
        }
        if (i5 > 0) {
            haraka512Perm(this.buffer);
            System.arraycopy(this.buffer, 0, bArr, i, i5);
        }
        reset();
        return i2;
    }

    public String getAlgorithmName() {
        return "Haraka-S";
    }

    public void update(byte b4) {
        byte[] bArr = this.buffer;
        int i = this.f228930off;
        int i2 = i + 1;
        this.f228930off = i2;
        bArr[i] = (byte) (b4 ^ bArr[i]);
        if (i2 == 32) {
            haraka512Perm(bArr);
            this.f228930off = 0;
        }
    }

    public void update(byte[] bArr, int i, int i2) {
        int i3 = (this.f228930off + i2) >> 5;
        int i5 = i;
        for (int i6 = 0; i6 < i3; i6++) {
            while (true) {
                int i21 = this.f228930off;
                if (i21 < 32) {
                    byte[] bArr2 = this.buffer;
                    this.f228930off = i21 + 1;
                    bArr2[i21] = (byte) (bArr[i5] ^ bArr2[i21]);
                    i5++;
                }
            }
            haraka512Perm(this.buffer);
            this.f228930off = 0;
        }
        while (i5 < i + i2) {
            byte[] bArr3 = this.buffer;
            int i22 = this.f228930off;
            this.f228930off = i22 + 1;
            bArr3[i22] = (byte) (bArr3[i22] ^ bArr[i5]);
            i5++;
        }
    }
}
