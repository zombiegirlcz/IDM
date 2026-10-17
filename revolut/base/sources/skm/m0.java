package skm;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutinesInternalError;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.Job;
import yhm.m;

/* JADX INFO: loaded from: classes13.dex */
public abstract class m0 extends elm.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f263995c;

    public m0(int i) {
        super(0L, false);
        this.f263995c = i;
    }

    public void c(CancellationException cancellationException) {
    }

    public abstract Continuation f();

    public Throwable g(Object obj2) {
        u uVar = obj2 instanceof u ? (u) obj2 : null;
        if (uVar != null) {
            return uVar.f264012a;
        }
        return null;
    }

    public Object h(Object obj2) {
        return obj2;
    }

    public final void i(Throwable th10) {
        e0.v(f().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th10));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Continuation continuationF = f();
            Intrinsics.i(continuationF, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            zkm.f fVar = (zkm.f) continuationF;
            Continuation continuation = fVar.e;
            Object obj2 = fVar.f323103g;
            CoroutineContext context = continuation.getContext();
            Object objC = zkm.w.c(context, obj2);
            Job job2 = null;
            i2 i2VarC = objC != zkm.w.f323126a ? x.c(continuation, context, objC) : null;
            try {
                CoroutineContext context2 = continuation.getContext();
                Object objJ = j();
                Throwable thG = g(objJ);
                if (thG == null) {
                    int i = this.f263995c;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        job2 = (Job) context2.get(g1.f263979a);
                    }
                }
                if (job2 != null && !job2.d()) {
                    CancellationException cancellationExceptionP = job2.p();
                    c(cancellationExceptionP);
                    m.Companion companion = yhm.m.INSTANCE;
                    continuation.resumeWith(yhm.o.a(cancellationExceptionP));
                } else if (thG != null) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    continuation.resumeWith(yhm.o.a(thG));
                } else {
                    m.Companion companion3 = yhm.m.INSTANCE;
                    continuation.resumeWith(h(objJ));
                }
                Unit unit = Unit.f186387a;
                if (i2VarC == null || i2VarC.l0()) {
                    zkm.w.a(context, objC);
                }
            } catch (Throwable th10) {
                if (i2VarC == null || i2VarC.l0()) {
                    zkm.w.a(context, objC);
                }
                throw th10;
            }
        } catch (DispatchException e) {
            e0.v(f().getContext(), e.getF187929a());
        } catch (Throwable th11) {
            i(th11);
        }
    }
}
