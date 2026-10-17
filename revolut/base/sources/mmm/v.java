package mmm;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class v implements s0 {

    @NotNull
    private final s0 delegate;

    public v(s0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @NotNull
    @yhm.d
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final s0 m3803deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @NotNull
    public final s0 delegate() {
        return this.delegate;
    }

    @Override // mmm.s0
    public long read(h sink, long j2) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return this.delegate.read(sink, j2);
    }

    @Override // mmm.s0
    @NotNull
    public v0 timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + CoreConstants.LEFT_PARENTHESIS_CHAR + this.delegate + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
