package skm;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes14.dex */
public final class w1 extends kotlin.coroutines.a implements Job {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w1 f264016b = new w1(g1.f263979a);

    @Override // kotlinx.coroutines.Job
    public final boolean d() {
        return true;
    }

    @Override // kotlinx.coroutines.Job
    public final void f(CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.Job
    public final Sequence getChildren() {
        return nkm.t.d();
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public final r0 k(Function1 function1) {
        return x1.f264019a;
    }

    @Override // kotlinx.coroutines.Job
    public final flm.c l() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    public final r0 o(boolean z, boolean z3, Function1 function1) {
        return x1.f264019a;
    }

    @Override // kotlinx.coroutines.Job
    public final CancellationException p() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    public final o s(r1 r1Var) {
        return x1.f264019a;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.Job
    public final Object u(Continuation continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }
}
