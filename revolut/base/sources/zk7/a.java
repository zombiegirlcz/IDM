package zk7;

import afj.g0;
import afj.k0;
import android.os.Bundle;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.obligated_products.SwitchOutObligatedProductsScreen;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.obligated_products.SwitchOutObligatedProductsScreenContract$InputData;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block.BlockMerchantScreen;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block.BlockMerchantScreenContract$InputData;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block.BlockMerchantTransparentScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.CreditCardInstalmentRepayFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.CreditCardInstalmentRepayFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement_details.flow.CreditCardStatementDetailsFlow;
import com.revolut.feature.credit.card.impl.ui.statement_details.flow.CreditCardStatementDetailsFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.customer.FreelancerAddCustomerScreen;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.customer.FreelancerAddCustomerScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.status_update.CFACClaimStatusUpdateScreen;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.status_update.CFACClaimStatusUpdateScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.documents_hint.DocumentsHintScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.documents_hint.DocumentsHintScreenContract$InputData;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.ChallengesOverviewContract$Step;
import com.revolut.feature.payments.groups.impl.ui_new.customize.GroupCustomizationScreen;
import com.revolut.feature.payments.groups.impl.ui_new.customize.GroupCustomizationScreenContract$InputData;
import com.revolut.feature.pricingplans.models.PricingPlanTextDescriptor;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.option_selection.SavingsOptionSelectionContract$InputData;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.option_selection.SavingsOptionSelectionController;
import com.revolut.feature.tax_residency.impl.flows.list.TaxResidenciesListFlow;
import com.revolut.feature.tax_residency.impl.flows.list.TaxResidenciesListFlowContract$InputData;
import com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferLocateInputData;
import com.revolut.feature.transfer.core.impl.ui.transfer.locate.TransferLocateScreen;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.upcoming_dividends.UpcomingDividendsController;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_action.EsimMobilePlanPhoneNumberActionScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_action.EsimMobilePlanPhoneNumberActionScreenContract$InputData;
import com.revolut.sso.impl.ui.external_entry.external_entry.ExternalEntryFlowContract$InputData;
import com.revolut.sso.impl.ui.external_entry.external_entry.ExternalEntryFlowImpl;
import com.revolut.sso.impl.ui.reauthentication_wrapper.wrapper_flow.ReauthenticationWrapperFlow;
import com.revolut.sso.impl.ui.reauthentication_wrapper.wrapper_flow.ReauthenticationWrapperFlowContract$InputData;
import com.revolut.trading.orders.ui.screens.investment_plan.projection.InvestmentProjectionsScreen;
import com.revolut.trading.orders.ui.screens.investment_plan.projection.InvestmentProjectionsScreenContract$InputData;
import ine.n;
import ine.o;
import ip0.v7;
import jm4.a3;
import jm4.h1;
import jm4.n2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import ljl.o0;
import ljl.q0;
import lpf.i;
import lpf.j;
import lpf.y;
import nk7.q;
import nk7.r;
import ql7.a0;
import ql7.k1;
import rlb.h;
import vkm.c2;
import vkm.d2;
import vn2.b0;
import xsl.p;
import ybl.l;
import zhm.h0;
import zmk.k;
import ztg.m;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f322911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f322912c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f322910a = i;
        this.f322911b = obj2;
        this.f322912c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v1, types: [b60.a] */
    /* JADX WARN: Type inference failed for: r7v33 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f322910a;
        Object obj2 = this.f322912c;
        Object obj3 = this.f322911b;
        switch (i) {
            case 0:
                CFACClaimStatusUpdateScreenContract$InputData cFACClaimStatusUpdateScreenContract$InputData = (CFACClaimStatusUpdateScreenContract$InputData) obj2;
                KProperty[] kPropertyArr = CFACClaimStatusUpdateScreen.f75142a0;
                qji.b bVarQ2 = ((CFACClaimStatusUpdateScreen) obj3).Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.insurance.impl.ui.cfac.my_claims.status_update.di.CFACClaimStatusUpdateScreenInjector");
                r rVar = (r) bVarQ2;
                q qVar = rVar.f216721b;
                r rVar2 = rVar.f216722c;
                cFACClaimStatusUpdateScreenContract$InputData.getClass();
                return new nk7.g(qVar, rVar2, cFACClaimStatusUpdateScreenContract$InputData);
            case 1:
                wbf.a aVar = ((zke.g) obj3).f;
                lbf.f tradingAddOnCode = lbf.f.TRADING_PRO;
                Intrinsics.checkNotNullParameter(tradingAddOnCode, "tradingAddOnCode");
                return vkm.q.M(rd0.e.e(nim.a.A(v7.y("InvestActionsProvider", "addOnEnabledFlow", xam.a.h(new u29.c(aVar, tradingAddOnCode, (Continuation) , 25), l.d(aVar.f296142b))), new zke.f(4)), h0.f322473a, new z6k.l(3, 4, null)), (CoroutineScope) obj2, c2.a(d2.Companion, 2000L, 2), 1);
            case 2:
                ((com.revolut.kompot.navigable.a) obj3).e((Bundle) obj2);
                return Unit.f186387a;
            case 3:
                SavingsOptionSelectionController savingsOptionSelectionController = (SavingsOptionSelectionController) obj3;
                KProperty[] kPropertyArr2 = SavingsOptionSelectionController.T;
                qji.b bVarU2 = savingsOptionSelectionController.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.option_selection.di.SavingsOptionSelectionControllerInjector");
                rlb.g gVar = (rlb.g) bVarU2;
                return new h(gVar.f254990b, gVar.f254991c, savingsOptionSelectionController, (SavingsOptionSelectionContract$InputData) obj2);
            case 4:
                qji.b bVarU22 = ((EsimMobilePlanPhoneNumberActionScreen) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_action.di.EsimMobilePlanPhoneNumberActionScreenInjector");
                k0 k0Var = (k0) bVarU22;
                return new g0(k0Var.f4310b, k0Var.f4311c, (EsimMobilePlanPhoneNumberActionScreenContract$InputData) obj2);
            case 5:
                k kVar = (k) obj3;
                kVar.l2(new zmk.h(kVar, (PricingPlanTextDescriptor.Action.UrlNavigation) obj2, null), new yi5.b(26));
                return Unit.f186387a;
            case 6:
                ExternalEntryFlowImpl externalEntryFlowImpl = (ExternalEntryFlowImpl) obj3;
                ExternalEntryFlowContract$InputData externalEntryFlowContract$InputData = (ExternalEntryFlowContract$InputData) obj2;
                KProperty[] kPropertyArr3 = ExternalEntryFlowImpl.f106553a0;
                phm.a aVar2 = (phm.a) ue0.e.j(externalEntryFlowImpl.m2()).a().get(kjl.c.class);
                 = aVar2 != null ? (b60.a) aVar2.get() : 0;
                if ( != 0) {
                    return new kjl.b(((kjl.c) b()).i, externalEntryFlowImpl, externalEntryFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", kjl.c.class, " is not found"));
            case 7:
                TaxResidenciesListFlowContract$InputData taxResidenciesListFlowContract$InputData = (TaxResidenciesListFlowContract$InputData) obj2;
                phm.a aVar3 = (phm.a) ue0.e.j(((TaxResidenciesListFlow) obj3).m2()).a().get(o.class);
                b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar4 != null) {
                    return new n(((o) aVar4.b()).f162885l, taxResidenciesListFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
            case 8:
                return new o0(((q0) kli.a.n(((ReauthenticationWrapperFlow) obj3).m2())).E, (ReauthenticationWrapperFlowContract$InputData) obj2);
            case 9:
                SwitchOutObligatedProductsScreenContract$InputData switchOutObligatedProductsScreenContract$InputData = (SwitchOutObligatedProductsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr4 = SwitchOutObligatedProductsScreen.P;
                phm.a aVar5 = (phm.a) ue0.e.j(((SwitchOutObligatedProductsScreen) obj3).m2()).a().get(vn2.h.class);
                b60.a aVar6 = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar6 != null) {
                    return new b0(((vn2.h) aVar6.b()).f290682l, switchOutObligatedProductsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
            case 10:
                oki.h.w2(((com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b) obj3).f77400t, new ChallengesOverviewContract$Step.TaxesBreakdown(((ChallengesOverviewContract$Step.GmfBreakdown) ((ChallengesOverviewContract$Step) obj2)).f77387a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Unit.f186387a;
            case 11:
                zp8.h hVar = (zp8.h) obj3;
                return vkm.q.M(rd0.e.b(hVar.f324194a.a(hVar.f324196c, true)), (CoroutineScope) obj2, c2.a(d2.Companion, 0L, 3), 1);
            case 12:
                KProperty[] kPropertyArr5 = DocumentsHintScreen.Z;
                qji.b bVarQ22 = ((DocumentsHintScreen) obj3).Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.documents_hint.di.DocumentsHintScreenInjector");
                k1 k1Var = (k1) bVarQ22;
                return new a0(k1Var.f247369b, k1Var.f247370c, (DocumentsHintScreenContract$InputData) obj2);
            case 13:
                TransferLocateScreen transferLocateScreen = (TransferLocateScreen) obj3;
                TransferLocateInputData transferLocateInputData = (TransferLocateInputData) obj2;
                KProperty[] kPropertyArr6 = TransferLocateScreen.f92223b0;
                phm.a aVar7 = (phm.a) ue0.e.j(transferLocateScreen.m2()).a().get(wof.a.class);
                b60.a aVar8 = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar8 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", wof.a.class, " is not found"));
                }
                i iVar = ((i) ((y) aVar8.b())).o;
                transferLocateInputData.getClass();
                return new j(iVar, transferLocateScreen, transferLocateInputData);
            case 14:
                BlockMerchantScreen blockMerchantScreen = (BlockMerchantScreen) obj3;
                KProperty[] kPropertyArr7 = BlockMerchantScreen.f64239a0;
                qji.b bVarQ23 = blockMerchantScreen.Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block.di.BlockMerchantScreenInjector");
                tr2.i iVar2 = (tr2.i) bVarQ23;
                return new tr2.j(iVar2.f273638b, iVar2.f273639c, blockMerchantScreen, (BlockMerchantScreenContract$InputData) obj2);
            case 15:
                BlockMerchantTransparentScreen blockMerchantTransparentScreen = (BlockMerchantTransparentScreen) obj3;
                qji.b bVarQ24 = blockMerchantTransparentScreen.Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block.di.BlockMerchantScreenInjector");
                tr2.i iVar3 = (tr2.i) bVarQ24;
                return new tr2.j(iVar3.f273638b, iVar3.f273639c, blockMerchantTransparentScreen, (BlockMerchantScreenContract$InputData) obj2);
            case 16:
                CreditCardInstalmentRepayFlowContract$InputData creditCardInstalmentRepayFlowContract$InputData = (CreditCardInstalmentRepayFlowContract$InputData) obj2;
                phm.a aVar9 = (phm.a) ue0.e.j(((CreditCardInstalmentRepayFlow) obj3).m2()).a().get(a3.class);
                b60.a aVar10 = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar10 != null) {
                    return new h1(((a3) aVar10.b()).Y, creditCardInstalmentRepayFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            case 17:
                GroupCustomizationScreen groupCustomizationScreen = (GroupCustomizationScreen) obj3;
                KProperty[] kPropertyArr8 = GroupCustomizationScreen.g0;
                qji.b bVarQ25 = groupCustomizationScreen.Q2();
                Intrinsics.i(bVarQ25, "null cannot be cast to non-null type com.revolut.feature.payments.groups.impl.ui_new.customize.di.GroupCustomizationScreenInjector");
                kr9.k kVar2 = (kr9.k) bVarQ25;
                return new kr9.f(kVar2.f188754b, kVar2.f188755c, groupCustomizationScreen, (GroupCustomizationScreenContract$InputData) obj2);
            case 18:
                KProperty[] kPropertyArr9 = UpcomingDividendsController.R;
                qji.b bVarU23 = ((UpcomingDividendsController) obj3).U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.wealth.account_closure.impl.ui.screens.upcoming_dividends.di.UpcomingDividendsComponent.Injector");
                ztg.h hVar2 = (ztg.h) bVarU23;
                return new m(hVar2.f325134b, hVar2.f325135c, (zug.b) obj2);
            case 19:
                InvestmentProjectionsScreen investmentProjectionsScreen = (InvestmentProjectionsScreen) obj3;
                InvestmentProjectionsScreenContract$InputData investmentProjectionsScreenContract$InputData = (InvestmentProjectionsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr10 = InvestmentProjectionsScreen.f107027e0;
                phm.a aVar11 = (phm.a) ue0.e.j(investmentProjectionsScreen.m2()).a().get(p.class);
                b60.a aVar12 = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar12 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                }
                p pVar = ((p) aVar12.b()).O;
                investmentProjectionsScreenContract$InputData.getClass();
                a3h.e eVar = new a3h.e(investmentProjectionsScreenContract$InputData.f107031a);
                usc.a aVar13 = investmentProjectionsScreen.Z;
                aVar13.getClass();
                zul.d dVar = investmentProjectionsScreen.f107029b0;
                dVar.getClass();
                jsl.d dVar2 = investmentProjectionsScreen.f107028a0;
                dVar2.getClass();
                return new xsl.j(pVar, new f3h.b(), new f3h.a(), investmentProjectionsScreen, dVar2, investmentProjectionsScreenContract$InputData, aVar13, eVar, dVar);
            case 20:
                CreditCardStatementDetailsFlowContract$InputData creditCardStatementDetailsFlowContract$InputData = (CreditCardStatementDetailsFlowContract$InputData) obj2;
                phm.a aVar14 = (phm.a) ue0.e.j(((CreditCardStatementDetailsFlow) obj3).m2()).a().get(a3.class);
                b60.a aVar15 = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar15 != null) {
                    return new n2(((a3) aVar15.b()).Y, creditCardStatementDetailsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            case 21:
                FreelancerAddCustomerScreenContract$InputData freelancerAddCustomerScreenContract$InputData = (FreelancerAddCustomerScreenContract$InputData) obj2;
                KProperty[] kPropertyArr11 = FreelancerAddCustomerScreen.f73759b0;
                phm.a aVar16 = (phm.a) ue0.e.j(((FreelancerAddCustomerScreen) obj3).m2()).a().get(us6.q.class);
                b60.a aVar17 = aVar16 != null ? (b60.a) aVar16.get() : null;
                if (aVar17 != null) {
                    return new us6.o(((us6.q) aVar17.b()).Q, freelancerAddCustomerScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
            case 22:
                com.revolut.feature.topup_screen.impl.google_pay.flow.b bVar = (com.revolut.feature.topup_screen.impl.google_pay.flow.b) obj2;
                if (!((Ref$BooleanRef) obj3).f186407a) {
                    bVar.C2(new ste.l(false));
                }
                return Unit.f186387a;
            default:
                yki.b bVar2 = (yki.b) obj2;
                if (!((Ref$BooleanRef) obj3).f186407a) {
                    oki.h.D2(bVar2);
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ a(Ref$BooleanRef ref$BooleanRef, com.revolut.feature.topup_screen.impl.google_pay.flow.b bVar, yki.b bVar2) {
        this.f322910a = 23;
        this.f322911b = ref$BooleanRef;
        this.f322912c = bVar2;
    }
}
