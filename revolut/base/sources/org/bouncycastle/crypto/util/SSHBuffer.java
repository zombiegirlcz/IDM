package org.bouncycastle.crypto.util;

import com.google.common.primitives.UnsignedBytes;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes14.dex */
class SSHBuffer {
    private final byte[] buffer;
    private int pos = 0;

    public SSHBuffer(byte[] bArr) {
        this.buffer = bArr;
    }

    public byte[] getBuffer() {
        return Arrays.clone(this.buffer);
    }

    public boolean hasRemaining() {
        return this.pos < this.buffer.length;
    }

    public BigInteger readBigNumPositive() {
        int u322 = readU32();
        byte[] bArr = this.buffer;
        int length = bArr.length;
        int i = this.pos;
        if (u322 > length - i) {
            throw new IllegalArgumentException("not enough data for big num");
        }
        int i2 = u322 + i;
        this.pos = i2;
        return new BigInteger(1, Arrays.copyOfRange(bArr, i, i2));
    }

    public byte[] readBlock() {
        int u322 = readU32();
        if (u322 == 0) {
            return new byte[0];
        }
        byte[] bArr = this.buffer;
        int length = bArr.length;
        int i = this.pos;
        if (u322 > length - i) {
            throw new IllegalArgumentException("not enough data for block");
        }
        int i2 = u322 + i;
        this.pos = i2;
        return Arrays.copyOfRange(bArr, i, i2);
    }

    public byte[] readPaddedBlock() {
        return readPaddedBlock(8);
    }

    public String readString() {
        return Strings.fromByteArray(readBlock());
    }

    public int readU32() {
        int i = this.pos;
        byte[] bArr = this.buffer;
        if (i > bArr.length - 4) {
            throw new IllegalArgumentException("4 bytes for U32 exceeds buffer.");
        }
        int iBigEndianToInt = org.bouncycastle.util.Pack.bigEndianToInt(bArr, i);
        this.pos += 4;
        return iBigEndianToInt;
    }

    public void skipBlock() {
        int u322 = readU32();
        int length = this.buffer.length;
        int i = this.pos;
        if (u322 > length - i) {
            throw new IllegalArgumentException("not enough data for block");
        }
        this.pos = i + u322;
    }

    public SSHBuffer(byte[] bArr, byte[] bArr2) {
        this.buffer = bArr2;
        for (int i = 0; i != bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                throw new IllegalArgumentException("magic-number incorrect");
            }
        }
        this.pos += bArr.length;
    }

    public byte[] readPaddedBlock(int i) {
        int i2;
        int u322 = readU32();
        if (u322 == 0) {
            return new byte[0];
        }
        byte[] bArr = this.buffer;
        int length = bArr.length;
        int i3 = this.pos;
        if (u322 > length - i3) {
            throw new IllegalArgumentException("not enough data for block");
        }
        if (u322 % i != 0) {
            throw new IllegalArgumentException("missing padding");
        }
        int i5 = i3 + u322;
        this.pos = i5;
        if (u322 > 0 && (i2 = bArr[i5 - 1] & UnsignedBytes.MAX_VALUE) > 0 && i2 < i) {
            i5 -= i2;
            int i6 = 1;
            int i21 = i5;
            while (i6 <= i2) {
                if (i6 != (this.buffer[i21] & UnsignedBytes.MAX_VALUE)) {
                    throw new IllegalArgumentException("incorrect padding");
                }
                i6++;
                i21++;
            }
        }
        return Arrays.copyOfRange(this.buffer, i3, i5);
    }
}
