package pmj;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.EsimMobilePlanSummaryScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.EsimMobilePlanSummaryScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimMobilePlanSummaryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(EsimMobilePlanSummaryScreen esimMobilePlanSummaryScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimMobilePlanSummaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((EsimCoverage.Regional) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        EsimCoverage.Regional coverage = (EsimCoverage.Regional) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVarD3 = this.v.d();
        Intrinsics.h(coverage);
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.a aVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.a) jVarD3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(coverage, "coverage");
        oki.h.v2(aVar2.f101413s, new EsimMobilePlanSummaryScreenContract$ModalStep.IncludedCountries(coverage), ModalDestination.Style.POPUP.f98311a);
        return Unit.f186387a;
    }
}
