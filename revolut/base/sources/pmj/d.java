package pmj;

import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.EsimMobilePlanSummaryScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.EsimMobilePlanSummaryScreenContract$ContractStatementData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EsimMobilePlanSummaryScreen f237598w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(EsimMobilePlanSummaryScreen esimMobilePlanSummaryScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f237598w = esimMobilePlanSummaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f237598w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f237598w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            default:
                d dVar3 = new d(this.f237598w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EsimMobilePlanSummaryScreen esimMobilePlanSummaryScreen = this.f237598w;
        switch (i) {
            case 0:
                EsimMobilePlanSummaryScreenContract$ContractStatementData contractStatement = (EsimMobilePlanSummaryScreenContract$ContractStatementData) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarD3 = esimMobilePlanSummaryScreen.d();
                Intrinsics.h(contractStatement);
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.a aVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.a) jVarD3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(contractStatement, "contractStatement");
                aVar2.A1(new pdi.j(aVar2, contractStatement, null, 25), new yi5.b(25));
                break;
            case 1:
                h hVar = (h) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarD32 = esimMobilePlanSummaryScreen.d();
                Intrinsics.h(hVar);
                ((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.a) jVarD32).I2(hVar);
                break;
            default:
                h hVar2 = (h) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarD33 = esimMobilePlanSummaryScreen.d();
                Intrinsics.h(hVar2);
                ((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.a) jVarD33).I2(hVar2);
                break;
        }
        return Unit.f186387a;
    }
}
