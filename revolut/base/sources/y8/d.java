package y8;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes16.dex */
public final class d extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f311594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f311595b;

    public d(InputStream inputStream, long j2) {
        super(inputStream);
        this.f311594a = j2;
    }

    public static d f(InputStream inputStream, long j2) {
        return new d(inputStream, j2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f311594a - ((long) this.f311595b), ((FilterInputStream) this).in.available());
    }

    public final void d(int i) throws IOException {
        if (i >= 0) {
            this.f311595b += i;
            return;
        }
        long j2 = this.f311595b;
        long j3 = this.f311594a;
        if (j3 - j2 <= 0) {
            return;
        }
        StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j3, "Failed to read all expected data, expected: ", ", but read: ");
        sbV.append(this.f311595b);
        throw new IOException(sbV.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        d(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        i3 = super.read(bArr, i, i2);
        d(i3);
        return i3;
    }
}
