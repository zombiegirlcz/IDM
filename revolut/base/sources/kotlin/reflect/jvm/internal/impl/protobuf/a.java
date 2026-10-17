package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f187515a;

    public a(InputStream inputStream, int i) {
        super(inputStream);
        this.f187515a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f187515a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f187515a <= 0) {
            return -1;
        }
        int i = super.read();
        if (i >= 0) {
            this.f187515a--;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) throws IOException {
        long jSkip = super.skip(Math.min(j2, this.f187515a));
        if (jSkip >= 0) {
            this.f187515a = (int) (((long) this.f187515a) - jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f187515a;
        if (i3 <= 0) {
            return -1;
        }
        int i5 = super.read(bArr, i, Math.min(i2, i3));
        if (i5 >= 0) {
            this.f187515a -= i5;
        }
        return i5;
    }
}
