package hu1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import tof.v5;

/* JADX INFO: loaded from: classes20.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ e0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(e0 e0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = e0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y(this.v, continuation, 0);
            default:
                return new y(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((y) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((y) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0Var = this.v;
                eu1.a aVar2 = e0Var.f155513q;
                xi0.b currency = e0Var.f155512p.f61665a;
                eu1.h hVar = (eu1.h) aVar2;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(currency, "currency");
                xt1.d dVar = hVar.f129469a;
                Intrinsics.checkNotNullParameter(currency, "currency");
                vkm.d dVarB = rd0.e.b(dVar.f308743b.f(currency, true));
                Continuation continuation = null;
                yji.l.a1(e0Var, dVarB, null, null, new x(e0Var, continuation, 0), 3);
                return yji.l.a1(e0Var, nim.a.v(h12.h.a(e0Var.z, tof.n.BLIK, tof.l.BLIK_P2P, v5.BLIK_P2P, null, 8), new hqk.a(26)), null, null, new x(e0Var, continuation, 1), 3);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                this.v.x2(new hqk.a(27));
                return Unit.f186387a;
        }
    }
}
