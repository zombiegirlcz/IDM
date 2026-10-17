package hlm;

import hb4.n;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuation;
import skm.k2;
import skm.l;
import zkm.t;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements CancellableContinuation, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f153479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f153480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f153481c;

    public b(c cVar, l lVar, Object obj2) {
        this.f153481c = cVar;
        this.f153479a = lVar;
        this.f153480b = obj2;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final boolean a(Throwable th10) {
        return this.f153479a.a(th10);
    }

    @Override // skm.k2
    public final void b(t tVar, int i) {
        this.f153479a.b(tVar, i);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final boolean d() {
        return this.f153479a.d();
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void e(Object obj2, Function3 function3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f153482h;
        Object obj3 = this.f153480b;
        c cVar = this.f153481c;
        atomicReferenceFieldUpdater.set(cVar, obj3);
        h8b.b bVar = new h8b.b(cVar, this, 29);
        l lVar = this.f153479a;
        lVar.D((Unit) obj2, lVar.f263995c, new sa5.b(bVar, 6));
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f153479a.e;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void m(Object obj2) {
        this.f153479a.m(obj2);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final cfm.c q(Object obj2, Function3 function3) {
        c cVar = this.f153481c;
        n nVar = new n(cVar, this, 12);
        cfm.c cVarG = this.f153479a.G((Unit) obj2, nVar);
        if (cVarG != null) {
            c.f153482h.set(cVar, this.f153480b);
        }
        return cVarG;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void r(Function1 function1) {
        this.f153479a.r(function1);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj2) {
        this.f153479a.resumeWith(obj2);
    }
}
