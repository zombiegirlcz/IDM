package l8;

import com.google.common.primitives.UnsignedBytes;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes16.dex */
public final class x extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile byte[] f192757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f192758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f192759c;
    public int d;
    public int e;
    public final f8.f f;

    public x(InputStream inputStream, f8.f fVar) {
        super(inputStream);
        this.d = -1;
        this.f = fVar;
        this.f192757a = (byte[]) fVar.c(65536, byte[].class);
    }

    public static void f() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f192757a == null || inputStream == null) {
            f();
            throw null;
        }
        return (this.f192758b - this.e) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f192757a != null) {
            this.f.g(this.f192757a);
            this.f192757a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final int d(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.d;
        if (i != -1) {
            int i2 = this.e - i;
            int i3 = this.f192759c;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f192758b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f.c(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f192757a = bArr2;
                    this.f.g(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i5 = this.e - this.d;
                this.e = i5;
                this.d = 0;
                this.f192758b = 0;
                int i6 = inputStream.read(bArr, i5, bArr.length - i5);
                int i21 = this.e;
                if (i6 > 0) {
                    i21 += i6;
                }
                this.f192758b = i21;
                return i6;
            }
        }
        int i22 = inputStream.read(bArr);
        if (i22 > 0) {
            this.d = -1;
            this.e = 0;
            this.f192758b = i22;
        }
        return i22;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f192759c = Math.max(this.f192759c, i);
        this.d = this.e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f192757a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            f();
            throw null;
        }
        if (this.e >= this.f192758b && d(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f192757a && (bArr = this.f192757a) == null) {
            f();
            throw null;
        }
        int i = this.f192758b;
        int i2 = this.e;
        if (i - i2 <= 0) {
            return -1;
        }
        this.e = i2 + 1;
        return bArr[i2] & UnsignedBytes.MAX_VALUE;
    }

    public final synchronized void release() {
        if (this.f192757a != null) {
            this.f.g(this.f192757a);
            this.f192757a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f192757a == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.d;
        if (-1 == i) {
            throw new jk.b("Mark has been invalidated, pos: " + this.e + " markLimit: " + this.f192759c);
        }
        this.e = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j2) {
        if (j2 < 1) {
            return 0L;
        }
        byte[] bArr = this.f192757a;
        if (bArr == null) {
            f();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            f();
            throw null;
        }
        int i = this.f192758b;
        int i2 = this.e;
        if (i - i2 >= j2) {
            this.e = (int) (((long) i2) + j2);
            return j2;
        }
        long j3 = ((long) i) - ((long) i2);
        this.e = i;
        if (this.d == -1 || j2 > this.f192759c) {
            long jSkip = inputStream.skip(j2 - j3);
            if (jSkip > 0) {
                this.d = -1;
            }
            return j3 + jSkip;
        }
        if (d(inputStream, bArr) == -1) {
            return j3;
        }
        int i3 = this.f192758b;
        int i5 = this.e;
        if (i3 - i5 >= j2 - j3) {
            this.e = (int) ((((long) i5) + j2) - j3);
            return j2;
        }
        long j5 = (j3 + ((long) i3)) - ((long) i5);
        this.e = i3;
        return j5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i5;
        byte[] bArr2 = this.f192757a;
        if (bArr2 == null) {
            f();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i6 = this.e;
            int i21 = this.f192758b;
            if (i6 < i21) {
                int i22 = i21 - i6;
                if (i22 >= i2) {
                    i22 = i2;
                }
                System.arraycopy(bArr2, i6, bArr, i, i22);
                this.e += i22;
                if (i22 == i2 || inputStream.available() == 0) {
                    return i22;
                }
                i += i22;
                i3 = i2 - i22;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.d == -1 && i3 >= bArr2.length) {
                    i5 = inputStream.read(bArr, i, i3);
                    if (i5 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else {
                    if (d(inputStream, bArr2) == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                    if (bArr2 != this.f192757a && (bArr2 = this.f192757a) == null) {
                        f();
                        throw null;
                    }
                    int i32 = this.f192758b;
                    int i33 = this.e;
                    i5 = i32 - i33;
                    if (i5 >= i3) {
                        i5 = i3;
                    }
                    System.arraycopy(bArr2, i33, bArr, i, i5);
                    this.e += i5;
                }
                i3 -= i5;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i5;
            }
        } else {
            f();
            throw null;
        }
    }
}
