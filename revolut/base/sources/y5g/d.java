package y5g;

import au0.j4;
import com.revolut.core.backend_flow.impl.ui.transactions.TransactionsSelectionController;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import com.revolut.feature.add.new_product.impl.ui.add_new_product.AddNewProductScreen;
import com.revolut.feature.category_boost.impl.ui.boost_selection.CategoryBoostSelectionScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.KontomatikSignInController;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.SepaDirectDebitSetUpController;
import com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.LoanInstalmentDetailsScreen;
import com.revolut.feature.crypto.asset.details.impl.dialog.staking_risk_disclaimer.StakingRiskDisclaimerDialogController;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts_au.access_detail_au.AccessDetailsAuScreen;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.screen.verification_code.PseVerificationCodeScreen;
import com.revolut.feature.picker.legacy.PickerScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.billing.CobrandedCardsBillingScreen;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.home.RentAndBillsHomeScreen;
import com.revolut.feature.shops.impl.ui.carousel_details.ShopsCarouselDetailsScreen;
import com.revolut.feature.subscriptions.impl.edit_frequency.EditSubscriptionFrequencyController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.PortfolioInsightsPerformanceController;
import com.revolut.feature.transaction_list.impl.ui.recurring_transfers.RecurringTransfersScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.documents.TravelFlightsDocumentsScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.redeem_option.TravelMilesRedeemOptionScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_segments.TravelMilesFlightSegmentsScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import vkm.j2;
import wim.z;
import yf1.y;
import yg5.u;
import yhm.o;
import yic.x;
import yk6.n;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.q] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d((TravelFlightsDocumentsScreen) this.v, continuation, 0);
            case 1:
                return new d((LoanInstalmentDetailsScreen) this.v, continuation, 1);
            case 2:
                return new d((CobrandedCardsBillingScreen) this.v, continuation, 2);
            case 3:
                return new d((t7a.a) this.v, continuation, 3);
            case 4:
                return new d((PickerScreen) this.v, continuation, 4);
            case 5:
                return new d((PortfolioInsightsPerformanceController) this.v, continuation, 5);
            case 6:
                return new d((com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a) this.v, continuation, 6);
            case 7:
                return new d((y9d.e) this.v, continuation, 7);
            case 8:
                return new d((EditSubscriptionFrequencyController) this.v, continuation, 8);
            case 9:
                return new d((q) this.v, continuation);
            case 10:
                return new d((yaa.h) this.v, continuation, 10);
            case 11:
                return new d((com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b) this.v, continuation, 11);
            case 12:
                return new d((TransactionsSelectionController) this.v, continuation, 12);
            case 13:
                return new d((KontomatikSignInController) this.v, continuation, 13);
            case 14:
                return new d((StakingRiskDisclaimerDialogController) this.v, continuation, 14);
            case 15:
                return new d((com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a) this.v, continuation, 15);
            case 16:
                return new d((CategoryBoostSelectionScreen) this.v, continuation, 16);
            case 17:
                return new d((com.revolut.feature.pockets.impl.ui.add_new.c) this.v, continuation, 17);
            case 18:
                return new d((AddNewProductScreen) this.v, continuation, 18);
            case 19:
                return new d((u) this.v, continuation, 19);
            case 20:
                return new d((RecurringTransfersScreen) this.v, continuation, 20);
            case 21:
                return new d((TravelMilesRedeemOptionScreen) this.v, continuation, 21);
            case 22:
                return new d((SepaDirectDebitSetUpController) this.v, continuation, 22);
            case 23:
                return new d((TravelMilesFlightSegmentsScreen) this.v, continuation, 23);
            case 24:
                return new d((AccessDetailsAuScreen) this.v, continuation, 24);
            case 25:
                return new d((com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.a) this.v, continuation, 25);
            case 26:
                return new d((RentAndBillsHomeScreen) this.v, continuation, 26);
            case 27:
                return new d((ShopsCarouselDetailsScreen) this.v, continuation, 27);
            case 28:
                return new d((com.revolut.feature.shops.impl.ui.carousel_details.a) this.v, continuation, 28);
            default:
                return new d((PseVerificationCodeScreen) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v21, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.q] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v52, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v65, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v72, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v76, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v90, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        List list;
        int i = this.u;
        ArrayList arrayList = null;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((k) ((h) ((TravelFlightsDocumentsScreen) obj3).Q.getValue())).B2();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((LoanInstalmentDetailsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((y6b.k) ((CobrandedCardsBillingScreen) obj3).R2()).B2();
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                t7a.a aVar5 = (t7a.a) obj3;
                e0m.e.a(aVar5.f268625c);
                aVar5.f268625c.m0(j4.FROM_CLICKED_BUTTON);
                aVar5.f268625c.i0();
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((PickerScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((y7f.e) ((PortfolioInsightsPerformanceController) obj3).M.getValue()).B2();
                return Unit.f186387a;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar9 = (com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a) obj3;
                aVar9.A.Q();
                j9i.d dVar = aVar9.B;
                j9i.b type = j9i.b.GIF;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(type, "type");
                ReactionsKeyboardView reactionsKeyboardView = dVar.d;
                int i2 = j9i.c.f172345a[type.ordinal()];
                if (i2 == 1) {
                    str = "type_sticker";
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "type_gif";
                }
                reactionsKeyboardView.setType(str);
                dVar.d.setState(zx0.j.EXPANDED);
                return Unit.f186387a;
            case 7:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                y9d.e eVar = (y9d.e) obj3;
                ReentrantReadWriteLock.ReadLock lock = eVar.f311840g.readLock();
                lock.lock();
                try {
                    ue0.c cVar = eVar.d;
                    KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                    KType kTypeB = o0.b(r9d.b.class);
                    companion.getClass();
                    List list2 = (List) cVar.T2("invoices:templates:storage", z.d(o0.c(List.class, KTypeProjection.Companion.a(kTypeB))));
                    if (list2 != null) {
                        List list3 = list2;
                        arrayList = new ArrayList(w.t(list3, 10));
                        Iterator it8 = list3.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(x9d.a.a((r9d.b) it8.next()));
                            break;
                        }
                    }
                    return arrayList;
                } finally {
                    lock.unlock();
                }
            case 8:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                y9e.g gVar = (y9e.g) ((y9e.c) ((EditSubscriptionFrequencyController) obj3).S.getValue());
                gVar.getClass();
                gVar.l2(new y9e.f(gVar, null), new yi5.b(26));
                return Unit.f186387a;
            case 9:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return ((q) obj3).invoke();
            case 10:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((yaa.h) obj3).C2(yaa.e.f311999a);
                return Unit.f186387a;
            case 11:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.D2(((com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b) obj3).f93798q);
                return Unit.f186387a;
            case 12:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                dc0.f fVar = ((yb0.i) ((TransactionsSelectionController) obj3).d()).f312149t;
                yb0.h hVar = fVar.f112783r;
                if (hVar == null) {
                    throw new IllegalArgumentException("PagedDataStorage should be initialized first");
                }
                lk0.g gVar2 = ((yb0.d) ((j2) hVar.f312147a.f312151x.f22677a).getValue()).d;
                lk0.e eVar2 = (gVar2 == null || (list = gVar2.f196174a) == null) ? null : (lk0.e) d0.m0(list);
                if ((eVar2 != null ? eVar2.e : null) == null) {
                    fVar.T2(new dc0.a(fVar, null), new yi5.b(27));
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.a) ((KontomatikSignInController) obj3).e3()).I2(yc4.h.f312518a);
                return Unit.f186387a;
            case 14:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((yc5.f) ((yc5.c) ((StakingRiskDisclaimerDialogController) obj3).T.getValue())).C2(aii.q.f5292a);
                return Unit.f186387a;
            case 15:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a) obj3).B2();
                return Unit.f186387a;
            case 16:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ye3.b) ((CategoryBoostSelectionScreen) obj3).M.getValue()).B2();
                return Unit.f186387a;
            case 17:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.D2(((com.revolut.feature.pockets.impl.ui.add_new.c) obj3).f80902y);
                return Unit.f186387a;
            case 18:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((y) ((AddNewProductScreen) obj3).R2()).B2();
                return Unit.f186387a;
            case 19:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((u) obj3).C2(yg5.h.f313527a);
                return Unit.f186387a;
            case 20:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((RecurringTransfersScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 21:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ygg.d) ((TravelMilesRedeemOptionScreen) obj3).T.getValue()).C2(ygg.c.f313663a);
                return Unit.f186387a;
            case 22:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.a) ((SepaDirectDebitSetUpController) obj3).d()).J2(yh4.i.f313757a);
                return Unit.f186387a;
            case 23:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((yhg.b) ((TravelMilesFlightSegmentsScreen) obj3).S.getValue()).B2();
                return Unit.f186387a;
            case 24:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((yi6.e) ((yi6.c) ((AccessDetailsAuScreen) obj3).Q.getValue())).B2();
                return Unit.f186387a;
            case 25:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.D2(((com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.a) obj3).u);
                return Unit.f186387a;
            case 26:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((x) ((RentAndBillsHomeScreen) obj3).R2()).B2();
                return Unit.f186387a;
            case 27:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.shops.impl.ui.carousel_details.a) ((ShopsCarouselDetailsScreen) obj3).d()).B2();
                return Unit.f186387a;
            case 28:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.shops.impl.ui.carousel_details.a) obj3).J2();
                return Unit.f186387a;
            default:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((n) ((yk6.j) ((PseVerificationCodeScreen) obj3).N.getValue())).B2();
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.u = 9;
        this.v = (q) function0;
    }
}
