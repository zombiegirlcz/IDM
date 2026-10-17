package igh;

import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.dg;
import com.revolut.core.ui_kit.delegates.eg;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsCollectionAssetsTypeFilterValue;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.home_widget_customisation.WatchlistCustomisationScreen;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.home_widget_customisation.b;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.b;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.EsimMobilePlanCancellationScreen;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import ip0.c2;
import ip0.d2;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import ip0.xk;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import xzg.o0;
import zh9.i0;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161212a;

    public /* synthetic */ k(int i) {
        this.f161212a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        boolean z = false;
        switch (this.f161212a) {
            case 0:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "<unused var>", 5);
                for (int i = 0; i < 5; i++) {
                    arrayListP.add(new d2(a0.d.n("FUND_DETAILS_HOLDINGS_ITEM_LOADING", i), c2.CIRCLE));
                }
                return yp0.b.j(new eg("FUND_DETAILS_HOLDINGS_SCROLLER_BOX_LOADING", arrayListP, dg.c.f54053a, 4.0f, 0, 0, 1008), new gu("FUND_DETAILS_HOLDINGS_HEADER_LOADING", 0, 0, 30), null, 126);
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return yp0.b.j(nb0.b(pb0.Companion, "FUND_DETAILS_INVESTMENTS_ITEM_LOADING", false, 0, false, 30), new gu("FUND_DETAILS_INVESTMENTS_HEADER_LOADING", 0, 0, 30), null, 126);
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                gu guVar = new gu("FUND_DETAILS_KEY_DETAILS_HEADER_LOADING", 0, R$attr.uikit_dp12, 26);
                int i2 = R$attr.uikit_dp0;
                int i3 = R$attr.uikit_dp8;
                CounterTextDelegate.Model.Companion companion = CounterTextDelegate.Model.INSTANCE;
                List<CounterTextDelegate.Model> listK = zhm.v.k(CounterTextDelegate.Model.Companion.b(companion, "FUND_DETAILS_KEY_DETAILS_BUY_FREQUENCY_LOADING", null, 0, 0, 0, 0, 126), CounterTextDelegate.Model.Companion.b(companion, "FUND_DETAILS_KEY_DETAILS_SELL_FREQUENCY_LOADING", null, 0, 0, 0, 0, 126));
                ArrayList arrayList = new ArrayList(zhm.w.t(listK, 10));
                for (CounterTextDelegate.Model model : listK) {
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(model);
                }
                xk xkVar = new xk("FUND_DETAILS_KEY_DETAILS_FREQUENCY_GRID_LOADING", arrayList, 2, Float.valueOf(8.0f), null, i2, i3, 0, 0, 65136);
                CounterTextDelegate.Model modelB = CounterTextDelegate.Model.Companion.b(CounterTextDelegate.Model.INSTANCE, "FUND_DETAILS_KEY_DETAILS_SELL_TIMELINE_LOADING", null, 0, 0, 0, 0, 126);
                yp0.b.l(modelB, R$attr.uikit_dp0, 0, 0, 0, null, false, 62);
                return zhm.v.k(guVar, xkVar, modelB);
            case 3:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return b.AbstractC0588b.a.f95782a;
            case 4:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return b.a.C0586a.f95780a;
            case 5:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return null;
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return f0.f322471a;
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                List listK2 = zhm.v.k(new s7("LOCKED_BALANCE_TOTAL", 0, 0, 0, 0, false, null, 126), new s7("LOCKED_BALANCE_AVAILABLE", 0, 0, 0, 0, false, null, 126));
                int i5 = R$attr.uikit_dp0;
                yp0.b.k(listK2, i5, i5, 0, 0, 28);
                return listK2;
            case 8:
                Function0 defaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultLoadingItems, "defaultLoadingItems");
                return (List) defaultLoadingItems.invoke();
            case 9:
                Unit it11 = (Unit) obj2;
                WatchlistCustomisationScreen.a aVar = WatchlistCustomisationScreen.Companion;
                Intrinsics.checkNotNullParameter(it11, "it");
                return b.e.f86966a;
            case 10:
                ihd.o updateState = (ihd.o) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                m70.a.c(t0.f186434a);
                return ihd.o.a(updateState, null, null, "", false, 7);
            case 11:
                ihd.o updateState2 = (ihd.o) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return ihd.o.a(updateState2, null, null, null, true, 15);
            case 12:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255101c = true;
                return Unit.f186387a;
            case 13:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                ybl.g gVar = (ybl.g) pair.f186386b;
                Iterator it12 = list.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        next = it12.next();
                        if (((WealthAccount) next).T0() == WealthAccountType.MARGIN) {
                        }
                    } else {
                        next = null;
                    }
                }
                WealthAccount wealthAccount = (WealthAccount) next;
                if (wealthAccount != null) {
                    if (wealthAccount.getF95255c() != o0.ACTIVE && wealthAccount.getF95255c() != o0.OFFBOARDING) {
                        z = false;
                    }
                    z = z;
                }
                cfl.p pVar = cfl.p.BONDS;
                TradingAccountType.Gia gia = TradingAccountType.Gia.f105270a;
                boolean zC = gVar.c(pVar, gia);
                boolean zC2 = gVar.c(cfl.p.ETF, gia);
                InstrumentsCollectionAssetsTypeFilterValue instrumentsCollectionAssetsTypeFilterValue = InstrumentsCollectionAssetsTypeFilterValue.ALL;
                InstrumentsCollectionAssetsTypeFilterValue instrumentsCollectionAssetsTypeFilterValue2 = InstrumentsCollectionAssetsTypeFilterValue.CFDS;
                if (!z) {
                    instrumentsCollectionAssetsTypeFilterValue2 = null;
                }
                InstrumentsCollectionAssetsTypeFilterValue instrumentsCollectionAssetsTypeFilterValue3 = InstrumentsCollectionAssetsTypeFilterValue.STOCKS;
                if (!z && !zC && !zC2) {
                    instrumentsCollectionAssetsTypeFilterValue3 = null;
                }
                InstrumentsCollectionAssetsTypeFilterValue instrumentsCollectionAssetsTypeFilterValue4 = InstrumentsCollectionAssetsTypeFilterValue.BONDS;
                if (!zC) {
                    instrumentsCollectionAssetsTypeFilterValue4 = null;
                }
                InstrumentsCollectionAssetsTypeFilterValue[] elements = {instrumentsCollectionAssetsTypeFilterValue, instrumentsCollectionAssetsTypeFilterValue2, instrumentsCollectionAssetsTypeFilterValue3, instrumentsCollectionAssetsTypeFilterValue4, zC2 ? InstrumentsCollectionAssetsTypeFilterValue.ETFS : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return kotlin.collections.d.L(elements);
            case 14:
                iii.d params = (iii.d) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return iii.c.a(params.f161622c, params.f161620a, params.d);
            case 15:
                iii.d params2 = (iii.d) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                boolean z3 = params2.f161621b;
                Object obj3 = params2.d;
                String str = params2.f161622c;
                boolean z4 = params2.f161620a;
                return z3 ? iii.c.d(str, z4, obj3) : iii.c.a(str, z4, obj3);
            case 16:
                iii.d params3 = (iii.d) obj2;
                Intrinsics.checkNotNullParameter(params3, "params");
                return iii.c.a(params3.f161622c, params3.f161620a, params3.d);
            case 17:
                iii.d params4 = (iii.d) obj2;
                Intrinsics.checkNotNullParameter(params4, "params");
                boolean z6 = params4.f161621b;
                Object obj4 = params4.d;
                String str2 = params4.f161622c;
                boolean z11 = params4.f161620a;
                return z6 ? iii.c.d(str2, z11, obj4) : iii.c.a(str2, z11, obj4);
            case 18:
                iii.d params5 = (iii.d) obj2;
                Intrinsics.checkNotNullParameter(params5, "params");
                return iii.c.a(params5.f161622c, params5.f161620a, params5.d);
            case 19:
                EsimDataPlan it13 = (EsimDataPlan) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(it13.f100217j);
            case 20:
                EsimDataPlan it14 = (EsimDataPlan) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f100215g;
            case 21:
                EsimDataPlan it15 = (EsimDataPlan) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Integer.valueOf(Period.parse(it15.f).getDays());
            case 22:
                EsimDataPlan it16 = (EsimDataPlan) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Long.valueOf(it16.e.f115082a);
            case 23:
                Intrinsics.checkNotNullParameter((ij4.g) obj2, "$this$update");
                return new ij4.g(new Data(null, null, true, 3, null), null, false);
            case 24:
                ij4.g update = (ij4.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return ij4.g.a(update, null, false, 3);
            case 25:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new ij4.i((List) getDefaultLoadingItems.invoke());
            case 26:
                Function0 it17 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return lk6.b.b(false);
            case 27:
                return Boolean.valueOf(((Integer) obj2).intValue() == 0);
            case 28:
                od0.i it18 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                i0 i0Var = (i0) it18.f224257a;
                if (i0Var != null) {
                    return cj9.c.Y(i0Var);
                }
                return null;
            default:
                String str3 = (String) obj2;
                KProperty[] kPropertyArr = EsimMobilePlanCancellationScreen.T;
                return prk.o.m(str3, "itemId", str3, "ID_HELP_MENU_ITEM");
        }
    }
}
