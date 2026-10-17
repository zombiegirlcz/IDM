package xmm;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class e extends OutputStream {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f307292a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f307293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f307294c;
    public byte[] d;
    public int e;

    public e() {
        d(8192);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void d(int i) {
        int i2 = this.f307293b;
        ArrayList arrayList = this.f307292a;
        if (i2 < arrayList.size() - 1) {
            this.f307294c += this.d.length;
            int i3 = this.f307293b + 1;
            this.f307293b = i3;
            this.d = (byte[]) arrayList.get(i3);
            return;
        }
        byte[] bArr = this.d;
        if (bArr == null) {
            this.f307294c = 0;
        } else {
            i = Math.max(bArr.length << 1, i - this.f307294c);
            this.f307294c += this.d.length;
        }
        this.f307293b++;
        byte[] bArr2 = tmm.c.f272274a;
        byte[] bArr3 = new byte[i];
        this.d = bArr3;
        arrayList.add(bArr3);
    }

    public final byte[] f() {
        int i = this.e;
        if (i == 0) {
            return tmm.c.f272274a;
        }
        byte[] bArr = tmm.c.f272274a;
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        for (byte[] bArr3 : this.f307292a) {
            int iMin = Math.min(bArr3.length, i);
            System.arraycopy(bArr3, 0, bArr2, i2, iMin);
            i2 += iMin;
            i -= iMin;
            if (i == 0) {
                break;
            }
        }
        return bArr2;
    }

    public final String toString() {
        return new String(f(), Charset.defaultCharset());
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException(String.format("offset=%,d, length=%,d", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        if (i2 == 0) {
            return;
        }
        int i5 = this.e;
        int i6 = i5 + i2;
        int i21 = i5 - this.f307294c;
        while (i2 > 0) {
            int iMin = Math.min(i2, this.d.length - i21);
            System.arraycopy(bArr, i3 - i2, this.d, i21, iMin);
            i2 -= iMin;
            if (i2 > 0) {
                d(i6);
                i21 = 0;
            }
        }
        this.e = i6;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        int i2 = this.e;
        int i3 = i2 - this.f307294c;
        if (i3 == this.d.length) {
            d(i2 + 1);
            i3 = 0;
        }
        this.d[i3] = (byte) i;
        this.e++;
    }
}
