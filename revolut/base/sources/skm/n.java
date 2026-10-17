package skm;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes13.dex */
public final class n extends i1 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ n(Object obj2, int i) {
        this.e = i;
        this.f = obj2;
    }

    @Override // skm.i1
    public final boolean i() {
        switch (this.e) {
        }
        return false;
    }

    @Override // skm.i1
    public final void j(Throwable th10) {
        int i = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                l lVar = (l) obj2;
                Throwable thS = lVar.s(h());
                if (lVar.z()) {
                    Continuation continuation = lVar.d;
                    Intrinsics.i(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
                    zkm.f fVar = (zkm.f) continuation;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zkm.f.f323102h;
                    while (true) {
                        Object obj3 = atomicReferenceFieldUpdater.get(fVar);
                        if (Intrinsics.f(obj3, zkm.g.f323105b)) {
                            if (z9h.n.p(atomicReferenceFieldUpdater, fVar, thS)) {
                                break;
                            }
                        } else if (obj3 instanceof Throwable) {
                            break;
                        } else if (z9h.n.o(atomicReferenceFieldUpdater, fVar, obj3)) {
                        }
                    }
                }
                lVar.a(thS);
                if (!lVar.z()) {
                    lVar.o();
                }
                break;
            case 1:
                ((Function1) obj2).invoke(th10);
                break;
            default:
                j1 j1Var = (j1) obj2;
                Object obj4 = r1.f264005a.get(h());
                if (!(obj4 instanceof u)) {
                    m.Companion companion = yhm.m.INSTANCE;
                    j1Var.resumeWith(e0.I(obj4));
                } else {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    j1Var.resumeWith(yhm.o.a(((u) obj4).f264012a));
                }
                break;
        }
    }
}
