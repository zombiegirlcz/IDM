package w83;

import android.app.Activity;
import com.revolut.core.backend_flow.impl.ui.stories.StoriesScreenController;
import com.revolut.feature.apm.bills.pagopa.impl.ui.bill_input.PagoPABillInputScreen;
import com.revolut.feature.apm.bills.pagopa.impl.ui.bill_input.PagoPABillInputScreenContract$InputData;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.amount.TapiTransferAmountScreen;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.amount.TapiTransferAmountScreenContract$Input;
import com.revolut.feature.backend_flow.domain.models.StoriesScreen;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.direct_debits.BankAccountSwitchingDirectDebitsScreen;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.direct_debits.BankAccountSwitchingDirectDebitsScreenContract$InputData;
import com.revolut.feature.card_screen.impl.prompts.merchant_redirect.MerchantRedirectPromptController;
import com.revolut.feature.card_screen.impl.prompts.merchant_redirect.MerchantRedirectPromptScreenContract$InputData;
import com.revolut.feature.cash_topup.impl.ui.entry.CashTopUpEntryScreen;
import com.revolut.feature.cash_topup.impl.ui.entry.CashTopUpEntryScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.autopay.settings.AutopaySettingsContract$InputData;
import com.revolut.feature.credit.card.impl.ui.autopay.settings.AutopaySettingsScreen;
import com.revolut.feature.credit.loan.impl.ui.statements.LoanStatementsListScreen;
import com.revolut.feature.credit.loan.impl.ui.statements.LoanStatementsListScreenContract$InputData;
import com.revolut.feature.credit.post_termination_plan.impl.ui.plandetails.PostTerminationPlanDetailsFlow;
import com.revolut.feature.credit.post_termination_plan.impl.ui.plandetails.PostTerminationPlanDetailsFlowContract$InputData;
import com.revolut.feature.crypto.spare.change.impl.ui.crypto_spare_change.CryptoSpareChangeScreen;
import com.revolut.feature.crypto.spare.change.impl.ui.crypto_spare_change.CryptoSpareChangeScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts.accounts_selection.AccountsSelectionScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.date.DateSelectorScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.date.DateSelectorScreenContract$InputData;
import com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig;
import com.revolut.feature.pay_later.impl.ui.paymentbreakdown.PayLaterPaymentBreakdownScreen;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.review.PixQrCodeTransactionReviewScreen;
import com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerCreationInputData;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlow;
import com.revolut.feature.robo.impl.ui.screen.templates.TemplatesScreen;
import com.revolut.feature.robo.impl.ui.screen.templates.TemplatesScreenContract$Input;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreen;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.combined_watchlist.flow.CombinedWatchlistHomeFlow;
import com.revolut.feature.shared_separate_favourites.combined_watchlist.flow.CombinedWatchlistHomeFlowContract$InputData;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.MultipleWatchlistsFlow;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.MultipleWatchlistsFlowContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.home.RevIQHomeFlow;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.details.TransactionRecogniserDetailsScreen;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.details.TransactionRecogniserDetailsScreenContract$InputData;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.detail.TroubleshooterDetailScreen;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.detail.TroubleshooterDetailScreenContract$InputData;
import com.revolut.feature.transfer.core.api.cancellation.TransferCancellationInputData;
import com.revolut.feature.transfer.core.impl.ui.transfer.cancellation.TransferCancellationDialogScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.room.selection.TravelHotelsRoomsSelectionFlow;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.room.selection.TravelHotelsRoomsSelectionFlowContract$InputData$Amendment;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.TravelHotelsCheckoutScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.TravelHotelsCheckoutScreenContract$InputData;
import com.revolut.feature.wealth.private_equity.api.ui.details.FundDetailsContract$InputData;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.FundDetailsScreen;
import com.revolut.feature.web_sign_in.ui.screen.confirmation.WebSignInConfirmationScreen;
import com.revolut.feature.web_sign_in.ui.screen.confirmation.WebSignInConfirmationScreenContract$InputData;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.downgrade.RevPointsPocketDowngradeScreen;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.downgrade.RevPointsPocketDowngradeScreenContract$InputData;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.agreement.RiskAgreementScreen;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.agreement.RiskAgreementScreenContract$InputData;
import dmc.r;
import fa0.t;
import fa0.u;
import g9g.o;
import g9g.p0;
import jgk.v;
import jm4.c0;
import jm4.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.s;
import kotlin.reflect.KProperty;
import lpf.y;
import mb3.n;
import mb3.p;
import p8a.k0;
import p8a.l0;
import qgk.i3;
import u45.n0;
import xf6.c2;
import xf6.q2;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f295577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f295578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f295579c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f295577a = i;
        this.f295578b = obj2;
        this.f295579c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v1, types: [b60.a] */
    /* JADX WARN: Type inference failed for: r4v69 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f295577a;
        Object obj2 = this.f295579c;
        Object obj3 = this.f295578b;
        switch (i) {
            case 0:
                qji.b bVarU2 = ((MerchantRedirectPromptController) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.prompts.merchant_redirect.di.MerchantRedirectPromptScreenInjector");
                t83.b bVar = (t83.b) bVarU2;
                return new t83.d(bVar.f268816b, bVar.f268817c, (MerchantRedirectPromptScreenContract$InputData) obj2);
            case 1:
                LoanStatementsListScreenContract$InputData loanStatementsListScreenContract$InputData = (LoanStatementsListScreenContract$InputData) obj2;
                KProperty[] kPropertyArr = LoanStatementsListScreen.f70611d0;
                phm.a aVar = (phm.a) ue0.e.j(((LoanStatementsListScreen) obj3).m2()).a().get(u45.h.class);
                 = aVar != null ? (b60.a) aVar.get() : 0;
                if ( != 0) {
                    return new n0(((u45.h) b()).B, loanStatementsListScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
            case 2:
                PostTerminationPlanDetailsFlowContract$InputData postTerminationPlanDetailsFlowContract$InputData = (PostTerminationPlanDetailsFlowContract$InputData) obj2;
                phm.a aVar2 = (phm.a) ue0.e.j(((PostTerminationPlanDetailsFlow) obj3).m2()).a().get(oa5.b.class);
                b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar3 != null) {
                    return new oa5.c(((oa5.b) aVar3.b()).i, postTerminationPlanDetailsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", oa5.b.class, " is not found"));
            case 3:
                TravelHotelsRoomsSelectionFlowContract$InputData$Amendment travelHotelsRoomsSelectionFlowContract$InputData$Amendment = (TravelHotelsRoomsSelectionFlowContract$InputData$Amendment) obj2;
                phm.a aVar4 = (phm.a) ue0.e.j(((TravelHotelsRoomsSelectionFlow) obj3).m2()).a().get(g9g.d.class);
                b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar5 != null) {
                    return new p0(((g9g.d) aVar5.b()).L, travelHotelsRoomsSelectionFlowContract$InputData$Amendment);
                }
                throw new IllegalStateException(a0.d.q("Api ", g9g.d.class, " is not found"));
            case 4:
                RiskAgreementScreen riskAgreementScreen = (RiskAgreementScreen) obj3;
                qji.b bVarQ2 = riskAgreementScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.ui.agreement.di.RiskAgreementScreenInjector");
                lal.a aVarB = ((oal.a) bVarQ2).B();
                aVarB.d = riskAgreementScreen;
                aVarB.e = (RiskAgreementScreenContract$InputData) obj2;
                return (lal.g) aVarB.mo3800build();
            case 5:
                StoriesScreenController storiesScreenController = (StoriesScreenController) obj3;
                StoriesScreen storiesScreen = (StoriesScreen) obj2;
                qji.b bVarU22 = storiesScreenController.U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.core.backend_flow.impl.ui.stories.di.StoriesScreenControllerInjector");
                t tVarV = ((na0.d) bVarU22).v();
                switch (tVarV.f133157a) {
                    case 0:
                        tVarV.f133159c = storiesScreen;
                        break;
                    default:
                        tVarV.f133159c = storiesScreen;
                        break;
                }
                return (u) ((t) tVarV.mo3808a(storiesScreenController)).mo3783build();
            case 6:
                CashTopUpEntryScreenContract$InputData cashTopUpEntryScreenContract$InputData = (CashTopUpEntryScreenContract$InputData) obj2;
                KProperty[] kPropertyArr2 = CashTopUpEntryScreen.f65628b0;
                phm.a aVar6 = (phm.a) ue0.e.j(((CashTopUpEntryScreen) obj3).m2()).a().get(bb3.a.class);
                b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar7 != null) {
                    return new n(((p) aVar7.b()).i, cashTopUpEntryScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", bb3.a.class, " is not found"));
            case 7:
                PixQrCodeTransactionReviewScreen pixQrCodeTransactionReviewScreen = (PixQrCodeTransactionReviewScreen) obj3;
                PixQrCodeTransactionReviewScreen.Companion aVar8 = PixQrCodeTransactionReviewScreen.INSTANCE;
                qji.b bVarU23 = pixQrCodeTransactionReviewScreen.U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.review.di.PixQrCodeTransactionReviewScreenInjector");
                k0 k0Var = (k0) bVarU23;
                return new l0(k0Var.f234005b, k0Var.f234006c, pixQrCodeTransactionReviewScreen, (wba.i) obj2);
            case 8:
                TravelHotelsCheckoutScreen travelHotelsCheckoutScreen = (TravelHotelsCheckoutScreen) obj3;
                TravelHotelsCheckoutScreenContract$InputData travelHotelsCheckoutScreenContract$InputData = (TravelHotelsCheckoutScreenContract$InputData) obj2;
                KProperty[] kPropertyArr3 = TravelHotelsCheckoutScreen.f93892d0;
                phm.a aVar9 = (phm.a) ue0.e.j(travelHotelsCheckoutScreen.m2()).a().get(i3.class);
                b60.a aVar10 = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar10 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", i3.class, " is not found"));
                }
                v vVarD = ((i3) aVar10.b()).d();
                qji.b bVarU24 = travelHotelsCheckoutScreen.U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.di.TravelHotelsCheckoutScreenInjector");
                g9g.n nVar = (g9g.n) bVarU24;
                g9g.d dVar = nVar.f141747b;
                g9g.n nVar2 = nVar.f141748c;
                vVarD.getClass();
                return new o(dVar, nVar2, travelHotelsCheckoutScreen, travelHotelsCheckoutScreenContract$InputData, vVarD);
            case 9:
                RevPointsPocketDowngradeScreenContract$InputData revPointsPocketDowngradeScreenContract$InputData = (RevPointsPocketDowngradeScreenContract$InputData) obj2;
                KProperty[] kPropertyArr4 = RevPointsPocketDowngradeScreen.R;
                phm.a aVar11 = (phm.a) ue0.e.j(((RevPointsPocketDowngradeScreen) obj3).m2()).a().get(jdi.c.class);
                b60.a aVar12 = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar12 != null) {
                    return new jdi.e(((jdi.c) aVar12.b()).i, revPointsPocketDowngradeScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", jdi.c.class, " is not found"));
            case 10:
                SharedAlertsScreen sharedAlertsScreen = (SharedAlertsScreen) obj3;
                SharedAlertsScreen.Companion aVar13 = SharedAlertsScreen.INSTANCE;
                qji.b bVarQ22 = sharedAlertsScreen.Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreenInjector");
                ned.g gVar = (ned.g) ((ted.a) bVarQ22);
                ned.e eVar = gVar.f214455b;
                ned.g gVar2 = gVar.f214456c;
                ScreenContentRecyclerView recyclerView = sharedAlertsScreen.h3().f174540c;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                return new ned.i(eVar, gVar2, sharedAlertsScreen, recyclerView, (SharedAlertsScreenContract$InputData) obj2);
            case 11:
                KProperty[] kPropertyArr5 = TransactionRecogniserDetailsScreen.f91827d0;
                qji.b bVarQ23 = ((TransactionRecogniserDetailsScreen) obj3).Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.details.di.TransactionRecogniserDetailsScreenInjector");
                jef.g gVar3 = (jef.g) bVarQ23;
                return new jef.f(gVar3.f173380b, gVar3.f173381c, (TransactionRecogniserDetailsScreenContract$InputData) obj2);
            case 12:
                CombinedWatchlistHomeFlowContract$InputData combinedWatchlistHomeFlowContract$InputData = (CombinedWatchlistHomeFlowContract$InputData) obj2;
                phm.a aVar14 = (phm.a) ue0.e.j(((CombinedWatchlistHomeFlow) obj3).m2()).a().get(ufd.a.class);
                b60.a aVar15 = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar15 != null) {
                    return new vfd.b(((vfd.a) aVar15.b()).i, combinedWatchlistHomeFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ufd.a.class, " is not found"));
            case 13:
                TroubleshooterDetailScreen troubleshooterDetailScreen = (TroubleshooterDetailScreen) obj3;
                KProperty[] kPropertyArr6 = TroubleshooterDetailScreen.l0;
                qji.b bVarQ24 = troubleshooterDetailScreen.Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.detail.di.TroubleshooterDetailScreenInjector");
                off.c cVar = (off.c) bVarQ24;
                return new off.b(cVar.f224823b, cVar.f224824c, troubleshooterDetailScreen, (TroubleshooterDetailScreenContract$InputData) obj2);
            case 14:
                FundDetailsScreen fundDetailsScreen = (FundDetailsScreen) obj3;
                FundDetailsContract$InputData fundDetailsContract$InputData = (FundDetailsContract$InputData) obj2;
                KProperty[] kPropertyArr7 = FundDetailsScreen.f95735e0;
                phm.a aVar16 = (phm.a) ue0.e.j(fundDetailsScreen.m2()).a().get(ufh.i.class);
                b60.a aVar17 = aVar16 != null ? (b60.a) aVar16.get() : null;
                if (aVar17 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", ufh.i.class, " is not found"));
                }
                ufh.i iVar = ((ufh.i) aVar17.b()).f279862s;
                Activity activity = fundDetailsScreen.m2();
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullExpressionValue(new ihm.f(), "create(...)");
                Intrinsics.checkNotNullExpressionValue(new ihm.f(), "create(...)");
                Intrinsics.checkNotNullExpressionValue(new ihm.f(), "create(...)");
                Intrinsics.checkNotNullExpressionValue(new ihm.f(), "create(...)");
                Intrinsics.checkNotNullExpressionValue(new ihm.f(), "create(...)");
                return new ufh.a(iVar, new f3h.b(), new f3h.a(), fundDetailsScreen, fundDetailsContract$InputData, fundDetailsScreen, fundDetailsScreen, fundDetailsScreen, fundDetailsScreen, new v2h.c(fundDetailsScreen.M), fundDetailsScreen);
            case 15:
                MultipleWatchlistsFlowContract$InputData multipleWatchlistsFlowContract$InputData = (MultipleWatchlistsFlowContract$InputData) obj2;
                MultipleWatchlistsFlow.Companion companion = MultipleWatchlistsFlow.INSTANCE;
                phm.a aVar18 = (phm.a) ue0.e.j(((MultipleWatchlistsFlow) obj3).m2()).a().get(vgd.b.class);
                b60.a aVar19 = aVar18 != null ? (b60.a) aVar18.get() : null;
                if (aVar19 != null) {
                    return new vgd.c(((vgd.b) aVar19.b()).e, multipleWatchlistsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", vgd.b.class, " is not found"));
            case 16:
                KProperty[] kPropertyArr8 = AccountsSelectionScreen.S;
                qji.b bVarU25 = ((AccountsSelectionScreen) obj3).U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts.accounts_selection.di.AccountsSelectionScreenInjector");
                q2 q2Var = (q2) bVarU25;
                return new c2(q2Var.f305009b, q2Var.f305010c, (wi6.i) obj2);
            case 17:
                PayLaterKompotFeatureConfig.PaymentBreakdownNavigationDestination.InputData inputData = (PayLaterKompotFeatureConfig.PaymentBreakdownNavigationDestination.InputData) obj2;
                KProperty[] kPropertyArr9 = PayLaterPaymentBreakdownScreen.c0;
                oi9.f fVar = s.n(((PayLaterPaymentBreakdownScreen) obj3).m2()).v;
                inputData.getClass();
                return new oi9.j(fVar, inputData);
            case 18:
                wka.h hVar = (wka.h) obj3;
                hVar.l2(new wgb.v((Ref$ObjectRef) obj2, hVar, , 11), new yi5.b(26));
                return Unit.f186387a;
            case 19:
                CryptoSpareChangeScreen cryptoSpareChangeScreen = (CryptoSpareChangeScreen) obj3;
                CryptoSpareChangeScreenContract$InputData cryptoSpareChangeScreenContract$InputData = (CryptoSpareChangeScreenContract$InputData) obj2;
                phm.a aVar20 = (phm.a) ue0.e.j(cryptoSpareChangeScreen.m2()).a().get(nl5.e.class);
                b60.a aVar21 = aVar20 != null ? (b60.a) aVar20.get() : null;
                if (aVar21 != null) {
                    return new nl5.f(((nl5.e) aVar21.b()).f217018l, cryptoSpareChangeScreen, cryptoSpareChangeScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", nl5.e.class, " is not found"));
            case 20:
                TemplatesScreen templatesScreen = (TemplatesScreen) obj3;
                TemplatesScreenContract$Input templatesScreenContract$Input = (TemplatesScreenContract$Input) obj2;
                KProperty[] kPropertyArr10 = TemplatesScreen.g0;
                Object objR1 = templatesScreen.z2().R1();
                r rVar = objR1 instanceof r ? (r) objR1 : null;
                if (rVar == null) {
                    phm.a aVar22 = (phm.a) ue0.e.j(templatesScreen.m2()).a().get(r.class);
                    b60.a aVar23 = aVar22 != null ? (b60.a) aVar22.get() : null;
                    if (aVar23 == null) {
                        throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
                    }
                    rVar = (r) aVar23.b();
                }
                return new dmc.t(rVar.f116039s, new xnc.a(), templatesScreen, templatesScreenContract$Input, templatesScreen, new doc.g(templatesScreen.R, templatesScreen.X, templatesScreen.Y, templatesScreen.U, null, templatesScreen.S, templatesScreen.T, null), new doc.i(pdh.c.FIVE_YEARS), new noc.e(templatesScreen.O, templatesScreen.V, templatesScreen.W, templatesScreen.Z), new v1h.a(templatesScreen.Q));
            case 21:
                DateSelectorScreen dateSelectorScreen = (DateSelectorScreen) obj3;
                KProperty[] kPropertyArr11 = DateSelectorScreen.c0;
                qji.b bVarQ25 = dateSelectorScreen.Q2();
                Intrinsics.i(bVarQ25, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.date.di.DateSelectorScreenInjector");
                ql7.n nVar3 = (ql7.n) bVarQ25;
                return new ql7.v(nVar3.f247399b, nVar3.f247400c, dateSelectorScreen, (DateSelectorScreenContract$InputData) obj2);
            case 22:
                BankAccountSwitchingDirectDebitsScreenContract$InputData bankAccountSwitchingDirectDebitsScreenContract$InputData = (BankAccountSwitchingDirectDebitsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr12 = BankAccountSwitchingDirectDebitsScreen.P;
                phm.a aVar24 = (phm.a) ue0.e.j(((BankAccountSwitchingDirectDebitsScreen) obj3).m2()).a().get(vn2.h.class);
                b60.a aVar25 = aVar24 != null ? (b60.a) aVar24.get() : null;
                if (aVar25 != null) {
                    return new vn2.g(((vn2.h) aVar25.b()).f290682l, bankAccountSwitchingDirectDebitsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
            case 23:
                AutopaySettingsScreen autopaySettingsScreen = (AutopaySettingsScreen) obj3;
                KProperty[] kPropertyArr13 = AutopaySettingsScreen.g0;
                qji.b bVarQ26 = autopaySettingsScreen.Q2();
                Intrinsics.i(bVarQ26, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.autopay.settings.di.AutopaySettingsScreenInjector");
                j0 j0Var = (j0) bVarQ26;
                return new c0(j0Var.f176144b, j0Var.f176145c, autopaySettingsScreen, (AutopaySettingsContract$InputData) obj2);
            case 24:
                PagoPABillInputScreen pagoPABillInputScreen = (PagoPABillInputScreen) obj3;
                KProperty[] kPropertyArr14 = PagoPABillInputScreen.f61486d0;
                qji.b bVarQ27 = pagoPABillInputScreen.Q2();
                Intrinsics.i(bVarQ27, "null cannot be cast to non-null type com.revolut.feature.apm.bills.pagopa.impl.ui.bill_input.di.PagoPABillInputScreenInjector");
                tq1.d dVar2 = ((tq1.h) ((br1.a) bVarQ27)).f273498b;
                ((PagoPABillInputScreenContract$InputData) obj2).getClass();
                tq1.f fVar2 = new tq1.f();
                fVar2.f273490a = e4m.b.b(e4m.c.a(pagoPABillInputScreen));
                int i2 = 7;
                fVar2.f273491b = e4m.b.b(new tg5.h(dVar2, fVar2, 2, i2));
                fVar2.f273492c = e4m.b.b(new tg5.h(dVar2, fVar2, 1, i2));
                fVar2.d = e4m.b.b(new tg5.h(dVar2, fVar2, 0, i2));
                fVar2.e = e4m.b.b(new tg5.h(dVar2, fVar2, 4, i2));
                fVar2.f = e4m.b.b(new tg5.h(dVar2, fVar2, 5, i2));
                fVar2.f273493g = e4m.b.b(new tg5.h(dVar2, fVar2, 3, i2));
                return fVar2;
            case 25:
                CardOwnerCreationInputData cardOwnerCreationInputData = (CardOwnerCreationInputData) obj2;
                phm.a aVar26 = (phm.a) ue0.e.j(((CardOwnerCreationFlow) obj3).m2()).a().get(vpa.a.class);
                b60.a aVar27 = aVar26 != null ? (b60.a) aVar26.get() : null;
                if (aVar27 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", vpa.a.class, " is not found"));
                }
                jqa.e eVar2 = ((jqa.e) ((jqa.s) aVar27.b())).O;
                cardOwnerCreationInputData.getClass();
                return new jqa.b(eVar2, cardOwnerCreationInputData);
            case 26:
                wqd.d dVar3 = (wqd.d) obj2;
                KProperty[] kPropertyArr15 = RevIQHomeFlow.P;
                phm.a aVar28 = (phm.a) ue0.e.j(((RevIQHomeFlow) obj3).m2()).a().get(ppd.n.class);
                b60.a aVar29 = aVar28 != null ? (b60.a) aVar28.get() : null;
                if (aVar29 != null) {
                    return new ppd.p0(((ppd.n) aVar29.b()).L0, dVar3);
                }
                throw new IllegalStateException(a0.d.q("Api ", ppd.n.class, " is not found"));
            case 27:
                TransferCancellationDialogScreen transferCancellationDialogScreen = (TransferCancellationDialogScreen) obj3;
                TransferCancellationInputData transferCancellationInputData = (TransferCancellationInputData) obj2;
                phm.a aVar30 = (phm.a) ue0.e.j(transferCancellationDialogScreen.m2()).a().get(wof.a.class);
                b60.a aVar31 = aVar30 != null ? (b60.a) aVar30.get() : null;
                if (aVar31 != null) {
                    return new lpf.h(((lpf.i) ((y) aVar31.b())).o, transferCancellationDialogScreen, transferCancellationInputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", wof.a.class, " is not found"));
            case 28:
                TapiTransferAmountScreen.Companion aVar32 = TapiTransferAmountScreen.INSTANCE;
                qji.b bVarU26 = ((TapiTransferAmountScreen) obj3).U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.apm.bills.tapi.impl.screen.transfer.amount.di.TapiTransferAmountScreenInjector");
                rr1.e eVar3 = (rr1.e) bVarU26;
                return new rr1.c(eVar3.f256650b, eVar3.f256651c, (TapiTransferAmountScreenContract$Input) obj2);
            default:
                KProperty[] kPropertyArr16 = WebSignInConfirmationScreen.c0;
                qji.b bVarQ28 = ((WebSignInConfirmationScreen) obj3).Q2();
                Intrinsics.i(bVarQ28, "null cannot be cast to non-null type com.revolut.feature.web_sign_in.ui.screen.confirmation.di.WebSignInConfirmationScreenInjector");
                srh.d dVar4 = (srh.d) bVarQ28;
                return new srh.c(dVar4.f265223b, dVar4.f265224c, (WebSignInConfirmationScreenContract$InputData) obj2);
        }
    }
}
