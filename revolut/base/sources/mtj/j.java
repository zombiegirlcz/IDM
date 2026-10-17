package mtj;

import com.revolut.retail.feature.api.rewards_hub.model.RewardsHubChallengeDetailsParams;
import d0j.a0;
import d0j.b0;
import d0j.c0;
import d0j.e0;
import d0j.r;
import d0j.s;
import d0j.t;
import d0j.u;
import d0j.v;
import d0j.y;
import d0j.z;
import d9.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ntj.d0;
import ntj.g0;
import ntj.j0;
import ntj.m0;
import ntj.p0;
import ntj.s0;
import ntj.t1;
import ntj.x;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f208881w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(q qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f208881w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f208881w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            case 1:
                j jVar2 = new j(this.f208881w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
            case 2:
                j jVar3 = new j(this.f208881w, continuation, 2);
                jVar3.v = obj2;
                return jVar3;
            case 3:
                j jVar4 = new j(this.f208881w, continuation, 3);
                jVar4.v = obj2;
                return jVar4;
            default:
                j jVar5 = new j(this.f208881w, continuation, 4);
                jVar5.v = obj2;
                return jVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        x xVar;
        b0 b0Var;
        a0 a0Var;
        d0j.x xVar2;
        t tVar;
        String str;
        String str2;
        boolean z;
        y yVar;
        z zVar;
        int i = this.u;
        String str3 = "<this>";
        q qVar = this.f208881w;
        switch (i) {
            case 0:
                RewardsHubChallengeDetailsParams rewardsHubChallengeDetailsParams = (RewardsHubChallengeDetailsParams) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ntj.l lVar = (ntj.l) wp5.y.t(ntj.l.class, qVar.d, q.b(rewardsHubChallengeDetailsParams));
                if (lVar != null) {
                    return z92.f.A(lVar);
                }
                return null;
            case 1:
                d0j.l lVar2 = (d0j.l) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (lVar2.f110420b != null || (xVar = (x) wp5.y.t(x.class, qVar.d, q.d(lVar2.f110419a))) == null) {
                    return null;
                }
                return do3.q.C(xVar);
            case 2:
                String str4 = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g0 g0Var = (g0) wp5.y.t(g0.class, qVar.d, j6.a.q("COLLECTION_STORAGE_KEY_", str4));
                if (g0Var == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(g0Var, "<this>");
                String str5 = g0Var.f219064a;
                String str6 = g0Var.f219065b;
                b0[] b0VarArrValues = b0.values();
                int length = b0VarArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        b0Var = b0VarArrValues[i2];
                        if (!kotlin.text.a0.z(b0Var.name(), str6, true)) {
                            i2++;
                        }
                    } else {
                        b0Var = null;
                    }
                }
                if (b0Var == null) {
                    b0Var = b0.UNKNOWN;
                }
                b0 b0Var2 = b0Var;
                String str7 = g0Var.f219066c;
                a0[] a0VarArrValues = a0.values();
                int length2 = a0VarArrValues.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length2) {
                        a0Var = a0VarArrValues[i3];
                        if (!kotlin.text.a0.z(a0Var.name(), str7, true)) {
                            i3++;
                        }
                    } else {
                        a0Var = null;
                    }
                }
                if (a0Var == null) {
                    a0Var = a0.UNKNOWN;
                }
                a0 a0Var2 = a0Var;
                String str8 = g0Var.d;
                String str9 = g0Var.e;
                d0 d0Var = g0Var.f;
                Intrinsics.checkNotNullParameter(d0Var, "<this>");
                u uVar = new u(d0Var.f219052a, d0Var.f219053b);
                List list = g0Var.f219067g;
                Intrinsics.checkNotNullParameter(list, "<this>");
                List list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    m0 m0Var = (m0) it8.next();
                    Intrinsics.checkNotNullParameter(m0Var, str3);
                    String str10 = m0Var.f219098a;
                    String str11 = m0Var.f219099b;
                    String str12 = m0Var.f219100c;
                    int i5 = m0Var.d;
                    String str13 = m0Var.e;
                    Iterator it9 = it8;
                    d0j.x[] xVarArrValues = d0j.x.values();
                    int length3 = xVarArrValues.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length3) {
                            xVar2 = xVarArrValues[i6];
                            int i21 = i6;
                            int i22 = length3;
                            if (!kotlin.text.a0.z(xVar2.name(), str13, true)) {
                                i6 = i21 + 1;
                                length3 = i22;
                            }
                        } else {
                            xVar2 = null;
                        }
                    }
                    if (xVar2 == null) {
                        xVar2 = d0j.x.UNKNOWN;
                    }
                    d0j.x xVar3 = xVar2;
                    ntj.a0 a0Var3 = m0Var.f;
                    Intrinsics.checkNotNullParameter(a0Var3, str3);
                    String str14 = a0Var3.f219043a;
                    t[] tVarArrValues = t.values();
                    int length4 = tVarArrValues.length;
                    String str15 = str5;
                    int i32 = 0;
                    while (true) {
                        if (i32 < length4) {
                            tVar = tVarArrValues[i32];
                            int i33 = length4;
                            int i43 = i32;
                            if (!kotlin.text.a0.z(tVar.name(), str14, true)) {
                                i32 = i43 + 1;
                                length4 = i33;
                            }
                        } else {
                            tVar = null;
                        }
                    }
                    if (tVar == null) {
                        tVar = t.UNKNOWN;
                    }
                    s sVar = new s(tVar, a0Var3.f219044b);
                    String str16 = m0Var.f219101g;
                    String str17 = m0Var.f219102h;
                    j0 j0Var = m0Var.i;
                    Intrinsics.checkNotNullParameter(j0Var, str3);
                    d0j.w wVar = new d0j.w(j0Var.f219077a, j0Var.f219078b);
                    p0 p0Var = m0Var.f219103j;
                    if (p0Var != null) {
                        Intrinsics.checkNotNullParameter(p0Var, str3);
                        String str18 = p0Var.f219109a;
                        z[] zVarArrValues = z.values();
                        str = str3;
                        int length5 = zVarArrValues.length;
                        str2 = str17;
                        int i59 = 0;
                        while (true) {
                            if (i59 < length5) {
                                zVar = zVarArrValues[i59];
                                int i66 = length5;
                                int i74 = i59;
                                z = true;
                                if (!kotlin.text.a0.z(zVar.name(), str18, true)) {
                                    i59 = i74 + 1;
                                    length5 = i66;
                                }
                            } else {
                                z = true;
                                zVar = null;
                            }
                        }
                        if (zVar == null) {
                            zVar = z.UNKNOWN;
                        }
                        yVar = new y(zVar, p0Var.f219110b);
                    } else {
                        str = str3;
                        str2 = str17;
                        z = true;
                        yVar = null;
                    }
                    arrayList.add(new v(str10, str11, str12, i5, xVar3, sVar, str16, str2, wVar, yVar));
                    it8 = it9;
                    str5 = str15;
                    str3 = str;
                }
                return new r(str5, b0Var2, a0Var2, str8, str9, uVar, arrayList);
            case 3:
                String str19 = (String) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s0 s0Var = (s0) wp5.y.t(s0.class, qVar.d, q.e(str19));
                if (s0Var == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(s0Var, "<this>");
                String str20 = s0Var.f219123a;
                String str21 = s0Var.f219124b;
                List<ntj.f> list3 = s0Var.f219125c;
                ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                for (ntj.f fVar : list3) {
                    Intrinsics.checkNotNullParameter(fVar, "<this>");
                    String str22 = fVar.f219060a;
                    List<ntj.c> list4 = fVar.f219061b;
                    ArrayList arrayList3 = new ArrayList(w.t(list4, 10));
                    for (ntj.c cVar : list4) {
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        arrayList3.add(new d0j.d0(cVar.f219050a));
                    }
                    arrayList2.add(new e0(str22, arrayList3));
                }
                return new c0(str20, str21, s0Var.d, arrayList2);
            default:
                String str23 = (String) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t1 t1Var = (t1) wp5.y.t(t1.class, qVar.d, j6.a.q("REWARDS_HUB_WIDGET_STORAGE_KEY_", str23));
                if (t1Var == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(t1Var, "<this>");
                List list5 = t1Var.f219128a;
                ArrayList arrayList4 = new ArrayList(w.t(list5, 10));
                Iterator it10 = list5.iterator();
                while (it10.hasNext()) {
                    arrayList4.add(e1.U((ntj.r) it10.next()));
                }
                return arrayList4;
        }
    }
}
