package rlh;

import au0.j4;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_settings.CreditCardLimitSettingsController;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.TrendingScreen;
import com.revolut.feature.cryptocommodity_invest.impl.ui.standalone_symbol.screen.StandaloneSymbolCustomisationScreen;
import com.revolut.feature.external_accounts.impl.ui.link.screens.branches.BranchesScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.summary.PolicySummaryScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.documents.InsuranceDocumentsLayoutScreen;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.details.ChallengeEditDetailsScreen;
import com.revolut.feature.profile.impl.ui.profile.screens.app_settings.AppSettingsController;
import com.revolut.feature.recurringbuys.impl.ui.kompot.payment_history.PaymentHistoryController;
import com.revolut.feature.semi_independent_activation.impl.ui.details.SemiIndependentActivationDetailsScreen;
import com.revolut.feature.tax_residency.impl.v2.ui.exemption.TaxExemptionScreen;
import com.revolut.feature.view.image.impl.ui.gallery.ImageGalleryScreen;
import com.revolut.feature.wealth.ui.impl.recurring_buy_hub_collection.RecurringBuyHubCollectionController;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.modals.unlimited_profiles.AirportLoungesUnlimitedProfileSwitchScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.EsimConnectivityTroubleshootingScreen;
import com.revolut.retail.feature.learn.impl.ui.glossary.GlossaryHomeScreen;
import com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.WealthNewsOverviewFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_management.termsandconditions.screen.TermsAndConditionsScreen;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.benefits.WaitlistBenefitsScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.analyst_ratings.AnalystRatingsScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.analyst_details_screen.AnalystDetailsScreen;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.consent_request.ConsentRequestScreen;
import com.revolut.sso.impl.ui.revolut_id.documents.document_photo.DocumentPhotoScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rn6.f;
import rok.e;
import s0d.h;

