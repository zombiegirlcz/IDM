package mmm;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class g implements q0 {
    @Override // mmm.q0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // mmm.q0, java.io.Flushable
    public final void flush() {
    }

    @Override // mmm.q0
    public final v0 timeout() {
        return v0.d;
    }

    @Override // mmm.q0
    public final void write(h source, long j2) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        source.skip(j2);
    }
}
