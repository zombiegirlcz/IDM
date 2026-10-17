package skm;

import ch.qos.logback.core.CoreConstants;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes14.dex */
public final class f2 extends zkm.s implements Runnable {
    public final long e;

    public f2(long j2, Continuation continuation) {
        super(continuation, continuation.getContext());
        this.e = j2;
    }

    @Override // skm.r1
    public final String W() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(super.W());
        sb6.append("(timeMillis=");
        return a0.d.t(sb6, this.e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // java.lang.Runnable
    public final void run() {
        k0.d(this.f263953c);
        z(new TimeoutCancellationException("Timed out waiting for " + this.e + " ms", this));
    }
}
