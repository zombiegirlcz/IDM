package org.bouncycastle.util.io;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class BufferingOutputStream extends OutputStream {

    /* JADX INFO: renamed from: buf, reason: collision with root package name */
    private final byte[] f228952buf;
    private int bufOff;
    private final OutputStream other;

    public BufferingOutputStream(OutputStream outputStream) {
        this.other = outputStream;
        this.f228952buf = new byte[4096];
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        flush();
        this.other.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.other.write(this.f228952buf, 0, this.bufOff);
        this.bufOff = 0;
        Arrays.fill(this.f228952buf, (byte) 0);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f228952buf;
        int i2 = this.bufOff;
        int i3 = i2 + 1;
        this.bufOff = i3;
        bArr[i2] = (byte) i;
        if (i3 == bArr.length) {
            flush();
        }
    }

    public BufferingOutputStream(OutputStream outputStream, int i) {
        this.other = outputStream;
        this.f228952buf = new byte[i];
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2;
        byte[] bArr3 = this.f228952buf;
        int length = bArr3.length;
        int i3 = this.bufOff;
        if (i2 < length - i3) {
            System.arraycopy(bArr, i, bArr3, i3, i2);
        } else {
            int length2 = bArr3.length - i3;
            System.arraycopy(bArr, i, bArr3, i3, length2);
            this.bufOff += length2;
            flush();
            int length3 = i + length2;
            i2 -= length2;
            while (true) {
                bArr2 = this.f228952buf;
                if (i2 < bArr2.length) {
                    break;
                }
                this.other.write(bArr, length3, bArr2.length);
                byte[] bArr4 = this.f228952buf;
                length3 += bArr4.length;
                i2 -= bArr4.length;
            }
            if (i2 <= 0) {
                return;
            } else {
                System.arraycopy(bArr, length3, bArr2, this.bufOff, i2);
            }
        }
        this.bufOff += i2;
    }
}
