package com.bumptech.glide.load.data;

import com.google.common.primitives.UnsignedBytes;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes16.dex */
public final class k extends FilterInputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f26115c = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
    public static final int d = 31;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f26116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26117b;

    public k(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(a0.d.n("Cannot add invalid orientation: ", i));
        }
        this.f26116a = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i;
        int i2 = this.f26117b;
        int i3 = (i2 < 2 || i2 > (i = d)) ? super.read() : i2 == i ? this.f26116a : f26115c[i2 - 2] & UnsignedBytes.MAX_VALUE;
        if (i3 != -1) {
            this.f26117b++;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) throws IOException {
        long jSkip = super.skip(j2);
        if (jSkip > 0) {
            this.f26117b = (int) (((long) this.f26117b) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i5 = this.f26117b;
        int i6 = d;
        if (i5 > i6) {
            i3 = super.read(bArr, i, i2);
        } else if (i5 == i6) {
            bArr[i] = this.f26116a;
            i3 = 1;
        } else if (i5 < 2) {
            i3 = super.read(bArr, i, 2 - i5);
        } else {
            int iMin = Math.min(i6 - i5, i2);
            System.arraycopy(f26115c, this.f26117b - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.f26117b += i3;
        }
        return i3;
    }
}
