package org.bouncycastle.util.encoders;

/* JADX INFO: loaded from: classes14.dex */
public class BufferedEncoder {

    /* JADX INFO: renamed from: buf, reason: collision with root package name */
    protected byte[] f228951buf;
    protected int bufOff;
    protected Translator translator;

    public BufferedEncoder(Translator translator, int i) {
        this.translator = translator;
        if (i % translator.getEncodedBlockSize() != 0) {
            throw new IllegalArgumentException("buffer size not multiple of input block size");
        }
        this.f228951buf = new byte[i];
        this.bufOff = 0;
    }

    public int processByte(byte b4, byte[] bArr, int i) {
        byte[] bArr2 = this.f228951buf;
        int i2 = this.bufOff;
        int i3 = i2 + 1;
        this.bufOff = i3;
        bArr2[i2] = b4;
        if (i3 != bArr2.length) {
            return 0;
        }
        int iEncode = this.translator.encode(bArr2, 0, bArr2.length, bArr, i);
        this.bufOff = 0;
        return iEncode;
    }

    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArr3;
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        byte[] bArr4 = this.f228951buf;
        int length = bArr4.length;
        int i5 = this.bufOff;
        int i6 = length - i5;
        int iEncode = 0;
        if (i2 > i6) {
            System.arraycopy(bArr, i, bArr4, i5, i6);
            Translator translator = this.translator;
            byte[] bArr5 = this.f228951buf;
            int iEncode2 = translator.encode(bArr5, 0, bArr5.length, bArr2, i3);
            this.bufOff = 0;
            int i21 = i2 - i6;
            int i22 = i + i6;
            int length2 = i21 - (i21 % this.f228951buf.length);
            bArr3 = bArr;
            iEncode = iEncode2 + this.translator.encode(bArr3, i22, length2, bArr2, i3 + iEncode2);
            i2 = i21 - length2;
            i = i22 + length2;
        } else {
            bArr3 = bArr;
        }
        if (i2 != 0) {
            System.arraycopy(bArr3, i, this.f228951buf, this.bufOff, i2);
            this.bufOff += i2;
        }
        return iEncode;
    }
}
