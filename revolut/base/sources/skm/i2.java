package skm;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes13.dex */
public final class i2 extends zkm.s {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public i2(Continuation continuation, CoroutineContext coroutineContext) {
        j2 j2Var = j2.f263984a;
        super(continuation, coroutineContext.get(j2Var) == null ? coroutineContext.plus(j2Var) : coroutineContext);
        this.e = new ThreadLocal();
        if (continuation.getContext().get(kotlin.coroutines.d.q1) instanceof CoroutineDispatcher) {
            return;
        }
        Object objC = zkm.w.c(coroutineContext, null);
        zkm.w.a(coroutineContext, objC);
        n0(coroutineContext, objC);
    }

    @Override // zkm.s
    public final void k0() {
        m0();
    }

    public final boolean l0() {
        boolean z = this.threadLocalIsSet && this.e.get() == null;
        this.e.remove();
        return !z;
    }

    public final void m0() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.e.get();
            if (pair != null) {
                zkm.w.a((CoroutineContext) pair.f186385a, pair.f186386b);
            }
            this.e.remove();
        }
    }

    public final void n0(CoroutineContext coroutineContext, Object obj2) {
        this.threadLocalIsSet = true;
        this.e.set(new Pair(coroutineContext, obj2));
    }

    @Override // zkm.s, skm.r1
    public final void x(Object obj2) {
        m0();
        Object objA = v.a(obj2);
        Continuation continuation = this.d;
        CoroutineContext context = continuation.getContext();
        Object objC = zkm.w.c(context, null);
        i2 i2VarC = objC != zkm.w.f323126a ? x.c(continuation, context, objC) : null;
        try {
            continuation.resumeWith(objA);
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
    }
}
