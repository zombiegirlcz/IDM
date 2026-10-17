package com.google.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes17.dex */
public final class a extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49677a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49678b;

    public a(y8.e eVar) {
        super(eVar);
        this.f49678b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        switch (this.f49677a) {
            case 0:
                return Math.min(super.available(), this.f49678b);
            default:
                int i = this.f49678b;
                return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
        }
    }

    public long d(long j2) {
        int i = this.f49678b;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j2 <= ((long) i)) ? j2 : i;
    }

    public void f(long j2) {
        int i = this.f49678b;
        if (i == Integer.MIN_VALUE || j2 == -1) {
            return;
        }
        this.f49678b = (int) (((long) i) - j2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.f49677a) {
            case 1:
                synchronized (this) {
                    super.mark(i);
                    this.f49678b = i;
                }
                return;
            default:
                super.mark(i);
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.f49677a) {
            case 0:
                if (this.f49678b <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i < 0) {
                    return i;
                }
                this.f49678b--;
                return i;
            default:
                if (d(1L) == -1) {
                    return -1;
                }
                int i2 = super.read();
                f(1L);
                return i2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.f49677a) {
            case 1:
                synchronized (this) {
                    super.reset();
                    this.f49678b = Integer.MIN_VALUE;
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) throws IOException {
        switch (this.f49677a) {
            case 0:
                int iSkip = (int) super.skip(Math.min(j2, this.f49678b));
                if (iSkip >= 0) {
                    this.f49678b -= iSkip;
                }
                return iSkip;
            default:
                long jD = d(j2);
                if (jD == -1) {
                    return 0L;
                }
                long jSkip = super.skip(jD);
                f(jSkip);
                return jSkip;
        }
    }

    public a(InputStream inputStream, int i) {
        super(inputStream);
        this.f49678b = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.f49677a) {
            case 0:
                int i3 = this.f49678b;
                if (i3 <= 0) {
                    return -1;
                }
                int i5 = super.read(bArr, i, Math.min(i2, i3));
                if (i5 < 0) {
                    return i5;
                }
                this.f49678b -= i5;
                return i5;
            default:
                int iD = (int) d(i2);
                if (iD == -1) {
                    return -1;
                }
                int i6 = super.read(bArr, i, iD);
                f(i6);
                return i6;
        }
    }
}
