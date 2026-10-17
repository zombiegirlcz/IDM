package vjj;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanPerk;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.EsimMobilePlanDetailsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.EsimMobilePlanDetailsScreenContract$EndTextClickParcel$CoverageCountries;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.EsimMobilePlanDetailsScreenContract$ModalStep;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimMobilePlanDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EsimMobilePlanDetailsScreen esimMobilePlanDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimMobilePlanDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarE3 = this.v.R2();
        Object obj3 = model.o;
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c cVar = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c) vVarE3;
        cVar.getClass();
        if (obj3 instanceof EsimMobilePlanPerk) {
            String str = ((EsimMobilePlanPerk) obj3).f100303c;
            String strV = str != null ? a0.d.v(new Object[]{str}, 1, "revolut://app/offers/%s", "format(...)") : null;
            if (strV != null) {
                cVar.l2(new vge.r(cVar, strV, null, 17), new yi5.b(26));
            } else {
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c.L2("Can't open perk redemption flow, perkId is null");
            }
        } else if (obj3 instanceof EsimMobilePlanDetailsScreenContract$EndTextClickParcel$CoverageCountries) {
            List list = ((EsimMobilePlanDetailsScreenContract$EndTextClickParcel$CoverageCountries) obj3).f101190a;
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c.L2("Coverage countries is null or empty, can't display coverage countries modal");
            } else {
                oki.h.v2(cVar.J, new EsimMobilePlanDetailsScreenContract$ModalStep.CoverageCountries(list), ModalDestination.Style.POPUP.f98311a);
            }
        }
        return Unit.f186387a;
    }
}
