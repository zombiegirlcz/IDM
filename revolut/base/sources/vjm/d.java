package vjm;

import com.google.common.primitives.UnsignedBytes;
import java.io.InputStream;

/* JADX INFO: loaded from: classes14.dex */
public final class d extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sgm.f f289828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kotlin.reflect.jvm.internal.impl.protobuf.g f289829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f289830c;
    public int d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.i f289831g;

    public d(kotlin.reflect.jvm.internal.impl.protobuf.i iVar) {
        this.f289831g = iVar;
        sgm.f fVar = new sgm.f(iVar);
        this.f289828a = fVar;
        kotlin.reflect.jvm.internal.impl.protobuf.g gVarA = fVar.a();
        this.f289829b = gVarA;
        this.f289830c = gVarA.f187528a.length;
        this.d = 0;
        this.e = 0;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f289831g.f187534a - (this.e + this.d);
    }

    public final void d() {
        if (this.f289829b != null) {
            int i = this.d;
            int i2 = this.f289830c;
            if (i == i2) {
                this.e += i2;
                this.d = 0;
                if (!this.f289828a.hasNext()) {
                    this.f289829b = null;
                    this.f289830c = 0;
                } else {
                    kotlin.reflect.jvm.internal.impl.protobuf.g gVarA = this.f289828a.a();
                    this.f289829b = gVarA;
                    this.f289830c = gVarA.f187528a.length;
                }
            }
        }
    }

    public final int f(int i, int i2, byte[] bArr) {
        int i3 = i2;
        while (true) {
            if (i3 <= 0) {
                break;
            }
            d();
            if (this.f289829b != null) {
                int iMin = Math.min(this.f289830c - this.d, i3);
                if (bArr != null) {
                    this.f289829b.copyTo(bArr, this.d, i, iMin);
                    i += iMin;
                }
                this.d += iMin;
                i3 -= iMin;
            } else if (i3 == i2) {
                return -1;
            }
        }
        return i2 - i3;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f = this.e + this.d;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        return f(i, i2, bArr);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        sgm.f fVar = new sgm.f(this.f289831g);
        this.f289828a = fVar;
        kotlin.reflect.jvm.internal.impl.protobuf.g gVarA = fVar.a();
        this.f289829b = gVarA;
        this.f289830c = gVarA.f187528a.length;
        this.d = 0;
        this.e = 0;
        f(0, this.f, null);
    }

    @Override // java.io.InputStream
    public final long skip(long j2) {
        if (j2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j2 > 2147483647L) {
            j2 = 2147483647L;
        }
        return f(0, (int) j2, null);
    }

    @Override // java.io.InputStream
    public final int read() {
        d();
        kotlin.reflect.jvm.internal.impl.protobuf.g gVar = this.f289829b;
        if (gVar == null) {
            return -1;
        }
        int i = this.d;
        this.d = i + 1;
        return gVar.f187528a[i] & UnsignedBytes.MAX_VALUE;
    }
}
