package an9;

import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.flow.TaxHubProfileFlowContract$State;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.TaxHubTransactionExportFlowContract$State;
import com.revolut.feature.tab.accounts.impl.total_wealth.category_list.TotalWealthCategoryListContract$State;
import h93.f0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.q0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f6602b;

    public /* synthetic */ t(LinkedHashSet linkedHashSet, int i) {
        this.f6601a = i;
        this.f6602b = linkedHashSet;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        List listB;
        switch (this.f6601a) {
            case 0:
                n update = (n) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return n.a(update, null, null, this.f6602b, null, 27);
            case 1:
                String taxCalendarEventId = (String) obj2;
                Intrinsics.checkNotNullParameter(taxCalendarEventId, "taxCalendarEventId");
                return Boolean.valueOf(this.f6602b.contains(taxCalendarEventId));
            case 2:
                String id10 = (String) obj2;
                Intrinsics.checkNotNullParameter(id10, "id");
                return Boolean.valueOf(this.f6602b.contains(id10));
            case 3:
                bec.i update2 = (bec.i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return bec.i.a(update2, null, this.f6602b, null, null, 4093);
            case 4:
                bec.i update3 = (bec.i) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return bec.i.a(update3, null, this.f6602b, null, null, 4093);
            case 5:
                db.l update4 = (db.l) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return db.l.a(update4, null, null, null, null, null, this.f6602b, 31);
            case 6:
                g1k.d update5 = (g1k.d) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return g1k.d.a(update5, this.f6602b, null, null, 6);
            case 7:
                List cards = (List) obj2;
                Intrinsics.checkNotNullParameter(cards, "cards");
                LinkedHashSet linkedHashSet = this.f6602b;
                int iB = q0.b(zhm.w.t(linkedHashSet, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj3 : linkedHashSet) {
                    String str = (String) obj3;
                    Iterator it8 = cards.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            i93.c cVar = ((f0) next).f150113g;
                            if (cVar == null || (listB = cVar.b()) == null || !listB.contains(str)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    linkedHashMap.put(obj3, (f0) next);
                }
                return linkedHashMap;
            case 8:
                String key = (String) obj2;
                Intrinsics.checkNotNullParameter(key, "key");
                LinkedHashSet linkedHashSet2 = this.f6602b;
                boolean z = false;
                if (!linkedHashSet2.isEmpty()) {
                    Iterator it9 = linkedHashSet2.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            if (kotlin.text.a0.y(key, (String) it9.next(), false)) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 9:
                TaxHubTransactionExportFlowContract$State update6 = (TaxHubTransactionExportFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return TaxHubTransactionExportFlowContract$State.a(update6, null, null, this.f6602b, 0, 0, 0, null, 123);
            case 10:
                TotalWealthCategoryListContract$State update7 = (TotalWealthCategoryListContract$State) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return TotalWealthCategoryListContract$State.a(update7, null, null, null, this.f6602b, null, 47);
            case 11:
                Pair pair = (Pair) obj2;
                Map map = (Map) pair.f186385a;
                Map map2 = (Map) pair.f186386b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String str2 : this.f6602b) {
                    f0 f0Var = (f0) map.get(str2);
                    h6e.b bVar = (h6e.b) map2.get(str2);
                    if (f0Var != null || bVar != null) {
                        linkedHashMap2.put(str2, new h6e.d(f0Var != null ? new h6e.c(f0Var) : null, bVar));
                    }
                }
                return linkedHashMap2;
            case 12:
                t18.q update8 = (t18.q) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return t18.q.a(update8, this.f6602b, null, null, 6);
            case 13:
                List visibleItems = (List) obj2;
                Intrinsics.checkNotNullParameter(visibleItems, "visibleItems");
                LinkedHashSet linkedHashSet3 = this.f6602b;
                Set setQ0 = d0.Q0(visibleItems, linkedHashSet3);
                linkedHashSet3.clear();
                linkedHashSet3.addAll(visibleItems);
                return d0.d1(setQ0);
            case 14:
                vpd.d update9 = (vpd.d) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                LinkedHashSet selectedDestinations = this.f6602b;
                Intrinsics.checkNotNullParameter(selectedDestinations, "selectedDestinations");
                return vpd.d.a(update9, null, new vpd.j(selectedDestinations), null, 5);
            case 15:
                wed.l updateState = (wed.l) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return wed.l.a(updateState, null, this.f6602b, null, null, null, null, false, null, 507);
            case 16:
                ((TaxHubProfileFlowContract$State) obj2).getClass();
                LinkedHashSet allowedTaxTypes = this.f6602b;
                Intrinsics.checkNotNullParameter(allowedTaxTypes, "allowedTaxTypes");
                return new TaxHubProfileFlowContract$State(allowedTaxTypes);
            case 17:
                List visibleItems2 = (List) obj2;
                Intrinsics.checkNotNullParameter(visibleItems2, "visibleItems");
                LinkedHashSet linkedHashSet4 = this.f6602b;
                Set setQ02 = d0.Q0(visibleItems2, linkedHashSet4);
                linkedHashSet4.clear();
                linkedHashSet4.addAll(visibleItems2);
                return d0.d1(setQ02);
            default:
                z8b.g update10 = (z8b.g) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                return z8b.g.a(update10, null, this.f6602b, null, 5);
        }
    }

    public /* synthetic */ t(vpd.j jVar, LinkedHashSet linkedHashSet) {
        this.f6601a = 14;
        this.f6602b = linkedHashSet;
    }
}
