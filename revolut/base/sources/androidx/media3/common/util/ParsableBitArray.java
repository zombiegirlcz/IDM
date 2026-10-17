package androidx.media3.common.util;

import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class ParsableBitArray {
    private int bitOffset;
    private int byteLimit;
    private int byteOffset;
    public byte[] data;

    public ParsableBitArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    private void assertValidOffset() {
        int i;
        int i2 = this.byteOffset;
        Preconditions.checkState(i2 >= 0 && (i2 < (i = this.byteLimit) || (i2 == i && this.bitOffset == 0)));
    }

    public int bitsLeft() {
        return ((this.byteLimit - this.byteOffset) * 8) - this.bitOffset;
    }

    public void byteAlign() {
        if (this.bitOffset == 0) {
            return;
        }
        this.bitOffset = 0;
        this.byteOffset++;
        assertValidOffset();
    }

    public int getBytePosition() {
        Preconditions.checkState(this.bitOffset == 0);
        return this.byteOffset;
    }

    public int getPosition() {
        return (this.byteOffset * 8) + this.bitOffset;
    }

    public void putInt(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int iMin = Math.min(8 - this.bitOffset, i2);
        int i3 = this.bitOffset;
        int i5 = (8 - i3) - iMin;
        byte[] bArr = this.data;
        int i6 = this.byteOffset;
        byte b4 = (byte) (((65280 >> i3) | ((1 << i5) - 1)) & bArr[i6]);
        bArr[i6] = b4;
        int i21 = i2 - iMin;
        bArr[i6] = (byte) (b4 | ((i >>> i21) << i5));
        int i22 = i6 + 1;
        while (i21 > 8) {
            this.data[i22] = (byte) (i >>> (i21 - 8));
            i21 -= 8;
            i22++;
        }
        int i32 = 8 - i21;
        byte[] bArr2 = this.data;
        byte b5 = (byte) (bArr2[i22] & ((1 << i32) - 1));
        bArr2[i22] = b5;
        bArr2[i22] = (byte) (((i & ((1 << i21) - 1)) << i32) | b5);
        skipBits(i2);
        assertValidOffset();
    }

    public boolean readBit() {
        boolean z = (this.data[this.byteOffset] & (128 >> this.bitOffset)) != 0;
        skipBit();
        return z;
    }

    public int readBits(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.bitOffset += i;
        int i3 = 0;
        while (true) {
            i2 = this.bitOffset;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.bitOffset = i5;
            byte[] bArr = this.data;
            int i6 = this.byteOffset;
            this.byteOffset = i6 + 1;
            i3 |= (bArr[i6] & UnsignedBytes.MAX_VALUE) << i5;
        }
        byte[] bArr2 = this.data;
        int i21 = this.byteOffset;
        int i22 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i21] & UnsignedBytes.MAX_VALUE) >> (8 - i2)));
        if (i2 == 8) {
            this.bitOffset = 0;
            this.byteOffset = i21 + 1;
        }
        assertValidOffset();
        return i22;
    }

    public long readBitsToLong(int i) {
        return i <= 32 ? Util.toUnsignedLong(readBits(i)) : Util.toLong(readBits(i - 32), readBits(32));
    }

    public void readBytes(byte[] bArr, int i, int i2) {
        Preconditions.checkState(this.bitOffset == 0);
        System.arraycopy(this.data, this.byteOffset, bArr, i, i2);
        this.byteOffset += i2;
        assertValidOffset();
    }

    public String readBytesAsString(int i, Charset charset) {
        byte[] bArr = new byte[i];
        readBytes(bArr, 0, i);
        return new String(bArr, charset);
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public void setPosition(int i) {
        int i2 = i / 8;
        this.byteOffset = i2;
        this.bitOffset = i - (i2 * 8);
        assertValidOffset();
    }

    public void skipBit() {
        int i = this.bitOffset + 1;
        this.bitOffset = i;
        if (i == 8) {
            this.bitOffset = 0;
            this.byteOffset++;
        }
        assertValidOffset();
    }

    public void skipBits(int i) {
        int i2 = i / 8;
        int i3 = this.byteOffset + i2;
        this.byteOffset = i3;
        int i5 = (i - (i2 * 8)) + this.bitOffset;
        this.bitOffset = i5;
        if (i5 > 7) {
            this.byteOffset = i3 + 1;
            this.bitOffset = i5 - 8;
        }
        assertValidOffset();
    }

    public void skipBytes(int i) {
        Preconditions.checkState(this.bitOffset == 0);
        this.byteOffset += i;
        assertValidOffset();
    }

    public void reset(ParsableByteArray parsableByteArray) {
        reset(parsableByteArray.getData(), parsableByteArray.limit());
        setPosition(parsableByteArray.getPosition() * 8);
    }

    public ParsableBitArray(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public ParsableBitArray(byte[] bArr, int i) {
        this.data = bArr;
        this.byteLimit = i;
    }

    public void reset(byte[] bArr, int i) {
        this.data = bArr;
        this.byteOffset = 0;
        this.bitOffset = 0;
        this.byteLimit = i;
    }

    public void readBits(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.data;
            int i5 = this.byteOffset;
            int i6 = i5 + 1;
            this.byteOffset = i6;
            byte b4 = bArr2[i5];
            int i21 = this.bitOffset;
            byte b5 = (byte) (b4 << i21);
            bArr[i] = b5;
            bArr[i] = (byte) (((255 & bArr2[i6]) >> (8 - i21)) | b5);
            i++;
        }
        int i22 = i2 & 7;
        if (i22 == 0) {
            return;
        }
        byte b7 = (byte) (bArr[i3] & (255 >> i22));
        bArr[i3] = b7;
        int i32 = this.bitOffset;
        if (i32 + i22 > 8) {
            byte[] bArr3 = this.data;
            int i33 = this.byteOffset;
            this.byteOffset = i33 + 1;
            bArr[i3] = (byte) (b7 | ((bArr3[i33] & UnsignedBytes.MAX_VALUE) << i32));
            this.bitOffset = i32 - 8;
        }
        int i43 = this.bitOffset + i22;
        this.bitOffset = i43;
        byte[] bArr4 = this.data;
        int i59 = this.byteOffset;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i59]) >> (8 - i43)) << (8 - i22))) | bArr[i3]);
        if (i43 == 8) {
            this.bitOffset = 0;
            this.byteOffset = i59 + 1;
        }
        assertValidOffset();
    }
}
