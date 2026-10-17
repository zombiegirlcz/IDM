package upc;

import ahe.z0;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetFieldDefinitions;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import ip0.gu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lw0.h;
import n14.k;
import q2j.v;
import upd.i;
import upe.o;
import uqh.q;
import uqh.z;
import wp5.y;
import yhm.r;
import zhm.a0;
import zhm.a1;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281952a;

    public /* synthetic */ b(int i) {
        this.f281952a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        io3.d dVar;
        switch (this.f281952a) {
            case 0:
                RowDelegate.Model it8 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Object obj3 = it8.u;
                if (obj3 instanceof a) {
                    return (a) obj3;
                }
                return null;
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 2:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return d0.E0((List) pair.f186386b, (List) pair.f186385a);
            case 3:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List list = (List) rVar.f314201a;
                List list2 = (List) rVar.f314202b;
                List list3 = (List) rVar.f314203c;
                ArrayList arrayList = new ArrayList();
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    a0.x(((k1j.b) it9.next()).f180284c, arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : arrayList) {
                    if (obj4 instanceof BalanceWrapper.PocketBalanceWrapper) {
                        arrayList2.add(obj4);
                    }
                }
                int iB = q0.b(w.t(arrayList2, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj5 : arrayList2) {
                    linkedHashMap.put(((BalanceWrapper.PocketBalanceWrapper) obj5).i.f163147c, obj5);
                }
                List list4 = list3;
                int iB2 = q0.b(w.t(list4, 10));
                if (iB2 < 16) {
                    iB2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2);
                for (Object obj6 : list4) {
                    linkedHashMap2.put(((cw5.b) obj6).f109534a, obj6);
                }
                List list5 = list2;
                int iB3 = q0.b(w.t(list5, 10));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB3 >= 16 ? iB3 : 16);
                for (Object obj7 : list5) {
                    linkedHashMap3.put(((xi0.b) obj7).f306286a, obj7);
                }
                LinkedHashSet<String> linkedHashSetL = a1.l(linkedHashMap3.keySet(), linkedHashMap.keySet());
                ArrayList arrayList3 = new ArrayList(w.t(linkedHashSetL, 10));
                for (String str : linkedHashSetL) {
                    xi0.b bVarA = (xi0.b) linkedHashMap3.get(str);
                    if (bVarA == null) {
                        xi0.b.Companion.getClass();
                        bVarA = xi0.a.a(str);
                    }
                    BalanceWrapper.PocketBalanceWrapper pocketBalanceWrapper = (BalanceWrapper.PocketBalanceWrapper) linkedHashMap.get(str);
                    arrayList3.add(new IncomeSorterDestinationInfo.Crypto.CryptoPocket(new dj0.d((pocketBalanceWrapper == null || (dVar = pocketBalanceWrapper.i) == null) ? 0L : dVar.i, bVarA), pocketBalanceWrapper != null ? pocketBalanceWrapper.i : null, bVarA, zld.a.ACTIVE));
                }
                return d0.P0(arrayList3, new v(new oh3.e(new oh3.e(new z0(linkedHashMap, 9), linkedHashMap, 24), linkedHashMap2, 25), 14));
            case 4:
                List balanceGroups = (List) obj2;
                Intrinsics.checkNotNullParameter(balanceGroups, "balanceGroups");
                ArrayList arrayList4 = new ArrayList();
                Iterator it10 = balanceGroups.iterator();
                while (it10.hasNext()) {
                    a0.x(((k1j.b) it10.next()).f180284c, arrayList4);
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj8 : arrayList4) {
                    if (obj8 instanceof BalanceWrapper.PocketBalanceWrapper) {
                        arrayList5.add(obj8);
                    }
                }
                List listP0 = d0.P0(arrayList5, new upd.a());
                ArrayList arrayList6 = new ArrayList(w.t(listP0, 10));
                Iterator it11 = listP0.iterator();
                while (it11.hasNext()) {
                    io3.d dVar2 = ((BalanceWrapper.PocketBalanceWrapper) it11.next()).i;
                    long j2 = dVar2.i;
                    String str2 = dVar2.f163147c;
                    xi0.b.Companion.getClass();
                    arrayList6.add(new IncomeSorterDestinationInfo.Crypto.RevXFiatPocket(new dj0.d(j2, xi0.a.a(str2)), dVar2, xi0.a.a(str2), zld.a.ACTIVE));
                }
                return arrayList6;
            case 5:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return new TradingLegalEntityInformation(null);
            case 6:
                yoj.a aVar = (yoj.a) obj2;
                return y.s(aVar, "feature", aVar);
            case 7:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return d0.E0((List) pair2.f186386b, (List) pair2.f186385a);
            case 8:
                List portfolios = (List) obj2;
                Intrinsics.checkNotNullParameter(portfolios, "portfolios");
                List list6 = portfolios;
                int iB4 = q0.b(w.t(list6, 10));
                if (iB4 < 16) {
                    iB4 = 16;
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(iB4);
                for (Object obj9 : list6) {
                    ArrayList arrayList7 = ((wel.e) obj9).e;
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj10 : arrayList7) {
                        if (obj10 instanceof kel.b) {
                            arrayList8.add(obj10);
                        }
                    }
                    linkedHashMap4.put(obj9, arrayList8);
                }
                return linkedHashMap4;
            case 9:
                return w.u((List) obj2);
            case 10:
                del.b balance = (del.b) obj2;
                Intrinsics.checkNotNullParameter(balance, "balance");
                return new i(mif.a.Q(balance.f113708a), mif.a.Q(balance.f113708a));
            case 11:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return new i(mif.a.Q(((del.b) pair3.f186385a).f113708a), mif.a.Q(((del.b) pair3.f186386b).f113708a));
            case 12:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return r0.g();
            case 13:
                return r0.g();
            case 14:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                return d0.E0((List) pair4.f186386b, (List) pair4.f186385a);
            case 15:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new o((List) getDefaultLoadingItems.invoke(), false);
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new cii.b(null, iii.c.c(2), new h(lw0.i.TITLE_SUBTITLE));
            case 17:
                String str3 = (String) obj2;
                Intrinsics.h(str3);
                return Long.valueOf(!kotlin.text.d0.W(str3) ? 300L : 0L);
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return yp0.b.h(q.a(), new gu("screener-result-loading-subheader", 0, 0, 30), null, 0, 126);
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return yp0.b.h(q.a(), new gu("screener-result-loading-subheader", 0, 0, 30), null, 0, 126);
            case 20:
                z it12 = (z) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f282184b;
            case 21:
                z it13 = (z) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f282185c;
            case 22:
                z update = (z) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return z.a(update, null, null, null, null, null, null, false, null, null, null, 975);
            case 23:
                Pair pair5 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair5, "<destruct>");
                fo3.c cVar = (fo3.c) pair5.f186385a;
                String id10 = cVar.f136801a;
                Intrinsics.checkNotNullParameter(id10, "id");
                return new Pair(new WalletId(id10), cVar.d);
            case 24:
                fo3.c wallet = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(wallet, "wallet");
                return wallet.d;
            case 25:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return k.N(it14);
            case 26:
                io3.d pocket = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                return Boolean.valueOf(ur5.c.d.contains(pocket.e));
            case 27:
                io3.d pocket2 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(pocket2, "pocket");
                return Boolean.valueOf(ur5.c.f282248c.contains(pocket2.f));
            case 28:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            default:
                CustomAssetFieldDefinitions it15 = (CustomAssetFieldDefinitions) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new Pair(it15.f99231b, it15.f99232c);
        }
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f281952a = i;
    }
}
