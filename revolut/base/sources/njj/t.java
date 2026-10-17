package njj;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import com.revolut.retail.feature.esim.api.model.EsimTerms;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.mappers.EsimDynamicTermsMapper$TermsClickData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreenContract$ExchangeBreakdownData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreenContract$RefundBreakdown;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreenContract$UpdatedBillParcel;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.EsimMobilePlanSummaryScreenContract$ContractStatementData;
import ip0.e8;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EsimMobilePlanCheckoutScreen f216590w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(EsimMobilePlanCheckoutScreen esimMobilePlanCheckoutScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f216590w = esimMobilePlanCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                t tVar = new t(this.f216590w, continuation, 0);
                tVar.v = obj2;
                return tVar;
            case 1:
                t tVar2 = new t(this.f216590w, continuation, 1);
                tVar2.v = obj2;
                return tVar2;
            case 2:
                t tVar3 = new t(this.f216590w, continuation, 2);
                tVar3.v = obj2;
                return tVar3;
            case 3:
                t tVar4 = new t(this.f216590w, continuation, 3);
                tVar4.v = obj2;
                return tVar4;
            case 4:
                t tVar5 = new t(this.f216590w, continuation, 4);
                tVar5.v = obj2;
                return tVar5;
            default:
                t tVar6 = new t(this.f216590w, continuation, 5);
                tVar6.v = obj2;
                return tVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((t) create((EsimMobilePlanCheckoutScreenContract$ExchangeBreakdownData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((t) create((EsimDynamicTermsMapper$TermsClickData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((t) create((EsimMobilePlanCheckoutScreenContract$UpdatedBillParcel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((t) create((EsimDataPlan) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((t) create((EsimDynamicTermsMapper$TermsClickData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((t) create((e8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        EsimMobilePlanSummaryScreenContract$ContractStatementData esimMobilePlanSummaryScreenContract$ContractStatementData;
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        EsimMobilePlanCheckoutScreen esimMobilePlanCheckoutScreen = this.f216590w;
        switch (i) {
            case 0:
                EsimMobilePlanCheckoutScreenContract$ExchangeBreakdownData breakdownData = (EsimMobilePlanCheckoutScreenContract$ExchangeBreakdownData) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a aVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a) esimMobilePlanCheckoutScreen.d();
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(breakdownData, "breakdownData");
                oki.h.v2(aVar2.H, new EsimMobilePlanCheckoutScreenContract$ModalStep.ExchangeBreakdown(breakdownData), bottom_dialog);
                break;
            case 1:
                EsimDynamicTermsMapper$TermsClickData esimDynamicTermsMapper$TermsClickData = (EsimDynamicTermsMapper$TermsClickData) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a) esimMobilePlanCheckoutScreen.d()).L2(esimDynamicTermsMapper$TermsClickData);
                break;
            case 2:
                EsimMobilePlanCheckoutScreenContract$UpdatedBillParcel updatedBillParcel = (EsimMobilePlanCheckoutScreenContract$UpdatedBillParcel) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a aVar5 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a) esimMobilePlanCheckoutScreen.d();
                aVar5.getClass();
                Intrinsics.checkNotNullParameter(updatedBillParcel, "updatedBillParcel");
                oki.h.v2(aVar5.H, new EsimMobilePlanCheckoutScreenContract$ModalStep.UpdatedBill(updatedBillParcel), bottom_dialog);
                break;
            case 3:
                EsimDataPlan mobilePlan = (EsimDataPlan) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j0 j0VarE3 = esimMobilePlanCheckoutScreen.d();
                Intrinsics.h(mobilePlan);
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a aVar7 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a) j0VarE3;
                aVar7.getClass();
                Intrinsics.checkNotNullParameter(mobilePlan, "mobilePlan");
                dej.a aVar8 = (dej.a) ((b0) ((j2) aVar7.G.f22677a).getValue()).e.getContent();
                if (aVar8 != null) {
                    String str = mobilePlan.f100212a;
                    String str2 = aVar8.d;
                    EsimDataPlanOfferInfo esimDataPlanOfferInfo = aVar8.f113472b;
                    EsimTerms esimTerms = aVar8.f;
                    esimMobilePlanSummaryScreenContract$ContractStatementData = new EsimMobilePlanSummaryScreenContract$ContractStatementData(esimTerms.e, esimDataPlanOfferInfo, str, str2, esimTerms.f);
                } else {
                    esimMobilePlanSummaryScreenContract$ContractStatementData = null;
                }
                com.revolut.kompot.navigable.vc.modal.a aVar9 = aVar7.H;
                EsimMobilePlanCheckoutScreenContract$InputData esimMobilePlanCheckoutScreenContract$InputData = aVar7.f101171p;
                if (!(esimMobilePlanCheckoutScreenContract$InputData instanceof EsimMobilePlanCheckoutScreenContract$InputData.PurchaseNewPlan)) {
                    esimMobilePlanCheckoutScreenContract$InputData = null;
                }
                EsimMobilePlanCheckoutScreenContract$InputData.PurchaseNewPlan purchaseNewPlan = (EsimMobilePlanCheckoutScreenContract$InputData.PurchaseNewPlan) esimMobilePlanCheckoutScreenContract$InputData;
                oki.h.v2(aVar9, new EsimMobilePlanCheckoutScreenContract$ModalStep.PlanSummary(mobilePlan, purchaseNewPlan != null ? purchaseNewPlan.d : null, esimMobilePlanSummaryScreenContract$ContractStatementData), bottom_dialog);
                break;
            case 4:
                EsimDynamicTermsMapper$TermsClickData esimDynamicTermsMapper$TermsClickData2 = (EsimDynamicTermsMapper$TermsClickData) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a) esimMobilePlanCheckoutScreen.d()).L2(esimDynamicTermsMapper$TermsClickData2);
                break;
            default:
                e8 e8Var = (e8) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j0 j0VarE32 = esimMobilePlanCheckoutScreen.d();
                Object obj3 = e8Var.e;
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a aVar12 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a) j0VarE32;
                if (obj3 instanceof EsimMobilePlanCheckoutScreenContract$RefundBreakdown) {
                    EsimMobilePlanCheckoutScreenContract$RefundBreakdown esimMobilePlanCheckoutScreenContract$RefundBreakdown = (EsimMobilePlanCheckoutScreenContract$RefundBreakdown) obj3;
                    oki.h.v2(aVar12.H, new EsimMobilePlanCheckoutScreenContract$ModalStep.Refund(esimMobilePlanCheckoutScreenContract$RefundBreakdown.f101166a, esimMobilePlanCheckoutScreenContract$RefundBreakdown.f101167b), bottom_dialog);
                } else {
                    aVar12.getClass();
                }
                break;
        }
        return Unit.f186387a;
    }
}
