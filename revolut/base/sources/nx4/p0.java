package nx4;

import dx4.a4;
import dx4.a5;
import dx4.b4;
import dx4.b5;
import dx4.c5;
import dx4.d5;
import dx4.e5;
import dx4.f3;
import dx4.f4;
import dx4.g3;
import dx4.g4;
import dx4.g5;
import dx4.h3;
import dx4.h5;
import dx4.i3;
import dx4.i4;
import dx4.i5;
import dx4.j3;
import dx4.j4;
import dx4.j5;
import dx4.k3;
import dx4.k4;
import dx4.k5;
import dx4.l3;
import dx4.l4;
import dx4.m4;
import dx4.n3;
import dx4.o5;
import dx4.p3;
import dx4.p5;
import dx4.r3;
import dx4.r4;
import dx4.s3;
import dx4.s4;
import dx4.t4;
import dx4.u4;
import dx4.v4;
import dx4.w3;
import dx4.x3;
import dx4.x4;
import dx4.x5;
import dx4.y3;
import dx4.y4;
import dx4.z3;
import dx4.z4;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nx4.b0;
import nx4.b3;
import nx4.g2;
import nx4.r2;
import nx4.u2;
import nx4.w1;

/* JADX INFO: loaded from: classes22.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DateTimeFormatter f220299a = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static final m0 a(dx4.e1 e1Var) {
        Object g0Var;
        r2.a.AbstractC1223a abstractC1223a;
        String str;
        String str2;
        Long lValueOf;
        String str3;
        String str4;
        String str5;
        x1 cVar;
        dx4.l lVar;
        Intrinsics.checkNotNullParameter(e1Var, "<this>");
        if (e1Var instanceof i4) {
            i4 i4Var = (i4) e1Var;
            String str6 = i4Var.f120628a;
            String str7 = i4Var.f120629b;
            String str8 = i4Var.f120630c;
            String str9 = i4Var.f120633j;
            g4 g4Var = i4Var.k;
            String strName = g4Var != null ? g4Var.name() : null;
            String str10 = i4Var.i;
            dx4.q qVar = i4Var.d;
            String strName2 = qVar != null ? qVar.name() : null;
            dx4.l lVar2 = i4Var.f120631g;
            n nVarA = lVar2 != null ? t.a(lVar2) : null;
            dx4.q qVar2 = i4Var.e;
            String strName3 = qVar2 != null ? qVar2.name() : null;
            dx4.d1 d1Var = i4Var.f;
            k0 k0VarH = d1Var != null ? a.a.H(d1Var) : null;
            dx4.l lVar3 = i4Var.f120632h;
            n nVarA2 = lVar3 != null ? t.a(lVar3) : null;
            String str11 = i4Var.f120634l;
            Boolean boolValueOf = Boolean.valueOf(i4Var.f120635m);
            String strName4 = i4Var.f120636n.name();
            b4 b4Var = i4Var.o;
            return new i2(str6, str7, str8, str9, strName, str10, strName2, nVarA, strName3, k0VarH, nVarA2, str11, boolValueOf, strName4, b4Var != null ? e(b4Var) : null);
        }
        if (e1Var instanceof l4) {
            l4 l4Var = (l4) e1Var;
            String str12 = l4Var.f120667a;
            String str13 = l4Var.f120668b;
            dx4.a1 a1Var = l4Var.f120669c;
            String strB = a1Var != null ? a1Var.b() : null;
            k4 k4Var = l4Var.d;
            String strName5 = k4Var != null ? k4Var.name() : null;
            j4 j4Var = l4Var.e;
            String strName6 = j4Var != null ? j4Var.name() : null;
            j4 j4Var2 = l4Var.f;
            return new j2(str12, str13, strB, strName5, strName6, j4Var2 != null ? j4Var2.name() : null);
        }
        if (e1Var instanceof f4) {
            f4 f4Var = (f4) e1Var;
            String str14 = f4Var.f120595a;
            String str15 = f4Var.f120596b;
            String strName7 = f4Var.f120597c.name();
            String str16 = f4Var.d;
            String str17 = f4Var.e;
            dx4.q qVar3 = f4Var.f;
            String strName8 = qVar3 != null ? qVar3.name() : null;
            dx4.l lVar4 = f4Var.f120598g;
            return new h2(str14, str15, strName7, str16, str17, strName8, lVar4 != null ? t.a(lVar4) : null);
        }
        if (e1Var instanceof dx4.g2) {
            dx4.g2 g2Var = (dx4.g2) e1Var;
            String str18 = g2Var.f120602a;
            String str19 = str18 == null ? "" : str18;
            String str20 = g2Var.f120603b;
            String str21 = g2Var.f120604c;
            List list = g2Var.d;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(a((dx4.e1) it8.next()));
            }
            dx4.q qVar4 = g2Var.e;
            String strName9 = qVar4 != null ? qVar4.name() : null;
            dx4.l lVar5 = g2Var.f;
            return new d1(str19, str20, str21, strName9, arrayList, lVar5 != null ? t.a(lVar5) : null);
        }
        if (e1Var instanceof h5) {
            h5 h5Var = (h5) e1Var;
            String str22 = h5Var.f120615a;
            String str23 = h5Var.f120616b;
            String str24 = h5Var.f120617c;
            Boolean boolValueOf2 = Boolean.valueOf(h5Var.f120618g);
            g5 g5Var = h5Var.f;
            String str25 = g5Var != null ? g5Var.f120608a : null;
            n nVarA3 = (g5Var == null || (lVar = g5Var.f120609b) == null) ? null : t.a(lVar);
            dx4.q qVar5 = h5Var.d;
            String strName10 = qVar5 != null ? qVar5.name() : null;
            dx4.l lVar6 = h5Var.e;
            return new w2(str22, str23, str24, boolValueOf2, str25, nVarA3, strName10, lVar6 != null ? t.a(lVar6) : null);
        }
        if (e1Var instanceof dx4.x1) {
            dx4.x1 x1Var = (dx4.x1) e1Var;
            return new y0(x1Var.f120827a, x1Var.f120828b, x1Var.f120829c);
        }
        if (e1Var instanceof dx4.i0) {
            dx4.i0 i0Var = (dx4.i0) e1Var;
            String str26 = i0Var.f120620a;
            String str27 = i0Var.f120621b;
            String str28 = i0Var.f120622c;
            String str29 = i0Var.d;
            dx4.h0 h0Var = i0Var.e;
            return new y(str26, str27, str28, str29, h0Var != null ? h0Var.name() : null);
        }
        if (e1Var instanceof e5) {
            e5 e5Var = (e5) e1Var;
            String str30 = e5Var.f120585a;
            String str31 = e5Var.f120586b;
            String str32 = e5Var.f120587c;
            d5 d5Var = e5Var.d;
            return new u2(str30, str31, str32, d5Var != null ? new u2.a(d5Var.f120577a, t.a(d5Var.f120578b)) : null);
        }
        if (e1Var instanceof dx4.l0) {
            dx4.l0 l0Var = (dx4.l0) e1Var;
            return new z(l0Var.f120655a, l0Var.f120656b, l0Var.f120657c, l0Var.d, l0Var.e, l0Var.f);
        }
        if (e1Var instanceof dx4.j2) {
            return new h1(((dx4.j2) e1Var).f120640a);
        }
        if (e1Var instanceof dx4.t0) {
            dx4.t0 t0Var = (dx4.t0) e1Var;
            String str33 = t0Var.f120770a;
            String str34 = t0Var.f120771b;
            Boolean boolValueOf3 = Boolean.valueOf(t0Var.f120772c);
            Boolean boolValueOf4 = Boolean.valueOf(t0Var.d);
            List<dx4.m1> list2 = t0Var.e;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
            for (dx4.m1 m1Var : list2) {
                arrayList2.add(new s0(m1Var.f120675a, t.a(m1Var.f120676b)));
            }
            return new d0(boolValueOf3, boolValueOf4, str33, str34, arrayList2);
        }
        if (e1Var instanceof dx4.b3) {
            dx4.b3 b3Var = (dx4.b3) e1Var;
            dx4.c1 c1Var = b3Var.f120557b;
            return new v1(c1Var != null ? f(c1Var) : null, b3Var.f120558c, b3Var.d);
        }
        if (e1Var instanceof p3) {
            p3 p3Var = (p3) e1Var;
            dx4.c1 c1Var2 = p3Var.f120712b;
            return new a2(c1Var2 != null ? f(c1Var2) : null, p3Var.f120713c, p3Var.e, p3Var.d, p3Var.f120714g, p3Var.f120715h, p3Var.i, p3Var.f);
        }
        if (e1Var instanceof n3) {
            n3 n3Var = (n3) e1Var;
            dx4.c1 c1Var3 = n3Var.f120686b;
            return new z1(c1Var3 != null ? f(c1Var3) : null, n3Var.f120687c, Boolean.valueOf(n3Var.f), n3Var.e, n3Var.d, n3Var.f120688g);
        }
        if (e1Var instanceof dx4.w1) {
            dx4.w1 w1Var = (dx4.w1) e1Var;
            String str35 = w1Var.f120809a;
            String str36 = w1Var.f120810b;
            String str37 = w1Var.f120811c;
            dx4.a1 a1Var2 = w1Var.d;
            String strB2 = a1Var2 != null ? a1Var2.b() : null;
            String str38 = strB2 == null ? "" : strB2;
            dx4.f0 f0Var = w1Var.e;
            String strName11 = f0Var != null ? f0Var.name() : null;
            boolean z = w1Var.f;
            boolean z3 = w1Var.f120812g;
            List<dx4.v1> list3 = w1Var.f120813h;
            ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
            for (dx4.v1 v1Var : list3) {
                arrayList3.add(new w0(v1Var.f120799a, v1Var.f120800b));
            }
            dx4.z2 z2Var = w1Var.i;
            return new x0(str35, str36, str37, str38, strName11, z, z3, arrayList3, z2Var != null ? t.c(z2Var) : null);
        }
        if (e1Var instanceof dx4.o) {
            dx4.o oVar = (dx4.o) e1Var;
            String str39 = oVar.f120694a;
            String str40 = oVar.f120695b;
            String str41 = oVar.f120696c;
            dx4.n nVar = oVar.f120698h;
            String strName12 = nVar != null ? nVar.name() : null;
            dx4.d1 d1Var2 = oVar.d;
            k0 k0VarH2 = d1Var2 != null ? a.a.H(d1Var2) : null;
            dx4.l lVar7 = oVar.e;
            n nVarA4 = lVar7 != null ? t.a(lVar7) : null;
            String str42 = oVar.f;
            dx4.c0 c0Var = oVar.f120697g;
            String strName13 = c0Var != null ? c0Var.name() : null;
            dx4.a1 a1Var3 = oVar.i;
            return new b(str39, str40, str41, strName12, k0VarH2, nVarA4, str42, strName13, a1Var3 != null ? f(a1Var3) : null);
        }
        if (e1Var instanceof dx4.r0) {
            dx4.r0 r0Var = (dx4.r0) e1Var;
            String str43 = r0Var.f120735a;
            String str44 = r0Var.f120736b;
            String str45 = r0Var.f120737c;
            dx4.a1 a1Var4 = r0Var.f;
            String strB3 = a1Var4 != null ? a1Var4.b() : null;
            List<dx4.q0> list4 = r0Var.e;
            ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
            for (dx4.q0 q0Var : list4) {
                arrayList4.add(new b0.a(q0Var.f120724a, q0Var.f120725b.name()));
            }
            dx4.l lVar8 = r0Var.f120739h;
            n nVarA5 = lVar8 != null ? t.a(lVar8) : null;
            dx4.n0 n0Var = r0Var.i;
            String strName14 = n0Var != null ? n0Var.name() : null;
            dx4.j1 j1Var = r0Var.f120738g;
            l0 l0VarI = j1Var != null ? a.a.I(j1Var) : null;
            b4 b4Var2 = r0Var.d;
            return new b0(str43, str44, str45, b4Var2 != null ? e(b4Var2) : null, strB3, arrayList4, nVarA5, strName14, l0VarI);
        }
        if (e1Var instanceof k3) {
            k3 k3Var = (k3) e1Var;
            String str46 = k3Var.f120651a;
            String str47 = k3Var.f120652b;
            String str48 = k3Var.f120653c;
            j3 j3Var = k3Var.d;
            if (j3Var instanceof dx4.d3) {
                dx4.d3 d3Var = (dx4.d3) j3Var;
                cVar = new w1.b(d3Var.f120574a, d3Var.f120575b, d3Var.f120576c, d3Var.d);
            } else if (j3Var instanceof i3) {
                i3 i3Var = (i3) j3Var;
                cVar = new w1.d(i3Var.f120626a, i3Var.f120627b);
            } else if (j3Var instanceof dx4.c3) {
                dx4.c3 c3Var = (dx4.c3) j3Var;
                LocalDate localDate = c3Var.f120565a;
                cVar = new w1.a(localDate != null ? localDate.format(f220299a) : null, c3Var.f120566b);
            } else {
                if (!(j3Var instanceof h3)) {
                    throw new NoWhenBranchMatchedException();
                }
                h3 h3Var = (h3) j3Var;
                String str49 = h3Var.f120613a;
                dx4.e3 e3Var = h3Var.f120614b;
                String str50 = e3Var.f120582a;
                ArrayList arrayList5 = e3Var.f120583b;
                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                Iterator it9 = arrayList5.iterator();
                while (it9.hasNext()) {
                    arrayList6.add(d((g3) it9.next()));
                }
                g3 g3Var = e3Var.f120584c;
                cVar = new w1.c(str49, new w1.c.a(str50, arrayList6, g3Var != null ? d(g3Var) : null));
            }
            return new w1(str46, str47, str48, cVar);
        }
        if (e1Var instanceof i5) {
            i5 i5Var = (i5) e1Var;
            return new x2(b(i5Var.f120637a), b(i5Var.f120638b));
        }
        if (e1Var instanceof j5) {
            j5 j5Var = (j5) e1Var;
            return new y2(c(j5Var.f120641a), c(j5Var.f120642b));
        }
        if (e1Var instanceof x5) {
            x5 x5Var = (x5) e1Var;
            return new e3(x5Var.f120843a, x5Var.f120844b);
        }
        if (e1Var instanceof x4) {
            x4 x4Var = (x4) e1Var;
            v4 v4Var = x4Var.f120837g;
            if (v4Var instanceof s4) {
                str2 = ((s4) v4Var).f120767a.f306286a;
                str3 = null;
                str4 = null;
                str = null;
                lValueOf = null;
                str5 = "MONEY";
            } else if (v4Var instanceof t4) {
                t4 t4Var = (t4) v4Var;
                String str51 = t4Var.f120779a.f306286a;
                lValueOf = Long.valueOf(t4Var.f120780b);
                str3 = null;
                str4 = null;
                str = null;
                str2 = str51;
                str5 = "MONEY_WITH_PERCENTAGE";
            } else {
                if (!(v4Var instanceof u4)) {
                    throw new NoWhenBranchMatchedException();
                }
                u4 u4Var = (u4) v4Var;
                String str52 = u4Var.f120791a;
                String str53 = u4Var.f120792b;
                str = u4Var.f120793c;
                str2 = null;
                lValueOf = null;
                str3 = str52;
                str4 = str53;
                str5 = "NUMBER";
            }
            String str54 = x4Var.f120834a;
            String str55 = x4Var.f120835b;
            long j2 = x4Var.f120836c;
            long j3 = x4Var.d;
            long j5 = x4Var.e;
            Integer numValueOf = Integer.valueOf(x4Var.f);
            Boolean boolValueOf5 = Boolean.valueOf(x4Var.f120838h);
            dx4.q qVar6 = x4Var.f120839j;
            String strName15 = qVar6 != null ? qVar6.name() : null;
            dx4.l lVar9 = x4Var.i;
            n nVarA6 = lVar9 != null ? t.a(lVar9) : null;
            dx4.q qVar7 = x4Var.f120840l;
            String strName16 = qVar7 != null ? qVar7.name() : null;
            dx4.l lVar10 = x4Var.k;
            return new p2(str54, str55, j2, j3, j5, numValueOf, str3, str4, str, boolValueOf5, strName15, nVarA6, strName16, lVar10 != null ? t.a(lVar10) : null, str5, str2, lValueOf, x4Var.f120841m, x4Var.f120842n, x4Var.o.name());
        }
        if (e1Var instanceof c5) {
            c5 c5Var = (c5) e1Var;
            String str56 = c5Var.f120569a;
            String str57 = c5Var.f120570b;
            dx4.q qVar8 = c5Var.f120571c;
            String strName17 = qVar8 != null ? qVar8.name() : null;
            dx4.l lVar11 = c5Var.d;
            n nVarA7 = lVar11 != null ? t.a(lVar11) : null;
            boolean z4 = c5Var.e;
            dx4.l lVar12 = c5Var.f;
            return new t2(str56, str57, strName17, nVarA7, z4, lVar12 != null ? t.a(lVar12) : null, c5Var.f120572g);
        }
        if (e1Var instanceof m4) {
            m4 m4Var = (m4) e1Var;
            return new k2(m4Var.f120680a, m4Var.f120681b, m4Var.f120682c, m4Var.e, m4Var.d);
        }
        if (e1Var instanceof dx4.r) {
            dx4.r rVar = (dx4.r) e1Var;
            String str58 = rVar.f120732a;
            String str59 = rVar.f120733b;
            String str60 = rVar.f120734c;
            dx4.d1 d1Var3 = rVar.d;
            return new v(str58, str59, str60, d1Var3 != null ? a.a.H(d1Var3) : null);
        }
        if (e1Var instanceof r4) {
            r4 r4Var = (r4) e1Var;
            return new n2(r4Var.f120752a, r4Var.f120753b, t.a(r4Var.f120754c));
        }
        if (e1Var instanceof p5) {
            p5 p5Var = (p5) e1Var;
            String str61 = p5Var.f120721a;
            String str62 = p5Var.f120722b;
            String str63 = p5Var.f120723c;
            ArrayList<o5> arrayList7 = p5Var.d;
            ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
            for (o5 o5Var : arrayList7) {
                String str64 = o5Var.f120702a;
                String str65 = o5Var.f120703b;
                dx4.a1 a1Var5 = o5Var.f120704c;
                String strB4 = a1Var5 != null ? a1Var5.b() : null;
                String str66 = o5Var.d;
                Long l2 = o5Var.e;
                boolean z6 = o5Var.f;
                dx4.l lVar13 = o5Var.f120705g;
                arrayList8.add(new b3.a(str64, str65, strB4, str66, l2, z6, lVar13 != null ? t.a(lVar13) : null));
            }
            return new b3(str61, str62, str63, arrayList8);
        }
        if (e1Var instanceof dx4.m) {
            dx4.m mVar = (dx4.m) e1Var;
            String str67 = mVar.f120670a;
            String str68 = mVar.f120671b;
            dx4.a1 a1Var6 = mVar.f120672c;
            return new a(str67, str68, a1Var6 != null ? a1Var6.b() : null, t.a(mVar.d));
        }
        if (e1Var instanceof s3) {
            s3 s3Var = (s3) e1Var;
            return new c2(s3Var.f120764a, s3Var.f120765b, s3Var.f120766c);
        }
        if (e1Var instanceof r3) {
            r3 r3Var = (r3) e1Var;
            String str69 = r3Var.f120748a;
            String str70 = r3Var.f120749b;
            String str71 = r3Var.f120750c;
            String str72 = r3Var.d;
            String str73 = r3Var.e;
            String str74 = r3Var.f;
            dx4.l lVar14 = r3Var.f120751g;
            return new b2(str69, str70, str71, str72, str73, str74, lVar14 != null ? t.a(lVar14) : null);
        }
        if (e1Var instanceof dx4.i2) {
            dx4.i2 i2Var = (dx4.i2) e1Var;
            return new g1(i2Var.f120623a, i2Var.f120624b, i2Var.f120625c.b(), i2Var.e.name(), t.a(i2Var.d));
        }
        if (e1Var instanceof w3) {
            return new d2(((w3) e1Var).f120817a);
        }
        if (e1Var instanceof dx4.a2) {
            dx4.a2 a2Var = (dx4.a2) e1Var;
            String str75 = a2Var.f120543a;
            String str76 = a2Var.f120544b;
            String strName18 = a2Var.f120545c.name();
            dx4.y1 y1Var = a2Var.d;
            String strName19 = y1Var != null ? y1Var.name() : null;
            List<dx4.m1> list5 = a2Var.e;
            ArrayList arrayList9 = new ArrayList(zhm.w.t(list5, 10));
            for (dx4.m1 m1Var2 : list5) {
                arrayList9.add(new s0(m1Var2.f120675a, t.a(m1Var2.f120676b)));
            }
            return new z0(str75, str76, strName18, strName19, arrayList9);
        }
        if (e1Var instanceof y4) {
            y4 y4Var = (y4) e1Var;
            return new q2(y4Var.f120854a, y4Var.f120855b, y4Var.f120856c, a.a.H(y4Var.d));
        }
        if (e1Var instanceof l3) {
            l3 l3Var = (l3) e1Var;
            return new y1(l3Var.f120664a, l3Var.f120665b, l3Var.f120666c, l3Var.d.b());
        }
        if (e1Var instanceof b5) {
            ArrayList<a5> arrayList10 = ((b5) e1Var).f120560a;
            ArrayList arrayList11 = new ArrayList(zhm.w.t(arrayList10, 10));
            for (a5 a5Var : arrayList10) {
                String str77 = a5Var.f120547a;
                String str78 = a5Var.f120548b;
                z4 z4Var = a5Var.f120549c;
                if (z4Var.equals(z4.c.f120869a)) {
                    abstractC1223a = r2.a.AbstractC1223a.c.f220334a;
                } else if (z4Var.equals(z4.a.f120867a)) {
                    abstractC1223a = r2.a.AbstractC1223a.C1224a.f220332a;
                } else {
                    if (!z4Var.equals(z4.b.f120868a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    abstractC1223a = r2.a.AbstractC1223a.b.f220333a;
                }
                dx4.l lVar15 = a5Var.d;
                arrayList11.add(new r2.a(str77, str78, abstractC1223a, lVar15 != null ? t.a(lVar15) : null));
            }
            return new r2(arrayList11);
        }
        if (e1Var instanceof x3) {
            x3 x3Var = (x3) e1Var;
            String str79 = x3Var.f120831a;
            String str80 = x3Var.f120832b;
            String str81 = x3Var.f120833c;
            String str82 = x3Var.d;
            boolean z11 = x3Var.e;
            List<dx4.m1> list6 = x3Var.f;
            ArrayList arrayList12 = new ArrayList(zhm.w.t(list6, 10));
            for (dx4.m1 m1Var3 : list6) {
                arrayList12.add(new s0(m1Var3.f120675a, t.a(m1Var3.f120676b)));
            }
            return new e2(str79, str80, str81, str82, arrayList12, z11);
        }
        if (e1Var instanceof dx4.l2) {
            dx4.l2 l2Var = (dx4.l2) e1Var;
            String str83 = l2Var.f120661a;
            String str84 = l2Var.f120662b;
            String str85 = l2Var.f120663c;
            String str86 = l2Var.d;
            dx4.d1 d1Var4 = l2Var.e;
            k0 k0VarH3 = d1Var4 != null ? a.a.H(d1Var4) : null;
            dx4.l lVar16 = l2Var.f;
            return new j1(str83, str84, str85, str86, lVar16 != null ? t.a(lVar16) : null, k0VarH3);
        }
        if (!(e1Var instanceof dx4.x0)) {
            if (!(e1Var instanceof dx4.s0)) {
                throw new NoWhenBranchMatchedException();
            }
            dx4.s0 s0Var = (dx4.s0) e1Var;
            return new c0(s0Var.f120759a, s0Var.f120761c, mo3.a.p(s0Var.f120760b));
        }
        dx4.x0 x0Var = (dx4.x0) e1Var;
        String str87 = x0Var.f120824a;
        String str88 = x0Var.f120825b;
        LinkedHashMap linkedHashMap = x0Var.f120826c;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zhm.q0.b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            dx4.w0 w0Var = (dx4.w0) entry.getValue();
            if (w0Var instanceof dx4.u0) {
                dx4.u0 u0Var = (dx4.u0) w0Var;
                String str89 = u0Var.f120781a;
                dx4.l lVar17 = u0Var.f120782b;
                g0Var = new f0(str89, lVar17 != null ? t.a(lVar17) : null);
            } else {
                if (!(w0Var instanceof dx4.v0)) {
                    throw new NoWhenBranchMatchedException();
                }
                dx4.v0 v0Var = (dx4.v0) w0Var;
                String str90 = v0Var.f120797a;
                dx4.l lVar18 = v0Var.f120798b;
                g0Var = new g0(str90, lVar18 != null ? t.a(lVar18) : null);
            }
            linkedHashMap2.put(key, g0Var);
        }
        return new i0(str87, str88, linkedHashMap2);
    }

    public static final q0 b(dx4.l1 l1Var) {
        String str = l1Var.f120658a;
        String str2 = l1Var.f120659b;
        String str3 = l1Var.f120660c;
        dx4.q qVar = l1Var.d;
        String strName = qVar != null ? qVar.name() : null;
        dx4.l lVar = l1Var.e;
        return new q0(str, str2, str3, strName, lVar != null ? t.a(lVar) : null);
    }

    public static final i1 c(dx4.k2 k2Var) {
        String str = k2Var.f120648a;
        String str2 = k2Var.f120649b;
        String str3 = k2Var.f120650c;
        k0 k0VarH = a.a.H(k2Var.d);
        dx4.l lVar = k2Var.e;
        return new i1(str, str2, str3, k0VarH, lVar != null ? t.a(lVar) : null, Boolean.valueOf(k2Var.f));
    }

    public static final w1.c.C1225c d(g3 g3Var) {
        String str = g3Var.f120605a;
        String str2 = g3Var.f120606b;
        String str3 = g3Var.f120607c;
        String str4 = g3Var.d;
        f3 f3Var = g3Var.e;
        return new w1.c.C1225c(str, str2, str3, str4, f3Var != null ? new w1.c.b(f3Var.f120592a, f3Var.f120593b, f3Var.f120594c) : null);
    }

    public static final g2 e(b4 b4Var) {
        Iterable<z3> iterable = (Iterable) b4Var.f120559a;
        ArrayList arrayList = new ArrayList(zhm.w.t(iterable, 10));
        for (z3 z3Var : iterable) {
            String str = z3Var.f120865a;
            a4 a4Var = z3Var.f120866b;
            g2.b bVar = null;
            if (a4Var != null) {
                y3 y3Var = a4Var.f120546a;
                bVar = new g2.b(y3Var != null ? y3Var.name() : null);
            }
            arrayList.add(new g2.a(str, bVar));
        }
        return new g2(arrayList);
    }

    public static final String f(dx4.c1 c1Var) {
        Intrinsics.checkNotNullParameter(c1Var, "<this>");
        if (c1Var instanceof dx4.a1) {
            return ((dx4.a1) c1Var).b();
        }
        if (c1Var instanceof dx4.k0) {
            return "BULLET_NUMBER_24";
        }
        if (c1Var instanceof k5) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
