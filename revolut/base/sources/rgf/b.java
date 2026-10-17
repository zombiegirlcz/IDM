package rgf;

import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.give_consent.GiveConsentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.give_consent.GiveConsentScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.agreement.CreditCardInstalmentAgreementScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.agreement.CreditCardInstalmentAgreementScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_settings.CreditCardLimitSettingsController;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_settings.CreditCardLimitSettingsControllerContract$InputData;
import com.revolut.feature.crypto_investments.impl.ui.screens.activity.ActivityScreen;
import com.revolut.feature.crypto_investments.impl.ui.screens.activity.ActivityScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.claim.coverage_info.CFACInsuranceCoverageInfoScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.coverage_info.CFACInsuranceCoverageInfoScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_details.CFACClaimDetailsScreen;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_details.CFACClaimDetailsScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.delivery.print.PrintDiscScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.delivery.print.PrintDiscScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.manual_input.CarManualInputScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.manual_input.CarManualInputScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.summary.PolicySummaryScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.summary.PolicySummaryScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.flow.coverage.CoverageFlow;
import com.revolut.feature.insurance_embedded.impl.ui.flow.coverage.CoverageFlowContract$InputData;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.details.ChallengeEditDetailsScreen;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.details.ChallengeEditDetailsScreenContract$InputData;
import com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.SummaryController;
import com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.SummaryControllerContract$InputData;
import com.revolut.feature.payments.bills_chooser.api.navigation.BillsChooserInputData;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_selection.BillsChooserScreen;
import com.revolut.feature.payments.groups.impl.ui_new.share_group_qr.GroupQrScreen;
import com.revolut.feature.payments.groups.impl.ui_new.share_group_qr.GroupQrScreenContract$InputData;
import com.revolut.feature.rev_points.giftcards.api.navigation.descriptor.RevPointsGiftcardsCheckoutController$InputData;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.checkout.RevPointsGiftcardCheckoutScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.cancel.CancelSalarySwitchScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.cancel.CancelSalarySwitchScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.street_mode.name_location.NameLocationScreen;
import com.revolut.feature.security_hub.impl.ui.street_mode.name_location.NameLocationScreenContract$InputData;
import com.revolut.feature.slot_manager.impl.ui.screen.prompt.SlotManagerPromptController;
import com.revolut.feature.slot_manager.impl.ui.screen.prompt.SlotManagerPromptControllerContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.delete.IncomeSorterDeleteContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.delete.IncomeSorterDeleteController;
import com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreen;
import com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreenContract$InputData;
import com.revolut.feature.trading_orders.api.navigation.trading_asset_details.RecurringBuyAssetDetailsDestination;
import com.revolut.feature.transaction_list.impl.ui.list.screen.all_accounts_filter.AllAccountsTransactionFiltersScreen;
import com.revolut.feature.transaction_list.impl.ui.list.screen.all_accounts_filter.AllAccountsTransactionFiltersScreenContract$InputData;
import com.revolut.feature.transport.impl.ui.transit_checkout.date_input.DateInputScreen;
import com.revolut.feature.transport.impl.ui.transit_checkout.date_input.DateInputScreenContract$InputData;
import com.revolut.feature.view.image.impl.ui.gallery.ImageGalleryScreen;
import com.revolut.feature.view.image.impl.ui.gallery.ImageGalleryScreenContract$InputData;
import com.revolut.feature.widgets.impl.ui.flow.customisation.WidgetCustomisationFlow;
import com.revolut.feature.widgets.impl.ui.flow.customisation.WidgetCustomisationFlowContact$InputData;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.category_budget.CategoryBudgetContract$InputData;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.category_budget.CategoryBudgetScreen;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.analyst_details_screen.AnalystDetailsScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.analyst_details_screen.AnalystDetailsScreenContract$InputData;
import com.revolut.sso.impl.ui.post_authentication.PostAuthenticationFlow;
import com.revolut.sso.impl.ui.post_authentication.PostAuthenticationFlowContract$InputData;
import dw3.i9;
import dw3.w6;
import jm4.a1;
import jm4.k3;
import jm4.o1;
import jm4.r1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ljl.j0;
import ljl.q0;
import prk.g0;
import prk.n0;
import ql7.c1;
import ql7.d1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f254144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f254145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f254146c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f254144a = i;
        this.f254145b = obj2;
        this.f254146c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v1, types: [b60.a] */
    /* JADX WARN: Type inference failed for: r3v39 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f254144a;
        Object obj2 = this.f254146c;
        Object obj3 = this.f254145b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = AllAccountsTransactionFiltersScreen.T;
                qji.b bVarU2 = ((AllAccountsTransactionFiltersScreen) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transaction_list.impl.ui.list.screen.all_accounts_filter.di.AllAccountsTransactionsFilterScreenInjector");
                pgf.f fVar = (pgf.f) bVarU2;
                return new pgf.a(fVar.f235912b, fVar.f235913c, (AllAccountsTransactionFiltersScreenContract$InputData) obj2);
            case 1:
                com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b bVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b) obj3;
                bVar.T2(new rgk.l(bVar, (PricingPlanAction.OpenUrl) obj2, null), new yi5.b(27));
                return Unit.f186387a;
            case 2:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b bVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b) obj3;
                bVar2.l2(new rhk.j(bVar2, (String) obj2, , 0), new yi5.b(26));
                return Unit.f186387a;
            case 3:
                GiveConsentScreen giveConsentScreen = (GiveConsentScreen) obj3;
                KProperty[] kPropertyArr2 = GiveConsentScreen.f68473d0;
                qji.b bVarQ2 = giveConsentScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.di.SpousalConsentPartnerFlowComponent");
                w6 w6Var = (w6) bVarQ2;
                return new i9(w6Var.f120076c, w6Var.d, giveConsentScreen, (GiveConsentScreenContract$InputData) obj2);
            case 4:
                KProperty[] kPropertyArr3 = CFACInsuranceCoverageInfoScreen.c0;
                qji.b bVarQ22 = ((CFACInsuranceCoverageInfoScreen) obj3).Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.insurance.impl.ui.cfac.claim.coverage_info.di.CFACInsuranceCoverageInfoScreenInjector");
                nk7.j jVar = (nk7.j) bVarQ22;
                return new nk7.l(jVar.f216688b, jVar.f216689c, (CFACInsuranceCoverageInfoScreenContract$InputData) obj2);
            case 5:
                CFACClaimDetailsScreenContract$InputData cFACClaimDetailsScreenContract$InputData = (CFACClaimDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr4 = CFACClaimDetailsScreen.f75126e0;
                qji.b bVarQ23 = ((CFACClaimDetailsScreen) obj3).Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_details.di.CFACClaimDetailsScreenInjector");
                nk7.r rVar = (nk7.r) bVarQ23;
                nk7.q qVar = rVar.f216721b;
                nk7.r rVar2 = rVar.f216722c;
                cFACClaimDetailsScreenContract$InputData.getClass();
                return new nk7.c(qVar, rVar2, cFACClaimDetailsScreenContract$InputData);
            case 6:
                KProperty[] kPropertyArr5 = SummaryController.T;
                qji.b bVarU22 = ((SummaryController) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.di.SummaryControllerInjector");
                oi9.w wVar = (oi9.w) bVarU22;
                return new oi9.x(wVar.f225579b, wVar.f225580c, (SummaryControllerContract$InputData) obj2);
            case 7:
                SlotManagerPromptControllerContract$InputData slotManagerPromptControllerContract$InputData = (SlotManagerPromptControllerContract$InputData) obj2;
                phm.a aVar = (phm.a) ue0.e.j(((SlotManagerPromptController) obj3).m2()).a().get(rkd.g.class);
                 = aVar != null ? (b60.a) aVar.get() : 0;
                if ( != 0) {
                    return new rkd.i(((rkd.g) b()).f254806l, slotManagerPromptControllerContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", rkd.g.class, " is not found"));
            case 8:
                ((rlh.j) obj3).C1(new RecurringBuyAssetDetailsDestination(((rlh.q) ((rlh.s) obj2)).f255069a));
                return Unit.f186387a;
            case 9:
                KProperty[] kPropertyArr6 = PrintDiscScreen.f75517a0;
                qji.b bVarQ24 = ((PrintDiscScreen) obj3).Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.delivery.print.di.PrintDiscScreenInjector");
                ql7.x xVar = (ql7.x) bVarQ24;
                return new d1(xVar.f247516b, xVar.f247517c, (PrintDiscScreenContract$InputData) obj2);
            case 10:
                KProperty[] kPropertyArr7 = CarManualInputScreen.f75555b0;
                qji.b bVarQ25 = ((CarManualInputScreen) obj3).Q2();
                Intrinsics.i(bVarQ25, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.manual_input.di.CarManualInputScreenInjector");
                ql7.q qVar2 = (ql7.q) bVarQ25;
                return new ql7.m(qVar2.f247430a, qVar2.f247431b, (CarManualInputScreenContract$InputData) obj2);
            case 11:
                TaxNumberInputScreen taxNumberInputScreen = (TaxNumberInputScreen) obj3;
                TaxNumberInputScreenContract$InputData taxNumberInputScreenContract$InputData = (TaxNumberInputScreenContract$InputData) obj2;
                TaxNumberInputScreen.Companion aVar2 = TaxNumberInputScreen.INSTANCE;
                qji.b bVarQ26 = taxNumberInputScreen.Q2();
                Intrinsics.i(bVarQ26, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.screens.tin.di.TaxNumberInputScreenInjector");
                ine.w wVar2 = (ine.w) ((soe.a) bVarQ26).j().S(taxNumberInputScreen);
                switch (wVar2.f162913a) {
                    case 0:
                        wVar2.d = taxNumberInputScreenContract$InputData;
                        break;
                    case 1:
                        wVar2.d = taxNumberInputScreenContract$InputData;
                        break;
                    default:
                        wVar2.d = taxNumberInputScreenContract$InputData;
                        break;
                }
                return (ine.x) wVar2.mo3800build();
            case 12:
                PostAuthenticationFlow postAuthenticationFlow = (PostAuthenticationFlow) obj3;
                return new j0(((q0) kli.a.n(postAuthenticationFlow.m2())).E, postAuthenticationFlow, (PostAuthenticationFlowContract$InputData) obj2);
            case 13:
                KProperty[] kPropertyArr8 = ChallengeEditDetailsScreen.R;
                qji.b bVarU23 = ((ChallengeEditDetailsScreen) obj3).U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.details.di.ChallengeEditDetailsScreenComponent.Injector");
                gp8.i iVar = (gp8.i) bVarU23;
                return new gp8.d(iVar.f145310b, iVar.f145311c, (ChallengeEditDetailsScreenContract$InputData) obj2);
            case 14:
                BillsChooserScreen billsChooserScreen = (BillsChooserScreen) obj3;
                BillsChooserInputData billsChooserInputData = (BillsChooserInputData) obj2;
                KProperty[] kPropertyArr9 = BillsChooserScreen.g0;
                phm.a aVar3 = (phm.a) ue0.e.j(billsChooserScreen.m2()).a().get(gp9.a.class);
                b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar4 != null) {
                    return new gp9.e(((gp9.d) ((gp9.a) aVar4.b())).f145365r, billsChooserScreen, billsChooserInputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", gp9.a.class, " is not found"));
            case 15:
                KProperty[] kPropertyArr10 = IncomeSorterDeleteController.P;
                qji.b bVarU24 = ((IncomeSorterDeleteController) obj3).U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.delete.di.IncomeSorterDeleteControllerInjector");
                ppd.j0 j0Var = (ppd.j0) bVarU24;
                return new ppd.d0(j0Var.f238443b, j0Var.f238444c, (IncomeSorterDeleteContract$InputData) obj2);
            case 16:
                PolicySummaryScreen policySummaryScreen = (PolicySummaryScreen) obj3;
                KProperty[] kPropertyArr11 = PolicySummaryScreen.j0;
                qji.b bVarQ27 = policySummaryScreen.Q2();
                Intrinsics.i(bVarQ27, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.policy.summary.di.PolicySummaryScreenInjector");
                ql7.o oVar = (ql7.o) bVarQ27;
                return new c1(oVar.f247408b, oVar.f247409c, policySummaryScreen, (PolicySummaryScreenContract$InputData) obj2);
            case 17:
                KProperty[] kPropertyArr12 = CancelSalarySwitchScreen.Q;
                qji.b bVarU25 = ((CancelSalarySwitchScreen) obj3).U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.salary_switch.impl.ui.brazil.screen.cancel.di.CancelSalarySwitchScreenInjector");
                zpc.l lVar = (zpc.l) bVarU25;
                return new zpc.c(lVar.f324270b, lVar.f324271c, (CancelSalarySwitchScreenContract$InputData) obj2);
            case 18:
                KProperty[] kPropertyArr13 = CreditCardInstalmentAgreementScreen.S;
                qji.b bVarU26 = ((CreditCardInstalmentAgreementScreen) obj3).U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.agreement.di.CreditCardInstalmentAgreementScreenInjector");
                k3 k3Var = (k3) bVarU26;
                return new a1(k3Var.f176172b, k3Var.f176173c, (CreditCardInstalmentAgreementScreenContract$InputData) obj2);
            case 19:
                ImageGalleryScreenContract$InputData imageGalleryScreenContract$InputData = (ImageGalleryScreenContract$InputData) obj2;
                KProperty[] kPropertyArr14 = ImageGalleryScreen.R;
                qji.b bVarQ28 = ((ImageGalleryScreen) obj3).Q2();
                Intrinsics.i(bVarQ28, "null cannot be cast to non-null type com.revolut.feature.view.image.impl.ui.gallery.di.ImageGalleryScreenInjector");
                mrg.d dVar = (mrg.d) bVarQ28;
                mrg.c cVar = dVar.f208129b;
                mrg.d dVar2 = dVar.f208130c;
                imageGalleryScreenContract$InputData.getClass();
                return new mrg.a(cVar, dVar2, imageGalleryScreenContract$InputData);
            case 20:
                CategoryBudgetContract$InputData categoryBudgetContract$InputData = (CategoryBudgetContract$InputData) obj2;
                KProperty[] kPropertyArr15 = CategoryBudgetScreen.f101521e0;
                phm.a aVar5 = (phm.a) ue0.e.j(((CategoryBudgetScreen) obj3).m2()).a().get(erj.h.class);
                b60.a aVar6 = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar6 != null) {
                    return new erj.j(((erj.h) aVar6.b()).u, categoryBudgetContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", erj.h.class, " is not found"));
            case 21:
                WidgetCustomisationFlowContact$InputData widgetCustomisationFlowContact$InputData = (WidgetCustomisationFlowContact$InputData) obj2;
                hf0.a aVarJ = ue0.e.j(((WidgetCustomisationFlow) obj3).m2());
                hsh.b bVar3 = (hsh.b) ue0.e.h(aVarJ, hsh.b.class);
                csh.k kVar = (csh.k) ue0.e.h(aVarJ, widgetCustomisationFlowContact$InputData.f96370a);
                ssh.a aVar7 = new ssh.a();
                aVar7.f265397b = bVar3;
                aVar7.f265398c = kVar;
                aVar7.f265396a = widgetCustomisationFlowContact$InputData;
                vc.s.h(aVar7.f265396a, WidgetCustomisationFlowContact$InputData.class);
                vc.s.h(aVar7.f265397b, hsh.b.class);
                vc.s.h(aVar7.f265398c, csh.k.class);
                return new ssh.b(new osh.a(), aVar7.f265397b, aVar7.f265398c, aVar7.f265396a);
            case 22:
                KProperty[] kPropertyArr16 = CreditCardLimitSettingsController.T;
                qji.b bVarU27 = ((CreditCardLimitSettingsController) obj3).U2();
                Intrinsics.i(bVarU27, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.limit_hub.limit_settings.di.CreditCardLimitSettingsControllerInjector");
                o1 o1Var = (o1) bVarU27;
                return new r1(o1Var.f176227b, o1Var.f176228c, (CreditCardLimitSettingsControllerContract$InputData) obj2);
            case 23:
                GroupQrScreenContract$InputData groupQrScreenContract$InputData = (GroupQrScreenContract$InputData) obj2;
                phm.a aVar8 = (phm.a) ue0.e.j(((GroupQrScreen) obj3).m2()).a().get(kr9.l.class);
                b60.a aVar9 = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar9 != null) {
                    return new kr9.n(((kr9.l) aVar9.b()).F, groupQrScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", kr9.l.class, " is not found"));
            case 24:
                ActivityScreenContract$InputData activityScreenContract$InputData = (ActivityScreenContract$InputData) obj2;
                ActivityScreen.Companion aVar10 = ActivityScreen.INSTANCE;
                phm.a aVar11 = (phm.a) ue0.e.j(((ActivityScreen) obj3).m2()).a().get(et5.a.class);
                b60.a aVar12 = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar12 != null) {
                    return new ku5.e(((ku5.f) aVar12.b()).f189675q, activityScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", et5.a.class, " is not found"));
            case 25:
                CoverageFlowContract$InputData coverageFlowContract$InputData = (CoverageFlowContract$InputData) obj2;
                phm.a aVar13 = (phm.a) ue0.e.j(((CoverageFlow) obj3).m2()).a().get(lu7.s.class);
                b60.a aVar14 = aVar13 != null ? (b60.a) aVar13.get() : null;
                if (aVar14 != null) {
                    return new lu7.f(((lu7.s) aVar14.b()).o, coverageFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", lu7.s.class, " is not found"));
            case 26:
                AnalystDetailsScreen analystDetailsScreen = (AnalystDetailsScreen) obj3;
                AnalystDetailsScreenContract$InputData analystDetailsScreenContract$InputData = (AnalystDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr17 = AnalystDetailsScreen.X;
                phm.a aVar15 = (phm.a) ue0.e.j(analystDetailsScreen.m2()).a().get(n0.class);
                b60.a aVar16 = aVar15 != null ? (b60.a) aVar15.get() : null;
                if (aVar16 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                }
                g0 g0Var = ((g0) ((n0) aVar16.b())).N;
                analystDetailsScreenContract$InputData.getClass();
                return new prk.e(g0Var, analystDetailsScreen, analystDetailsScreenContract$InputData);
            case 27:
                KProperty[] kPropertyArr18 = NameLocationScreen.R;
                qji.b bVarU28 = ((NameLocationScreen) obj3).U2();
                Intrinsics.i(bVarU28, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.street_mode.name_location.di.NameLocationScreenInjector");
                vtc.x xVar2 = (vtc.x) bVarU28;
                return new vtc.r(xVar2.f292093b, xVar2.f292094c, (NameLocationScreenContract$InputData) obj2);
            case 28:
                RevPointsGiftcardsCheckoutController$InputData revPointsGiftcardsCheckoutController$InputData = (RevPointsGiftcardsCheckoutController$InputData) obj2;
                int i2 = RevPointsGiftcardCheckoutScreen.Y;
                phm.a aVar17 = (phm.a) ue0.e.j(((RevPointsGiftcardCheckoutScreen) obj3).m2()).a().get(iwb.e.class);
                b60.a aVar18 = aVar17 != null ? (b60.a) aVar17.get() : null;
                if (aVar18 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                }
                iwb.e eVar = ((iwb.e) aVar18.b()).f169026r;
                revPointsGiftcardsCheckoutController$InputData.getClass();
                return new iwb.c(eVar, revPointsGiftcardsCheckoutController$InputData);
            default:
                DateInputScreenContract$InputData dateInputScreenContract$InputData = (DateInputScreenContract$InputData) obj2;
                KProperty[] kPropertyArr19 = DateInputScreen.P;
                phm.a aVar19 = (phm.a) ue0.e.j(((DateInputScreen) obj3).m2()).a().get(hvf.q.class);
                b60.a aVar20 = aVar19 != null ? (b60.a) aVar19.get() : null;
                if (aVar20 != null) {
                    return new hvf.e(((hvf.q) aVar20.b()).k, dateInputScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", hvf.q.class, " is not found"));
        }
    }
}
