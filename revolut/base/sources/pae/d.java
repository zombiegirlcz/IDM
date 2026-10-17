package pae;

import com.revolut.feature.core.model.domain.wallet.WalletId;
import com.revolut.feature.subscriptions.impl.mark_recurring.flow.MarkRecurringTransactionsFlowContract$SelectedTransaction;
import efm.d0;
import efm.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k71.q;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p5a.m;
import qua.u;
import skm.p0;
import te0.w;
import ufm.i;
import whf.p;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f234540b;

    public /* synthetic */ d(e eVar, int i) {
        this.f234539a = i;
        this.f234540b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f234539a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                p pVar = (p) pair.f186385a;
                HashSet hashSet = (HashSet) pair.f186386b;
                List list = pVar.f297646a;
                q qVar = pVar.f297647b;
                HashSet hashSet2 = new HashSet();
                Iterator it8 = hashSet.iterator();
                while (it8.hasNext()) {
                    hashSet2.add(((MarkRecurringTransactionsFlowContract$SelectedTransaction) it8.next()).f89217a);
                }
                return new c(list, qVar, hashSet2, (String) ((h) this.f234540b.f234543c).w0().get());
            case 1:
                HashSet transactions = (HashSet) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it9 = transactions.iterator();
                while (true) {
                    Object[] objArr = 0;
                    if (it9.hasNext()) {
                        Object next = it9.next();
                        String id10 = ((MarkRecurringTransactionsFlowContract$SelectedTransaction) next).f89218b;
                        if (id10 != null) {
                            Intrinsics.checkNotNullParameter(id10, "id");
                        } else {
                            id10 = null;
                        }
                        WalletId walletId = id10 != null ? new WalletId(id10) : null;
                        Object arrayList = linkedHashMap.get(walletId);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(walletId, arrayList);
                        }
                        ((List) arrayList).add(next);
                    } else {
                        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                        Iterator it10 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it10.hasNext();
                            e eVar = this.f234540b;
                            if (!zHasNext) {
                                eVar.getClass();
                                d0 list2 = r.fromIterable(arrayList2).concatMapSingle(new p8k.b(9, new m(23))).toList();
                                p8k.b bVar = new p8k.b(10, new m(24));
                                list2.getClass();
                                i iVar = new i(list2, bVar, 1);
                                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                i iVar2 = new i(iVar, new p8k.b(14, new d(eVar, 2)), 1);
                                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                return iVar2;
                            }
                            Map.Entry entry = (Map.Entry) it10.next();
                            WalletId walletId2 = (WalletId) entry.getKey();
                            String str = walletId2 != null ? walletId2.f66106a : null;
                            List list3 = (List) entry.getValue();
                            eVar.getClass();
                            arrayList2.add(w.o0(p0.f264003c, new oqk.i(eVar, list3, str, objArr == true ? 1 : 0, 14)));
                        }
                    }
                }
                break;
            default:
                List list4 = (List) obj2;
                Intrinsics.checkNotNullParameter(list4, "list");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj3 : list4) {
                    String str2 = ((qua.p) obj3).f249314a.f160150a;
                    Object objO = linkedHashMap2.get(str2);
                    if (objO == null) {
                        objO = v0.a.o(linkedHashMap2, str2);
                    }
                    ((List) objO).add(obj3);
                }
                ArrayList arrayList3 = new ArrayList(linkedHashMap2.size());
                Iterator it11 = linkedHashMap2.entrySet().iterator();
                while (it11.hasNext()) {
                    arrayList3.add((qua.p) zhm.d0.b0((List) ((Map.Entry) it11.next()).getValue()));
                }
                int i = 0;
                if (!arrayList3.isEmpty()) {
                    Iterator it12 = arrayList3.iterator();
                    while (it12.hasNext()) {
                        if (u.s((qua.p) it12.next(), ((l80.f) this.f234540b.d).g()) && (i = i + 1) < 0) {
                            v.r();
                            throw null;
                        }
                    }
                }
                return new nae.g(arrayList3.size(), i);
        }
    }
}
