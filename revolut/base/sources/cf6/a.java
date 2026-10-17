package cf6;

import android.app.Application;
import android.content.Context;
import com.revolut.core.ui_kit.internal.views.order_book.OrderBookChartView;
import com.revolut.feature.alipay_plus.mpm.core.APMPMCoordinator;
import com.revolut.feature.alipay_plus.mpm.model.APMPMCallback;
import com.revolut.feature.alipay_plus.mpm.model.APMPMError;
import com.revolut.feature.contacts.impl.ui.contact.flow.ContactFlow;
import com.revolut.feature.contacts.impl.ui.contact.flow.ContactFlowContract$InputData;
import com.revolut.feature.crypto.tfr.validation.impl.provide_details.ProvideDetailsScreen;
import com.revolut.feature.crypto.tfr.validation.impl.provide_details.ProvideDetailsScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.funds_confirmation.OpenBankingFundsConfirmationScreen;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.funds_confirmation.OpenBankingFundsConfirmationScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.claim.reason_group.CFACInsuranceReasonGroupScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.reason_group.CFACInsuranceReasonGroupScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.flow.delivery.DeliveryFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.delivery.DeliveryFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.flow.policy.CarPolicyFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.policy.CarPolicyFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.decline.MtaDeclineScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.decline.MtaDeclineScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.edit_application.EditApplicationScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.edit_application.EditApplicationScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.detail.EmbeddedInsuranceDetailScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.detail.EmbeddedInsuranceDetailScreenContract$InputData;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.details.ChallengesOverviewDetailsScreen;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.details.ChallengesOverviewDetailsScreenContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.details.FormDetailsScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.details.FormDetailsScreenContract$InputData;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.AddSplitItemController;
import com.revolut.feature.profile.impl.ui.details.name.flow.ChangeNameFlow;
import com.revolut.feature.profile.impl.ui.details.name.flow.ChangeNameFlowContract$InputData;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.simple_selector.SimpleSelectorController;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.simple_selector.SimpleSelectorControllerContract$InputData;
import com.revolut.feature.shared_separate_favourites.common.screen.counterpart_chooser.SharedFavouritesCounterpartChooserScreen;
import com.revolut.feature.shared_separate_favourites.common.screen.counterpart_chooser.SharedFavouritesCounterpartChooserScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.WatchlistsSelectorScreen;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.WatchlistsSelectorScreenContract$InputData;
import com.revolut.feature.shops.impl.ui.details.ShopsCampaignCheckoutScreen;
import com.revolut.feature.shops.impl.ui.details.ShopsCampaignCheckoutScreenContract$InputData;
import com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.acceptance.DocumentAcceptanceScreen;
import com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.acceptance.DocumentAcceptanceScreenContract$Input;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.fund_highlights.FundHighlightsScreen;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_category_budgets.SetCategoryBudgetsScreen;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_category_budgets.SetCategoryBudgetsScreenContract$InputData;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.collection.RewardsHubCollectionScreen;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.collection.RewardsHubCollectionScreenContract$InputData;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.sso.impl.data.storage.RevolutAccountsManagerContentProvider;
import com.revolut.sso.impl.ui.signin_sessions_flow.bottom_dialog.SignInSessionsBottomSheet;
import com.revolut.sso.impl.ui.signin_sessions_flow.bottom_dialog.SignInSessionsBottomSheetContract$InputData;
import fma.h;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import lf9.f;
import lf9.m;
import ljl.s0;
import ljl.u0;
import lu7.y;
import ne0.j;
import ned.k;
import ned.n;
import nk7.u;
import ql7.f0;
import ql7.k0;
import ql7.o;
import ql7.q1;
import ql7.r1;
import ql7.x;
import th0.l;
import ufh.i;
import vgd.g;
import xf6.y2;
import xf6.z2;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23558c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f23556a = i;
        this.f23557b = obj2;
        this.f23558c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v1, types: [b60.a] */
    /* JADX WARN: Type inference failed for: r4v53 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        th0.a aVar;
        switch (this.f23556a) {
            case 0:
                e eVar = (e) this.f23557b;
                j jVar = (j) this.f23558c;
                int i = 0;
                int i2 = 1;
                return new x4l.c(new b(eVar, , i), new bek.c(jVar, i2), new bek.d(jVar, i2), new c(eVar, , i), new d(eVar, , i));
            case 1:
                SimpleSelectorController simpleSelectorController = (SimpleSelectorController) this.f23557b;
                SimpleSelectorControllerContract$InputData simpleSelectorControllerContract$InputData = (SimpleSelectorControllerContract$InputData) this.f23558c;
                KProperty[] kPropertyArr = SimpleSelectorController.Q;
                phm.a aVar2 = (phm.a) ue0.e.j(simpleSelectorController.m2()).a().get(ned.e.class);
                 = aVar2 != null ? (b60.a) aVar2.get() : 0;
                if ( == 0) {
                    throw new IllegalStateException(a0.d.q("Api ", ned.e.class, " is not found"));
                }
                Object objB = b();
                Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.simple_selector.di.SimpleSelectorInjector");
                return new n(((ned.e) objB).i, simpleSelectorControllerContract$InputData);
            case 2:
                FormDetailsScreen formDetailsScreen = (FormDetailsScreen) this.f23557b;
                FormDetailsScreenContract$InputData formDetailsScreenContract$InputData = (FormDetailsScreenContract$InputData) this.f23558c;
                KProperty[] kPropertyArr2 = FormDetailsScreen.S;
                phm.a aVar3 = (phm.a) ue0.e.j(formDetailsScreen.m2()).a().get(m.class);
                b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar4 != null) {
                    return new f(((m) aVar4.b()).u, formDetailsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
            case 3:
                SharedFavouritesCounterpartChooserScreen sharedFavouritesCounterpartChooserScreen = (SharedFavouritesCounterpartChooserScreen) this.f23557b;
                SharedFavouritesCounterpartChooserScreenContract$InputData sharedFavouritesCounterpartChooserScreenContract$InputData = (SharedFavouritesCounterpartChooserScreenContract$InputData) this.f23558c;
                SharedFavouritesCounterpartChooserScreen.Companion aVar5 = SharedFavouritesCounterpartChooserScreen.INSTANCE;
                qji.b bVarQ2 = sharedFavouritesCounterpartChooserScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.shared_separate_favourites.common.screen.counterpart_chooser.SharedCounterpartChooserScreenInjector");
                ned.c cVar = (ned.c) bVarQ2;
                return new k(cVar.f214438b, cVar.f214439c, sharedFavouritesCounterpartChooserScreen, sharedFavouritesCounterpartChooserScreenContract$InputData);
            case 4:
                FundHighlightsScreen fundHighlightsScreen = (FundHighlightsScreen) this.f23557b;
                cgh.n nVar = (cgh.n) this.f23558c;
                KProperty[] kPropertyArr3 = FundHighlightsScreen.V;
                phm.a aVar6 = (phm.a) ue0.e.j(fundHighlightsScreen.m2()).a().get(i.class);
                b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar7 != null) {
                    return new ufh.c(((i) aVar7.b()).f279862s, fundHighlightsScreen, nVar);
                }
                throw new IllegalStateException(a0.d.q("Api ", i.class, " is not found"));
            case 5:
                WatchlistsSelectorScreen watchlistsSelectorScreen = (WatchlistsSelectorScreen) this.f23557b;
                WatchlistsSelectorScreenContract$InputData watchlistsSelectorScreenContract$InputData = (WatchlistsSelectorScreenContract$InputData) this.f23558c;
                KProperty[] kPropertyArr4 = WatchlistsSelectorScreen.Q;
                phm.a aVar8 = (phm.a) ue0.e.j(watchlistsSelectorScreen.m2()).a().get(vgd.b.class);
                b60.a aVar9 = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar9 != null) {
                    return new g(((vgd.b) aVar9.b()).e, watchlistsSelectorScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", vgd.b.class, " is not found"));
            case 6:
                OpenBankingFundsConfirmationScreen openBankingFundsConfirmationScreen = (OpenBankingFundsConfirmationScreen) this.f23557b;
                OpenBankingFundsConfirmationScreenContract$InputData openBankingFundsConfirmationScreenContract$InputData = (OpenBankingFundsConfirmationScreenContract$InputData) this.f23558c;
                KProperty[] kPropertyArr5 = OpenBankingFundsConfirmationScreen.P;
                qji.b bVarU2 = openBankingFundsConfirmationScreen.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.funds_confirmation.di.OpenBankingFundsConfirmationScreenInjector");
                y2 y2Var = (y2) bVarU2;
                return new z2(y2Var.f305180b, y2Var.f305181c, openBankingFundsConfirmationScreenContract$InputData);
            case 7:
                ShopsCampaignCheckoutScreen shopsCampaignCheckoutScreen = (ShopsCampaignCheckoutScreen) this.f23557b;
                ShopsCampaignCheckoutScreenContract$InputData shopsCampaignCheckoutScreenContract$InputData = (ShopsCampaignCheckoutScreenContract$InputData) this.f23558c;
                int i3 = ShopsCampaignCheckoutScreen.W;
                phm.a aVar10 = (phm.a) ue0.e.j(shopsCampaignCheckoutScreen.m2()).a().get(did.d.class);
                b60.a aVar11 = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar11 != null) {
                    return new did.f(((did.d) aVar11.b()).f115008y, shopsCampaignCheckoutScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
            case 8:
                CFACInsuranceReasonGroupScreen cFACInsuranceReasonGroupScreen = (CFACInsuranceReasonGroupScreen) this.f23557b;
                CFACInsuranceReasonGroupScreenContract$InputData cFACInsuranceReasonGroupScreenContract$InputData = (CFACInsuranceReasonGroupScreenContract$InputData) this.f23558c;
                KProperty[] kPropertyArr6 = CFACInsuranceReasonGroupScreen.c0;
                qji.b bVarQ22 = cFACInsuranceReasonGroupScreen.Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.insurance.impl.ui.cfac.claim.reason_group.di.CFACInsuranceReasonGroupScreenInjector");
                nk7.j jVar2 = (nk7.j) bVarQ22;
                return new u(jVar2.f216688b, jVar2.f216689c, cFACInsuranceReasonGroupScreenContract$InputData);
            case 9:
                Context context = (Context) this.f23557b;
                RevolutAccountsManagerContentProvider revolutAccountsManagerContentProvider = (RevolutAccountsManagerContentProvider) this.f23558c;
                RevolutAccountsManagerContentProvider.a aVar12 = RevolutAccountsManagerContentProvider.Companion;
                nn0.c cVar2 = (nn0.c) nn0.b.Companion.c();
                String processName = Application.getProcessName();
                Context context2 = revolutAccountsManagerContentProvider.getContext();
                if (Intrinsics.f(context2 != null ? context2.getPackageName() : null, processName)) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "Revolut SSO", "If content provider is used in main app process it's a mistake\nUsing app declaration to get MobileServicesApi...", null, h0Var);
                    Object objI = ue0.e.i(ue0.e.j(context), th0.a.class);
                    if (objI == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    aVar = (th0.a) objI;
                } else {
                    l.a aVar13 = l.Companion;
                    th0.a aVar14 = (th0.a) aVar13.f125044b;
                    aVar = aVar14 == null ? (th0.a) aVar13.e(new b0.b(context, 5)) : aVar14;
                }
                return new jjl.b(context, cVar2, aVar);
            case 10:
                ContactFlow contactFlow = (ContactFlow) this.f23557b;
                ContactFlowContract$InputData contactFlowContract$InputData = (ContactFlowContract$InputData) this.f23558c;
                phm.a aVar15 = (phm.a) ue0.e.j(contactFlow.m2()).a().get(bl3.a.class);
                b60.a aVar16 = aVar15 != null ? (b60.a) aVar15.get() : null;
                if (aVar16 != null) {
                    return new vl3.l(((vl3.k) aVar16.b()).z, contactFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", bl3.a.class, " is not found"));
            case 11:
                DeliveryFlow deliveryFlow = (DeliveryFlow) this.f23557b;
                DeliveryFlowContract$InputData deliveryFlowContract$InputData = (DeliveryFlowContract$InputData) this.f23558c;
                phm.a aVar17 = (phm.a) ue0.e.j(deliveryFlow.m2()).a().get(fl7.a.class);
                b60.a aVar18 = aVar17 != null ? (b60.a) aVar17.get() : null;
                if (aVar18 != null) {
                    return new x(((k0) aVar18.b()).f247359n, deliveryFlow, deliveryFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", fl7.a.class, " is not found"));
            case 12:
                ProvideDetailsScreen provideDetailsScreen = (ProvideDetailsScreen) this.f23557b;
                ProvideDetailsScreenContract$InputData provideDetailsScreenContract$InputData = (ProvideDetailsScreenContract$InputData) this.f23558c;
                phm.a aVar19 = (phm.a) ue0.e.j(provideDetailsScreen.m2()).a().get(um5.c.class);
                b60.a aVar20 = aVar19 != null ? (b60.a) aVar19.get() : null;
                if (aVar20 != null) {
                    return new um5.g(((um5.c) aVar20.b()).f281237h, provideDetailsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", um5.c.class, " is not found"));
            case 13:
                CarPolicyFlow carPolicyFlow = (CarPolicyFlow) this.f23557b;
                CarPolicyFlowContract$InputData carPolicyFlowContract$InputData = (CarPolicyFlowContract$InputData) this.f23558c;
                phm.a aVar21 = (phm.a) ue0.e.j(carPolicyFlow.m2()).a().get(fl7.a.class);
                b60.a aVar22 = aVar21 != null ? (b60.a) aVar21.get() : null;
                if (aVar22 != null) {
                    return new o(((k0) aVar22.b()).f247359n, carPolicyFlow, carPolicyFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", fl7.a.class, " is not found"));
            case 14:
                ChangeNameFlow changeNameFlow = (ChangeNameFlow) this.f23557b;
                ChangeNameFlowContract$InputData changeNameFlowContract$InputData = (ChangeNameFlowContract$InputData) this.f23558c;
                phm.a aVar23 = (phm.a) ue0.e.j(changeNameFlow.m2()).a().get(h.class);
                b60.a aVar24 = aVar23 != null ? (b60.a) aVar23.get() : null;
                if (aVar24 != null) {
                    return new fma.a(((h) aVar24.b()).v, changeNameFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", h.class, " is not found"));
            case 15:
                MtaDeclineScreen mtaDeclineScreen = (MtaDeclineScreen) this.f23557b;
                MtaDeclineScreenContract$InputData mtaDeclineScreenContract$InputData = (MtaDeclineScreenContract$InputData) this.f23558c;
                KProperty[] kPropertyArr7 = MtaDeclineScreen.f75533a0;
                qji.b bVarQ23 = mtaDeclineScreen.Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.mta.decline.di.MtaDeclineScreenInjector");
                q1 q1Var = (q1) ((do7.a) bVarQ23).s().S(mtaDeclineScreen);
                switch (q1Var.f247440a) {
                    case 0:
                        q1Var.d = mtaDeclineScreenContract$InputData;
                        break;
                    default:
                        q1Var.d = mtaDeclineScreenContract$InputData;
                        break;
                }
                return (r1) q1Var.mo3800build();
            case 16:
                return APMPMCoordinator.dispatchSuccess$lambda$0((APMPMCallback) this.f23557b, this.f23558c);
            case 17:
                return APMPMCoordinator.dispatchFailure$lambda$0((APMPMCallback) this.f23557b, (APMPMError) this.f23558c);
            case 18:
                EditApplicationScreen editApplicationScreen = (EditApplicationScreen) this.f23557b;
                EditApplicationScreenContract$InputData editApplicationScreenContract$InputData = (EditApplicationScreenContract$InputData) this.f23558c;
                KProperty[] kPropertyArr8 = EditApplicationScreen.c0;
                qji.b bVarQ24 = editApplicationScreen.Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.edit_application.di.EditApplicationScreenInjector");
                ql7.n nVar2 = (ql7.n) bVarQ24;
                return new f0(nVar2.f247399b, nVar2.f247400c, editApplicationScreen, editApplicationScreenContract$InputData);
            case 19:
                ChallengesOverviewDetailsScreen challengesOverviewDetailsScreen = (ChallengesOverviewDetailsScreen) this.f23557b;
                ChallengesOverviewDetailsScreenContract$InputData challengesOverviewDetailsScreenContract$InputData = (ChallengesOverviewDetailsScreenContract$InputData) this.f23558c;
                int i5 = ChallengesOverviewDetailsScreen.U;
                qji.b bVarU22 = challengesOverviewDetailsScreen.U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.details.di.ChallengesOverviewDetailsScreenComponent.Injector");
                gp8.k kVar = (gp8.k) bVarU22;
                return new gp8.j(kVar.f145316b, kVar.f145317c, challengesOverviewDetailsScreenContract$InputData);
            case 20:
                AddSplitItemController addSplitItemController = (AddSplitItemController) this.f23557b;
                cq9.g gVar = (cq9.g) this.f23558c;
                KProperty[] kPropertyArr9 = AddSplitItemController.S;
                phm.a aVar25 = (phm.a) ue0.e.j(addSplitItemController.m2()).a().get(gp9.a.class);
                b60.a aVar26 = aVar25 != null ? (b60.a) aVar25.get() : null;
                if (aVar26 != null) {
                    return new gp9.c(((gp9.d) ((gp9.a) aVar26.b())).f145365r, gVar);
                }
                throw new IllegalStateException(a0.d.q("Api ", gp9.a.class, " is not found"));
            case 21:
                SignInSessionsBottomSheet signInSessionsBottomSheet = (SignInSessionsBottomSheet) this.f23557b;
                SignInSessionsBottomSheetContract$InputData signInSessionsBottomSheetContract$InputData = (SignInSessionsBottomSheetContract$InputData) this.f23558c;
                int i6 = SignInSessionsBottomSheet.U;
                qji.b bVarU23 = signInSessionsBottomSheet.U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.sso.impl.ui.signin_sessions_flow.bottom_dialog.di.SignInSessionsBottomSheetInjector");
                u0 u0Var = (u0) bVarU23;
                return new s0(u0Var.f196109c, u0Var.d, signInSessionsBottomSheetContract$InputData);
            case 22:
                cr0.l lVar = (cr0.l) this.f23557b;
                Function1 function1 = (Function1) this.f23558c;
                lVar.d = null;
                function1.invoke(Boolean.TRUE);
                return Unit.f186387a;
            case 23:
                DocumentAcceptanceScreen documentAcceptanceScreen = (DocumentAcceptanceScreen) this.f23557b;
                DocumentAcceptanceScreenContract$Input documentAcceptanceScreenContract$Input = (DocumentAcceptanceScreenContract$Input) this.f23558c;
                KProperty[] kPropertyArr10 = DocumentAcceptanceScreen.i0;
                qji.b bVarQ25 = documentAcceptanceScreen.Q2();
                Intrinsics.i(bVarQ25, "null cannot be cast to non-null type com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.di.AcceptDocumentsFlowComponent");
                wpg.b bVar = (wpg.b) bVarQ25;
                return new wpg.f(bVar.f299239a, bVar.f299240b, documentAcceptanceScreenContract$Input);
            case 24:
                SetCategoryBudgetsScreen setCategoryBudgetsScreen = (SetCategoryBudgetsScreen) this.f23557b;
                SetCategoryBudgetsScreenContract$InputData setCategoryBudgetsScreenContract$InputData = (SetCategoryBudgetsScreenContract$InputData) this.f23558c;
                KProperty[] kPropertyArr11 = SetCategoryBudgetsScreen.f101550h0;
                qji.b bVarQ26 = setCategoryBudgetsScreen.Q2();
                Intrinsics.i(bVarQ26, "null cannot be cast to non-null type com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_category_budgets.di.SetCategoryBudgetsScreenInjector");
                erj.k kVar2 = (erj.k) bVarQ26;
                return new erj.l(kVar2.f128715b, kVar2.f128716c, setCategoryBudgetsScreen, setCategoryBudgetsScreenContract$InputData);
            case 25:
                return OrderBookChartView.a((Context) this.f23557b, (OrderBookChartView) this.f23558c);
            case 26:
                RewardsHubCollectionScreen rewardsHubCollectionScreen = (RewardsHubCollectionScreen) this.f23557b;
                RewardsHubCollectionScreenContract$InputData rewardsHubCollectionScreenContract$InputData = (RewardsHubCollectionScreenContract$InputData) this.f23558c;
                KProperty[] kPropertyArr12 = RewardsHubCollectionScreen.R;
                qji.b bVarU24 = rewardsHubCollectionScreen.U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.retail.feature.impl.rewards_hub.ui.screen.collection.di.RewardsHubCollectionScreenInjector");
                rtj.h hVar = (rtj.h) bVarU24;
                return new rtj.d(hVar.f257290b, hVar.f257291c, rewardsHubCollectionScreen, rewardsHubCollectionScreenContract$InputData);
            case 27:
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar2 = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f23557b;
                eVar2.n2(new cn0.d(eVar2, (Amount) this.f23558c, (Continuation) , 14), new whi.b(6));
                return Unit.f186387a;
            case 28:
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar3 = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f23557b;
                eVar3.H2(eVar3.m0, new cp7.k((hdf.b) this.f23558c, 29));
                return Unit.f186387a;
            default:
                EmbeddedInsuranceDetailScreen embeddedInsuranceDetailScreen = (EmbeddedInsuranceDetailScreen) this.f23557b;
                EmbeddedInsuranceDetailScreenContract$InputData embeddedInsuranceDetailScreenContract$InputData = (EmbeddedInsuranceDetailScreenContract$InputData) this.f23558c;
                KProperty[] kPropertyArr13 = EmbeddedInsuranceDetailScreen.f76088d0;
                qji.b bVarQ27 = embeddedInsuranceDetailScreen.Q2();
                Intrinsics.i(bVarQ27, "null cannot be cast to non-null type com.revolut.feature.insurance_embedded.impl.ui.screen.detail.di.EmbeddedInsuranceDetailScreenInjector");
                return (y) ((dv7.a) ((dv7.b) bVarQ27).q().S(embeddedInsuranceDetailScreen)).m0(embeddedInsuranceDetailScreenContract$InputData).mo3800build();
        }
    }
}
