package mmm;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class j0 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f207278a;

    public j0(k0 k0Var) {
        this.f207278a = k0Var;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f207278a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        k0 k0Var = this.f207278a;
        if (k0Var.f207281c) {
            return;
        }
        k0Var.flush();
    }

    public final String toString() {
        return this.f207278a + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        k0 k0Var = this.f207278a;
        if (k0Var.f207281c) {
            throw new IOException("closed");
        }
        k0Var.f207280b.w((byte) i);
        k0Var.d();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        k0 k0Var = this.f207278a;
        if (!k0Var.f207281c) {
            k0Var.f207280b.write(data, i, i2);
            k0Var.d();
            return;
        }
        throw new IOException("closed");
    }
}
