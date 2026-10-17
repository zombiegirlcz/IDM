package w65;

import aii.q;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.selection.KontomatikSelectionController;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.intro.CreditOfferTypeSelectionScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method.SepaDirectDebitRepaymentMethodController;
import com.revolut.feature.credit.loan.impl.ui.rev10.documents.section.LoanDocumentSectionController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.multipleborrowers.LoanRepaymentAccountsController;
import com.revolut.feature.credit.loan.impl.ui.statements.LoanStatementsListScreen;
import com.revolut.feature.crypto.asset.details.impl.dialog.staking_rewards.StakingRewardsDialogController;
import com.revolut.feature.devicemanagement.impl.ui.list.DeviceListController;
import com.revolut.feature.junior_profile.impl.ui.screen.details.JuniorProfileDetailsScreen;
import com.revolut.feature.pix.impl.flow.automatico.screens.past_authorisations.PixAutomaticoPastAuthorisationsScreen;
import com.revolut.feature.pix.screens.token_verification.TokenVerificationScreen;
import com.revolut.feature.retail.salary_account.impl.salary_promotion.SalaryPromotionController;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreen;
import com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.SignInMethodsScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.investments.return_breakdown.ManagedPortfolioReturnBreakdownController;
import com.revolut.retail.feature.crypto_deposits.impl.ui.bottom_sheet.return_details.CryptoDepositReturnDetailsBottomSheetController;
import com.revolut.shared.feature.offboarding.impl.ui.home.OffboardingScreen;
import eoi.r;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import nii.n1;
import rp0.p;
import skm.a2;
import vkm.z1;
import w72.j;
import w75.l;
import w7b.o;
import wc4.k;
import zhm.d0;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c((LoanDocumentSectionController) this.v, continuation, 0);
            case 1:
                return new c((ManagedPortfolioReturnBreakdownController) this.v, continuation, 1);
            case 2:
                return new c((j) this.v, continuation, 2);
            case 3:
                return new c((LoanRepaymentAccountsController) this.v, continuation, 3);
            case 4:
                return new c((l) this.v, continuation, 4);
            case 5:
                return new c((o) this.v, continuation, 5);
            case 6:
                return new c((tyl.a) this.v, continuation, 6);
            case 7:
                return new c((LoanStatementsListScreen) this.v, continuation, 7);
            case 8:
                return new c((DeviceListController) this.v, continuation, 8);
            case 9:
                return new c((OffboardingScreen) this.v, continuation, 9);
            case 10:
                return new c((PixAutomaticoPastAuthorisationsScreen) this.v, continuation, 10);
            case 11:
                return new c((wa4.e) this.v, continuation, 11);
            case 12:
                return new c((waj.a) this.v, continuation, 12);
            case 13:
                return new c((CryptoDepositReturnDetailsBottomSheetController) this.v, continuation, 13);
            case 14:
                return new c((KontomatikSelectionController) this.v, continuation, 14);
            case 15:
                return new c((StakingRewardsDialogController) this.v, continuation, 15);
            case 16:
                return new c((TokenVerificationScreen) this.v, continuation, 16);
            case 17:
                return new c((SharedAlertsScreen) this.v, continuation, 17);
            case 18:
                return new c((CreditOfferTypeSelectionScreen) this.v, continuation, 18);
            case 19:
                return new c((SalaryPromotionController) this.v, continuation, 19);
            case 20:
                return new c((com.revolut.feature.retail.salary_account.impl.salary_promotion.b) this.v, continuation, 20);
            case 21:
                return new c((SepaDirectDebitRepaymentMethodController) this.v, continuation, 21);
            case 22:
                return new c((whe.c) this.v, continuation, 22);
            case 23:
                return new c((com.revolut.kompot.bridge.impl.rootflow.a) this.v, continuation, 23);
            case 24:
                return new c((com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.c) this.v, continuation, 24);
            case 25:
                return new c((JuniorProfileDetailsScreen) this.v, continuation, 25);
            case 26:
                return new c((wjd.d) this.v, continuation, 26);
            case 27:
                return new c((SignInMethodsScreen) this.v, continuation, 27);
            case 28:
                return new c((com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a) this.v, continuation, 28);
            default:
                return new c((com.revolut.feature.atm.impl.ui.redesign.v2.map.a) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c) create((p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                return ((c) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((zv0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v130, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v81, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LinkedHashMap linkedHashMapP = null;
        Object[] objArr = 0;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((h) ((LoanDocumentSectionController) this.v).O.getValue()).B2();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ManagedPortfolioReturnBreakdownController) this.v).c3(q.f5292a);
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((j) this.v).C2(w72.c.f295456a);
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((LoanRepaymentAccountsController) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVar = (l) this.v;
                lVar.H2(lVar.f295482t, new w6h.f(2));
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((o) this.v).invoke();
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((tyl.a) this.v).invoke();
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((LoanStatementsListScreen) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((DeviceListController) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((w8l.j) ((OffboardingScreen) this.v).R2()).B2();
                return Unit.f186387a;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((w9a.g) ((w9a.e) ((PixAutomaticoPastAuthorisationsScreen) this.v).L.getValue())).B2();
                return Unit.f186387a;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wa4.e eVar = (wa4.e) this.v;
                eVar.n2(new w76.a(eVar, objArr == true ? 1 : 0, 3), new whi.b(6));
                return Unit.f186387a;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vaj.o oVar = (vaj.o) j6.a.k(vaj.o.class, ((waj.a) this.v).f295946c, "CRYPTO_PRE_LAUNCH_STORAGE_KEY");
                if (oVar != null) {
                    return qk.d.y(oVar);
                }
                return null;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((wbj.f) ((CryptoDepositReturnDetailsBottomSheetController) this.v).h3()).B2();
                return Unit.f186387a;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((k) ((KontomatikSelectionController) this.v).N.getValue()).I2(wc4.c.f296335a);
                return Unit.f186387a;
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((wc5.e) ((StakingRewardsDialogController) this.v).T.getValue()).C2(q.f5292a);
                return Unit.f186387a;
            case 16:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((TokenVerificationScreen) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 17:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((SharedAlertsScreen) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 18:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((wf4.h) ((CreditOfferTypeSelectionScreen) this.v).O.getValue()).C2(wf4.d.f296965a);
                return Unit.f186387a;
            case 19:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.retail.salary_account.impl.salary_promotion.b) ((SalaryPromotionController) this.v).R2()).B2();
                return Unit.f186387a;
            case 20:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z1 z1Var = ((com.revolut.feature.retail.salary_account.impl.salary_promotion.b) this.v).v;
                Boolean bool = (Boolean) d0.d0(z1Var.d());
                z1Var.k(Boolean.valueOf(bool != null ? bool.booleanValue() : false));
                return Unit.f186387a;
            case 21:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method.a) ((SepaDirectDebitRepaymentMethodController) this.v).R2()).J2(wh4.h.f297401a);
                return Unit.f186387a;
            case 22:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (r.f127969a.get() == eoi.q.FINISHED) {
                    ConcurrentHashMap concurrentHashMap = r.f127970b;
                    ConcurrentHashMap concurrentHashMap2 = r.f127971c;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(concurrentHashMap2.size()));
                    for (Map.Entry entry : concurrentHashMap2.entrySet()) {
                        linkedHashMap.put(entry.getKey(), Long.valueOf(((Number) entry.getValue()).longValue() - r.d));
                    }
                    linkedHashMapP = r0.p(concurrentHashMap, linkedHashMap);
                }
                if (linkedHashMapP != null) {
                    whe.c cVar = (whe.c) this.v;
                    Map mapQ = r0.q(linkedHashMapP, new Pair("transactionsCount", new Integer(((Number) cVar.f297628c.f.getValue()).intValue())));
                    com.revolut.analytics.tracking.v3.d dVar = cVar.f297627b;
                    AtomicReference atomicReference = r.f127969a;
                    ((com.revolut.analytics.tracking.v3.f) dVar).j("login_to_home", r.e, mapQ, AnalyticsProduct.Shared.MobilePlatform.f);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a2 a2Var = ((com.revolut.kompot.bridge.impl.rootflow.a) this.v).L;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                com.revolut.kompot.bridge.impl.rootflow.a aVar25 = (com.revolut.kompot.bridge.impl.rootflow.a) this.v;
                aVar25.L = yji.l.a1(aVar25, rd0.e.b(msb.a.a(aVar25.G)), null, null, null, 7);
                return Unit.f186387a;
            case 24:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(((com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.c) this.v).u);
                return Unit.f186387a;
            case 25:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((oki.h) ((JuniorProfileDetailsScreen) this.v).e3()).B2();
                return Unit.f186387a;
            case 26:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(((wjd.d) this.v).f298041m.e());
            case 27:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a) ((wjd.j) ((SignInMethodsScreen) this.v).Q.getValue())).B2();
                return Unit.f186387a;
            case 28:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return ((com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a) this.v).f87247p.b();
            default:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.atm.impl.ui.redesign.v2.map.a aVar32 = (com.revolut.feature.atm.impl.ui.redesign.v2.map.a) this.v;
                Integer num = (Integer) aVar32.o.o.f290128a.getValue();
                if (num == null) {
                    return Unit.f186387a;
                }
                aVar32.H2(aVar32.C, new l2c.l(num.intValue(), 29));
                return Unit.f186387a;
        }
    }
}
