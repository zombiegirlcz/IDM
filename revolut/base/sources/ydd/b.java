package ydd;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import lcd.g;
import lcd.r;
import le.u1;
import ncd.i;
import ncd.j;
import ncd.k;
import org.joda.time.DateTime;
import pcd.a0;
import pcd.b0;
import pcd.c0;
import pcd.e0;
import pcd.f0;
import pcd.g0;
import pcd.h0;
import pcd.i0;
import pcd.j0;
import pcd.l0;
import pcd.m;
import pcd.n;
import pcd.o;
import pcd.p;
import pcd.s;
import pcd.x;
import pcd.y;
import pcd.z;
import rd0.c;
import vdd.a;
import vdd.e;
import zdd.h;
import zdd.l;
import zhm.d0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {
    public static final g0 a(p pVar, pcd.a aVar) {
        Serializable[] elements = {pVar, aVar};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayList = (ArrayList) d.L(elements);
        if (arrayList.isEmpty() || arrayList.size() > 1) {
            return null;
        }
        if (pVar != null) {
            return new f0(pVar);
        }
        if (aVar != null) {
            return new e0(aVar);
        }
        return null;
    }

    public static final Map b() {
        return r0.k(new Pair("INVITED", a0.INVITED), new Pair("ACTIVE", a0.ACTIVE), new Pair("INACTIVE", a0.INACTIVE), new Pair("REFUSED", a0.REFUSED), new Pair("LEFT", a0.LEFT), new Pair("REMOVED", a0.REMOVED));
    }

    public static final Map c() {
        return r0.k(new Pair("EXTERNAL", n.EXTERNAL), new Pair("EXTERNAL_MANDATE", n.EXTERNAL_MANDATE), new Pair("INTERNAL", n.INTERNAL), new Pair("CARD_MANDATE", n.CARD_MANDATE), new Pair("MANUAL_CARD_MANDATE", n.MANUAL_CARD_MANDATE), new Pair("UNKNOWN", n.UNKNOWN));
    }

    public static final Map d() {
        return r0.k(new Pair("WITHDRAW", y.WITHDRAW), new Pair("CONTRIBUTE", y.CONTRIBUTE));
    }

    public static final Map e() {
        return r0.k(new Pair("SAVINGS", l0.SAVINGS), new Pair("MONEY_MARKET_FUND_SAVINGS", l0.MONEY_MARKET_FUND_SAVINGS), new Pair("REGULAR", l0.REGULAR), new Pair("GROUP", l0.GROUP), new Pair("PRO_REGULAR", l0.PRO_REGULAR), new Pair("PRO_TAX", l0.PRO_TAX));
    }

    public static final i f(a.C1594a.C1595a c1595a) {
        k kVar;
        double percentage = c1595a.getPercentage();
        String suffix = c1595a.getSuffix();
        String type = c1595a.getType();
        k[] kVarArrValues = k.values();
        int length = kVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                kVar = null;
                break;
            }
            kVar = kVarArrValues[i];
            if (kotlin.text.a0.z(kVar.name(), type, true)) {
                break;
            }
            i++;
        }
        if (kVar == null) {
            kVar = k.UNKNOWN;
        }
        return new i(percentage, suffix, kVar);
    }

    public static final i g(h.a.C1779a c1779a) {
        k kVar;
        double percentage = c1779a.getPercentage();
        String suffix = c1779a.getSuffix();
        String type = c1779a.getType();
        k[] kVarArrValues = k.values();
        int length = kVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                kVar = null;
                break;
            }
            kVar = kVarArrValues[i];
            if (kotlin.text.a0.z(kVar.name(), type, true)) {
                break;
            }
            i++;
        }
        if (kVar == null) {
            kVar = k.UNKNOWN;
        }
        return new i(percentage, suffix, kVar);
    }

    public static final s h(vdd.i iVar) {
        pcd.a aVar;
        h0 h0Var;
        ArrayList arrayList;
        j0 j0Var;
        ArrayList arrayList2;
        ArrayList arrayList3;
        pcd.b bVar;
        DateTime dateTime;
        o oVar;
        o oVar2;
        i0 i0Var;
        j0 j0Var2;
        vdd.a aVar2;
        String str;
        lcd.h hVar;
        r rVar;
        String str2 = "<this>";
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        vdd.d dVar = iVar.f287899j;
        p pVar = dVar != null ? new p(dVar.getId(), dVar.getHistoricalId(), dVar.getName(), dVar.getCurrency(), dVar.getBalance(), dVar.getBalanceUpdatedDate()) : null;
        vdd.a aVar3 = iVar.k;
        if (aVar3 != null) {
            String name = aVar3.getName();
            String productId = aVar3.getProductId();
            String pocketId = aVar3.getPocketId();
            dj0.d dVarV = hx7.a.v(aVar3.getDepositAmount());
            a.C1594a displayRate = aVar3.getDisplayRate();
            i iVarF = f(displayRate.getPrimary());
            a.C1594a.C1595a secondary = displayRate.getSecondary();
            j jVar = new j(iVarF, secondary != null ? f(secondary) : null);
            String nextInterestPaymentDate = aVar3.getNextInterestPaymentDate();
            LocalDate localDate = nextInterestPaymentDate != null ? LocalDate.parse(nextInterestPaymentDate) : null;
            String challengeAccountId = aVar3.getChallengeAccountId();
            jo3.b interestBalance = aVar3.getInterestBalance();
            dj0.d dVarV2 = interestBalance != null ? hx7.a.v(interestBalance) : null;
            a.b term = aVar3.getTerm();
            if (term != null) {
                String title = term.getTitle();
                aVar2 = aVar3;
                String period = term.getMaturity().getPeriod();
                Instant instantOfEpochMilli = Instant.ofEpochMilli(term.getMaturity().getMaturityDate());
                str = name;
                Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
                hVar = new lcd.h(title, new g(period, term.getMaturity().getExplanationDeeplink(), instantOfEpochMilli));
            } else {
                aVar2 = aVar3;
                str = name;
                hVar = null;
            }
            vdd.g transferConfig = aVar2.getTransferConfig();
            if (transferConfig != null) {
                Intrinsics.checkNotNullParameter(transferConfig, "<this>");
                rVar = new r(transferConfig.getAcceptsTopups(), transferConfig.getAcceptsWithdrawals());
            } else {
                rVar = null;
            }
            aVar = new pcd.a(str, productId, pocketId, dVarV, jVar, localDate, challengeAccountId, dVarV2, hVar, rVar);
        } else {
            aVar = null;
        }
        g0 g0VarA = a(pVar, aVar);
        if (g0VarA == null) {
            throw new IllegalStateException("A vault must have either pocket or deposit");
        }
        String str3 = iVar.f287894a;
        String str4 = iVar.f287895b;
        String str5 = iVar.f287896c;
        h0[] h0VarArrValues = h0.values();
        int length = h0VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                h0Var = null;
                break;
            }
            h0Var = h0VarArrValues[i];
            if (kotlin.text.a0.z(h0Var.name(), str5, true)) {
                break;
            }
            i++;
        }
        if (h0Var == null) {
            h0Var = h0.ACTIVE;
        }
        h0 h0Var2 = h0Var;
        e eVar = iVar.d;
        if (eVar != null) {
            Intrinsics.checkNotNullParameter(eVar, "<this>");
            String type = eVar.getType();
            i0[] i0VarArrValues = i0.values();
            int length2 = i0VarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    i0Var = null;
                    break;
                }
                i0Var = i0VarArrValues[i2];
                if (kotlin.text.a0.z(i0Var.name(), type, true)) {
                    break;
                }
                i2++;
            }
            if (i0Var != null) {
                j0Var2 = new j0(i0Var, eVar.getDescription());
                arrayList = null;
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Unsupported state type ", eVar.getType()));
                zhm.h0 h0Var3 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                arrayList = null;
                rd0.d.a(c.ERROR, null, null, illegalArgumentException, h0Var3);
                j0Var2 = null;
            }
            j0Var = j0Var2;
        } else {
            arrayList = null;
            j0Var = null;
        }
        l0 l0Var = (l0) u1.u(iVar.e, e());
        String str6 = iVar.f;
        long j2 = iVar.f287897g;
        String str7 = iVar.f287898h;
        List list = iVar.f287900l;
        if (list != null) {
            ArrayList arrayList4 = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                x xVarJ = j((vdd.k) it8.next());
                if (xVarJ != null) {
                    arrayList4.add(xVarJ);
                }
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = arrayList;
        }
        Long l2 = iVar.f287902n;
        List list2 = iVar.o;
        if (list2 != null) {
            List<vdd.b> list3 = list2;
            ArrayList arrayList5 = new ArrayList(w.t(list3, 10));
            for (vdd.b bVar2 : list3) {
                Intrinsics.checkNotNullParameter(bVar2, str2);
                arrayList5.add(new m(bVar2.getId(), bVar2.getPaymentId(), (n) u1.t(bVar2.getType(), n.UNKNOWN, c())));
                str2 = str2;
            }
            arrayList3 = arrayList5;
        } else {
            arrayList3 = null;
        }
        String str8 = iVar.f287903p;
        pcd.b[] bVarArrValues = pcd.b.values();
        int length3 = bVarArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                bVar = null;
                break;
            }
            bVar = bVarArrValues[i3];
            if (kotlin.text.a0.z(bVar.name(), str8, true)) {
                break;
            }
            i3++;
        }
        if (bVar == null) {
            bVar = pcd.b.UNKNOWN;
        }
        pcd.b bVar3 = bVar;
        DateTime dateTime2 = new DateTime(iVar.f287904q);
        String str9 = iVar.f287906s;
        String str10 = iVar.f287907t;
        if (str10 != null) {
            o[] oVarArrValues = o.values();
            int length4 = oVarArrValues.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length4) {
                    dateTime = dateTime2;
                    oVar2 = null;
                    break;
                }
                oVar2 = oVarArrValues[i5];
                dateTime = dateTime2;
                if (kotlin.text.a0.z(oVar2.name(), str10, true)) {
                    break;
                }
                i5++;
                dateTime2 = dateTime;
            }
            if (oVar2 == null) {
                oVar2 = o.UNKNOWN;
            }
            oVar = oVar2;
        } else {
            dateTime = dateTime2;
            oVar = null;
        }
        Long l3 = iVar.f287905r;
        return new s(str3, str4, h0Var2, j0Var, l0Var, str6, j2, g0VarA, dateTime, str7, arrayList2, l2, arrayList3, bVar3, str9, oVar, l3 != null ? new DateTime(l3.longValue()) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x020e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021d  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v7, types: [pcd.b] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [lcd.r] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r21v0, types: [pcd.h0] */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [pcd.j0] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r2v13, types: [pcd.o[]] */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r33v0, types: [pcd.b] */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1, types: [pcd.o] */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r36v0 */
    /* JADX WARN: Type inference failed for: r36v1, types: [org.joda.time.DateTime] */
    /* JADX WARN: Type inference failed for: r36v2 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v3, types: [pcd.h0[]] */
    /* JADX WARN: Type inference failed for: r4v25, types: [pcd.i0[]] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [pcd.o] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v17, types: [pcd.h0] */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [pcd.b[]] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [pcd.i0] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Enum] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final pcd.s i(zdd.i r37, java.lang.String r38) {
        /*
            Method dump skipped, instruction units count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ydd.b.i(zdd.i, java.lang.String):pcd.s");
    }

    public static final x j(vdd.k kVar) {
        z zVar;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        a0 a0Var = (a0) u1.v(kVar.getState(), b());
        if (a0Var == null || (zVar = (z) u1.v(kVar.getRole(), r0.k(new Pair("ADMIN", z.ADMIN), new Pair("MEMBER", z.MEMBER)))) == null) {
            return null;
        }
        String id10 = kVar.getId();
        String firstName = kVar.getFirstName();
        String lastName = kVar.getLastName();
        long contribution = kVar.getContribution();
        Set permissions = kVar.getPermissions();
        ArrayList arrayList = new ArrayList(w.t(permissions, 10));
        Iterator it8 = permissions.iterator();
        while (it8.hasNext()) {
            arrayList.add((y) u1.u((String) it8.next(), d()));
        }
        return new x(id10, a0Var, zVar, firstName, lastName, contribution, d0.i1(arrayList), kVar.getReferralCode());
    }

    public static final x k(l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        a0 a0Var = (a0) u1.u(lVar.getState(), b());
        z zVar = (z) u1.u(lVar.getRole(), r0.k(new Pair("ADMIN", z.ADMIN), new Pair("MEMBER", z.MEMBER)));
        String id10 = lVar.getId();
        String firstName = lVar.getFirstName();
        String lastName = lVar.getLastName();
        long contribution = lVar.getContribution();
        List permissions = lVar.getPermissions();
        ArrayList arrayList = new ArrayList(w.t(permissions, 10));
        Iterator it8 = permissions.iterator();
        while (it8.hasNext()) {
            arrayList.add((y) u1.u((String) it8.next(), d()));
        }
        return new x(id10, a0Var, zVar, firstName, lastName, contribution, d0.i1(arrayList), lVar.getReferralCode());
    }

    public static final ArrayList l(List list) {
        zdd.m mVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<pcd.d0> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (pcd.d0 d0Var : list2) {
            if (d0Var instanceof b0) {
                b0 b0Var = (b0) d0Var;
                String str = b0Var.f234847a;
                Set set = b0Var.f234848b;
                ArrayList arrayList2 = new ArrayList(w.t(set, 10));
                Iterator it8 = set.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(u1.g((y) it8.next(), d()));
                }
                mVar = new zdd.m(null, str, arrayList2);
            } else {
                if (!(d0Var instanceof c0)) {
                    throw new NoWhenBranchMatchedException();
                }
                c0 c0Var = (c0) d0Var;
                String str2 = c0Var.f234851a;
                Set set2 = c0Var.f234852b;
                ArrayList arrayList3 = new ArrayList(w.t(set2, 10));
                Iterator it9 = set2.iterator();
                while (it9.hasNext()) {
                    arrayList3.add(u1.g((y) it9.next(), d()));
                }
                mVar = new zdd.m(str2, null, arrayList3);
            }
            arrayList.add(mVar);
        }
        return arrayList;
    }

    public static final vdd.i m(s sVar) {
        e eVar;
        String str;
        String str2;
        vdd.d dVar;
        String str3;
        e eVar2;
        String str4;
        String str5;
        vdd.a aVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        a.C1594a c1594a;
        String str6;
        a.b bVar;
        vdd.g gVar;
        String str7 = "<this>";
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        String str8 = sVar.f234881a;
        g0 g0Var = sVar.f234885h;
        String str9 = sVar.f234882b;
        String strName = sVar.f234883c.name();
        j0 j0Var = sVar.d;
        if (j0Var != null) {
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            eVar = new e(j0Var.f234868a.name(), j0Var.f234869b);
        } else {
            eVar = null;
        }
        String strG = u1.g(sVar.e, e());
        String str10 = sVar.f;
        String strName2 = sVar.f234889n.name();
        long j2 = sVar.f234884g;
        String str11 = sVar.f234886j;
        String strF = sVar.f();
        f0 f0Var = g0Var instanceof f0 ? (f0) g0Var : null;
        p pVar = f0Var != null ? f0Var.d : null;
        if (pVar != null) {
            Intrinsics.checkNotNullParameter(pVar, "<this>");
            str = str8;
            str2 = str9;
            dVar = new vdd.d(pVar.f234875a, pVar.f234876b, pVar.f234877c, pVar.d, pVar.e, pVar.f);
        } else {
            str = str8;
            str2 = str9;
            dVar = null;
        }
        e0 e0Var = g0Var instanceof e0 ? (e0) g0Var : null;
        pcd.a aVar2 = e0Var != null ? e0Var.d : null;
        if (aVar2 != null) {
            String str12 = aVar2.f234841a;
            String str13 = aVar2.f234842b;
            String str14 = aVar2.f234843c;
            jo3.b bVarA = hx7.a.A(aVar2.d);
            j jVar = aVar2.e;
            i iVar = jVar.f214177a;
            str3 = strName;
            eVar2 = eVar;
            str4 = strG;
            str5 = str10;
            a.C1594a.C1595a c1595a = new a.C1594a.C1595a(iVar.f214174a, iVar.f214175b, iVar.f214176c.name());
            i iVar2 = jVar.f214178b;
            a.C1594a c1594a2 = new a.C1594a(c1595a, iVar2 != null ? new a.C1594a.C1595a(iVar2.f214174a, iVar2.f214175b, iVar2.f214176c.name()) : null);
            LocalDate localDate = aVar2.f;
            String string = localDate != null ? localDate.toString() : null;
            String str15 = aVar2.f234844g;
            dj0.d dVar2 = aVar2.f234845h;
            jo3.b bVarA2 = dVar2 != null ? hx7.a.A(dVar2) : null;
            lcd.h hVar = aVar2.i;
            if (hVar != null) {
                String str16 = hVar.f193846a;
                g gVar2 = hVar.f193847b;
                c1594a = c1594a2;
                str6 = str15;
                bVar = new a.b(str16, new a.b.C1596a(gVar2.f193843a, gVar2.f193844b.toEpochMilli(), gVar2.f193845c));
            } else {
                c1594a = c1594a2;
                str6 = str15;
                bVar = null;
            }
            r rVar = aVar2.f234846j;
            if (rVar != null) {
                Intrinsics.checkNotNullParameter(rVar, "<this>");
                gVar = new vdd.g(rVar.f193868a, rVar.f193869b);
            } else {
                gVar = null;
            }
            aVar = new vdd.a(str12, str13, str14, bVarA, c1594a, string, str6, bVarA2, bVar, gVar);
        } else {
            str3 = strName;
            eVar2 = eVar;
            str4 = strG;
            str5 = str10;
            aVar = null;
        }
        List list = sVar.k;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList3.add(n((x) it8.next()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        Long l2 = sVar.f234887l;
        List list3 = sVar.f234888m;
        if (list3 != null) {
            List<m> list4 = list3;
            arrayList2 = new ArrayList(w.t(list4, 10));
            for (m mVar : list4) {
                Intrinsics.checkNotNullParameter(mVar, str7);
                arrayList2.add(new vdd.b(mVar.f234872a, mVar.f234873b, u1.g(mVar.f234874c, c())));
                str7 = str7;
            }
        } else {
            arrayList2 = null;
        }
        long millis = sVar.i.getMillis();
        String str17 = sVar.o;
        o oVar = sVar.f234890p;
        String strName3 = oVar != null ? oVar.name() : null;
        DateTime dateTime = sVar.f234891q;
        return new vdd.i(str, str2, str3, eVar2, str4, str5, j2, str11, strF, dVar, aVar, arrayList, null, l2, arrayList2, strName2, millis, dateTime != null ? Long.valueOf(dateTime.getMillis()) : null, str17, strName3);
    }

    public static final vdd.k n(x xVar) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        String str3 = xVar.f234903a;
        long j2 = xVar.f;
        String str4 = xVar.d;
        String str5 = xVar.e;
        switch (a.f312676a[xVar.f234904b.ordinal()]) {
            case 1:
                str = "INVITED";
                break;
            case 2:
                str = "ACTIVE";
                break;
            case 3:
                str = "INACTIVE";
                break;
            case 4:
                str = "REFUSED";
                break;
            case 5:
                str = "LEFT";
                break;
            case 6:
                str = "REMOVED";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String str6 = str;
        int i = a.f312677b[xVar.f234905c.ordinal()];
        if (i == 1) {
            str2 = "MEMBER";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "ADMIN";
        }
        String str7 = str2;
        Set set = xVar.f234906g;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            arrayList.add(u1.g((y) it8.next(), d()));
        }
        return new vdd.k(str3, str6, str7, str4, str5, j2, d0.i1(arrayList), xVar.f234907h);
    }
}
