package uqh;

import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedSorting;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class h0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f282149w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f282150x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l0 f282151y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i, Continuation continuation, l0 l0Var) {
        super(3, continuation);
        this.u = i;
        this.f282151y = l0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                h0 h0Var = new h0(0, continuation, this.f282151y);
                h0Var.f282149w = flowCollector;
                h0Var.f282150x = obj3;
                return h0Var.invokeSuspend(Unit.f186387a);
            default:
                h0 h0Var2 = new h0(1, continuation, this.f282151y);
                h0Var2.f282149w = flowCollector;
                h0Var2.f282150x = obj3;
                return h0Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f282149w;
                    zel.f group = (zel.f) this.f282150x;
                    qr0.i iVar = this.f282151y.f282161q;
                    iVar.getClass();
                    Intrinsics.checkNotNullParameter(group, "group");
                    akg.n nVarV = nim.a.v(((z0h.d) iVar.f248595b).w0(), new tjf.e(iVar, group, 24));
                    this.f282149w = null;
                    this.f282150x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, nVarV, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f282149w;
                    yhm.r rVar = (yhm.r) this.f282150x;
                    t tVar = (t) rVar.f314201a;
                    ScreenerSelectedSorting screenerSelectedSorting = (ScreenerSelectedSorting) rVar.f314202b;
                    vkm.d dVarV = fkg.a.v(this.f282151y.f282157l, tVar.f282175a, tVar.f282176b, screenerSelectedSorting != null ? screenerSelectedSorting.f105170a : null, screenerSelectedSorting != null ? screenerSelectedSorting.f105171b : null, Math.min(tVar.f282177c, 1000), 32);
                    this.f282149w = null;
                    this.f282150x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarV, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
