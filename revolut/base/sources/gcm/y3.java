package gcm;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class y3 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f142977b;

    public /* synthetic */ y3(Object obj2, int i) {
        this.f142976a = i;
        this.f142977b = obj2;
    }

    private final void d() {
    }

    private final void f() {
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f142976a) {
            case 1:
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        switch (this.f142976a) {
            case 1:
                break;
            default:
                super.flush();
                break;
        }
    }

    public String toString() {
        switch (this.f142976a) {
            case 1:
                return ((mmm.h) this.f142977b) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        switch (this.f142976a) {
            case 0:
                write(new byte[]{(byte) i}, 0, 1);
                break;
            default:
                ((mmm.h) this.f142977b).w(i);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i, int i2) {
        switch (this.f142976a) {
            case 0:
                ((a4) this.f142977b).g(i, i2, data);
                break;
            default:
                Intrinsics.checkNotNullParameter(data, "data");
                ((mmm.h) this.f142977b).write(data, i, i2);
                break;
        }
    }
}
