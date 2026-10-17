package zgj;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimAutoRenewalTerms;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanPointsOption;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.EsimCheckoutScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.EsimCheckoutScreenContract$ExchangeBreakdownData;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.EsimCheckoutScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.EsimCheckoutScreenContract$PlanChangeRefundInfo;
import ip0.e8;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EsimCheckoutScreen f322162w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(EsimCheckoutScreen esimCheckoutScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f322162w = esimCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f322162w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(this.f322162w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            case 2:
                i iVar3 = new i(this.f322162w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
            case 3:
                i iVar4 = new i(this.f322162w, continuation, 3);
                iVar4.v = obj2;
                return iVar4;
            case 4:
                i iVar5 = new i(this.f322162w, continuation, 4);
                iVar5.v = obj2;
                return iVar5;
            default:
                i iVar6 = new i(this.f322162w, continuation, 5);
                iVar6.v = obj2;
                return iVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((i) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        EsimCheckoutScreen esimCheckoutScreen = this.f322162w;
        switch (i) {
            case 0:
                EsimCheckoutScreenContract$ExchangeBreakdownData breakdownData = (EsimCheckoutScreenContract$ExchangeBreakdownData) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.checkout.a aVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.checkout.a) esimCheckoutScreen.d();
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(breakdownData, "breakdownData");
                oki.h.v2(aVar2.J, new EsimCheckoutScreenContract$ModalStep.ExchangeBreakdown(breakdownData), bottom_dialog);
                break;
            case 1:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.esim.impl.ui.screens.checkout.a) esimCheckoutScreen.d()).J2(aVar3.d);
                break;
            case 2:
                EsimMobilePlanPointsOption pointsOption = (EsimMobilePlanPointsOption) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.checkout.a aVar6 = (com.revolut.retail.feature.esim.impl.ui.screens.checkout.a) esimCheckoutScreen.d();
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(pointsOption, "pointsOption");
                aVar6.H2(aVar6.H, new za9.c(pointsOption, 22));
                break;
            case 3:
                e8 e8Var = (e8) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVarE3 = esimCheckoutScreen.d();
                Object obj3 = e8Var.e;
                com.revolut.retail.feature.esim.impl.ui.screens.checkout.a aVar8 = (com.revolut.retail.feature.esim.impl.ui.screens.checkout.a) yVarE3;
                if (obj3 instanceof EsimCheckoutScreenContract$PlanChangeRefundInfo) {
                    oki.h.v2(aVar8.J, new EsimCheckoutScreenContract$ModalStep.RefundBreakdown((EsimCheckoutScreenContract$PlanChangeRefundInfo) obj3), bottom_dialog);
                } else {
                    aVar8.getClass();
                }
                break;
            case 4:
                ty0.a aVar9 = (ty0.a) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVarE32 = esimCheckoutScreen.d();
                String listId = aVar9.f275445a;
                Object obj4 = aVar9.d;
                com.revolut.retail.feature.esim.impl.ui.screens.checkout.a aVar11 = (com.revolut.retail.feature.esim.impl.ui.screens.checkout.a) yVarE32;
                aVar11.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (Intrinsics.f(listId, "ID_AUTO_RENEWAL_LEARN_MORE_CLAUSE") && (obj4 instanceof EsimAutoRenewalTerms)) {
                    oki.h.v2(aVar11.J, new EsimCheckoutScreenContract$ModalStep.AutoRenewalInfo((EsimAutoRenewalTerms) obj4), bottom_dialog);
                }
                break;
            default:
                ty0.a aVar12 = (ty0.a) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.esim.impl.ui.screens.checkout.a) esimCheckoutScreen.d()).J2(aVar12.d);
                break;
        }
        return Unit.f186387a;
    }
}
