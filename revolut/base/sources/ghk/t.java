package ghk;

import android.accounts.Account;
import android.accounts.AccountManager;
import com.revolut.feature.apm.bills.f24.impl.ui.forms_list.FormsListScreen;
import com.revolut.feature.apm.bills.f24.impl.ui.forms_list.FormsListScreenContract$InputData;
import com.revolut.feature.bank_account_switching.impl.ui.terms_and_conditions.TermsAndConditionsScreen;
import com.revolut.feature.bank_account_switching.impl.ui.terms_and_conditions.TermsAndConditionsScreenContract$InputData;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.page.BlockedPaymentsListScreen;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.page.BlockedPaymentsListScreenContract$Input;
import com.revolut.feature.credit.card.impl.ui.repay.flow.CreditCardRepayFlow;
import com.revolut.feature.credit.card.impl.ui.repay.flow.CreditCardRepayFlowContract$InputData;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoBeneficiaryDetailsScreenContract$InputData;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails.CryptoBeneficiaryDetailsScreen;
import com.revolut.feature.feedback.api.flow.OneClickFeedbackFlowContract$InputData;
import com.revolut.feature.feedback.api.navigation.OneClickFeedbackFlowDescriptor;
import com.revolut.feature.freelancer.impl.ui.profile.email_flow.check_email.FreelancerCheckEmailScreen;
import com.revolut.feature.freelancer.impl.ui.profile.email_flow.check_email.FreelancerCheckEmailScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.claim.select_expenses.CFACInsuranceSelectExpensesScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.select_expenses.CFACInsuranceSelectExpensesScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.flow.mta.MtaFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.mta.MtaFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.flow.upload_documents.UploadDocumentsFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.upload_documents.UploadDocumentsFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.review.MtaReviewScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.review.MtaReviewScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.payment.PaymentBreakdownScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.payment.PaymentBreakdownScreenContract$InputData;
import com.revolut.feature.payments.money_request.api.navigation.ManualTransferInputData;
import com.revolut.feature.profile.impl.ui.documents_redesigned.document_selector.DocumentSelectorScreen;
import com.revolut.feature.profile.impl.ui.documents_redesigned.document_selector.DocumentSelectorScreenContract$InputData;
import com.revolut.feature.raffle.impl.flow.RaffleFlow;
import com.revolut.feature.raffle.impl.flow.RaffleFlowContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.CategoryManagementListContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.CategoryManagementListController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.execution.IncomeSorterExecutionContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.execution.IncomeSorterExecutionController;
import com.revolut.feature.tax_residency.impl.flows.tin.TaxNumberInputFlow;
import com.revolut.feature.tax_residency.impl.flows.tin.TaxNumberInputFlowContract$InputData;
import com.revolut.feature.transfer.core.impl.ui.reason.chooser.ReasonForTransferChooserScreen;
import com.revolut.feature.transfer.core.impl.ui.reason.chooser.ReasonForTransferChooserScreenContract$InputData;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow.ManualTransferFlow;
import com.revolut.feature.travel.experiences.impl.ui.flow.checkout.TravelExperiencesCheckoutFlow;
import com.revolut.feature.travel.experiences.impl.ui.flow.checkout.TravelExperiencesCheckoutFlowContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.recommended_flight.TravelMilesRecommendedFlightsScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.recommended_flight.TravelMilesRecommendedFlightsScreenContract$InputData;
import com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.AccountClosureFlow;
import com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.AccountClosureFlowContract$InputData;
import com.revolut.feature.wealth.analytics.ui.widgetised.total_value.WidgetisedAnalyticsTotalValueScreen;
import com.revolut.feature.wealth.analytics.ui.widgetised.total_value.WidgetisedAnalyticsTotalValueScreenContract$InputData;
import com.revolut.feature.wealth.ui.impl.holding.disclaimer.explanation.CashHoldingFundsExplanationScreen;
import com.revolut.feature.wealth.ui.impl.holding.disclaimer.explanation.CashHoldingFundsExplanationScreenContract$InputData;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Limit;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.sso.impl.ui.identifier_input.IdentifierInputScreen;
import com.revolut.sso.impl.ui.identifier_input.IdentifierInputScreenContract$InputData;
import com.revolut.trading.orders.ui.screens.schedule.ScheduleSettingsScreen;
import gld.f0;
import gul.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jm4.a3;
import jm4.z1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ljl.j1;
import ppd.j0;
import ql7.k0;
import ql7.k1;
import ql7.s1;
import ql7.t0;
import ql7.t1;
import ql7.x0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class t implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f143986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f143987c;

    public /* synthetic */ t(Object obj2, Object obj3, int i) {
        this.f143985a = i;
        this.f143986b = obj2;
        this.f143987c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v2, types: [b60.a] */
    /* JADX WARN: Type inference failed for: r5v61 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object next;
        Amount amount;
        int i = this.f143985a;
        boolean z = false;
        boolValueOf = null;
        Boolean boolValueOf = null;
        Object obj2 = this.f143987c;
        Object obj3 = this.f143986b;
        switch (i) {
            case 0:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d dVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d) obj3;
                dVar.l2(new v(dVar, (String) obj2, , z ? 1 : 0), new yi5.b(26));
                return Unit.f186387a;
            case 1:
                KProperty[] kPropertyArr = TravelMilesRecommendedFlightsScreen.U;
                qji.b bVarU2 = ((TravelMilesRecommendedFlightsScreen) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.recommended_flight.di.TravelMilesRecommendedFlightsScreenInjector");
                ufg.t tVar = (ufg.t) bVarU2;
                return new ufg.u(tVar.f279793b, tVar.f279794c, (TravelMilesRecommendedFlightsScreenContract$InputData) obj2);
            case 2:
                KProperty[] kPropertyArr2 = CFACInsuranceSelectExpensesScreen.c0;
                qji.b bVarQ2 = ((CFACInsuranceSelectExpensesScreen) obj3).Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.insurance.impl.ui.cfac.claim.select_expenses.di.CFACInsuranceSelectExpensesScreenInjector");
                nk7.j jVar = (nk7.j) bVarQ2;
                return new nk7.w(jVar.f216688b, jVar.f216689c, (CFACInsuranceSelectExpensesScreenContract$InputData) obj2);
            case 3:
                jld.f fVar = ((f0) obj3).f144640n;
                jld.d dVar2 = (jld.d) ((jld.e) obj2);
                String feedbackId = dVar2.f175716a;
                int i2 = dVar2.f175717b;
                jld.k kVar = (jld.k) fVar;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(feedbackId, "feedbackId");
                kVar.f175728c.k(new jld.a(new OneClickFeedbackFlowDescriptor(new OneClickFeedbackFlowContract$InputData.Comment(feedbackId, i2))));
                return Unit.f186387a;
            case 4:
                CashHoldingFundsExplanationScreenContract$InputData cashHoldingFundsExplanationScreenContract$InputData = (CashHoldingFundsExplanationScreenContract$InputData) obj2;
                int i3 = CashHoldingFundsExplanationScreen.U;
                phm.a aVar = (phm.a) ue0.e.j(((CashHoldingFundsExplanationScreen) obj3).m2()).a().get(vhh.a.class);
                 = aVar != null ? (b60.a) aVar.get() : 0;
                if ( != 0) {
                    return new mkh.c(((mkh.s) ((mkh.u) b())).l0, cashHoldingFundsExplanationScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", vhh.a.class, " is not found"));
            case 5:
                gm0.m mVar = (gm0.m) obj3;
                String str = (String) obj2;
                e8.r.d(mVar.f144750h, null, 3);
                mVar.f144748c.clear();
                AccountManager accountManager = mVar.f144747b;
                Account[] accounts = accountManager.getAccounts();
                Intrinsics.checkNotNullExpressionValue(accounts, "getAccounts(...)");
                ArrayList arrayListC = gm0.m.c(accounts);
                ArrayList<Account> arrayList = new ArrayList();
                for (Object obj4 : arrayListC) {
                    if (gm0.m.g(mVar, str, (Account) obj4)) {
                        arrayList.add(obj4);
                    }
                }
                for (Account account : arrayList) {
                    try {
                        if (!accountManager.removeAccount(account, null, null, null).getResult().getBoolean("booleanResult")) {
                            throw new IllegalStateException("Account manager returned 'false' on account deletion request");
                        }
                    } catch (Throwable th10) {
                        IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Unable to delete account (type: ", account.type, ")"), th10);
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    }
                }
                return Unit.f186387a;
            case 6:
                MtaFlowContract$InputData mtaFlowContract$InputData = (MtaFlowContract$InputData) obj2;
                phm.a aVar2 = (phm.a) ue0.e.j(((MtaFlow) obj3).m2()).a().get(fl7.a.class);
                b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar3 != null) {
                    return new t0(((k0) aVar3.b()).f247359n, mtaFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", fl7.a.class, " is not found"));
            case 7:
                UploadDocumentsFlowContract$InputData uploadDocumentsFlowContract$InputData = (UploadDocumentsFlowContract$InputData) obj2;
                phm.a aVar4 = (phm.a) ue0.e.j(((UploadDocumentsFlow) obj3).m2()).a().get(fl7.a.class);
                b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar5 != null) {
                    return new k1(((k0) aVar5.b()).f247359n, uploadDocumentsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", fl7.a.class, " is not found"));
            case 8:
                KProperty[] kPropertyArr3 = DocumentSelectorScreen.R;
                qji.b bVarU22 = ((DocumentSelectorScreen) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.documents_redesigned.document_selector.di.DocumentSelectorScreenInjector");
                fma.w wVar = (fma.w) bVarU22;
                return new fma.v(wVar.f136231b, wVar.f136232c, (DocumentSelectorScreenContract$InputData) obj2);
            case 9:
                IdentifierInputScreen identifierInputScreen = (IdentifierInputScreen) obj3;
                IdentifierInputScreenContract$InputData identifierInputScreenContract$InputData = (IdentifierInputScreenContract$InputData) obj2;
                KProperty[] kPropertyArr4 = IdentifierInputScreen.f106559e0;
                qji.b bVarQ22 = identifierInputScreen.Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.sso.impl.ui.identifier_input.di.IdentifierInputScreenInjector");
                j1 j1Var = (j1) ((hnl.a) bVarQ22).b().S(identifierInputScreen);
                switch (j1Var.f196001a) {
                    case 0:
                        j1Var.d = identifierInputScreenContract$InputData;
                        break;
                    case 1:
                        j1Var.d = identifierInputScreenContract$InputData;
                        break;
                    default:
                        j1Var.d = identifierInputScreenContract$InputData;
                        break;
                }
                return (ljl.k1) j1Var.mo3800build();
            case 10:
                MtaReviewScreen mtaReviewScreen = (MtaReviewScreen) obj3;
                MtaReviewScreenContract$InputData mtaReviewScreenContract$InputData = (MtaReviewScreenContract$InputData) obj2;
                KProperty[] kPropertyArr5 = MtaReviewScreen.f75535d0;
                qji.b bVarQ23 = mtaReviewScreen.Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.mta.review.di.MtaReviewScreenInjector");
                s1 s1Var = (s1) ((ho7.a) bVarQ23).j().S(mtaReviewScreen);
                switch (s1Var.f247464a) {
                    case 0:
                        s1Var.d = mtaReviewScreenContract$InputData;
                        break;
                    default:
                        s1Var.d = mtaReviewScreenContract$InputData;
                        break;
                }
                return (t1) s1Var.mo3800build();
            case 11:
                TaxNumberInputFlowContract$InputData taxNumberInputFlowContract$InputData = (TaxNumberInputFlowContract$InputData) obj2;
                phm.a aVar6 = (phm.a) ue0.e.j(((TaxNumberInputFlow) obj3).m2()).a().get(ine.o.class);
                b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar7 != null) {
                    return new ine.m(((ine.o) aVar7.b()).f162885l, taxNumberInputFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ine.o.class, " is not found"));
            case 12:
                PaymentBreakdownScreen paymentBreakdownScreen = (PaymentBreakdownScreen) obj3;
                KProperty[] kPropertyArr6 = PaymentBreakdownScreen.f75592b0;
                qji.b bVarQ24 = paymentBreakdownScreen.Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.payment.di.PaymentBreakdownScreenInjector");
                ql7.n nVar = (ql7.n) bVarQ24;
                return new x0(nVar.f247399b, nVar.f247400c, paymentBreakdownScreen, (PaymentBreakdownScreenContract$InputData) obj2);
            case 13:
                CategoryManagementListController categoryManagementListController = (CategoryManagementListController) obj3;
                CategoryManagementListContract$InputData categoryManagementListContract$InputData = (CategoryManagementListContract$InputData) obj2;
                KProperty[] kPropertyArr7 = CategoryManagementListController.S;
                phm.a aVar8 = (phm.a) ue0.e.j(categoryManagementListController.m2()).a().get(ppd.n.class);
                b60.a aVar9 = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar9 != null) {
                    return new ppd.t(((ppd.n) aVar9.b()).L0, categoryManagementListController, categoryManagementListContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ppd.n.class, " is not found"));
            case 14:
                KProperty[] kPropertyArr8 = FormsListScreen.R;
                qji.b bVarU23 = ((FormsListScreen) obj3).U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.apm.bills.f24.impl.ui.forms_list.di.FormsListScreenInjector");
                aq1.d dVar3 = (aq1.d) bVarU23;
                return new aq1.f(dVar3.f8236a, dVar3.f8237b, (FormsListScreenContract$InputData) obj2);
            case 15:
                TermsAndConditionsScreenContract$InputData termsAndConditionsScreenContract$InputData = (TermsAndConditionsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr9 = TermsAndConditionsScreen.P;
                phm.a aVar10 = (phm.a) ue0.e.j(((TermsAndConditionsScreen) obj3).m2()).a().get(vn2.h.class);
                b60.a aVar11 = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar11 != null) {
                    return new vn2.d0(((vn2.h) aVar11.b()).f290682l, termsAndConditionsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
            case 16:
                CryptoBeneficiaryDetailsScreen cryptoBeneficiaryDetailsScreen = (CryptoBeneficiaryDetailsScreen) obj3;
                CryptoBeneficiaryDetailsScreenContract$InputData cryptoBeneficiaryDetailsScreenContract$InputData = (CryptoBeneficiaryDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr10 = CryptoBeneficiaryDetailsScreen.X;
                phm.a aVar12 = (phm.a) ue0.e.j(cryptoBeneficiaryDetailsScreen.m2()).a().get(zo5.d.class);
                b60.a aVar13 = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar13 != null) {
                    return (zo5.o) ((hq5.a) ((hq5.b) aVar13.b()).b().mo3808a(cryptoBeneficiaryDetailsScreen)).G(cryptoBeneficiaryDetailsScreenContract$InputData).mo3783build();
                }
                throw new IllegalStateException(a0.d.q("Api ", zo5.d.class, " is not found"));
            case 17:
                KProperty[] kPropertyArr11 = IncomeSorterExecutionController.T;
                qji.b bVarU24 = ((IncomeSorterExecutionController) obj3).U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.execution.di.IncomeSorterExecutionInjector");
                j0 j0Var = (j0) bVarU24;
                return new ppd.h0(j0Var.f238443b, j0Var.f238444c, (IncomeSorterExecutionContract$InputData) obj2);
            case 18:
                KProperty[] kPropertyArr12 = ReasonForTransferChooserScreen.f92189b0;
                qji.b bVarQ25 = ((ReasonForTransferChooserScreen) obj3).Q2();
                Intrinsics.i(bVarQ25, "null cannot be cast to non-null type com.revolut.feature.transfer.core.impl.ui.reason.chooser.di.ReasonForTransferChooserScreenInjector");
                lpf.c cVar = (lpf.c) bVarQ25;
                return new lpf.q(cVar.f199013b, cVar.f199014c, (ReasonForTransferChooserScreenContract$InputData) obj2);
            case 19:
                BlockedPaymentsListScreen blockedPaymentsListScreen = (BlockedPaymentsListScreen) obj3;
                BlockedPaymentsListScreenContract$Input blockedPaymentsListScreenContract$Input = (BlockedPaymentsListScreenContract$Input) obj2;
                KProperty[] kPropertyArr13 = BlockedPaymentsListScreen.f64254d0;
                phm.a aVar14 = (phm.a) ue0.e.j(blockedPaymentsListScreen.m2()).a().get(tr2.m.class);
                b60.a aVar15 = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar15 != null) {
                    return new tr2.o(((tr2.m) aVar15.b()).f273668w, blockedPaymentsListScreen, blockedPaymentsListScreenContract$Input);
                }
                throw new IllegalStateException(a0.d.q("Api ", tr2.m.class, " is not found"));
            case 20:
                RaffleFlowContract$InputData raffleFlowContract$InputData = (RaffleFlowContract$InputData) obj2;
                phm.a aVar16 = (phm.a) ue0.e.j(((RaffleFlow) obj3).m2()).a().get(fta.h.class);
                b60.a aVar17 = aVar16 != null ? (b60.a) aVar16.get() : null;
                if (aVar17 != null) {
                    return new fta.c(((fta.b) ((fta.h) aVar17.b())).k, raffleFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", fta.h.class, " is not found"));
            case 21:
                ((gti.h) obj3).f146619a.getContentResolver().unregisterContentObserver((gti.g) obj2);
                return Unit.f186387a;
            case 22:
                CreditCardRepayFlowContract$InputData creditCardRepayFlowContract$InputData = (CreditCardRepayFlowContract$InputData) obj2;
                phm.a aVar18 = (phm.a) ue0.e.j(((CreditCardRepayFlow) obj3).m2()).a().get(a3.class);
                b60.a aVar19 = aVar18 != null ? (b60.a) aVar18.get() : null;
                if (aVar19 != null) {
                    return new z1(((a3) aVar19.b()).Y, creditCardRepayFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            case 23:
                ManualTransferInputData manualTransferInputData = (ManualTransferInputData) obj2;
                phm.a aVar20 = (phm.a) ue0.e.j(((ManualTransferFlow) obj3).m2()).a().get(ytf.e.class);
                b60.a aVar21 = aVar20 != null ? (b60.a) aVar20.get() : null;
                if (aVar21 != null) {
                    return new ytf.b(((ytf.e) aVar21.b()).H, manualTransferInputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ytf.e.class, " is not found"));
            case 24:
                AccountClosureFlowContract$InputData accountClosureFlowContract$InputData = (AccountClosureFlowContract$InputData) obj2;
                phm.a aVar22 = (phm.a) ue0.e.j(((AccountClosureFlow) obj3).m2()).a().get(ztg.n.class);
                b60.a aVar23 = aVar22 != null ? (b60.a) aVar22.get() : null;
                if (aVar23 != null) {
                    return new ztg.h(((ztg.n) aVar23.b()).f325156n, accountClosureFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ztg.n.class, " is not found"));
            case 25:
                Amount amount2 = (Amount) obj2;
                c.a aVar24 = gul.c.Companion;
                List list = ((OrderQuote) obj3).f104756h;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : list) {
                    if (obj5 instanceof Limit.LowerRestrictionLimit) {
                        arrayList2.add(obj5);
                    }
                }
                Iterator it8 = arrayList2.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((Limit.LowerRestrictionLimit) next).f104743a, "stock_holdings_min_size")) {
                        }
                    } else {
                        next = null;
                    }
                }
                Limit.LowerRestrictionLimit lowerRestrictionLimit = (Limit.LowerRestrictionLimit) next;
                if (lowerRestrictionLimit != null && (amount = lowerRestrictionLimit.f104744b) != null) {
                    boolValueOf = Boolean.valueOf(a.a.e(amount, amount2) >= 0);
                }
                return Boolean.valueOf(pd.b.j(boolValueOf));
            case 26:
                ScheduleSettingsScreen scheduleSettingsScreen = (ScheduleSettingsScreen) obj3;
                pdf.b bVar = (pdf.b) obj2;
                KProperty[] kPropertyArr14 = ScheduleSettingsScreen.X;
                phm.a aVar25 = (phm.a) ue0.e.j(scheduleSettingsScreen.m2()).a().get(xsl.p.class);
                b60.a aVar26 = aVar25 != null ? (b60.a) aVar25.get() : null;
                if (aVar26 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                }
                xsl.p pVar = ((xsl.p) aVar26.b()).O;
                bVar.getClass();
                return new xsl.l(pVar, scheduleSettingsScreen, bVar);
            case 27:
                WidgetisedAnalyticsTotalValueScreen widgetisedAnalyticsTotalValueScreen = (WidgetisedAnalyticsTotalValueScreen) obj3;
                KProperty[] kPropertyArr15 = WidgetisedAnalyticsTotalValueScreen.X;
                qji.b bVarU25 = widgetisedAnalyticsTotalValueScreen.U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.wealth.analytics.ui.widgetised.total_value.di.WidgetisedAnalyticsTotalValueScreenInjector");
                ewg.k kVar2 = (ewg.k) bVarU25;
                return new ewg.n(kVar2.d, kVar2.e, widgetisedAnalyticsTotalValueScreen, (WidgetisedAnalyticsTotalValueScreenContract$InputData) obj2, widgetisedAnalyticsTotalValueScreen);
            case 28:
                qji.b bVarU26 = ((FreelancerCheckEmailScreen) obj3).U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.profile.email_flow.check_email.di.FreelancerCheckEmailScreenInjector");
                us6.x xVar = (us6.x) bVarU26;
                return new us6.t(xVar.f282795b, xVar.f282796c, (FreelancerCheckEmailScreenContract$InputData) obj2);
            default:
                TravelExperiencesCheckoutFlowContract$InputData travelExperiencesCheckoutFlowContract$InputData = (TravelExperiencesCheckoutFlowContract$InputData) obj2;
                phm.a aVar27 = (phm.a) ue0.e.j(((TravelExperiencesCheckoutFlow) obj3).m2()).a().get(z0g.b.class);
                b60.a aVar28 = aVar27 != null ? (b60.a) aVar27.get() : null;
                if (aVar28 != null) {
                    return new z0g.f(((z0g.b) aVar28.b()).B, travelExperiencesCheckoutFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", z0g.b.class, " is not found"));
        }
    }
}
