package nz8;

import com.revolut.feature.learn.shared.models.domain.LearnReward;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jz8.h0;
import jz8.k0;
import jz8.o0;
import jz8.p0;
import jz8.r;
import jz8.s;
import jz8.s0;
import jz8.t0;
import jz8.z0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import u09.a0;
import u09.b0;
import u09.c0;
import u09.d0;
import u09.e0;
import u09.f0;
import u09.i0;
import u09.q;
import u09.u;
import u09.y;
import wz8.n;
import wz8.p;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f220998a = q0.c(new Pair("US_LOCATION_POPUP", u.US_LOCATION_POPUP));

    public static final q a(t0 t0Var) {
        String str;
        String str2;
        d0 d0Var;
        ArrayList arrayList;
        f0 f0Var;
        e0 e0Var;
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        String str3 = t0Var.f179663a;
        String str4 = t0Var.f179664b;
        String str5 = t0Var.d;
        String str6 = t0Var.f179665c;
        List<r> list = t0Var.e;
        int i = 10;
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        for (r rVar : list) {
            Intrinsics.checkNotNullParameter(rVar, "<this>");
            String str7 = rVar.f179655a;
            List list2 = rVar.f179656b;
            ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList3.add(cp5.c.J((s) it8.next()));
            }
            arrayList2.add(new u09.a(str7, rVar.f179657c, rVar.d, arrayList3));
        }
        s0 s0Var = t0Var.f;
        if (s0Var != null) {
            Intrinsics.checkNotNullParameter(s0Var, "<this>");
            String str8 = s0Var.f179659a;
            List<h0> list3 = s0Var.f179660b;
            ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
            for (h0 h0Var : list3) {
                Intrinsics.checkNotNullParameter(h0Var, "<this>");
                String str9 = h0Var.f179620a;
                String str10 = h0Var.f179621b;
                c0 c0Var = h0Var.f179622c;
                List list4 = h0Var.d;
                String str11 = str3;
                String str12 = str4;
                ArrayList arrayList5 = new ArrayList(w.t(list4, i));
                for (Iterator it9 = list4.iterator(); it9.hasNext(); it9 = it9) {
                    k0 k0Var = (k0) it9.next();
                    Intrinsics.checkNotNullParameter(k0Var, "<this>");
                    arrayList5.add(new b0(k0Var.f179635a, k0Var.f179636b));
                }
                arrayList4.add(new a0(str9, str10, c0Var, arrayList5));
                str3 = str11;
                str4 = str12;
                i = 10;
            }
            str = str3;
            str2 = str4;
            p0 p0Var = s0Var.f179661c;
            if (p0Var != null) {
                Intrinsics.checkNotNullParameter(p0Var, "<this>");
                int i2 = h.f221002c[p0Var.f179652a.ordinal()];
                if (i2 == 1) {
                    e0Var = e0.VIDEO;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e0Var = e0.IMAGE;
                }
                f0Var = new f0(e0Var, p0Var.f179653b);
            } else {
                f0Var = null;
            }
            d0Var = new d0(str8, arrayList4, f0Var);
        } else {
            str = str3;
            str2 = str4;
            d0Var = null;
        }
        LearnReward learnRewardA = j.a(t0Var.f179666g);
        y yVar = t0Var.f179667h;
        String str13 = t0Var.i;
        int i3 = t0Var.f179669l;
        int i5 = t0Var.f179670m;
        i0 i0Var = t0Var.k;
        String str14 = t0Var.f179668j.f179611a;
        kotlin.jvm.internal.s sVar = str14 != null ? new u09.s(str14) : u09.r.f276154a;
        List list5 = t0Var.f179671n;
        if (list5 != null) {
            ArrayList arrayList6 = new ArrayList();
            Iterator it10 = list5.iterator();
            while (it10.hasNext()) {
                u uVar = (u) u1.v((String) it10.next(), f220998a);
                if (uVar != null) {
                    arrayList6.add(uVar);
                }
            }
            arrayList = arrayList6;
        } else {
            arrayList = null;
        }
        return new q(str, str2, str6, str5, arrayList2, d0Var, learnRewardA, yVar, str13, sVar, i0Var, i3, i5, arrayList);
    }

    public static final q b(uz8.i iVar) {
        String str;
        String str2;
        d0 d0Var;
        i0 i0Var;
        kotlin.jvm.internal.s sVar;
        ArrayList arrayList;
        f0 f0Var;
        e0 e0Var;
        c0 c0Var;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        String e = iVar.getE();
        String f284652n = iVar.getF284652n();
        String f284646c = iVar.getF284646c();
        String f284651m = iVar.getF284651m();
        List<vz8.c> f284645b = iVar.getF284645b();
        ArrayList arrayList2 = new ArrayList(w.t(f284645b, 10));
        for (vz8.c cVar : f284645b) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            String str3 = cVar.f293412c;
            List list = cVar.f293411b;
            ArrayList arrayList3 = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList3.add(cp5.c.K((vz8.e) it8.next()));
            }
            arrayList2.add(new u09.a(str3, cVar.d, cVar.f293410a, arrayList3));
        }
        wz8.h f284649j = iVar.getF284649j();
        int i = 1;
        if (f284649j != null) {
            Intrinsics.checkNotNullParameter(f284649j, "<this>");
            String str4 = f284649j.f301386b;
            List<n> list2 = f284649j.f301387c;
            ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
            for (n nVar : list2) {
                Intrinsics.checkNotNullParameter(nVar, "<this>");
                String str5 = nVar.f301392a;
                String str6 = nVar.d;
                p pVar = nVar.f301394c;
                Intrinsics.checkNotNullParameter(pVar, "<this>");
                int i2 = h.f221000a[pVar.ordinal()];
                if (i2 == i) {
                    c0Var = c0.SINGLE;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0Var = c0.MULTIPLE;
                }
                List list3 = nVar.f301393b;
                String str7 = e;
                String str8 = f284652n;
                ArrayList arrayList5 = new ArrayList(w.t(list3, 10));
                for (Iterator it9 = list3.iterator(); it9.hasNext(); it9 = it9) {
                    wz8.k kVar = (wz8.k) it9.next();
                    Intrinsics.checkNotNullParameter(kVar, "<this>");
                    arrayList5.add(new b0(kVar.f301389a, kVar.f301390b));
                }
                arrayList4.add(new a0(str5, str6, c0Var, arrayList5));
                e = str7;
                f284652n = str8;
                i = 1;
            }
            str = e;
            str2 = f284652n;
            wz8.e eVar = f284649j.f301385a;
            if (eVar != null) {
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                int i3 = h.f221001b[eVar.f301383b.ordinal()];
                if (i3 == 1) {
                    e0Var = e0.VIDEO;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e0Var = e0.IMAGE;
                }
                f0Var = new f0(e0Var, eVar.f301382a);
            } else {
                f0Var = null;
            }
            d0Var = new d0(str4, arrayList4, f0Var);
        } else {
            str = e;
            str2 = f284652n;
            d0Var = null;
        }
        LearnReward learnRewardB = j.b(iVar.getK());
        uz8.n i5 = iVar.getI();
        Intrinsics.checkNotNullParameter(i5, "<this>");
        y yVarC = c(i5.f284642c);
        String d = iVar.getD();
        int f = iVar.getF();
        int o = iVar.getO();
        uz8.r f284650l = iVar.getF284650l();
        Intrinsics.checkNotNullParameter(f284650l, "<this>");
        int i6 = e.f220997c[f284650l.ordinal()];
        if (i6 == 1) {
            i0Var = i0.UNINITIALIZED;
        } else if (i6 == 2) {
            i0Var = i0.PAYABLE;
        } else if (i6 == 3) {
            i0Var = i0.PENDING;
        } else if (i6 == 4) {
            i0Var = i0.PAID;
        } else {
            if (i6 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i0Var = i0.INCENTIVE_ENDED;
        }
        i0 i0Var2 = i0Var;
        if (iVar instanceof uz8.b) {
            sVar = u09.r.f276154a;
        } else {
            if (!(iVar instanceof uz8.u)) {
                throw new NoWhenBranchMatchedException();
            }
            sVar = new u09.s(((uz8.u) iVar).f284653p);
        }
        kotlin.jvm.internal.s sVar2 = sVar;
        List f284648h = iVar.getF284648h();
        if (f284648h != null) {
            List<uz8.k> list4 = f284648h;
            ArrayList arrayList6 = new ArrayList(w.t(list4, 10));
            for (uz8.k kVar2 : list4) {
                Intrinsics.checkNotNullParameter(kVar2, "<this>");
                if (e.e[kVar2.ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList6.add(u.US_LOCATION_POPUP);
            }
            arrayList = arrayList6;
        } else {
            arrayList = null;
        }
        return new q(str, str2, f284646c, f284651m, arrayList2, d0Var, learnRewardB, yVarC, d, sVar2, i0Var2, f, o, arrayList);
    }

    public static final y c(uz8.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        switch (e.f220996b[pVar.ordinal()]) {
            case 1:
                return y.NOT_STARTED;
            case 2:
                return y.CONTENT_STARTED;
            case 3:
                return y.CONTENT_FINISHED;
            case 4:
                return y.QUIZ_STARTED;
            case 5:
                return y.COMPLETED;
            case 6:
                return y.LOCKED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final t0 d(q qVar) {
        String str;
        String str2;
        s0 s0Var;
        ArrayList arrayList;
        jz8.e0 e0Var;
        ArrayList arrayList2;
        p0 p0Var;
        o0 o0Var;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        String str3 = qVar.f276145a;
        String str4 = qVar.f276146b;
        String str5 = qVar.f276147c;
        String str6 = qVar.d;
        List<u09.a> list = qVar.e;
        int i = 10;
        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
        for (u09.a aVar : list) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            String str7 = aVar.f276094a;
            ArrayList arrayList4 = aVar.f276095b;
            ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
            Iterator it8 = arrayList4.iterator();
            while (it8.hasNext()) {
                arrayList5.add(cp5.c.N((u09.e) it8.next()));
            }
            arrayList3.add(new r(str7, aVar.f276096c, aVar.d, arrayList5));
        }
        d0 d0Var = qVar.f;
        if (d0Var != null) {
            Intrinsics.checkNotNullParameter(d0Var, "<this>");
            String str8 = d0Var.f276106a;
            ArrayList<a0> arrayList6 = d0Var.f276107b;
            ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
            for (a0 a0Var : arrayList6) {
                Intrinsics.checkNotNullParameter(a0Var, "<this>");
                String str9 = a0Var.f276097a;
                String str10 = a0Var.f276098b;
                ArrayList arrayList8 = a0Var.d;
                String str11 = str3;
                String str12 = str4;
                ArrayList arrayList9 = new ArrayList(w.t(arrayList8, i));
                for (Iterator it9 = arrayList8.iterator(); it9.hasNext(); it9 = it9) {
                    b0 b0Var = (b0) it9.next();
                    Intrinsics.checkNotNullParameter(b0Var, "<this>");
                    arrayList9.add(new k0(b0Var.f276102a, b0Var.f276103b));
                }
                arrayList7.add(new h0(str9, str10, a0Var.f276099c, arrayList9));
                str3 = str11;
                str4 = str12;
                i = 10;
            }
            str = str3;
            str2 = str4;
            f0 f0Var = d0Var.f276108c;
            if (f0Var != null) {
                Intrinsics.checkNotNullParameter(f0Var, "<this>");
                int i2 = h.d[f0Var.f276120a.ordinal()];
                if (i2 == 1) {
                    o0Var = o0.VIDEO;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    o0Var = o0.IMAGE;
                }
                p0Var = new p0(o0Var, f0Var.f276121b);
            } else {
                p0Var = null;
            }
            s0Var = new s0(str8, arrayList7, p0Var);
        } else {
            str = str3;
            str2 = str4;
            s0Var = null;
        }
        z0 z0VarC = j.c(qVar.f276148g);
        y yVar = qVar.f276149h;
        String str13 = qVar.i;
        int i3 = qVar.f276151l;
        int i5 = qVar.f276152m;
        i0 i0Var = qVar.k;
        kotlin.jvm.internal.s sVar = qVar.f276150j;
        if (sVar instanceof u09.r) {
            arrayList = null;
            e0Var = new jz8.e0(null);
        } else {
            arrayList = null;
            if (!(sVar instanceof u09.s)) {
                throw new NoWhenBranchMatchedException();
            }
            e0Var = new jz8.e0(((u09.s) sVar).f276155a);
        }
        List list2 = qVar.f276153n;
        if (list2 != null) {
            ArrayList arrayList10 = new ArrayList();
            Iterator it10 = list2.iterator();
            while (it10.hasNext()) {
                String strH = u1.h((u) it10.next(), f220998a);
                if (strH != null) {
                    arrayList10.add(strH);
                }
            }
            arrayList2 = arrayList10;
        } else {
            arrayList2 = arrayList;
        }
        return new t0(str, str2, str5, str6, arrayList3, s0Var, z0VarC, yVar, str13, e0Var, i0Var, i3, i5, arrayList2);
    }
}
