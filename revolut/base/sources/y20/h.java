package y20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h {
    public static String a(u10.q qVar, HashSet hashSet, String str) {
        String str2;
        if (qVar == null) {
            return null;
        }
        if (qVar.f276320g == null) {
            str2 = " neighbor must be a server row";
        } else {
            if (!hashSet.contains(qVar.f276317a)) {
                return null;
            }
            str2 = " neighbor must not be a batch member";
        }
        return p.a.p("the ", str, str2);
    }

    public static List c(ArrayList arrayList, HashMap map, UUID uuid, UUID uuid2, Map map2, Function1 function1, Function2 function2, Function1 function12) {
        int i;
        int i2;
        if (arrayList.isEmpty()) {
            return zhm.f0.f322471a;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i3 = 0;
        TreeSet treeSetC = zhm.y0.c(new Integer[0]);
        d(arrayList3, arrayList4, function1, treeSetC, arrayList5, map, uuid, uuid2, (u10.q) zhm.d0.b0(arrayList));
        int iJ = zhm.v.j(arrayList);
        while (i3 < iJ) {
            int i5 = i3 + 1;
            u10.q qVar = (u10.q) arrayList.get(i5);
            if (((Boolean) function2.invoke(arrayList.get(i3), qVar)).booleanValue()) {
                d(arrayList3, arrayList4, function1, treeSetC, arrayList5, map, uuid, uuid2, qVar);
                i = iJ;
                i2 = i5;
            } else {
                i = iJ;
                i2 = i5;
                ArrayList arrayList6 = arrayList3;
                ArrayList arrayList7 = arrayList4;
                TreeSet treeSet = treeSetC;
                e(arrayList6, arrayList7, treeSet, arrayList5, function12, arrayList2, map, uuid, uuid2, map2);
                treeSetC = treeSet;
                arrayList3 = arrayList6;
                arrayList4 = arrayList7;
                d(arrayList3, arrayList4, function1, treeSetC, arrayList5, map, uuid, uuid2, qVar);
            }
            iJ = i;
            i3 = i2;
        }
        e(arrayList3, arrayList4, treeSetC, arrayList5, function12, arrayList2, map, uuid, uuid2, map2);
        return arrayList2;
    }

    public static final void d(ArrayList arrayList, ArrayList arrayList2, Function1 function1, TreeSet treeSet, ArrayList arrayList3, HashMap map, UUID uuid, UUID uuid2, u10.q qVar) {
        arrayList.add(qVar);
        UUID uuid3 = qVar.f276317a;
        if (!map.containsKey(uuid3) && !Intrinsics.f(uuid3, uuid) && !Intrinsics.f(uuid3, uuid2)) {
            arrayList2.add(qVar);
        } else if (((Number) function1.invoke(qVar)).intValue() != 0) {
            treeSet.add(function1.invoke(qVar));
        } else {
            arrayList3.add(qVar.f276317a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(java.util.ArrayList r10, java.util.ArrayList r11, java.util.TreeSet r12, java.util.ArrayList r13, kotlin.jvm.functions.Function1 r14, java.util.ArrayList r15, java.util.HashMap r16, java.util.UUID r17, java.util.UUID r18, java.util.Map r19) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y20.h.e(java.util.ArrayList, java.util.ArrayList, java.util.TreeSet, java.util.ArrayList, kotlin.jvm.functions.Function1, java.util.ArrayList, java.util.HashMap, java.util.UUID, java.util.UUID, java.util.Map):void");
    }

    public static boolean f(u10.q qVar, u10.q qVar2) {
        return Intrinsics.f(qVar.d, qVar2.d) && Intrinsics.f(qVar.f276319c, qVar2.f276319c);
    }

    public final e1 b(List batch, Collection priorRows, u10.q qVar, u10.q qVar2, final p scope, Map groupRowCounts) {
        afa.a aVarA;
        boolean z;
        UUID uuid;
        int i;
        UUID uuid2;
        List list;
        UUID uuid3;
        List list2;
        UUID uuid4;
        Intrinsics.checkNotNullParameter(batch, "batch");
        Intrinsics.checkNotNullParameter(priorRows, "priorRows");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(groupRowCounts, "groupRowCounts");
        if (batch.isEmpty()) {
            return (qVar == null && qVar2 == null) ? new c1(new i(0)) : new d1("an empty batch proves no boundary pair");
        }
        float f = 1;
        HashSet hashSet = new HashSet((int) ((batch.size() / 0.75f) + f));
        Iterator it8 = batch.iterator();
        while (it8.hasNext()) {
            if (!hashSet.add(((u10.h) it8.next()).f276282a)) {
                return new d1("batch rows must have distinct ids");
            }
        }
        HashMap map = new HashMap((int) ((priorRows.size() / 0.75f) + f));
        Iterator it9 = priorRows.iterator();
        while (it9.hasNext()) {
            u10.q qVar3 = (u10.q) it9.next();
            if (!hashSet.contains(qVar3.f276317a)) {
                return new d1("prior rows must be re-fetched members of the batch");
            }
            if (map.put(qVar3.f276317a, qVar3) != null) {
                return new d1("prior rows must have distinct ids");
            }
        }
        String strA = a(qVar, hashSet, "newer");
        if (strA != null) {
            return new d1(strA);
        }
        String strA2 = a(qVar2, hashSet, "older");
        if (strA2 != null) {
            return new d1(strA2);
        }
        if (qVar != null && qVar2 != null && Intrinsics.f(qVar.f276317a, qVar2.f276317a)) {
            return new d1("the two neighbors must be distinct rows");
        }
        Iterator it10 = batch.iterator();
        while (it10.hasNext()) {
            u10.h hVar = (u10.h) it10.next();
            if (!map.containsKey(hVar.f276282a) && (hVar.i != 0 || hVar.f276287j != 0 || hVar.k != 0)) {
                return new d1(prk.o.r(hVar.f276282a, "a new batch row must arrive uncolored: "));
            }
        }
        boolean z3 = scope instanceof m;
        if (z3) {
            List list3 = batch;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it11 = list3.iterator();
                while (it11.hasNext()) {
                    UUID uuid5 = ((u10.h) it11.next()).f276284c;
                    UUID uuid6 = ((m) scope).f310523a;
                    if (!Intrinsics.f(uuid5, uuid6)) {
                        return new d1(prk.o.r(uuid6, "a Default-scope batch spans one ticket: "));
                    }
                }
            }
        }
        if (z3) {
            aVarA = cim.b.a(new y07.m(17), new y07.m(18));
        } else {
            if (!(scope instanceof n) && !(scope instanceof o)) {
                throw new NoWhenBranchMatchedException();
            }
            aVarA = cim.b.a(new y07.m(19), new y07.m(20), new y07.m(21));
        }
        Comparator comparatorReversed = aVarA.reversed();
        ArrayList arrayList = new ArrayList(batch.size());
        Iterator it12 = batch.iterator();
        while (it12.hasNext()) {
            arrayList.add(new u10.q((u10.h) it12.next()));
        }
        ArrayList arrayList2 = new ArrayList(batch.size());
        Iterator it13 = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it13, "iterator(...)");
        while (it13.hasNext()) {
            Object next = it13.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            u10.q qVar4 = (u10.q) next;
            u10.q qVar5 = (u10.q) map.get(qVar4.f276317a);
            if (qVar5 != null) {
                qVar4 = qVar5;
            }
            if (qVar4.f276320g != null) {
                arrayList2.add(qVar4);
            }
        }
        Intrinsics.h(comparatorReversed);
        zhm.z.w(arrayList2, comparatorReversed);
        if (arrayList2.isEmpty()) {
            return (qVar == null && qVar2 == null) ? new c1(new i(0)) : new d1("a fully transparent batch proves no boundary pair");
        }
        if (qVar != null && comparatorReversed.compare(qVar, zhm.d0.b0(arrayList2)) >= 0) {
            return new d1("the newer neighbor must sort above the batch span (mid-group join)");
        }
        if (qVar2 != null && comparatorReversed.compare(qVar2, zhm.d0.m0(arrayList2)) <= 0) {
            return new d1("the older neighbor must sort below the batch span (mid-group join)");
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + 2);
        if (qVar != null) {
            arrayList3.add(qVar);
        }
        arrayList3.addAll(arrayList2);
        if (qVar2 != null) {
            arrayList3.add(qVar2);
        }
        if (qVar != null) {
            z = true;
            uuid = qVar.f276317a;
        } else {
            z = true;
            uuid = null;
        }
        if (qVar2 != null) {
            i = 0;
            uuid2 = qVar2.f276317a;
        } else {
            i = 0;
            uuid2 = null;
        }
        final int i2 = i;
        List listC = c(arrayList3, map, uuid, uuid2, groupRowCounts, new y07.m(22), new rch.o(2, this, h.class, "chatPairValid", "chatPairValid(Lcom/revolut/chat/data/db/model/StoredMessageRow;Lcom/revolut/chat/data/db/model/StoredMessageRow;)Z", 0, 27), new xlb.o(1, this, h.class, "chatScopeOf", "chatScopeOf(Ljava/util/List;)Lcom/revolut/chat/data/repository/messages/MessagesLoadingContext;", 0, 15));
        if (qVar != null) {
            list = listC;
            uuid3 = qVar.f276317a;
        } else {
            list = listC;
            uuid3 = null;
        }
        if (qVar2 != null) {
            list2 = list;
            uuid4 = qVar2.f276317a;
        } else {
            list2 = list;
            uuid4 = null;
        }
        final int i3 = 1;
        return new c1(new i(list2, c(arrayList3, map, uuid3, uuid4, groupRowCounts, new y07.m(23), new Function2(this) { // from class: y20.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f310496b;

            {
                this.f310496b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                UUID uuid7;
                v30.c0 c0Var;
                u10.q newer = (u10.q) obj2;
                u10.q older = (u10.q) obj3;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(newer, "newer");
                        Intrinsics.checkNotNullParameter(older, "older");
                        this.f310496b.getClass();
                        return Boolean.valueOf((newer.f276320g == null || older.f276320g == null || (uuid7 = newer.e) == null || !uuid7.equals(older.e) || (!h.f(newer, older) && (scope instanceof m))) ? false : true);
                    default:
                        Intrinsics.checkNotNullParameter(newer, "newer");
                        Intrinsics.checkNotNullParameter(older, "older");
                        this.f310496b.getClass();
                        return Boolean.valueOf((newer.f276320g == null || older.f276320g == null || (c0Var = newer.f) == null || c0Var != older.f || (!h.f(newer, older) && !(scope instanceof o))) ? false : true);
                }
            }
        }, new xlb.o(1, this, h.class, "feedScopeOf", "feedScopeOf(Ljava/util/List;)Lcom/revolut/chat/data/repository/messages/MessagesLoadingContext;", 0, 16)), c(arrayList3, map, qVar != null ? qVar.f276317a : null, qVar2 != null ? qVar2.f276317a : null, groupRowCounts, new y07.m(24), new Function2(this) { // from class: y20.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f310496b;

            {
                this.f310496b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                UUID uuid7;
                v30.c0 c0Var;
                u10.q newer = (u10.q) obj2;
                u10.q older = (u10.q) obj3;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(newer, "newer");
                        Intrinsics.checkNotNullParameter(older, "older");
                        this.f310496b.getClass();
                        return Boolean.valueOf((newer.f276320g == null || older.f276320g == null || (uuid7 = newer.e) == null || !uuid7.equals(older.e) || (!h.f(newer, older) && (scope instanceof m))) ? false : true);
                    default:
                        Intrinsics.checkNotNullParameter(newer, "newer");
                        Intrinsics.checkNotNullParameter(older, "older");
                        this.f310496b.getClass();
                        return Boolean.valueOf((newer.f276320g == null || older.f276320g == null || (c0Var = newer.f) == null || c0Var != older.f || (!h.f(newer, older) && !(scope instanceof o))) ? false : true);
                }
            }
        }, new xlb.o(1, this, h.class, "typeScopeOf", "typeScopeOf(Ljava/util/List;)Lcom/revolut/chat/data/repository/messages/MessagesLoadingContext;", 0, 17))));
    }
}
