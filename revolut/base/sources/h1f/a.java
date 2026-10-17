package h1f;

import com.revolut.feature.trade_rev_points.models.TradeRevPointsAccountTransferLimit;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsRate;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsRedeemOption;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsRedeemOptionItem;
import j1f.g0;
import j1f.i;
import j1f.j0;
import j1f.k;
import j1f.m0;
import j1f.n;
import j1f.r;
import j1f.u;
import j1f.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import p1f.b;
import u2f.c;
import u2f.d;
import u2f.e;
import u2f.f;
import u2f.g;
import u2f.h;
import u2f.j;
import u2f.l;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static final TradeRevPointsAccountTransferLimit a(i iVar) {
        c cVar;
        int i = iVar.f170385a;
        int i2 = iVar.f170386b;
        int i3 = iVar.f170387c;
        String str = iVar.d;
        c[] cVarArrValues = c.values();
        int length = cVarArrValues.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArrValues[i5];
            if (a0.z(cVar.name(), str, true)) {
                break;
            }
            i5++;
        }
        if (cVar == null) {
            cVar = c.UNKNOWN;
        }
        return new TradeRevPointsAccountTransferLimit(i, i2, i3, cVar);
    }

    public static final TradeRevPointsRedeemOption b(j0 j0Var) {
        String str = j0Var.f170391a;
        String str2 = j0Var.f170392b;
        List<m0> list = j0Var.f170393c;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (m0 m0Var : list) {
            arrayList.add(new TradeRevPointsRedeemOptionItem(mo3.a.o(m0Var.f170402c), m0Var.f170400a, m0Var.f170401b));
        }
        String str3 = j0Var.d;
        jo3.a aVar = j0Var.e;
        return new TradeRevPointsRedeemOption(str, str2, arrayList, str3, aVar != null ? mo3.a.o(aVar) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    public static final d c(n nVar) {
        j jVar;
        String str;
        String str2;
        String str3;
        ?? arrayList;
        ?? arrayList2;
        l lVar;
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        String str4 = nVar.f170403a;
        String str5 = nVar.f170404b;
        j[] jVarArrValues = j.values();
        int length = jVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jVar = null;
                break;
            }
            jVar = jVarArrValues[i];
            if (a0.z(jVar.name(), str5, true)) {
                break;
            }
            i++;
        }
        if (jVar == null) {
            jVar = j.UNKNOWN;
        }
        j jVar2 = jVar;
        String str6 = nVar.f170405c;
        String str7 = nVar.d;
        String str8 = nVar.e;
        String str9 = nVar.f;
        String str10 = nVar.f170406g;
        String str11 = nVar.f170407h;
        String str12 = nVar.i;
        String str13 = nVar.f170408j;
        boolean z = nVar.k;
        String str14 = nVar.f170409l;
        h hVarF = f(nVar.f170410m);
        List list = nVar.f170411n;
        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            String str15 = (String) it8.next();
            l[] lVarArrValues = l.values();
            Iterator it9 = it8;
            int length2 = lVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    lVar = null;
                    break;
                }
                lVar = lVarArrValues[i2];
                int i3 = i2;
                int i5 = length2;
                if (a0.z(lVar.name(), str15, true)) {
                    break;
                }
                i2 = i3 + 1;
                length2 = i5;
            }
            if (lVar == null) {
                lVar = l.UNKNOWN;
            }
            arrayList3.add(lVar);
            it8 = it9;
        }
        String str16 = nVar.o;
        String str17 = nVar.f170412p;
        List list2 = nVar.f170413q;
        if (list2 != null) {
            List list3 = list2;
            str = str16;
            str2 = str17;
            str3 = str4;
            arrayList = new ArrayList(w.t(list3, 10));
            Iterator it10 = list3.iterator();
            while (it10.hasNext()) {
                arrayList.add(b((j0) it10.next()));
            }
        } else {
            str = str16;
            str2 = str17;
            str3 = str4;
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = f0.f322471a;
        }
        List list4 = nVar.f170414r;
        if (list4 != null) {
            List list5 = list4;
            arrayList2 = new ArrayList(w.t(list5, 10));
            Iterator it11 = list5.iterator();
            while (it11.hasNext()) {
                arrayList2.add(b((j0) it11.next()));
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = f0.f322471a;
        }
        k kVar = nVar.f170415s;
        e eVarE = kVar != null ? e(kVar) : null;
        i iVar = nVar.f170416t;
        return new d(str3, jVar2, str6, str7, str8, str9, str10, str11, str12, str13, z, str14, hVarF, arrayList3, str, str2, arrayList, arrayList2, eVarE, iVar != null ? a(iVar) : null);
    }

    public static final d d(b bVar) {
        j jVar;
        l lVar;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String str = bVar.f231900a;
        String str2 = bVar.f231901b;
        j[] jVarArrValues = j.values();
        int length = jVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jVar = null;
                break;
            }
            jVar = jVarArrValues[i];
            if (a0.z(jVar.name(), str2, true)) {
                break;
            }
            i++;
        }
        if (jVar == null) {
            jVar = j.UNKNOWN;
        }
        j jVar2 = jVar;
        String str3 = bVar.f231902c;
        String str4 = bVar.d;
        String str5 = bVar.e;
        String str6 = bVar.f;
        String str7 = bVar.f231903g;
        String str8 = bVar.f231904h;
        String str9 = bVar.i;
        String str10 = bVar.f231905j;
        boolean z = bVar.k;
        String str11 = bVar.f231906l;
        h hVarF = f(bVar.f231907m);
        List list = bVar.f231908n;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            String str12 = (String) it8.next();
            l[] lVarArrValues = l.values();
            Iterator it9 = it8;
            int length2 = lVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    lVar = null;
                    break;
                }
                lVar = lVarArrValues[i2];
                int i3 = i2;
                int i5 = length2;
                if (a0.z(lVar.name(), str12, true)) {
                    break;
                }
                i2 = i3 + 1;
                length2 = i5;
            }
            if (lVar == null) {
                lVar = l.UNKNOWN;
            }
            arrayList.add(lVar);
            it8 = it9;
        }
        String str13 = bVar.o;
        String str14 = bVar.f231909p;
        List list2 = bVar.f231910q;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        Iterator it10 = list2.iterator();
        while (it10.hasNext()) {
            arrayList2.add(b((j0) it10.next()));
        }
        List list3 = bVar.f231911r;
        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
        Iterator it11 = list3.iterator();
        while (it11.hasNext()) {
            arrayList3.add(b((j0) it11.next()));
        }
        k kVar = bVar.f231912s;
        e eVarE = kVar != null ? e(kVar) : null;
        i iVar = bVar.f231913t;
        return new d(str, jVar2, str3, str4, str5, str6, str7, str8, str9, str10, z, str11, hVarF, arrayList, str13, str14, arrayList2, arrayList3, eVarE, iVar != null ? a(iVar) : null);
    }

    public static final e e(k kVar) {
        List<r> list = kVar.f170395a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (r rVar : list) {
            arrayList.add(new f(rVar.f170425a, rVar.f170426b));
        }
        return new e(kVar.f170396b, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final u2f.h f(j1f.x r21) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1f.a.f(j1f.x):u2f.h");
    }

    public static final j0 g(TradeRevPointsRedeemOption tradeRevPointsRedeemOption) {
        String str = tradeRevPointsRedeemOption.f91195a;
        String str2 = tradeRevPointsRedeemOption.f91196b;
        ArrayList<TradeRevPointsRedeemOptionItem> arrayList = tradeRevPointsRedeemOption.f91197c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (TradeRevPointsRedeemOptionItem tradeRevPointsRedeemOptionItem : arrayList) {
            arrayList2.add(new m0(tradeRevPointsRedeemOptionItem.f91198a, tradeRevPointsRedeemOptionItem.f91199b, mo3.a.p(tradeRevPointsRedeemOptionItem.f91200c)));
        }
        String str3 = tradeRevPointsRedeemOption.d;
        dj0.d dVar = tradeRevPointsRedeemOption.e;
        return new j0(str, str2, arrayList2, str3, dVar != null ? mo3.a.p(dVar) : null);
    }

    public static final b h(d dVar) {
        String str;
        String str2;
        String str3;
        String str4;
        g0 g0Var;
        ArrayList arrayList;
        String str5;
        k kVar;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        String str6 = dVar.f276617a;
        String strName = dVar.f276618b.name();
        String str7 = dVar.f276619c;
        String str8 = dVar.d;
        String str9 = dVar.e;
        String str10 = dVar.f;
        String str11 = dVar.f276620g;
        String str12 = dVar.f276621h;
        String str13 = dVar.i;
        String str14 = dVar.f276622j;
        boolean z = dVar.k;
        String str15 = dVar.f276623l;
        h hVar = dVar.f276624m;
        String str16 = hVar.f276638a;
        String strName2 = hVar.f276639b.name();
        String str17 = hVar.f276640c;
        String str18 = hVar.d;
        String str19 = hVar.e;
        String str20 = hVar.f;
        String strName3 = hVar.f276641g.name();
        TradeRevPointsRate tradeRevPointsRate = hVar.f276642h;
        if (tradeRevPointsRate != null) {
            str = strName;
            str2 = str7;
            String strValueOf = String.valueOf(tradeRevPointsRate.f91190a);
            String strName4 = tradeRevPointsRate.f91192c.name();
            str3 = str8;
            TradeRevPointsRate.Display display = tradeRevPointsRate.d;
            str4 = str9;
            g0Var = new g0(strValueOf, strName4, new j1f.f0(display.f91193a, display.f91194b));
        } else {
            str = strName;
            str2 = str7;
            str3 = str8;
            str4 = str9;
            g0Var = null;
        }
        g gVar = hVar.i;
        x xVar = new x(str16, strName2, str17, str18, str19, str20, strName3, g0Var, gVar != null ? new u(gVar.f276635a, gVar.f276636b.name(), gVar.f276637c) : null, hVar.f276643j.name());
        ArrayList arrayList2 = dVar.f276625n;
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            arrayList3.add(((l) it8.next()).name());
        }
        String str21 = dVar.o;
        String str22 = dVar.f276626p;
        List list = dVar.f276627q;
        ArrayList arrayList4 = new ArrayList(w.t(list, 10));
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            arrayList4.add(g((TradeRevPointsRedeemOption) it9.next()));
        }
        List list2 = dVar.f276628r;
        ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
        Iterator it10 = list2.iterator();
        while (it10.hasNext()) {
            arrayList5.add(g((TradeRevPointsRedeemOption) it10.next()));
        }
        e eVar = dVar.f276629s;
        if (eVar != null) {
            ArrayList arrayList6 = eVar.f276631a;
            arrayList = arrayList3;
            ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
            Iterator it11 = arrayList6.iterator();
            while (it11.hasNext()) {
                f fVar = (f) it11.next();
                arrayList7.add(new r(fVar.f276633a, fVar.f276634b));
                it11 = it11;
                str22 = str22;
            }
            str5 = str22;
            kVar = new k(arrayList7, eVar.f276632b);
        } else {
            arrayList = arrayList3;
            str5 = str22;
            kVar = null;
        }
        TradeRevPointsAccountTransferLimit tradeRevPointsAccountTransferLimit = dVar.f276630t;
        return new b(str6, str, str2, str3, str4, str10, str11, str12, str13, str14, z, str15, xVar, arrayList, str21, str5, arrayList4, arrayList5, kVar, tradeRevPointsAccountTransferLimit != null ? new i(tradeRevPointsAccountTransferLimit.f91184a, tradeRevPointsAccountTransferLimit.f91185b, tradeRevPointsAccountTransferLimit.f91186c, tradeRevPointsAccountTransferLimit.d.name()) : null);
    }
}
