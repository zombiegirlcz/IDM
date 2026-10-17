package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes16.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f26108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f26109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f8.f f26110c;
    public int d;

    public c(FileOutputStream fileOutputStream, f8.f fVar) {
        this.f26108a = fileOutputStream;
        this.f26110c = fVar;
        this.f26109b = (byte[]) fVar.c(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f26108a;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f26109b;
            if (bArr != null) {
                this.f26110c.g(bArr);
                this.f26109b = null;
            }
        } catch (Throwable th10) {
            fileOutputStream.close();
            throw th10;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.d;
        FileOutputStream fileOutputStream = this.f26108a;
        if (i > 0) {
            fileOutputStream.write(this.f26109b, 0, i);
            this.d = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f26109b;
        int i2 = this.d;
        int i3 = i2 + 1;
        this.d = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.f26108a.write(bArr, 0, i3);
        this.d = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i5 = i2 - i3;
            int i6 = i + i3;
            int i21 = this.d;
            FileOutputStream fileOutputStream = this.f26108a;
            if (i21 == 0 && i5 >= this.f26109b.length) {
                fileOutputStream.write(bArr, i6, i5);
                return;
            }
            int iMin = Math.min(i5, this.f26109b.length - i21);
            System.arraycopy(bArr, i6, this.f26109b, this.d, iMin);
            int i22 = this.d + iMin;
            this.d = i22;
            i3 += iMin;
            byte[] bArr2 = this.f26109b;
            if (i22 == bArr2.length && i22 > 0) {
                fileOutputStream.write(bArr2, 0, i22);
                this.d = 0;
            }
        } while (i3 < i2);
    }
}
