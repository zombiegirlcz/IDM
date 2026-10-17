package j9;

import java.io.OutputStream;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes16.dex */
public final class c extends OutputStream {
    public static final byte[] e = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f172250a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f172251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f172252c;
    public int d;

    public c(int i) {
        this.f172252c = new byte[i > 131072 ? 131072 : i];
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void d() {
        int length = this.f172251b + this.f172252c.length;
        if (length < 0) {
            throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
        }
        this.f172251b = length;
        int iMax = Math.max(length >> 1, 1000);
        if (iMax > 131072) {
            iMax = 131072;
        }
        this.f172250a.add(this.f172252c);
        this.f172252c = new byte[iMax];
        this.d = 0;
    }

    public final void f(int i) {
        if (this.d >= this.f172252c.length) {
            d();
        }
        byte[] bArr = this.f172252c;
        int i2 = this.d;
        this.d = i2 + 1;
        bArr[i2] = (byte) i;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }

    public final void g(int i) {
        int i2 = this.d;
        int i3 = i2 + 1;
        byte[] bArr = this.f172252c;
        if (i3 >= bArr.length) {
            f(i >> 8);
            f(i);
        } else {
            this.d = i3;
            bArr[i2] = (byte) (i >> 8);
            this.d = i2 + 2;
            bArr[i3] = (byte) i;
        }
    }

    public final byte[] h() {
        int i = this.f172251b + this.d;
        if (i == 0) {
            return e;
        }
        byte[] bArr = new byte[i];
        LinkedList<byte[]> linkedList = this.f172250a;
        int i2 = 0;
        for (byte[] bArr2 : linkedList) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i2, length);
            i2 += length;
        }
        System.arraycopy(this.f172252c, 0, bArr, i2, this.d);
        int i3 = i2 + this.d;
        if (i3 != i) {
            throw new RuntimeException(com.google.android.gms.internal.mlkit_vision_face.a.m("Internal error: total len assumed to be ", i, i3, ", copied ", " bytes"));
        }
        if (!linkedList.isEmpty()) {
            this.f172251b = 0;
            this.d = 0;
            if (!linkedList.isEmpty()) {
                linkedList.clear();
            }
        }
        return bArr;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        while (true) {
            int iMin = Math.min(this.f172252c.length - this.d, i2);
            if (iMin > 0) {
                System.arraycopy(bArr, i, this.f172252c, this.d, iMin);
                i += iMin;
                this.d += iMin;
                i2 -= iMin;
            }
            if (i2 <= 0) {
                return;
            } else {
                d();
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        f(i);
    }
}
