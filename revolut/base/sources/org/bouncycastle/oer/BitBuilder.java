package org.bouncycastle.oer;

import com.google.common.primitives.SignedBytes;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class BitBuilder {
    private static final byte[] bits = {-128, SignedBytes.MAX_POWER_OF_TWO, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: buf, reason: collision with root package name */
    byte[] f228737buf = new byte[1];
    int pos = 0;

    public void pad() {
        int i = this.pos;
        this.pos = (i % 8) + i;
    }

    public int write(OutputStream outputStream) throws IOException {
        int i = this.pos;
        int i2 = ((i % 8) + i) / 8;
        outputStream.write(this.f228737buf, 0, i2);
        outputStream.flush();
        return i2;
    }

    public void write7BitBytes(int i) {
        boolean z = false;
        for (int i2 = 4; i2 >= 0; i2--) {
            if (!z && ((-33554432) & i) != 0) {
                z = true;
            }
            if (z) {
                writeBit(i2).writeBits(i, 32, 7);
            }
            i <<= 7;
        }
    }

    public int writeAndClear(OutputStream outputStream) throws IOException {
        int i = this.pos;
        int i2 = ((i % 8) + i) / 8;
        outputStream.write(this.f228737buf, 0, i2);
        outputStream.flush();
        zero();
        return i2;
    }

    public BitBuilder writeBit(int i) {
        int i2 = this.pos;
        int i3 = i2 / 8;
        byte[] bArr = this.f228737buf;
        if (i3 >= bArr.length) {
            byte[] bArr2 = new byte[bArr.length + 4];
            System.arraycopy(bArr, 0, bArr2, 0, i2 / 8);
            Arrays.clear(this.f228737buf);
            this.f228737buf = bArr2;
        }
        if (i == 0) {
            byte[] bArr3 = this.f228737buf;
            int i5 = this.pos;
            int i6 = i5 / 8;
            bArr3[i6] = (byte) ((~bits[i5 % 8]) & bArr3[i6]);
        } else {
            byte[] bArr4 = this.f228737buf;
            int i21 = this.pos;
            int i22 = i21 / 8;
            bArr4[i22] = (byte) (bits[i21 % 8] | bArr4[i22]);
        }
        this.pos++;
        return this;
    }

    public BitBuilder writeBits(long j2, int i) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            writeBit(((1 << i2) & j2) > 0 ? 1 : 0);
        }
        return this;
    }

    public void zero() {
        Arrays.clear(this.f228737buf);
        this.pos = 0;
    }

    public void write7BitBytes(BigInteger bigInteger) {
        int iBitLength = ((bigInteger.bitLength() % 8) + bigInteger.bitLength()) / 8;
        BigInteger bigIntegerShiftLeft = BigInteger.valueOf(254L).shiftLeft(iBitLength * 8);
        boolean z = false;
        while (iBitLength >= 0) {
            if (!z && bigInteger.and(bigIntegerShiftLeft).compareTo(BigInteger.ZERO) != 0) {
                z = true;
            }
            if (z) {
                writeBit(iBitLength).writeBits(bigInteger.and(bigIntegerShiftLeft).shiftRight(r3 - 8).intValue(), 8, 7);
            }
            bigInteger = bigInteger.shiftLeft(7);
            iBitLength--;
        }
    }

    public BitBuilder writeBits(long j2, int i, int i2) {
        for (int i3 = i - 1; i3 >= i - i2; i3--) {
            writeBit(((1 << i3) & j2) != 0 ? 1 : 0);
        }
        return this;
    }
}
