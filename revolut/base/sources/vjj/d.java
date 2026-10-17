package vjj;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.api.model.EsimIcon;
import com.revolut.retail.feature.esim.api.model.EsimInfoBottomSheetData;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanPerk;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.EsimMobilePlanDetailsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.EsimMobilePlanDetailsScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EsimMobilePlanDetailsScreen f289761w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(EsimMobilePlanDetailsScreen esimMobilePlanDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f289761w = esimMobilePlanDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f289761w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f289761w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((EsimMobilePlanPerk) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EsimMobilePlanDetailsScreen esimMobilePlanDetailsScreen = this.f289761w;
        switch (i) {
            case 0:
                EsimMobilePlanPerk esimMobilePlanPerk = (EsimMobilePlanPerk) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarE3 = esimMobilePlanDetailsScreen.R2();
                Intrinsics.h(esimMobilePlanPerk);
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c cVar = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c) vVarE3;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(esimMobilePlanPerk, "esimMobilePlanPerk");
                EsimInfoBottomSheetData esimInfoBottomSheetData = esimMobilePlanPerk.e;
                if (esimInfoBottomSheetData == null) {
                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c.L2("Perk preview is null, can't open info bottom sheet");
                } else {
                    com.revolut.kompot.navigable.vc.modal.a aVar2 = cVar.J;
                    String str = esimMobilePlanPerk.d;
                    oki.h.v2(aVar2, new EsimMobilePlanDetailsScreenContract$ModalStep.PerkInfoBottomSheet(str != null ? new EsimIcon.Url(str) : null, esimInfoBottomSheetData), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
            default:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarE32 = esimMobilePlanDetailsScreen.R2();
                Object obj3 = aVar3.d;
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c cVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c) vVarE32;
                if (obj3 instanceof EsimDescriptorValue.Link) {
                    cVar2.getClass();
                    cVar2.l2(new a0(cVar2, (EsimDescriptorValue.Link) obj3, null), new yi5.b(26));
                } else {
                    cVar2.getClass();
                }
                break;
        }
        return Unit.f186387a;
    }
}
