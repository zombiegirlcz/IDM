package androidx.media3.extractor;

import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes15.dex */
public final class VorbisBitArray {
    private int bitOffset;
    private final int byteLimit;
    private int byteOffset;
    private final byte[] data;

    public VorbisBitArray(byte[] bArr) {
        this.data = bArr;
        this.byteLimit = bArr.length;
    }

    private void assertValidOffset() {
        int i;
        int i2 = this.byteOffset;
        Preconditions.checkState(i2 >= 0 && (i2 < (i = this.byteLimit) || (i2 == i && this.bitOffset == 0)));
    }

    public int getPosition() {
        return (this.byteOffset * 8) + this.bitOffset;
    }

    public boolean readBit() {
        boolean z = (((this.data[this.byteOffset] & UnsignedBytes.MAX_VALUE) >> this.bitOffset) & 1) == 1;
        skipBits(1);
        return z;
    }

    public int readBits(int i) {
        int i2 = this.byteOffset;
        int iMin = Math.min(i, 8 - this.bitOffset);
        int i3 = i2 + 1;
        int i5 = ((this.data[i2] & UnsignedBytes.MAX_VALUE) >> this.bitOffset) & (255 >> (8 - iMin));
        while (iMin < i) {
            i5 |= (this.data[i3] & UnsignedBytes.MAX_VALUE) << iMin;
            iMin += 8;
            i3++;
        }
        int i6 = i5 & ((-1) >>> (32 - i));
        skipBits(i);
        return i6;
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
}
