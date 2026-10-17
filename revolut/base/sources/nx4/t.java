package nx4;

import dx4.q5;
import dx4.r5;
import dx4.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nx4.c3;
import nx4.x;

/* JADX INFO: loaded from: classes22.dex */
public abstract class t {
    public static final n a(dx4.l lVar) {
        String str;
        dx4.a aVar;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (lVar instanceof dx4.b) {
            return new d(((dx4.b) lVar).f120550a);
        }
        if (lVar instanceof dx4.i) {
            String str2 = ((dx4.i) lVar).f120619a;
            return new k(str2 != null ? str2 : "");
        }
        if (lVar instanceof dx4.a) {
            return new c(((dx4.a) lVar).f120542a);
        }
        if (lVar instanceof dx4.h) {
            return new j(c(((dx4.h) lVar).f120610a));
        }
        if (lVar instanceof dx4.g) {
            dx4.b2 b2Var = ((dx4.g) lVar).f120601a;
            String str3 = b2Var.f120553a;
            String str4 = b2Var.f120554b;
            String str5 = b2Var.f120555c;
            ArrayList arrayList = b2Var.d;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                arrayList2.add(p0.a((dx4.e1) it8.next()));
            }
            return new i(new b1(str3, str4, str5, b2Var.e, arrayList2));
        }
        if (lVar instanceof dx4.e) {
            dx4.u1 u1Var = ((dx4.e) lVar).f120579a;
            return new g(u1Var.f120783a, u1Var.f120784b, u1Var.f120785c);
        }
        if (lVar instanceof dx4.f) {
            return new h(((dx4.f) lVar).f120588a);
        }
        if (lVar instanceof dx4.k) {
            dx4.k kVar = (dx4.k) lVar;
            String str6 = kVar.f120643a;
            List list = kVar.f120644b;
            ArrayList arrayList3 = new ArrayList(zhm.w.t(list, 10));
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                arrayList3.add(((t80.f) it9.next()).name());
            }
            return new m(str6, arrayList3);
        }
        if (lVar instanceof dx4.c) {
            return new e(((dx4.c) lVar).f120561a);
        }
        if (!(lVar instanceof dx4.d)) {
            if (!(lVar instanceof dx4.j)) {
                throw new NoWhenBranchMatchedException();
            }
            r5 r5Var = ((dx4.j) lVar).f120639a;
            String str7 = r5Var.f120755a;
            String str8 = r5Var.f120756b;
            ArrayList<q5> arrayList4 = r5Var.f120757c;
            ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
            for (q5 q5Var : arrayList4) {
                arrayList5.add(new c3.a(q5Var.f120730b, q5Var.f120729a, q5Var.f120731c));
            }
            return new l(new c3(str7, str8, r5Var.d, arrayList5));
        }
        dx4.z zVar = ((dx4.d) lVar).f120573a;
        boolean z = zVar instanceof dx4.y;
        String str9 = z ? ((dx4.y) zVar).i : "";
        String title = zVar.getTitle();
        dx4.x xVarV8 = zVar.V8();
        String str10 = xVarV8 != null ? xVarV8.f120822a : null;
        dx4.x xVarV82 = zVar.V8();
        n nVarA = xVarV82 != null ? a(xVarV82.f120823b) : null;
        c cVar = nVarA instanceof c ? (c) nVarA : null;
        long jN5 = zVar.N5();
        long jV8 = zVar.v8();
        Long lQ1 = zVar.Q1();
        int iS6 = zVar.S6();
        String str11 = z ? ((dx4.y) zVar).f120850j : "";
        String str12 = z ? ((dx4.y) zVar).k : "";
        String str13 = z ? ((dx4.y) zVar).f120851l : "";
        String str14 = z ? ((dx4.y) zVar).f120852m : "";
        dx4.t tVarT6 = zVar.t6();
        if (tVarT6 instanceof dx4.s) {
            str = "MONEY";
        } else if (tVarT6 instanceof t.a) {
            str = "MONTH";
        } else {
            if (!(tVarT6 instanceof t.b)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "YEAR";
        }
        String str15 = str;
        dx4.t tVarT62 = zVar.t6();
        dx4.s sVar = tVarT62 instanceof dx4.s ? (dx4.s) tVarT62 : null;
        String str16 = sVar != null ? sVar.f120758a.f306286a : null;
        List<dx4.v> listP6 = zVar.P6();
        ArrayList arrayList6 = new ArrayList(zhm.w.t(listP6, 10));
        for (dx4.v vVar : listP6) {
            String str17 = str9;
            long j2 = vVar.f120794a;
            long j3 = vVar.f120795b;
            dx4.z zVar2 = zVar;
            String str18 = vVar.f120796c;
            String strName = vVar.d.name();
            dx4.z2 z2Var = vVar.e;
            arrayList6.add(new x.a(j2, j3, str18, strName, z2Var != null ? c(z2Var) : null));
            str9 = str17;
            zVar = zVar2;
        }
        String str19 = str9;
        dx4.y yVar = z ? (dx4.y) zVar : null;
        n nVarA2 = (yVar == null || (aVar = yVar.f120853n) == null) ? null : a(aVar);
        return new f(new x(str19, title, str10, cVar, jN5, jV8, lQ1, iS6, str11, str12, str13, str14, str15, str16, arrayList6, nVarA2 instanceof c ? (c) nVarA2 : null));
    }

    public static final r1 b(dx4.y2 y2Var) {
        dx4.o2 o2Var;
        if (y2Var instanceof dx4.v2) {
            dx4.v2 v2Var = (dx4.v2) y2Var;
            String str = v2Var.f120801a;
            dx4.a1 a1Var = v2Var.f120802b;
            return new o1(str, a1Var != null ? p0.f(a1Var) : null);
        }
        if (y2Var instanceof dx4.r2) {
            dx4.r2 r2Var = (dx4.r2) y2Var;
            String str2 = r2Var.f120743a;
            String str3 = r2Var.f120744b;
            String strName = r2Var.f120745c.name();
            dx4.n2 n2Var = r2Var.d;
            String strName2 = n2Var != null ? n2Var.name() : null;
            dx4.p2 p2Var = r2Var.e;
            String str4 = p2Var != null ? p2Var.f120709a : null;
            String strName3 = (p2Var == null || (o2Var = p2Var.f120710b) == null) ? null : o2Var.name();
            String strName4 = r2Var.f.name();
            dx4.l lVar = r2Var.f120746g;
            n nVarA = lVar != null ? a(lVar) : null;
            dx4.q qVar = r2Var.f120747h;
            return new l1(str2, str3, strName, strName2, strName4, str4, strName3, nVarA, qVar != null ? qVar.name() : null);
        }
        if (y2Var instanceof dx4.w2) {
            dx4.w2 w2Var = (dx4.w2) y2Var;
            String str5 = w2Var.f120814a;
            String str6 = w2Var.f120815b;
            dx4.c1 c1Var = w2Var.f120816c;
            return new p1(str5, str6, c1Var != null ? p0.f(c1Var) : null);
        }
        if (y2Var instanceof dx4.u2) {
            dx4.u2 u2Var = (dx4.u2) y2Var;
            return new n1(u2Var.f120786a, u2Var.f120787b.name(), u2Var.f120788c);
        }
        if (y2Var instanceof dx4.x2) {
            return new q1(((dx4.x2) y2Var).f120830a);
        }
        if (y2Var instanceof dx4.s2) {
            dx4.s2 s2Var = (dx4.s2) y2Var;
            String str7 = s2Var.f120762a;
            List list = s2Var.f120763b;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(b((dx4.y2) it8.next()));
            }
            return new m1(str7, arrayList);
        }
        if (!(y2Var instanceof dx4.m2)) {
            throw new NoWhenBranchMatchedException();
        }
        dx4.m2 m2Var = (dx4.m2) y2Var;
        String str8 = m2Var.f120677a;
        String str9 = m2Var.f120678b;
        dx4.c1 c1Var2 = m2Var.d;
        String strF = c1Var2 != null ? p0.f(c1Var2) : null;
        dx4.d1 d1Var = m2Var.f120679c;
        k0 k0VarH = d1Var != null ? a.a.H(d1Var) : null;
        dx4.a1 a1Var2 = m2Var.e;
        String strF2 = a1Var2 != null ? p0.f(a1Var2) : null;
        dx4.l lVar2 = m2Var.f;
        return new k1(str8, str9, strF, strF2, lVar2 != null ? a(lVar2) : null, k0VarH);
    }

    public static final s1 c(dx4.z2 z2Var) {
        u0 u0Var;
        t0 t0Var;
        Intrinsics.checkNotNullParameter(z2Var, "<this>");
        String str = z2Var.f120860a;
        String str2 = z2Var.f120861b;
        dx4.a1 a1Var = z2Var.f120862c;
        String strF = a1Var != null ? p0.f(a1Var) : null;
        List list = z2Var.d;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(b((dx4.y2) it8.next()));
        }
        String str3 = z2Var.e;
        String str4 = z2Var.f;
        String str5 = z2Var.f120863g;
        dx4.t1 t1Var = z2Var.f120864h;
        if (t1Var != null) {
            String strName = t1Var.f120773a.name();
            dx4.o1 o1Var = t1Var.f120774b;
            String str6 = o1Var.f120699a;
            dx4.l lVar = o1Var.f120700b;
            t0 t0Var2 = new t0(str6, lVar != null ? a(lVar) : null);
            dx4.o1 o1Var2 = t1Var.f120775c;
            if (o1Var2 != null) {
                String str7 = o1Var2.f120699a;
                dx4.l lVar2 = o1Var2.f120700b;
                t0Var = new t0(str7, lVar2 != null ? a(lVar2) : null);
            } else {
                t0Var = null;
            }
            String str8 = t1Var.d;
            dx4.r1 r1Var = t1Var.e;
            u0Var = new u0(strName, t0Var2, str8, t0Var, r1Var != null ? new v0(r1Var.f120740a.name(), r1Var.f120741b.name(), r1Var.f120742c.name()) : null);
        } else {
            u0Var = null;
        }
        return new s1(str, str2, strF, null, arrayList, str3, str4, str5, u0Var);
    }
}
