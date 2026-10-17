package uyh;

import com.revolut.feature.exchange.models.TakeProfitStopLoss;
import com.revolut.feature.recurring_buys.schedule.api.models.RecurringBuySettings;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f284395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f284396c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f284397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Serializable f284398h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f284399j;

    public /* synthetic */ r(Object obj2, Object obj3, Serializable serializable, Object obj4, Object obj5, Object obj6, Serializable serializable2, Object obj7, Object obj8, int i) {
        this.f284394a = i;
        this.f284395b = obj2;
        this.f284396c = obj3;
        this.d = serializable;
        this.e = obj4;
        this.f = obj5;
        this.f284397g = obj6;
        this.f284398h = serializable2;
        this.i = obj7;
        this.f284399j = obj8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        ArrayList arrayListF0;
        switch (this.f284394a) {
            case 0:
                Pair pair = (Pair) this.f284395b;
                Pair pair2 = (Pair) this.f284396c;
                Long l2 = (Long) this.d;
                RecurringBuySettings recurringBuySettings = (RecurringBuySettings) this.e;
                kyh.g gVar = (kyh.g) this.f;
                wd6.e eVar = (wd6.e) this.f284397g;
                wd6.h hVar = (wd6.h) this.f284398h;
                TakeProfitStopLoss takeProfitStopLoss = (TakeProfitStopLoss) this.i;
                com.revolut.feature_crypto_order_flow.impl.exchange.d dVar = (com.revolut.feature_crypto_order_flow.impl.exchange.d) this.f284399j;
                j update = (j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetails = new CryptoExchangeContract$MoneyDetails((xi0.b) pair.f186385a, l2, l2 != null, (CryptoExchangeContract$MoneyDetails.BalanceIdentifier) pair2.f186385a, 4);
                CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetails2 = new CryptoExchangeContract$MoneyDetails((xi0.b) pair.f186386b, (Long) null, false, (CryptoExchangeContract$MoneyDetails.BalanceIdentifier) pair2.f186386b, 14);
                zhm.f0 f0Var = zhm.f0.f322471a;
                return j.a(update, dVar.f96748s.m(new CryptoOrderDraft(cryptoExchangeContract$MoneyDetails, cryptoExchangeContract$MoneyDetails2, recurringBuySettings, gVar, eVar, hVar, null, null, f0Var, 0L, false, 0L, null, takeProfitStopLoss, null, null, null, 0.0d, null, false, f0Var), hVar), null, false, null, 30);
            default:
                vy5.v0 v0Var = ((vy5.a1) this.f284395b).f293134a;
                List list = (List) this.f284396c;
                do3.n nVar = (do3.n) this.d;
                dj0.d dVar2 = (dj0.d) this.e;
                List list2 = (List) this.f;
                vy5.a aVar = (vy5.a) this.f284397g;
                xi0.b bVar = (xi0.b) this.f284398h;
                f95.b bVar2 = (f95.b) this.i;
                Set set = (Set) this.f284399j;
                Pair pair3 = (Pair) obj2;
                AccountWidgetItemModel.EmptyStateStories emptyStateStories = (AccountWidgetItemModel.EmptyStateStories) pair3.f186385a;
                Map map = (Map) pair3.f186386b;
                Intrinsics.h(emptyStateStories);
                LinkedHashMap linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(((xi0.b) entry.getKey()).f306286a, entry.getValue());
                }
                List<io3.d> list3 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                for (io3.d dVar3 : list3) {
                    Intrinsics.checkNotNullParameter(bVar2, "<this>");
                    ArrayList arrayListF = v0Var.f(dVar3, aVar, bVar, bVar2 instanceof f95.a);
                    ProductAccountSubtitle productAccountSubtitle = (ProductAccountSubtitle) linkedHashMap.get(dVar3.f163147c);
                    List list4 = list3;
                    boolean zContains = set.contains(dVar3.f163145a);
                    ArrayList arrayList2 = arrayList;
                    f95.b bVar3 = bVar2;
                    AccountWidgetItemModel.EmptyStateStories emptyStateStories2 = emptyStateStories;
                    ProductAccount.ValueItem.Main mainE = v0Var.e(dVar3, bVar, list2, arrayListF, emptyStateStories2, bVar3, productAccountSubtitle, zContains);
                    emptyStateStories = emptyStateStories2;
                    bVar2 = bVar3;
                    arrayList2.add(mainE);
                    arrayList = arrayList2;
                    list3 = list4;
                }
                List list5 = list3;
                ArrayList arrayList3 = arrayList;
                if (arrayList3.size() == 1) {
                    arrayListF0 = arrayList3;
                } else {
                    Iterator it8 = list5.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (Intrinsics.f(((io3.d) next).f163147c, bVar.f306286a)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    arrayListF0 = zhm.d0.F0(v0Var.d(nVar, dVar2, list2, aVar, bVar2, (ProductAccountSubtitle) linkedHashMap.get(bVar.f306286a), (io3.d) next), arrayList3);
                }
                return zi0.c.P(arrayListF0, false, null, 3);
        }
    }
}