/* JADX INFO: loaded from: classes10.dex */
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
                return new c((RecurringBuyHubCollectionController) this.v, continuation, 0);
            case 1:
                return new c((j) this.v, continuation, 1);
            case 2:
                return new c((TermsAndConditionsScreen) this.v, continuation, 2);
            case 3:
                return new c((BranchesScreen) this.v, continuation, 3);
            case 4:
                return new c((AppSettingsController) this.v, continuation, 4);
            case 5:
                return new c((EsimConnectivityTroubleshootingScreen) this.v, continuation, 5);
            case 6:
                return new c((WaitlistBenefitsScreen) this.v, continuation, 6);
            case 7:
                return new c((ChallengeEditDetailsScreen) this.v, continuation, 7);
            case 8:
                return new c((ep9.a) this.v, continuation, 8);
            case 9:
                return new c((TaxExemptionScreen) this.v, continuation, 9);
            case 10:
                return new c((DocumentPhotoScreen) this.v, continuation, 10);
            case 11:
                return new c((com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c) this.v, continuation, 11);
            case 12:
                return new c((com.revolut.feature.foreign_currencies.impl.ui.flow.a) this.v, continuation, 12);
            case 13:
                return new c((PolicySummaryScreen) this.v, continuation, 13);
            case 14:
                return new c((ImageGalleryScreen) this.v, continuation, 14);
            case 15:
                return new c((rsk.j) this.v, continuation, 15);
            case 16:
                return new c((CreditCardLimitSettingsController) this.v, continuation, 16);
            case 17:
                return new c((AnalystRatingsScreen) this.v, continuation, 17);
            case 18:
                return new c((AnalystDetailsScreen) this.v, continuation, 18);
            case 19:
                return new c((InsuranceDocumentsLayoutScreen) this.v, continuation, 19);
            case 20:
                return new c((PaymentHistoryController) this.v, continuation, 20);
            case 21:
                return new c((rvf.c) this.v, continuation, 21);
            case 22:
                return new c((TrendingScreen) this.v, continuation, 22);
            case 23:
                return new c((AirportLoungesUnlimitedProfileSwitchScreen) this.v, continuation, 23);
            case 24:
                return new c((StandaloneSymbolCustomisationScreen) this.v, continuation, 24);
            case 25:
                return new c((GlossaryHomeScreen) this.v, continuation, 25);
            case 26:
                return new c((s0c.e) this.v, continuation, 26);
            case 27:
                return new c((SemiIndependentActivationDetailsScreen) this.v, continuation, 27);
            case 28:
                return new c((WealthNewsOverviewFlow) this.v, continuation, 28);
            default:
                return new c((ConsentRequestScreen) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v51, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v55, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v63, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v72, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((j) ((m) ((RecurringBuyHubCollectionController) obj3).S.getValue())).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vii.c cVar = ((j) obj3).u;
                Unit unit = Unit.f186387a;
                cVar.b(unit);
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((TermsAndConditionsScreen) obj3).m2().onBackPressed();
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((rn6.i) ((rn6.g) ((BranchesScreen) obj3).O.getValue())).C2(f.a.f255508a);
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((AppSettingsController) obj3).m2().onBackPressed();
                break;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.a) ((rnj.e) ((EsimConnectivityTroubleshootingScreen) obj3).P.getValue())).B2();
                break;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((rok.h) ((rok.f) ((WaitlistBenefitsScreen) obj3).Q.getValue())).C2(e.a.f256031a);
                break;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ChallengeEditDetailsScreen) obj3).m2().onBackPressed();
                break;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ep9.a aVar10 = (ep9.a) obj3;
                e0m.e.a(aVar10.f128120c);
                aVar10.f128120c.m0(j4.FROM_CLICKED_BUTTON);
                aVar10.f128120c.i0();
                break;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((rpe.g) ((TaxExemptionScreen) obj3).R.getValue()).B2();
                break;
            case 10:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((DocumentPhotoScreen) obj3).m2().onBackPressed();
                break;
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c cVar2 = (com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c) obj3;
                break;
            case 12:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.foreign_currencies.impl.ui.flow.a) obj3).B2();
                break;
            case 13:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((PolicySummaryScreen) obj3).m2().onBackPressed();
                break;
            case 14:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ImageGalleryScreen) obj3).m2().onBackPressed();
                break;
            case 15:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rsk.j jVar = (rsk.j) obj3;
                jVar.X2(jVar.f257119s, new ro7.n(jVar, 4));
                break;
            case 16:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((rt4.p) ((CreditCardLimitSettingsController) obj3).S.getValue()).B2();
                break;
            case 17:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((rtk.g) ((AnalystRatingsScreen) obj3).N.getValue()).B2();
                break;
            case 18:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((AnalystDetailsScreen) obj3).m2().onBackPressed();
                break;
            case 19:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((InsuranceDocumentsLayoutScreen) obj3).m2().onBackPressed();
                break;
            case 20:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.recurringbuys.impl.ui.kompot.payment_history.a) ((rva.b) ((PaymentHistoryController) obj3).L.getValue())).B2();
                break;
            case 21:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j60.a.v(((rvf.i) ((rvf.c) obj3).d).o, false, null, 3);
                break;
            case 22:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.a) ((rx5.b) ((TrendingScreen) obj3).L.getValue())).B2();
                break;
            case 23:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((AirportLoungesUnlimitedProfileSwitchScreen) obj3).Q.C2(rxi.a.f258184a);
                break;
            case 24:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((StandaloneSymbolCustomisationScreen) obj3).m2().onBackPressed();
                break;
            case 25:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((GlossaryHomeScreen) obj3).m2().onBackPressed();
                break;
            case 26:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((s0c.e) obj3).B2();
                break;
            case 27:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((s0d.m) ((SemiIndependentActivationDetailsScreen) obj3).d()).C2(h.a.f258944a);
                break;
            case 28:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((WealthNewsOverviewFlow) obj3).m2().onBackPressed();
                break;
            default:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ConsentRequestScreen) obj3).m2().onBackPressed();
                break;
        }
        return Unit.f186387a;
    }
}
