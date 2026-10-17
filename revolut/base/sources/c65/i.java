package c65;

import aw0.n6;
import ccb.c0;
import chj.u0;
import com.revolut.data.model.Data;
import com.revolut.feature.atm.impl.ui.redesign.atm_weekend_markup.AtmWeekendMarkupController;
import com.revolut.feature.category_boost.impl.ui.overview.CategoryBoostsOverviewScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.confirmation.CancelLoanConfirmationController;
import com.revolut.feature.credit.loan.impl.ui.rev10.loanslist.LoansListScreen;
import com.revolut.feature.junior_remote_login.impl.ui.screen.invite_creation.JuniorInviteCreationScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.details.FormDetailsScreen;
import com.revolut.feature.pockets.impl.details_v2.linked_account_details.LinkedAccountDetailsScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_selection.CobrandedCardsSelectionScreen;
import com.revolut.feature.robo.impl.ui.screen.manage_goal.ManageGoalScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.SubscriptionCancellationScreen;
import com.revolut.feature.shared_separate_favourites.common.screen.counterpart_chooser.SharedFavouritesCounterpartChooserScreen;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.WatchlistsSelectorScreen;
import com.revolut.feature.slot_manager.impl.ui.custom_rating.FeedbackBundle;
import com.revolut.feature.slot_manager.impl.ui.custom_rating.dialog.CustomRatingBottomSheetController;
import com.revolut.feature.tab.crypto.impl.ui.v2.accounts.picker.CryptoAccountPickerScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.search.TravelMilesAirlinesSearchScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.home.search.TravelMilesAirlinesHomeSearchScreen;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.fund_highlights.FundHighlightsScreen;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.IllegalBlockSizeException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import nii.y0;
import rp0.a0;
import skm.e0;
import vkm.j2;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i((CancelLoanConfirmationController) this.v, continuation, 0);
            case 1:
                return new i((com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f) this.v, continuation, 1);
            case 2:
                return new i((c6b.e) this.v, continuation, 2);
            case 3:
                return new i((LoansListScreen) this.v, continuation, 3);
            case 4:
                return new i((CobrandedCardsSelectionScreen) this.v, continuation, 4);
            case 5:
                return new i((SubscriptionCancellationScreen) this.v, continuation, 5);
            case 6:
                return new i((com.revolut.feature.retail.goals.impl.ui.a) this.v, continuation, 6);
            case 7:
                return new i((cc7.h) this.v, continuation, 7);
            case 8:
                return new i((c0) this.v, continuation, 8);
            case 9:
                return new i((LinkedAccountDetailsScreen) this.v, continuation, 9);
            case 10:
                return new i((CategoryBoostsOverviewScreen) this.v, continuation, 10);
            case 11:
                return new i((cf6.e) this.v, continuation, 11);
            case 12:
                return new i((FormDetailsScreen) this.v, continuation, 12);
            case 13:
                return new i((SharedFavouritesCounterpartChooserScreen) this.v, continuation, 13);
            case 14:
                return new i((FundHighlightsScreen) this.v, continuation, 14);
            case 15:
                return new i((WatchlistsSelectorScreen) this.v, continuation, 15);
            case 16:
                return new i((TravelMilesAirlinesSearchScreen) this.v, continuation, 16);
            case 17:
                return new i((chj.g) this.v, continuation, 17);
            case 18:
                return new i((u0) this.v, continuation, 18);
            case 19:
                return new i((TravelMilesAirlinesHomeSearchScreen) this.v, continuation, 19);
            case 20:
                return new i((AtmWeekendMarkupController) this.v, continuation, 20);
            case 21:
                return new i((CryptoAccountPickerScreen) this.v, continuation, 21);
            case 22:
                return new i((CustomRatingBottomSheetController) this.v, continuation, 22);
            case 23:
                return new i((com.revolut.feature.insurance_car.impl.ui.flow.delivery.a) this.v, continuation, 23);
            case 24:
                return new i((JuniorInviteCreationScreen) this.v, continuation, 24);
            case 25:
                return new i((cm8.k) this.v, continuation, 25);
            case 26:
                return new i((com.revolut.feature.pay_with_smile.impl.ui.settings.a) this.v, continuation, 26);
            case 27:
                return new i((cmi.z) this.v, continuation, 27);
            case 28:
                return new i((cn0.c) this.v, continuation, 28);
            default:
                return new i((ManageGoalScreen) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((i) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((i) create((a0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((i) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((i) create((se6.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((i) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((i) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((i) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((i) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((i) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((i) create((mii.q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v71, types: [gim.h, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v55, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v65, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v70, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        FeatureConfig dashboardByPlans;
        lm0.p pVarD;
        String strH;
        String strA;
        int i = this.u;
        int i2 = 1;
        aii.q qVar = aii.q.f5292a;
        Integer num = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVar = (t) ((o) ((CancelLoanConfirmationController) obj3).Q.getValue());
                tVar.getClass();
                tVar.l2(new r(tVar, objArr == true ? 1 : 0, i2), new yi5.b(26));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f) obj3).T2();
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((c6b.e) obj3).f21758b.clear();
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((LoansListScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((c7b.t) ((CobrandedCardsSelectionScreen) obj3).R2()).B2();
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.c) ((SubscriptionCancellationScreen) obj3).T2()).u2();
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.retail.goals.impl.ui.a) obj3).C2(qVar);
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                te0.r rVar = ((cc7.h) obj3).f22950m.f22964c;
                od0.i.Companion.getClass();
                rVar.set(od0.h.a(null));
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((c0) obj3).u2();
                return Unit.f186387a;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.pockets.impl.details_v2.linked_account_details.a) ((LinkedAccountDetailsScreen) obj3).R2()).B2();
                return Unit.f186387a;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((cf3.c) ((CategoryBoostsOverviewScreen) obj3).M.getValue()).B2();
                return Unit.f186387a;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cf6.e eVar = (cf6.e) obj3;
                try {
                    af6.b bVar = (af6.b) eVar.f.T2("INSTITUTIONS_STORAGE_KEY", wim.z.d(o0.b(af6.b.class)));
                    if (bVar != null) {
                        return eVar.f23566c.b(bVar);
                    }
                    return null;
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    return null;
                }
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((cg9.n) ((FormDetailsScreen) obj3).R2()).B2();
                return Unit.f186387a;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((SharedFavouritesCounterpartChooserScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth.private_equity.impl.ui.fund_details.fund_highlights.a) ((cgh.o) ((FundHighlightsScreen) obj3).L.getValue())).B2();
                return Unit.f186387a;
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((WatchlistsSelectorScreen) obj3).d().C2(qVar);
                return Unit.f186387a;
            case 16:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((chg.j) ((TravelMilesAirlinesSearchScreen) obj3).R2()).B2();
                return Unit.f186387a;
            case 17:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((chj.g) obj3).f24250p.k(chj.a.f24241a);
                return Unit.f186387a;
            case 18:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return ((u0) obj3).q2().d(new y0(null, u0.n3(true), false, 5));
            case 19:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.travel.miles.impl.ui.screen.home.search.a) ((TravelMilesAirlinesHomeSearchScreen) obj3).R2()).B2();
                return Unit.f186387a;
            case 20:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ck2.d dVar = (ck2.d) ((ck2.e) ((AtmWeekendMarkupController) obj3).R.getValue());
                Object content = ((ck2.f) ((j2) dVar.f24750q.f22677a).getValue()).f24752b.getContent();
                if (content == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                List list = (List) content;
                if (list.size() == 1 && hha.s.p((hha.d) d0.b0(list))) {
                    dashboardByPlans = new PricingPlanFeatureConfig.UltraDashboard(objArr2 == true ? 1 : 0);
                } else {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((hha.d) it8.next()).f152287a);
                    }
                    dashboardByPlans = new PricingPlanFeatureConfig.DashboardByPlans(null, arrayList, null, null, false, xfa.b.ATM_DETAILS, 189);
                }
                dVar.C1(zh9.u0.c(dashboardByPlans));
                return Unit.f186387a;
            case 21:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((cke.h) ((CryptoAccountPickerScreen) obj3).N.getValue()).B2();
                return Unit.f186387a;
            case 22:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cld.e eVar2 = (cld.e) ((CustomRatingBottomSheetController) obj3).U.getValue();
                cli.y yVar = eVar2.f24976q;
                if (!((cld.a) ((j2) yVar.f22677a).getValue()).f24972b) {
                    eVar2.H2(yVar, new cjj.j(7));
                    bld.j jVar = eVar2.f24975p;
                    FeedbackBundle feedbackBundle = eVar2.o.f87356a;
                    String feedback = kotlin.text.d0.F0(((cld.a) ((j2) yVar.f22677a).getValue()).f24971a).toString();
                    bld.m mVar = (bld.m) jVar;
                    mVar.getClass();
                    Intrinsics.checkNotNullParameter(feedbackBundle, "feedbackBundle");
                    Intrinsics.checkNotNullParameter(feedback, "feedback");
                    mVar.f.k(bld.m.c());
                    e0.C(mVar.d, null, null, new b96.d(mVar, feedbackBundle, feedback, null, 17), 3);
                }
                eVar2.C2(qVar);
                return Unit.f186387a;
            case 23:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.insurance_car.impl.ui.flow.delivery.a) obj3).I2();
                return Unit.f186387a;
            case 24:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((cm8.k) ((cm8.h) ((JuniorInviteCreationScreen) obj3).P.getValue())).B2();
                return Unit.f186387a;
            case 25:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((cm8.k) obj3).C2(cm8.e.f25161a);
                return Unit.f186387a;
            case 26:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.pay_with_smile.impl.ui.settings.a) obj3).C2(ol9.b.f226361a);
                return Unit.f186387a;
            case 27:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ue0.c) ((cmi.z) obj3).d.getValue()).I0("active_processing");
                return Unit.f186387a;
            case 28:
                cn0.c cVar = (cn0.c) obj3;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                try {
                    pVarD = cVar.f25330a.d(o0.f186429a.b(lm0.g.class));
                    break;
                } catch (Exception e2) {
                    if (!(e2 instanceof SecurityException)) {
                        nkm.n nVarA = nkm.p.a((gim.h) i26.l.i(e2).f195577b);
                        while (nVarA.hasNext()) {
                            Throwable th10 = (Throwable) nVarA.next();
                            if (lr0.a.r(th10) || (th10 instanceof IllegalBlockSizeException)) {
                            }
                        }
                        throw e2;
                    }
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var2);
                    pVarD = null;
                }
                if (pVarD == null || (strA = pVarD.a()) == null) {
                    try {
                        strH = cVar.f25331b.h();
                    } catch (Exception e4) {
                        h0 h0Var3 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, e4, h0Var3);
                        strH = null;
                    }
                    if (strH != null) {
                        num = new Integer(strH.length());
                    }
                    break;
                } else {
                    num = new Integer(Integer.parseInt(strA));
                }
                return new zm0.a(num);
            default:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.robo.impl.ui.screen.manage_goal.a) ((ManageGoalScreen) obj3).R2()).C2(qVar);
                return Unit.f186387a;
        }
    }
}
