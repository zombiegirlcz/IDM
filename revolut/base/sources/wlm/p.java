package wlm;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mmm.q0;
import mmm.u;

/* JADX INFO: loaded from: classes13.dex */
public final class p extends u {
    public final Function1 d;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q0 delegate, Function1 onException) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onException, "onException");
        this.d = onException;
    }

    @Override // mmm.u, mmm.q0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.f = true;
            this.d.invoke(e);
        }
    }

    @Override // mmm.u, mmm.q0, java.io.Flushable
    public final void flush() {
        if (this.f) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.f = true;
            this.d.invoke(e);
        }
    }

    @Override // mmm.u, mmm.q0
    public final void write(mmm.h source, long j2) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f) {
            source.skip(j2);
            return;
        }
        try {
            super.write(source, j2);
        } catch (IOException e) {
            this.f = true;
            this.d.invoke(e);
        }
    }
}
