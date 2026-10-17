package k37;

import androidx.compose.foundation.pager.PagerMeasureKt;
import androidx.compose.ui.layout.Placeable;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.tab.accounts.impl.total_wealth.category_list.TotalWealthCategoryListContract$State;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k50.b1;
import k50.h0;
import k50.v0;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import org.joda.time.LocalDate;
import tof.a3;
import zhm.d0;
import zhm.f0;
import zhm.q0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f180646b;

    public /* synthetic */ t(List list, int i) {
        this.f180645a = i;
        this.f180646b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f180645a) {
            case 0:
                g update = (g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return g.a(update, null, this.f180646b, 3);
            case 1:
                return k3g.d.a((k3g.d) obj2, null, null, this.f180646b, null, 23);
            case 2:
                return k3g.d.a((k3g.d) obj2, null, null, this.f180646b, null, 23);
            case 3:
                return k3g.d.a((k3g.d) obj2, null, null, null, this.f180646b, 15);
            case 4:
                h0 h0Var = (h0) obj2;
                return h0.a(h0Var, null, null, null, null, null, null, null, null, null, null, false, false, null, null, b1.a(h0Var.f181090r, this.f180646b, null, null, null, 30), null, false, null, null, null, null, null, null, null, 268304383);
            case 5:
                h0 h0Var2 = (h0) obj2;
                v0 v0Var = h0Var2.f181094x;
                v0 v0Var2 = v0.PROMPT;
                List list = this.f180646b;
                return v0Var == v0Var2 ? h0.a(h0Var2, null, null, null, null, null, null, null, null, null, null, false, false, null, null, b1.a(h0Var2.f181090r, null, null, list, null, 27), null, false, null, null, null, null, null, null, null, 268304383) : h0.a(h0Var2, null, null, null, null, null, null, null, null, null, null, false, false, null, null, b1.a(h0Var2.f181090r, list, null, null, null, 26), null, false, null, null, null, null, null, null, null, 268304383);
            case 6:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list2 = (List) pair.f186385a;
                k71.q qVar = (k71.q) pair.f186386b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : list2) {
                    String str = ((a3) obj3).f272584c;
                    Object objO = linkedHashMap.get(str);
                    if (objO == null) {
                        objO = v0.a.o(linkedHashMap, str);
                    }
                    ((List) objO).add(obj3);
                }
                List list3 = this.f180646b;
                int iB = q0.b(zhm.w.t(list3, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB);
                for (Object obj4 : list3) {
                    linkedHashMap2.put(((k5l.f) obj4).f181572a, obj4);
                }
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    List list4 = (List) entry.getValue();
                    k5l.f fVar = (k5l.f) linkedHashMap2.get(str2);
                    k5l.e eVar = fVar == null ? null : new k5l.e(fVar.f181572a, fVar.f181574c, list4, qVar);
                    if (eVar != null) {
                        arrayList.add(eVar);
                    }
                }
                return d0.P0(arrayList, new k5l.g());
            case 7:
                return TotalWealthCategoryListContract$State.a((TotalWealthCategoryListContract$State) obj2, null, this.f180646b, null, null, null, 59);
            case 8:
                koe.h update2 = (koe.h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return koe.h.a(update2, null, null, null, zi0.c.P(this.f180646b, false, null, 3), 7);
            case 9:
                zme.f residency = (zme.f) obj2;
                Intrinsics.checkNotNullParameter(residency, "residency");
                Iterator it8 = this.f180646b.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        zme.d dVar = (zme.d) next;
                        if (!dVar.f323479a.equals(residency.f323482a) || !Intrinsics.f(dVar.f323481c, "JUSTIFIED_EXEMPTION")) {
                        }
                    } else {
                        next = null;
                    }
                }
                return Boolean.valueOf(((zme.d) next) != null);
            case 10:
                return koe.h.a((koe.h) obj2, null, zi0.c.P(this.f180646b, false, null, 3), null, null, 13);
            case 11:
                kqh.f fVar2 = (kqh.f) obj2;
                Map map = fVar2.f188411c;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry2 : map.entrySet()) {
                    if (this.f180646b.contains((zel.f) entry2.getKey())) {
                        linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                    }
                }
                return kqh.f.a(fVar2, null, linkedHashMap3, false, 11);
            case 12:
                io3.d it9 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(this.f180646b.contains(it9.e));
            case 13:
                kye.m update3 = (kye.m) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return kye.m.a(update3, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, this.f180646b, null, null, null, null, null, null, Integer.MAX_VALUE, 63);
            case 14:
                return kye.m.a((kye.m) obj2, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, this.f180646b, null, null, null, null, null, null, null, -1073741825, 63);
            case 15:
                return kye.m.a((kye.m) obj2, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, this.f180646b, null, -1, 47);
            case 16:
                return kye.m.a((kye.m) obj2, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, this.f180646b, -1, 31);
            case 17:
                return kye.m.a((kye.m) obj2, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, this.f180646b, null, null, -1, 55);
            case 18:
                return kye.m.a((kye.m) obj2, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, this.f180646b, null, null, null, -1, 59);
            case 19:
                List items = this.f180646b;
                Intrinsics.h(items);
                AccountId accountId = ((kzj.b) obj2).f191118a;
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                Intrinsics.checkNotNullParameter(items, "items");
                return new kzj.b(accountId, items);
            case 20:
                return PagerMeasureKt.measurePager_7L1iB3k$lambda$18$0(this.f180646b, (Placeable.PlacementScope) obj2);
            case 21:
                return l26.b.a((l26.b) obj2, null, null, null, null, null, null, this.f180646b, null, null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
            case 22:
                return l26.b.a((l26.b) obj2, null, null, null, null, null, this.f180646b, null, null, null, 479);
            case 23:
                lc0.j update4 = (lc0.j) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return lc0.j.a(update4, null, null, null, null, null, !this.f180646b.isEmpty(), 63);
            case 24:
                ((lg4.i) obj2).getClass();
                List images = this.f180646b;
                Intrinsics.checkNotNullParameter(images, "images");
                return new lg4.i(images);
            case 25:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                nkm.j jVarS = y.s(d0.Q((List) pair2.f186386b), new c9h.a(this.f180646b, (xi0.b) pair2.f186385a, 4));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                nkm.i iVar = new nkm.i(jVarS);
                while (iVar.hasNext()) {
                    Pair pair3 = (Pair) iVar.next();
                    LocalDate localDate = (LocalDate) pair3.f186385a;
                    Object arrayList2 = linkedHashMap4.get(localDate);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap4.put(localDate, arrayList2);
                    }
                    ((List) arrayList2).add(Long.valueOf(((Number) pair3.f186386b).longValue()));
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(q0.b(linkedHashMap4.size()));
                for (Map.Entry entry3 : linkedHashMap4.entrySet()) {
                    linkedHashMap5.put(entry3.getKey(), Long.valueOf(d0.U0((List) entry3.getValue())));
                }
                return linkedHashMap5;
            case 26:
                List groupMembers = (List) obj2;
                Intrinsics.checkNotNullParameter(groupMembers, "groupMembers");
                List list5 = this.f180646b;
                Intrinsics.h(list5);
                List list6 = groupMembers;
                int iB2 = q0.b(zhm.w.t(list6, 10));
                if (iB2 < 16) {
                    iB2 = 16;
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(iB2);
                for (Object obj5 : list6) {
                    linkedHashMap6.put(((oq9.o) obj5).b(), obj5);
                }
                return a.a.F(linkedHashMap6, list5);
            case 27:
                List groupMembers2 = (List) obj2;
                Intrinsics.checkNotNullParameter(groupMembers2, "groupMembers");
                List list7 = this.f180646b;
                Intrinsics.h(list7);
                List list8 = groupMembers2;
                int iB3 = q0.b(zhm.w.t(list8, 10));
                if (iB3 < 16) {
                    iB3 = 16;
                }
                LinkedHashMap linkedHashMap7 = new LinkedHashMap(iB3);
                for (Object obj6 : list8) {
                    linkedHashMap7.put(((oq9.o) obj6).b(), obj6);
                }
                return v13.d.G(linkedHashMap7, list7, f0.f322471a);
            case 28:
                List groupMembers3 = (List) obj2;
                Intrinsics.checkNotNullParameter(groupMembers3, "groupMembers");
                List list9 = this.f180646b;
                Intrinsics.h(list9);
                List list10 = groupMembers3;
                int iB4 = q0.b(zhm.w.t(list10, 10));
                if (iB4 < 16) {
                    iB4 = 16;
                }
                LinkedHashMap linkedHashMap8 = new LinkedHashMap(iB4);
                for (Object obj7 : list10) {
                    linkedHashMap8.put(((oq9.o) obj7).b(), obj7);
                }
                return a.a.F(linkedHashMap8, list9);
            default:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                List list11 = (List) pair4.f186385a;
                List list12 = (List) pair4.f186386b;
                int iB5 = q0.b(zhm.w.t(list12, 10));
                if (iB5 < 16) {
                    iB5 = 16;
                }
                LinkedHashMap linkedHashMap9 = new LinkedHashMap(iB5);
                for (Object obj8 : list12) {
                    linkedHashMap9.put(((oq9.o) obj8).b(), obj8);
                }
                Intrinsics.h(list11);
                ArrayList arrayListR = xam.a.r(linkedHashMap9, list11);
                List list13 = this.f180646b;
                Intrinsics.h(list13);
                return v13.d.G(linkedHashMap9, list13, arrayListR);
        }
    }

    public /* synthetic */ t(k5l.j jVar, List list) {
        this.f180645a = 6;
        this.f180646b = list;
    }
}
