package cge;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.xh;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.impl.mandate.create_mandate.CreateMandateScreen;
import com.revolut.feature.external_accounts.impl.mandate.create_mandate.a;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.Watchlist;
import com.revolut.feature.tab.accounts.api.model.AccountContent;
import com.revolut.feature.tab.accounts.impl.ui.tab.AccountsController;
import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$State;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.search.TravelMilesAirlinesSearchScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.home.search.TravelMilesAirlinesHomeSearchScreen;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelections;
import ip0.cs;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import jel.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import pie.s;
import prk.o;
import sfe.x;
import sfe.y;
import vge.y2;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23953a;

    public /* synthetic */ g(int i) {
        this.f23953a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = 0;
        switch (this.f23953a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return ((s) pair.f186386b).a();
            case 1:
                y2 creditFlowOr = (y2) obj2;
                Intrinsics.checkNotNullParameter(creditFlowOr, "$this$creditFlowOr");
                return creditFlowOr.f289065c;
            case 2:
                jel.c it8 = (jel.c) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof b0) {
                    return (b0) it8;
                }
                return null;
            case 3:
                IntRange intRangeU = t61.a.u((Function0) obj2, "<unused var>", 1, 2, 1);
                ArrayList arrayList = new ArrayList(w.t(intRangeU, 10));
                vim.f it9 = intRangeU.iterator();
                while (it9.f289625c) {
                    arrayList.add(new s7(a0.d.n("FUND_DETAILS_ABOUT_LOADING_ITEM", it9.nextInt()), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                IntRange intRange = new IntRange(3, 4, 1);
                ArrayList arrayList2 = new ArrayList(w.t(intRange, 10));
                vim.f it10 = intRange.iterator();
                while (it10.f289625c) {
                    arrayList2.add(new s7(a0.d.n("FUND_DETAILS_ABOUT_LOADING_ITEM", it10.nextInt()), 0, 0, 0, 0, false, null, 126));
                }
                ArrayList arrayListE0 = d0.E0(yp0.b.h(arrayList2, new gu("FUND_DETAILS_ABOUT_LOADING_KEY_MEMBERS_HEADER", 0, 0, 30), null, 0, 126), arrayList);
                IntRange intRange2 = new IntRange(4, 5, 1);
                ArrayList arrayList3 = new ArrayList(w.t(intRange2, 10));
                vim.f it11 = intRange2.iterator();
                while (it11.f289625c) {
                    arrayList3.add(nb0.b(pb0.Companion, a0.d.n("FUND_DETAILS_ABOUT_LOADING_ITEM", it11.nextInt()), false, 0, false, 30));
                }
                return d0.E0(yp0.b.h(arrayList3, new gu("FUND_DETAILS_ABOUT_LOADING_PARTNERS_GROUP_HEADER", 0, 0, 30), null, 0, 126), arrayListE0);
            case 4:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 5:
                String str = (String) obj2;
                CreateMandateScreen.a aVar = CreateMandateScreen.Companion;
                return o.m(str, "it", str, "MENU_INFO_ID");
            case 6:
                CellDetailsDelegate.Model it12 = (CellDetailsDelegate.Model) obj2;
                CreateMandateScreen.a aVar2 = CreateMandateScreen.Companion;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(Intrinsics.f(it12.f51832a, "ITEM_ID_TO"));
            case 7:
                CellDetailsActionDelegate.Model it13 = (CellDetailsActionDelegate.Model) obj2;
                CreateMandateScreen.a aVar3 = CreateMandateScreen.Companion;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(v.k("ITEM_ID_MAX_PER_TRANSFER", "ITEM_ID_MAX_PER_MONTH").contains(it13.f51781a));
            case 8:
                com.revolut.feature.external_accounts.impl.mandate.create_mandate.a update = (com.revolut.feature.external_accounts.impl.mandate.create_mandate.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                if (update instanceof ch6.i) {
                    return ch6.i.a((ch6.i) update, null, null, !r1.d, 55);
                }
                if (Intrinsics.f(update, a.C0482a.f72441a)) {
                    return update;
                }
                throw new NoWhenBranchMatchedException();
            case 9:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list = (List) pair2.f186385a;
                List list2 = (List) pair2.f186386b;
                Set setI1 = d0.i1(list);
                List<Watchlist> list3 = list2;
                ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                for (Watchlist watchlist : list3) {
                    arrayList4.add(new Pair(watchlist, Boolean.valueOf(setI1.contains(watchlist))));
                }
                return arrayList4;
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return u.c(nb0.a(pb0.Companion, "loading-list-id", false, 6));
            case 11:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return chf.f.f24216a;
            case 12:
                return f0.f322471a;
            case 13:
                String it14 = (String) obj2;
                KProperty[] kPropertyArr = TravelMilesAirlinesSearchScreen.W;
                Intrinsics.checkNotNullParameter(it14, "it");
                return kotlin.text.d0.F0(it14).toString();
            case 14:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 3);
                while (i < 3) {
                    arrayListP.add(new pb0(a0.d.n("LOADING_ITEM_ID_", i)));
                    i++;
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            case 15:
                SwipeToActionDelegate.b it15 = (SwipeToActionDelegate.b) obj2;
                KProperty[] kPropertyArr2 = AccountsController.O0;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(it15 instanceof xh);
            case 16:
                SmallStockCardDelegate.Model it16 = (SmallStockCardDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = AccountsController.O0;
                Intrinsics.checkNotNullParameter(it16, "it");
                return new x(it16);
            case 17:
                SmallStockCardDelegate.Model it17 = (SmallStockCardDelegate.Model) obj2;
                KProperty[] kPropertyArr4 = AccountsController.O0;
                Intrinsics.checkNotNullParameter(it17, "it");
                return new y(it17);
            case 18:
                TabAccountsScreenContract$State state = (TabAccountsScreenContract$State) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                ProductAccountDescriptor$Value productAccountDescriptor$Value = state.k;
                return new Data(productAccountDescriptor$Value, null, productAccountDescriptor$Value == null, 2, null);
            case 19:
                TabAccountsScreenContract$State screenState = (TabAccountsScreenContract$State) obj2;
                Intrinsics.checkNotNullParameter(screenState, "screenState");
                AccountContent accountContentL2 = com.revolut.feature.tab.accounts.impl.ui.tab.d.L2((List) screenState.f89686c.getContent(), screenState.k);
                Data data = screenState.f89686c;
                return new Data(accountContentL2, data.getError(), data.getLoading());
            case 20:
                return TabAccountsScreenContract$State.a((TabAccountsScreenContract$State) obj2, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, false, null, 3670015);
            case 21:
                return ((TabAccountsScreenContract$State) obj2).f89686c;
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 24:
                String it18 = (String) obj2;
                KProperty[] kPropertyArr5 = TravelMilesAirlinesHomeSearchScreen.T;
                Intrinsics.checkNotNullParameter(it18, "it");
                return kotlin.text.d0.F0(it18).toString();
            case 25:
                ArrayList arrayListP2 = kii.e.p((Function0) obj2, "it", 3);
                while (i < 3) {
                    arrayListP2.add(new pb0(a0.d.n("LOADING_ITEM_ID_", i)));
                    i++;
                }
                yp0.b.k(arrayListP2, 0, 0, 0, 0, 31);
                return arrayListP2;
            case 26:
                cjd.d update2 = (cjd.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return cjd.d.a(update2, null, null, null, 0, false, null, false, false, 239);
            case 27:
                cjd.d update3 = (cjd.d) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return cjd.d.a(update3, null, null, null, 0, true, null, false, false, 239);
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                lw0.h hVar = new lw0.h(lw0.i.AVATAR);
                ArrayList arrayList5 = new ArrayList();
                IntRange intRange3 = new IntRange(1, 3, 1);
                ArrayList arrayList6 = new ArrayList(w.t(intRange3, 10));
                vim.f it19 = intRange3.iterator();
                while (it19.f289625c) {
                    arrayList6.add(t61.a.o("LOADING_STATE_ID_", it19.nextInt(), pb0.Companion, false, 6));
                }
                yp0.b.k(arrayList6, 0, 0, 0, 0, 31);
                a0.x(arrayList6, arrayList5);
                cs csVar = new cs("LOADING_CAMPAIGN_BUTTON_STATE_ID");
                yp0.b.l(csVar, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
                return new cii.b(null, d0.F0(csVar, arrayList5), hVar);
            default:
                List phoneNumberSelections = (List) obj2;
                Intrinsics.checkNotNullParameter(phoneNumberSelections, "phoneNumberSelections");
                EsimPhoneNumberSelections esimPhoneNumberSelections = (EsimPhoneNumberSelections) d0.d0(phoneNumberSelections);
                if (esimPhoneNumberSelections == null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "EsimMobilePlanAddPhoneNumberScreenModel", "Phone number selections is null", null, h0Var);
                }
                return esimPhoneNumberSelections;
        }
    }

    public /* synthetic */ g(Object obj2, int i) {
        this.f23953a = i;
    }
}
