package mmm;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class u implements q0 {

    @NotNull
    private final q0 delegate;

    public u(q0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @NotNull
    @yhm.d
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final q0 m3802deprecated_delegate() {
        return this.delegate;
    }

    @Override // mmm.q0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @NotNull
    public final q0 delegate() {
        return this.delegate;
    }

    @Override // mmm.q0, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // mmm.q0
    @NotNull
    public v0 timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + CoreConstants.LEFT_PARENTHESIS_CHAR + this.delegate + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // mmm.q0
    public void write(h source, long j2) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.delegate.write(source, j2);
    }
}
