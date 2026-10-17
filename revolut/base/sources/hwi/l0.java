package hwi;

import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.card_screen.impl.kompot.reactivate.ReactivateCardScreen;
import com.revolut.feature.card_screen.impl.kompot.reactivate.a;
import com.revolut.feature.credit.impl.ui.security_deposit.SecurityDepositInfoScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.confirmation.LoanConfirmWithdrawalController;
import com.revolut.feature.freelancer.impl.ui.onboarding.business_category.FreelancerBusinessCategoryScreen;
import com.revolut.feature.learn.shared.impl.ui.course.overview.CourseOverviewScreen;
import com.revolut.feature.notification_centre.impl.ui.inbox.LegacyInboxScreen;
import com.revolut.feature.rev_points.impl.ui.earn.RevPointsEarnScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.upcoming.UpcomingTransactionsScreen;
import com.revolut.feature.shared.invoices.impl.ui.template_preview.InvoiceTemplatePreviewScreen;
import com.revolut.feature.stock_lending.impl.ui.screens.details.StockLendingDetailsScreen;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_note_glossary.AboutNoteGlossaryScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsControllerContract$ModalStep;
import com.revolut.feature.travel.experiences.impl.ui.screen.reviews.TravelExperiencesReviewsScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.location_picker.TravelFlightsLocationPickerScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.ticket_rules.TravelFlightsTicketRulesScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.crypto.asset_details.common.impl.glossary.CryptoStatsGlossaryScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.comparison.ui.PriceComparisonScreen;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.limits_explanation.LimitsExplanationScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.recommended_buy_info.RecommendedBuyInfoScreen;
import com.revolut.retail.feature.travel_status.impl.ui.screens.partner.TravelStatusPartnerScreen;
import gwi.b6;
import gwi.g5;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class l0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l0((m0) this.v, continuation, 0);
            case 1:
                return new l0((x0) this.v, continuation, 1);
            case 2:
                return new l0((f1) this.v, continuation, 2);
            case 3:
                return new l0((RecommendedBuyInfoScreen) this.v, continuation, 3);
            case 4:
                return new l0((FreelancerBusinessCategoryScreen) this.v, continuation, 4);
            case 5:
                return new l0((RevPointsEarnScreen) this.v, continuation, 5);
            case 6:
                return new l0((CourseOverviewScreen) this.v, continuation, 6);
            case 7:
                return new l0((com.revolut.feature.rev_points.impl.ui.terms_review.flow.a) this.v, continuation, 7);
            case 8:
                return new l0((StockLendingDetailsScreen) this.v, continuation, 8);
            case 9:
                return new l0((i1e.s) this.v, continuation, 9);
            case 10:
                return new l0((PriceComparisonScreen) this.v, continuation, 10);
            case 11:
                return new l0((TravelStatusPartnerScreen) this.v, continuation, 11);
            case 12:
                return new l0((SecurityDepositInfoScreen) this.v, continuation, 12);
            case 13:
                return new l0((TravelExperiencesReviewsScreen) this.v, continuation, 13);
            case 14:
                return new l0((i4h.n) this.v, continuation, 14);
            case 15:
                return new l0((AboutNoteGlossaryScreen) this.v, continuation, 15);
            case 16:
                return new l0((LoanConfirmWithdrawalController) this.v, continuation, 16);
            case 17:
                return new l0((com.revolut.feature.masav.impl.ui.review.a) this.v, continuation, 17);
            case 18:
                return new l0((ManagedPortfolioDetailsController) this.v, continuation, 18);
            case 19:
                return new l0((com.revolut.feature.trading.managed_portfolios.impl.ui.details.c) this.v, continuation, 19);
            case 20:
                return new l0((TravelFlightsLocationPickerScreen) this.v, continuation, 20);
            case 21:
                return new l0((LegacyInboxScreen) this.v, continuation, 21);
            case 22:
                return new l0((TravelFlightsTicketRulesScreen) this.v, continuation, 22);
            case 23:
                return new l0((ReactivateCardScreen) this.v, continuation, 23);
            case 24:
                return new l0((i8d.e) this.v, continuation, 24);
            case 25:
                return new l0((i8e.k) this.v, continuation, 25);
            case 26:
                return new l0((CryptoStatsGlossaryScreen) this.v, continuation, 26);
            case 27:
                return new l0((LimitsExplanationScreen) this.v, continuation, 27);
            case 28:
                return new l0((UpcomingTransactionsScreen) this.v, continuation, 28);
            default:
                return new l0((InvoiceTemplatePreviewScreen) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((l0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v60, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v69, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v73, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v77, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v81, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 1;
        Continuation continuation = null;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g5 g5Var = (g5) ((x0) obj3).f156269b.T2("KEY_USER_CAPABILITIES", g5.class);
                if (g5Var != null) {
                }
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b6 b6Var = (b6) j6.a.k(b6.class, ((f1) obj3).f156214b, "STORAGE_CACHE_KEY_SCHEME_LOUNGES");
                if (b6Var != null) {
                }
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((hwk.c) ((RecommendedBuyInfoScreen) obj3).N.getValue()).B2();
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                FreelancerBusinessCategoryScreen freelancerBusinessCategoryScreen = (FreelancerBusinessCategoryScreen) obj3;
                hz6.k kVarE3 = freelancerBusinessCategoryScreen.R2();
                cli.y yVar = kVarE3.f157051r;
                if (((hz6.e) ((j2) yVar.f22677a).getValue()).f157042c) {
                    kVarE3.H2(yVar, new g7b.q(false, 17));
                } else {
                    kVarE3.C2(hz6.f.f157043a);
                }
                NavBarWithToolbar navBarWithToolbar = freelancerBusinessCategoryScreen.d3().f174539b;
                Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
                kli.c.c(navBarWithToolbar, true);
                break;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((RevPointsEarnScreen) obj3).m2().onBackPressed();
                break;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.learn.shared.impl.ui.course.overview.e) ((CourseOverviewScreen) obj3).T2()).u2();
                break;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.rev_points.impl.ui.terms_review.flow.a) obj3).C2(iub.a.f168544a);
                break;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((StockLendingDetailsScreen) obj3).m2().onBackPressed();
                break;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((i1e.s) obj3).u2();
                break;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((PriceComparisonScreen) obj3).m2().onBackPressed();
                break;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((i2l.m0) ((TravelStatusPartnerScreen) obj3).R2()).B2();
                break;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((SecurityDepositInfoScreen) obj3).m2().onBackPressed();
                break;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((i3g.j) ((TravelExperiencesReviewsScreen) obj3).P.getValue()).B2();
                break;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i4h.p0 p0Var = ((i4h.n) obj3).d;
                p0Var.V2(new i4h.m0(i2, p0Var, continuation), new yi5.b(29));
                break;
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((i5e.h) ((AboutNoteGlossaryScreen) obj3).O.getValue()).B2();
                break;
            case 16:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((i65.s) ((LoanConfirmWithdrawalController) obj3).e3()).J2(i65.i.f158865a);
                break;
            case 17:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.masav.impl.ui.review.a) obj3).C2(i69.g.f158895a);
                break;
            case 18:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.trading.managed_portfolios.impl.ui.details.c) ((ManagedPortfolioDetailsController) obj3).d()).B2();
                break;
            case 19:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.trading.managed_portfolios.impl.ui.details.c cVar = (com.revolut.feature.trading.managed_portfolios.impl.ui.details.c) obj3;
                oki.h.v2(cVar.J, new ManagedPortfolioDetailsControllerContract$ModalStep.TargetAllocations(cVar.A.f91277a), ModalDestination.Style.POPUP.f98311a);
                break;
            case 20:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((i6g.m) ((TravelFlightsLocationPickerScreen) obj3).R2()).B2();
                break;
            case 21:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((i79.k) ((LegacyInboxScreen) obj3).d()).B2();
                break;
            case 22:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((i7g.g) ((TravelFlightsTicketRulesScreen) obj3).O.getValue()).B2();
                break;
            case 23:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.card_screen.impl.kompot.reactivate.b) ((ReactivateCardScreen) obj3).R2()).C2(a.C0466a.f65489a);
                break;
            case 24:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((i8d.e) obj3).u2();
                break;
            case 25:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((i8e.k) obj3).B2();
                break;
            case 26:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((i8j.d) ((CryptoStatsGlossaryScreen) obj3).O.getValue()).B2();
                break;
            case 27:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((i8k.a) ((LimitsExplanationScreen) obj3).R.getValue()).B2();
                break;
            case 28:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((i9d.k) ((UpcomingTransactionsScreen) obj3).f86369h0.getValue()).u2();
                break;
            default:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((iad.g) ((InvoiceTemplatePreviewScreen) obj3).P.getValue()).B2();
                break;
        }
        return Unit.f186387a;
    }
}
