package zkm;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import skm.f0;
import skm.i0;
import skm.r0;

/* JADX INFO: loaded from: classes14.dex */
public final class p extends CoroutineDispatcher implements i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f323120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineDispatcher f323121c;
    public final String d;

    /* JADX WARN: Multi-variable type inference failed */
    public p(CoroutineDispatcher coroutineDispatcher, String str) {
        i0 i0Var = coroutineDispatcher instanceof i0 ? (i0) coroutineDispatcher : null;
        this.f323120b = i0Var == null ? f0.f263977a : i0Var;
        this.f323121c = coroutineDispatcher;
        this.d = str;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        this.f323121c.dispatch(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        this.f323121c.dispatchYield(coroutineContext, runnable);
    }

    @Override // skm.i0
    public final void g(long j2, skm.l lVar) {
        this.f323120b.g(j2, lVar);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return this.f323121c.isDispatchNeeded(coroutineContext);
    }

    @Override // skm.i0
    public final r0 j(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f323120b.j(j2, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return this.d;
    }
}
