package wfh;

import jel.w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class t extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f297144w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f297145x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.private_equity.impl.ui.fund_details.d f297146y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i, com.revolut.feature.wealth.private_equity.impl.ui.fund_details.d dVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f297146y = dVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                t tVar = new t(0, this.f297146y, continuation);
                tVar.f297144w = flowCollector;
                tVar.f297145x = obj3;
                return tVar.invokeSuspend(Unit.f186387a);
            default:
                t tVar2 = new t(1, this.f297146y, continuation);
                tVar2.f297144w = flowCollector;
                tVar2.f297145x = obj3;
                return tVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        rdh.b bVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f297144w;
                    switch (r.f297142a[((w) this.f297145x).ordinal()]) {
                        case 1:
                            bVar = rdh.b.VENTURE_CAPITAL_ASSET_DETAILS;
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            bVar = rdh.b.PRIVATE_MARKETS_RISK_WARNING;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    wkm.l lVarZ2 = ((gah.e) this.f297146y.B).Z2(zhm.u.c(bVar));
                    this.f297144w = null;
                    this.f297145x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, lVarZ2, this) == aVar) {
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
                com.revolut.feature.wealth.private_equity.impl.ui.fund_details.d dVar = this.f297146y;
                ybl.b bVar2 = dVar.f95788q;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f297144w;
                    String str = (String) this.f297145x;
                    j23.b bVarE = yh5.b.e(rd0.e.b(((ael.k) bVar2).f(str)), ((ael.k) bVar2).o(str, w4l.h.f294642c), nim.a.v(rd0.e.b(dVar.o.a(str, false)), u.f297147a));
                    this.f297144w = null;
                    this.f297145x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, bVarE, this) == aVar2) {
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
