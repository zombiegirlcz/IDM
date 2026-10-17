package cbh;

import a83.p0;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcelable;
import android.os.UserManager;
import android.telephony.euicc.EuiccManager;
import au0.j4;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.select_tax_rate.SelectTaxRateScreen;
import com.revolut.feature.apm.bills.core.api.model.Bill;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.custom_solicitor_details.CustomSolicitorDetailsController;
import com.revolut.feature.external_accounts.impl.mandate.create_mandate.CreateMandateScreen;
import com.revolut.feature.insurance.api.models.details.CFACCancellationReason;
import com.revolut.feature.insurance.impl.ui.cfac.claim.reason_group.CFACInsuranceReasonGroupScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.details.FormDetailsScreen;
import com.revolut.feature.pockets.impl.details_v2.linked_account_details.LinkedAccountDetailsScreen;
import com.revolut.feature.rewards.impl.ui.concierge.screen.additionalinfo.AdditionalInfoBottomSheetScreen;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.simple_selector.SimpleSelectorController;
import com.revolut.feature.shared_separate_favourites.common.screen.counterpart_chooser.SharedFavouritesCounterpartChooserScreen;
import com.revolut.feature.shared_separate_favourites.common.screen.counterpart_chooser.SharedFavouritesCounterpartChooserScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesCounterpartAsset;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.WatchlistsSelectorScreen;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.WatchlistsSelectorScreenContract$ModalStep;
import com.revolut.feature.wealth.impl.ui.invest.transactions.list.screen.InvestTransactionsListScreen;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.fund_highlights.FundHighlightsScreen;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.fund_highlights.FundHighlightsScreenContract$ModalStep;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.utils.EsimInstallationDialogBuilder;
import dd1.a;
import dej.m1;
import ip0.t5;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.t0;
import nii.n1;
import nii.u1;
import nii.y0;
import pej.f;
import tx0.n3;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f22814w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f22814w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g((InvestTransactionsListScreen) this.f22814w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g((cbk.h) this.f22814w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            case 2:
                g gVar3 = new g((cc7.h) this.f22814w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
            case 3:
                g gVar4 = new g((cd4.k) this.f22814w, continuation, 3);
                gVar4.v = obj2;
                return gVar4;
            case 4:
                g gVar5 = new g((LinkedAccountDetailsScreen) this.f22814w, continuation, 4);
                gVar5.v = obj2;
                return gVar5;
            case 5:
                g gVar6 = new g((SelectTaxRateScreen) this.f22814w, continuation, 5);
                gVar6.v = obj2;
                return gVar6;
            case 6:
                g gVar7 = new g((cf3.c) this.f22814w, continuation, 6);
                gVar7.v = obj2;
                return gVar7;
            case 7:
                g gVar8 = new g((SimpleSelectorController) this.f22814w, continuation, 7);
                gVar8.v = obj2;
                return gVar8;
            case 8:
                g gVar9 = new g((FormDetailsScreen) this.f22814w, continuation, 8);
                gVar9.v = obj2;
                return gVar9;
            case 9:
                g gVar10 = new g((cgd.c) this.f22814w, continuation, 9);
                gVar10.v = obj2;
                return gVar10;
            case 10:
                g gVar11 = new g((NavBarWithToolbar) this.f22814w, continuation, 10);
                gVar11.v = obj2;
                return gVar11;
            case 11:
                return new g((NavBarWithToolbar) this.v, (SharedFavouritesCounterpartChooserScreen) this.f22814w, continuation, 11);
            case 12:
                g gVar12 = new g((SharedFavouritesCounterpartChooserScreen) this.f22814w, continuation, 12);
                gVar12.v = obj2;
                return gVar12;
            case 13:
                g gVar13 = new g((FundHighlightsScreen) this.f22814w, continuation, 13);
                gVar13.v = obj2;
                return gVar13;
            case 14:
                g gVar14 = new g((com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.b) this.f22814w, continuation, 14);
                gVar14.v = obj2;
                return gVar14;
            case 15:
                g gVar15 = new g((CreateMandateScreen) this.f22814w, continuation, 15);
                gVar15.v = obj2;
                return gVar15;
            case 16:
                g gVar16 = new g((com.revolut.feature.external_accounts.impl.mandate.create_mandate.b) this.f22814w, continuation, 16);
                gVar16.v = obj2;
                return gVar16;
            case 17:
                g gVar17 = new g((com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.a) this.f22814w, continuation, 17);
                gVar17.v = obj2;
                return gVar17;
            case 18:
                g gVar18 = new g((WatchlistsSelectorScreen) this.f22814w, continuation, 18);
                gVar18.v = obj2;
                return gVar18;
            case 19:
                g gVar19 = new g((chg.j) this.f22814w, continuation, 19);
                gVar19.v = obj2;
                return gVar19;
            case 20:
                g gVar20 = new g((chj.g) this.f22814w, continuation, 20);
                gVar20.v = obj2;
                return gVar20;
            case 21:
                g gVar21 = new g((CustomSolicitorDetailsController) this.f22814w, continuation, 21);
                gVar21.v = obj2;
                return gVar21;
            case 22:
                g gVar22 = new g((AdditionalInfoBottomSheetScreen) this.f22814w, continuation, 22);
                gVar22.v = obj2;
                return gVar22;
            case 23:
                g gVar23 = new g((com.revolut.feature.travel.miles.impl.ui.screen.home.search.a) this.f22814w, continuation, 23);
                gVar23.v = obj2;
                return gVar23;
            case 24:
                return new g((cj6.n) this.v, (String) this.f22814w, continuation, 24);
            case 25:
                g gVar24 = new g((com.revolut.feature.shops.impl.ui.details.a) this.f22814w, continuation, 25);
                gVar24.v = obj2;
                return gVar24;
            case 26:
                g gVar25 = new g((cjj.i) this.f22814w, continuation, 26);
                gVar25.v = obj2;
                return gVar25;
            case 27:
                g gVar26 = new g((ck1.c) this.f22814w, continuation, 27);
                gVar26.v = obj2;
                return gVar26;
            case 28:
                g gVar27 = new g((ck3.n) this.f22814w, continuation, 28);
                gVar27.v = obj2;
                return gVar27;
            default:
                g gVar28 = new g((CFACInsuranceReasonGroupScreen) this.f22814w, continuation, 29);
                gVar28.v = obj2;
                return gVar28;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((g) create((t5) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((g) create((lw0.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((g) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((g) create((n3) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((g) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((g) create((cgh.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((g) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((g) create((lw0.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((g) create((pej.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((g) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((g) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((g) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((g) create((yj1.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((CFACCancellationReason) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v121, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v68, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v111, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v53, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v95, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws IntentSender.SendIntentException {
        int i;
        int i2;
        Bill bill;
        List list;
        int i3 = this.u;
        int i5 = 27;
        int i6 = 14;
        int i21 = 4;
        int i22 = 2;
        int i32 = 1;
        int i33 = 0;
        List listP0 = null;
        Object[] objArr = 0;
        Object obj3 = this.f22814w;
        switch (i3) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t60.a aVar2 = (t60.a) pair.f186385a;
                t60.a currentState = (t60.a) pair.f186386b;
                m mVarE3 = ((InvestTransactionsListScreen) obj3).d();
                Intrinsics.h(currentState);
                y yVar = (y) mVarE3;
                yVar.getClass();
                Intrinsics.checkNotNullParameter(currentState, "currentState");
                Data data = ((j) ((j2) yVar.getState().f22677a).getValue()).f22821g;
                if (data != null && !data.getLoading() && aVar2 != null && ((i = currentState.f268120a) <= (i2 = aVar2.f268120a) ? !(i >= i2 || i >= 50) : currentState.e - currentState.f268121b < 50)) {
                    yVar.B.k(Integer.valueOf(i));
                }
                return Unit.f186387a;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cbk.h hVar = (cbk.h) obj3;
                hVar.X2(hVar.o, new qna.p(data2, i5));
                return Unit.f186387a;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cc7.m mVar = ((cc7.h) obj3).f22950m;
                cbf.i func = new cbf.i(data3, 6);
                mVar.getClass();
                Intrinsics.checkNotNullParameter(func, "func");
                te0.r rVar = mVar.f22963b;
                rVar.set(func.invoke(rVar.get()));
                return Unit.f186387a;
            case 3:
                Data data4 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((cd4.k) obj3).x2(new cbf.i(data4, 11));
                return Unit.f186387a;
            case 4:
                t5 model = (t5) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cea.k kVarE3 = ((LinkedAccountDetailsScreen) obj3).R2();
                Intrinsics.h(model);
                com.revolut.feature.pockets.impl.details_v2.linked_account_details.a aVar7 = (com.revolut.feature.pockets.impl.details_v2.linked_account_details.a) kVarE3;
                aVar7.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj4 = model.e;
                if (obj4 != null) {
                    if (!(obj4 instanceof dda.h)) {
                        obj4 = null;
                    }
                    dda.h hVar2 = (dda.h) obj4;
                    if (hVar2 != null) {
                        r70.c.b(aVar7.f80818r, 3);
                        aVar7.f80817q.c(null, hVar2.f113180c, false, new bvb.a(aVar7, i6));
                    }
                }
                return Unit.f186387a;
            case 5:
                lw0.l lVar = (lw0.l) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cf1.e eVar = (cf1.e) ((SelectTaxRateScreen) obj3).U.getValue();
                String menuId = lVar.a();
                cf1.g gVar = (cf1.g) eVar;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(menuId, "menuId");
                if (Intrinsics.f(menuId, "MANAGE_RATES_MENU_ID")) {
                    gVar.C2(a.b.f113083a);
                }
                return Unit.f186387a;
            case 6:
                Data data5 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cf3.c cVar = (cf3.c) obj3;
                cVar.H2(cVar.f23535p, new cbf.i(data5, 16));
                return Unit.f186387a;
            case 7:
                Object item = this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cfd.g gVar2 = (cfd.g) ((SimpleSelectorController) obj3).M.getValue();
                gVar2.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                gVar2.C2(new cfd.e(item));
                return Unit.f186387a;
            case 8:
                String menuItemId = (String) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cg9.h hVarE3 = ((FormDetailsScreen) obj3).R2();
                Intrinsics.h(menuItemId);
                cg9.n nVar = (cg9.n) hVarE3;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                if (menuItemId.equals("CREATE_COPY_MENU_ID") && (bill = (Bill) ((cg9.f) ((j2) nVar.f23883q.f22677a).getValue()).f23871b.getContent()) != null) {
                    nVar.l2(new cg9.m(nVar, bill, null), new yi5.b(26));
                }
                return Unit.f186387a;
            case 9:
                cgd.c cVar2 = (cgd.c) obj3;
                SharedFavouritesCounterpartChooserScreenContract$InputData sharedFavouritesCounterpartChooserScreenContract$InputData = cVar2.f23928p;
                Data data6 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                Ref$ObjectRef ref$ObjectRefW = p.a.w(obj2);
                List list2 = (List) data6.getContent();
                if (list2 != null) {
                    bm8.a aVar13 = new bm8.a(new adh.k(cVar2, 3), cVar2, i32);
                    kotlin.text.a0.A(t0.f186434a);
                    listP0 = zhm.d0.P0(list2, new bm8.a(aVar13));
                }
                ref$ObjectRefW.f186409a = listP0;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.f186409a = ((cgd.k) cVar2.t2()).f23940b;
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                ref$BooleanRef.f186407a = ((cgd.k) cVar2.t2()).d;
                if (sharedFavouritesCounterpartChooserScreenContract$InputData.d != null && (list = (List) ref$ObjectRefW.f186409a) != null && (!list.isEmpty())) {
                    Iterator it8 = ((List) ref$ObjectRefW.f186409a).iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            if (Intrinsics.f(((FavouritesCounterpartAsset) it8.next()).f86867a, sharedFavouritesCounterpartChooserScreenContract$InputData.d)) {
                                i = i33;
                            } else {
                                i33++;
                            }
                        }
                    }
                    FavouritesCounterpartAsset favouritesCounterpartAsset = (FavouritesCounterpartAsset) zhm.d0.e0(i, (List) ref$ObjectRefW.f186409a);
                    if (favouritesCounterpartAsset != null && i != 0) {
                        ArrayDeque arrayDeque = new ArrayDeque((Collection) ref$ObjectRefW.f186409a);
                        arrayDeque.remove(i);
                        arrayDeque.addFirst(favouritesCounterpartAsset);
                        ref$ObjectRefW.f186409a = arrayDeque;
                    }
                    if (!((cgd.k) cVar2.t2()).d) {
                        ref$ObjectRef.f186409a = favouritesCounterpartAsset;
                        ref$BooleanRef.f186407a = true;
                    }
                }
                cVar2.x2(new c1g.o(ref$ObjectRefW, 13, ref$ObjectRef, ref$BooleanRef));
                return Unit.f186387a;
            case 10:
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) obj3;
                n3 n3Var = (n3) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i = n3Var != null ? cgd.i.f23937a[n3Var.ordinal()] : -1;
                if (i == 1) {
                    navBarWithToolbar.setMenuItems(zhm.u.c(SharedFavouritesCounterpartChooserScreen.f86831h0));
                } else if (i == 2) {
                    navBarWithToolbar.setMenuItems(zhm.f0.f322471a);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                NavBarWithToolbar navBarWithToolbar2 = (NavBarWithToolbar) this.v;
                e0m.e.a(navBarWithToolbar2);
                navBarWithToolbar2.m0(j4.FADE);
                navBarWithToolbar2.i0();
                ((cgd.c) ((cgd.n) ((SharedFavouritesCounterpartChooserScreen) obj3).f86835e0.getValue())).x2(new ccg.c(i5));
                return Unit.f186387a;
            case 12:
                String str = (String) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                SharedFavouritesCounterpartChooserScreen sharedFavouritesCounterpartChooserScreen = (SharedFavouritesCounterpartChooserScreen) obj3;
                SharedFavouritesCounterpartChooserScreen.Companion aVar17 = SharedFavouritesCounterpartChooserScreen.INSTANCE;
                sharedFavouritesCounterpartChooserScreen.h3().f183968c.scrollToPosition(0);
                cgd.c cVar3 = (cgd.c) ((cgd.n) sharedFavouritesCounterpartChooserScreen.f86835e0.getValue());
                cVar3.getClass();
                cVar3.x2(new c86.c(str, i21));
                return Unit.f186387a;
            case 13:
                cgh.j parcel = (cgh.j) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.kompot.navigable.vc.modal.a aVar19 = ((com.revolut.feature.wealth.private_equity.impl.ui.fund_details.fund_highlights.a) ((cgh.o) ((FundHighlightsScreen) obj3).L.getValue())).u;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z = parcel instanceof cgh.g;
                ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                if (z) {
                    oki.h.v2(aVar19, new FundHighlightsScreenContract$ModalStep.DealSourcingInfo(((cgh.g) parcel).f23974a), bottom_dialog);
                } else if (parcel instanceof cgh.f) {
                    cgh.f fVar = (cgh.f) parcel;
                    oki.h.v2(aVar19, new FundHighlightsScreenContract$ModalStep.CoreTeamMemberInfo(fVar.f23971a, fVar.f23972b, fVar.f23973c, fVar.d), bottom_dialog);
                } else if (Intrinsics.f(parcel, cgh.i.f23976a)) {
                    oki.h.v2(aVar19, FundHighlightsScreenContract$ModalStep.TrackRecordInfo.f95800a, bottom_dialog);
                } else {
                    if (!Intrinsics.f(parcel, cgh.h.f23975a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.v2(aVar19, FundHighlightsScreenContract$ModalStep.LiquidityGateInfo.f95799a, bottom_dialog);
                }
                return Unit.f186387a;
            case 14:
                Data data7 = (Data) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.b bVar = (com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.b) obj3;
                bVar.H2(bVar.f60908q, new cbf.i(data7, 20));
                return Unit.f186387a;
            case 15:
                ty0.a aVar21 = (ty0.a) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ch6.j jVarE3 = ((CreateMandateScreen) obj3).R2();
                String url2 = aVar21.f275445a;
                com.revolut.feature.external_accounts.impl.mandate.create_mandate.b bVar2 = (com.revolut.feature.external_accounts.impl.mandate.create_mandate.b) jVarE3;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                BridgeDestination bridgeDestinationA = bVar2.f72445s.a(url2);
                if (bridgeDestinationA != null) {
                    bVar2.C1(bridgeDestinationA);
                }
                return Unit.f186387a;
            case 16:
                yhm.r rVar2 = (yhm.r) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bh6.e eVar2 = (bh6.e) rVar2.f314201a;
                ExternalInstitution externalInstitution = (ExternalInstitution) rVar2.f314202b;
                e7l.f fVar2 = (e7l.f) rVar2.f314203c;
                com.revolut.feature.external_accounts.impl.mandate.create_mandate.b bVar3 = (com.revolut.feature.external_accounts.impl.mandate.create_mandate.b) obj3;
                Intrinsics.h(fVar2);
                ch6.n nVarA = ((ch6.p) bVar3.f72443q).a(bVar3.o.f72437b, fVar2);
                if (nVarA != null) {
                    bVar3.H2(bVar3.f72449y, new a5b.b(nVarA, fVar2, externalInstitution, eVar2, 19));
                }
                return Unit.f186387a;
            case 17:
                Data data8 = (Data) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.a aVar25 = (com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.a) obj3;
                aVar25.H2(aVar25.f86935q, new cbf.i(data8, 21));
                return Unit.f186387a;
            case 18:
                lw0.l menuItem = (lw0.l) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.a aVarE3 = ((WatchlistsSelectorScreen) obj3).d();
                Intrinsics.h(menuItem);
                aVarE3.getClass();
                Intrinsics.checkNotNullParameter(menuItem, "menuItem");
                oki.h.v2(aVarE3.f86936r, WatchlistsSelectorScreenContract$ModalStep.CreateNewWatchlist.f86933a, ModalDestination.Style.POPUP.f98311a);
                return Unit.f186387a;
            case 19:
                Data data9 = (Data) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                chg.j jVar = (chg.j) obj3;
                jVar.H2(jVar.f24231s, new cbf.i(data9, 22));
                return Unit.f186387a;
            case 20:
                pej.f fVar3 = (pej.f) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                chj.g gVar3 = (chj.g) obj3;
                EsimInstallationDialogBuilder esimInstallationDialogBuilder = gVar3.f24249n;
                if (fVar3 instanceof f.a) {
                    esimInstallationDialogBuilder.getClass();
                    gVar3.L2(new y0("esimInstallationProgress", new nii.c0(new TextLocalisedClause(R$string.esim_installation_dialog_installing_title, null, null, 14), new TextLocalisedClause(R$string.esim_installation_dialog_installing_description, null, null, 14), null, false, null, false, false, null, 1916), false, 4));
                } else if (fVar3 instanceof pej.h) {
                    gVar3.d3(((pej.h) fVar3).f235392a, m1.SUCCEEDED);
                    esimInstallationDialogBuilder.getClass();
                    yji.n.j2(gVar3, gVar3.L2(new y0("esimInstallationSuccess", new nii.j0((Clause) new TextLocalisedClause(R$string.esim_installation_dialog_success_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.esim_installation_dialog_success_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092), false, 4)), null, new c65.i(gVar3, objArr == true ? 1 : 0, 17), 3);
                } else if (fVar3 instanceof pej.g) {
                    ynj.l lVar2 = gVar3.f24248m;
                    Intent resultIntent = ((pej.g) fVar3).f235391a;
                    lVar2.getClass();
                    Intrinsics.checkNotNullParameter(resultIntent, "resultIntent");
                    oej.c cVar4 = lVar2.f315486b;
                    Activity activity = lVar2.f315485a;
                    cVar4.getClass();
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Intrinsics.checkNotNullParameter(resultIntent, "resultIntent");
                    qej.e eVar3 = cVar4.f224612a;
                    eVar3.getClass();
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Intrinsics.checkNotNullParameter(resultIntent, "resultIntent");
                    rej.e eVar4 = eVar3.f245190c;
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Intrinsics.checkNotNullParameter(resultIntent, "resultIntent");
                    String stringExtra = resultIntent.getStringExtra("esim_profile_id");
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    Intent intent = new Intent("esim_resolve_error");
                    intent.setPackage(eVar4.f253642a.getApplicationContext().getPackageName());
                    intent.putExtra("esim_profile_id", stringExtra);
                    Unit unit = Unit.f186387a;
                    PendingIntent broadcast = PendingIntent.getBroadcast(activity, 0, intent, 167772160);
                    Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
                    EuiccManager euiccManagerA = eVar3.a();
                    if (euiccManagerA != null) {
                        euiccManagerA.startResolutionActivity(activity, 0, resultIntent, broadcast);
                    }
                } else if (fVar3 instanceof pej.d) {
                    pej.d dVar = (pej.d) fVar3;
                    String str2 = dVar.f235387a;
                    gVar3.d3(str2, m1.FAILED);
                    gVar3.c3(new EsimInstallationDialogBuilder.TryAgainPayload(str2, dVar.f235388b), ((UserManager) gVar3.f24247l.f224613b.d.getValue()).isManagedProfile());
                } else {
                    if (!(fVar3 instanceof pej.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar3.d3(((pej.e) fVar3).f235389a, m1.FAILED);
                    gVar3.c3(null, false);
                }
                return Unit.f186387a;
            case 21:
                ty0.a aVar29 = (ty0.a) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ci4.e eVarE3 = ((CustomSolicitorDetailsController) obj3).d();
                Intrinsics.h(aVar29);
                ((ci4.o) eVarE3).I2(new ci4.j(aVar29));
                return Unit.f186387a;
            case 22:
                n6 n6Var = (n6) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cic.d dVar2 = (cic.d) ((AdditionalInfoBottomSheetScreen) obj3).U.getValue();
                if (n6Var.k instanceof cic.a) {
                    dVar2.C2(aii.q.f5292a);
                } else {
                    dVar2.getClass();
                }
                return Unit.f186387a;
            case 23:
                Pair pair2 = (Pair) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.miles.impl.ui.screen.home.search.a aVar33 = (com.revolut.feature.travel.miles.impl.ui.screen.home.search.a) obj3;
                aVar33.H2(aVar33.f94364s, new p0((Data) pair2.f186385a, (Data) pair2.f186386b, 8));
                return Unit.f186387a;
            case 24:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((cj6.n) this.v).C2(new cj6.f((String) obj3));
                return Unit.f186387a;
            case 25:
                Data data10 = (Data) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.shops.impl.ui.details.a) obj3).R2(data10);
                return Unit.f186387a;
            case 26:
                Data data11 = (Data) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cjj.i iVar = (cjj.i) obj3;
                iVar.H2(iVar.f24696r, new cbf.i(data11, 28));
                return Unit.f186387a;
            case 27:
                yj1.e eVar5 = (yj1.e) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bk1.c cVar5 = (bk1.c) j6.a.k(bk1.c.class, ((ck1.c) obj3).f24743c, ngm.n.c(eVar5));
                if (cVar5 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(cVar5, "<this>");
                yj1.a aVar38 = new yj1.a(cVar5.f16215a, cVar5.f16216b, cVar5.f16217c, cVar5.d, cVar5.e);
                od0.i.Companion.getClass();
                return od0.h.a(aVar38);
            case 28:
                Data data12 = (Data) this.v;
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ck3.n nVar2 = (ck3.n) obj3;
                nVar2.H2(nVar2.f24771t, new ck2.c(data12, i22));
                return Unit.f186387a;
            default:
                CFACCancellationReason reasonGroup = (CFACCancellationReason) this.v;
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ck7.k kVar = (ck7.k) ((CFACInsuranceReasonGroupScreen) obj3).Y.getValue();
                Intrinsics.h(reasonGroup);
                kVar.getClass();
                Intrinsics.checkNotNullParameter(reasonGroup, "reasonGroup");
                kVar.v2(new ck7.f(reasonGroup));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f22814w = obj2;
    }
}
