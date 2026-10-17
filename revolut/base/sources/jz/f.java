package jz;

import androidx.lifecycle.Lifecycle;
import jsl.t0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.n0;
import kotlinx.coroutines.flow.FlowCollector;
import skm.a2;
import vkm.y;

/* JADX INFO: loaded from: classes16.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ l u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l lVar, Continuation continuation) {
        super(2, continuation);
        this.u = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVar = this.u;
        lVar.f179547n.a(Lifecycle.Event.ON_RESUME);
        xv.h hVar = lVar.v;
        ww.b bVar = lVar.f179552t;
        ((sx.b) lVar.f179551s).f(lVar.f179550r.f50815c);
        a2 a2Var = lVar.f179555y;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        lVar.f179555y = null;
        lVar.f179555y = yji.n.j2(lVar, bVar.f, null, new h(lVar, null, 0), 3);
        a2 a2Var2 = lVar.z;
        if (a2Var2 != null) {
            a2Var2.f(null);
        }
        lVar.z = null;
        n0 n0Var = new n0();
        lVar.z = yji.n.l2(lVar, z92.f.s(new j(lVar, n0Var, (Continuation) null), new ahe.i(new y(new j(n0Var, lVar, (Continuation) null), hVar.a()), 5)), null, null, 7);
        a2 a2Var3 = lVar.A;
        if (a2Var3 != null) {
            a2Var3.f(null);
        }
        lVar.A = null;
        lVar.A = yji.n.l2(lVar, bVar.f300565h, null, new g(2, lVar, continuation), 3);
        a2 a2Var4 = lVar.B;
        if (a2Var4 != null) {
            a2Var4.f(null);
        }
        lVar.B = null;
        lVar.B = yji.n.l2(lVar, hVar.a(), null, new t0(lVar, continuation, 15), 3);
        return Unit.f186387a;
    }
}
