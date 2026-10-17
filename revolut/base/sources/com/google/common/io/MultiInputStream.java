package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
final class MultiInputStream extends InputStream {

    /* JADX INFO: renamed from: in, reason: collision with root package name */
    private InputStream f49283in;

    /* JADX INFO: renamed from: it, reason: collision with root package name */
    private Iterator<? extends ByteSource> f49284it;

    public MultiInputStream(Iterator<? extends ByteSource> it8) throws IOException {
        this.f49284it = (Iterator) Preconditions.checkNotNull(it8);
        advance();
    }

    private void advance() throws IOException {
        close();
        if (this.f49284it.hasNext()) {
            this.f49283in = this.f49284it.next().openStream();
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.f49283in;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f49283in;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f49283in = null;
            }
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f49283in;
            if (inputStream == null) {
                return -1;
            }
            int i = inputStream.read();
            if (i != -1) {
                return i;
            }
            advance();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j2) throws IOException {
        InputStream inputStream = this.f49283in;
        if (inputStream == null || j2 <= 0) {
            return 0L;
        }
        long jSkip = inputStream.skip(j2);
        if (jSkip != 0) {
            return jSkip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.f49283in.skip(j2 - 1) + 1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        Preconditions.checkNotNull(bArr);
        while (true) {
            InputStream inputStream = this.f49283in;
            if (inputStream == null) {
                return -1;
            }
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 != -1) {
                return i3;
            }
            advance();
        }
    }
}
