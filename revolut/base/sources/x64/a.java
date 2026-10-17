package x64;

import aii.r;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.WithdrawalCodeDetailsScreen;
import com.revolut.feature.retail.crypto.advanced_charts.api.models.CryptoAdvancedChartSymbol;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.wealth.api.domain.model.SelectedCurrencyInfo;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import zhm.d0;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303031a;

    public /* synthetic */ a(int i) {
        this.f303031a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List list;
        switch (this.f303031a) {
            case 0:
                ax4.b updateConstructorState = (ax4.b) obj2;
                Intrinsics.checkNotNullParameter(updateConstructorState, "$this$updateConstructorState");
                return new ax4.b(0);
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                m70.a.c(t0.f186434a);
                return new o(hb4.o.a(""), f0.f322471a);
            case 2:
                List allowedTypes = (List) obj2;
                Intrinsics.checkNotNullParameter(allowedTypes, "allowedTypes");
                List<SubaccountType> list2 = allowedTypes;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    z = false;
                } else {
                    for (SubaccountType subaccountType : list2) {
                        SubaccountType[] elements = {SubaccountType.Pro.f88964a, SubaccountType.ProTax.f88965a};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        if (!kotlin.collections.d.y0(elements).contains(subaccountType)) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                ipa.j it8 = (ipa.j) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Unit.f186387a;
            case 4:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return f0.f322471a;
            case 5:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new x6e.j((Map) pair.f186385a, (Map) pair.f186386b);
            case 6:
                List it10 = (List) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (ProductAccount.ValueItem) d0.b0(it10);
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return iii.c.c(2);
            case 8:
                Function0 it11 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return f0.f322471a;
            case 9:
                lf8.c it12 = (lf8.c) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(it12.f194666a);
            case 10:
                Function0 it13 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                nb0 nb0Var = pb0.Companion;
                List listK = v.k(nb0.b(nb0Var, "LOADING_1", false, 0, false, 30), nb0.b(nb0Var, "LOADING_2", false, 0, false, 30));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 11:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list3 = (List) pair2.f186385a;
                List list4 = (List) pair2.f186386b;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list4) {
                    if (list3.contains((wi0.b) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list3) {
                    if (!list4.contains((wi0.b) obj4)) {
                        arrayList2.add(obj4);
                    }
                }
                return new x7a.a(arrayList, arrayList2);
            case 12:
                RowDelegate.Model it14 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = WithdrawalCodeDetailsScreen.W;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new x62.b(it14.f53228a, it14.u);
            case 13:
                CellDetailsChevronDelegate.Model it15 = (CellDetailsChevronDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = WithdrawalCodeDetailsScreen.W;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new x62.b(it15.f51822a, it15.e);
            case 14:
                x82.b update = (x82.b) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return x82.b.a(update, Data.copy$default(update.f303259a, null, null, true, 3, null), null, 0L, 6);
            case 15:
                x82.b it16 = (x82.b) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return (MultibancoWithdrawalCode) it16.f303259a.getContent();
            case 16:
                Function0 it17 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return new x82.c(null, f0.f322471a);
            case 17:
                IntRange intRangeU = t61.a.u((Function0) obj2, "it", 1, 15, 1);
                ArrayList arrayList3 = new ArrayList(w.t(intRangeU, 10));
                vim.f it18 = intRangeU.iterator();
                while (it18.f289625c) {
                    pb0 pb0Var = new pb0(a0.d.n("ID_LOADING_ITEM_", it18.nextInt() - 1));
                    yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                    arrayList3.add(pb0Var);
                }
                return new x84.n(false, arrayList3);
            case 18:
                r it19 = (r) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                ee5.a aVar = it19 instanceof ee5.a ? (ee5.a) it19 : null;
                Pair pair3 = aVar != null ? aVar.f125075a : null;
                if (pair3 != null) {
                    return new CryptoAdvancedChartSymbol((xi0.b) pair3.f186385a, (xi0.b) pair3.f186386b);
                }
                return null;
            case 19:
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                LinkedHashSet linkedHashSet = config.M;
                xi0.a aVar2 = xi0.b.Companion;
                ArrayList arrayList4 = new ArrayList(w.t(linkedHashSet, 10));
                Iterator it20 = linkedHashSet.iterator();
                while (it20.hasNext()) {
                    t61.a.A(aVar2, (String) it20.next(), arrayList4);
                }
                Collection[] elements2 = {arrayList4, config.T};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                ArrayList arrayListU = w.u(kotlin.collections.d.L(elements2));
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : arrayListU) {
                    if (cp5.d.z((xi0.b) obj5)) {
                        arrayList5.add(obj5);
                    }
                }
                return d0.i1(arrayList5);
            case 20:
                List it21 = (List) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                ArrayList arrayList6 = new ArrayList();
                for (Object obj6 : it21) {
                    xzg.d dVar = (xzg.d) obj6;
                    Intrinsics.checkNotNullParameter(dVar, "<this>");
                    List list5 = dVar.i;
                    if ((list5 != null && !list5.isEmpty()) || ((list = dVar.f309981j) != null && !list.isEmpty())) {
                        arrayList6.add(obj6);
                    }
                }
                return arrayList6;
            case 21:
                nel.n it22 = (nel.n) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return Boolean.valueOf(it22.f.d && io3.h.i(it22.f214597c));
            case 22:
                List it23 = (List) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return new zzg.g(it23, zzg.f.FALLBACK, null, null);
            case 23:
                nel.n it24 = (nel.n) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return Boolean.valueOf(it24.f.d && io3.h.k(it24.f214597c));
            case 24:
                List it25 = (List) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                return new zzg.g(it25, zzg.f.FALLBACK, null, null);
            case 25:
                List it26 = (List) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                return (xzg.k) d0.d0(it26);
            case 26:
                List it27 = (List) obj2;
                Intrinsics.checkNotNullParameter(it27, "it");
                return (xzg.k) d0.d0(it27);
            case 27:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                return new SelectedCurrencyInfo((List) pair4.f186386b, (xi0.b) pair4.f186385a);
            case 28:
                TradingAccounts tradingAccounts = (TradingAccounts) obj2;
                Intrinsics.checkNotNullParameter(tradingAccounts, "tradingAccounts");
                List list6 = tradingAccounts.f105278a;
                ArrayList arrayList7 = new ArrayList();
                for (Object obj7 : list6) {
                    TradingAccount tradingAccount = (TradingAccount) obj7;
                    if (com.revolut.shared.feature.wealth.models.trading_accounts.d.e(tradingAccount) || com.revolut.shared.feature.wealth.models.trading_accounts.d.g(tradingAccount)) {
                        if (w8h.c.a(tradingAccount.W())) {
                            arrayList7.add(obj7);
                        }
                    }
                }
                ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                Iterator it28 = arrayList7.iterator();
                while (it28.hasNext()) {
                    arrayList8.add(((TradingAccount) it28.next()).e());
                }
                return d0.d1(d0.i1(w.u(arrayList8)));
            default:
                Throwable it29 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it29, "it");
                return f0.f322471a;
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f303031a = i;
    }
}
