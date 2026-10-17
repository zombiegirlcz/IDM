package mtj;

import com.revolut.retail.feature.impl.rewards_hub.network.RewardsHubService;
import d0j.a0;
import d0j.b0;
import d0j.c0;
import d0j.d0;
import d0j.e0;
import d0j.r;
import d0j.s;
import d0j.t;
import d0j.u;
import d0j.v;
import d0j.w;
import d0j.x;
import d0j.y;
import d0j.z;
import d9.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import ttj.f2;
import ttj.g0;
import ttj.j0;
import ttj.m0;
import ttj.p0;
import ttj.q1;
import ttj.s0;
import ttj.t1;
import ttj.v0;
import ttj.w1;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ String f208885w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f208886x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(q qVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f208886x = qVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        String str = (String) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                n nVar = new n(this.f208886x, continuation, 0);
                nVar.f208885w = str;
                return nVar.invokeSuspend(Unit.f186387a);
            case 1:
                n nVar2 = new n(this.f208886x, continuation, 1);
                nVar2.f208885w = str;
                return nVar2.invokeSuspend(Unit.f186387a);
            default:
                n nVar3 = new n(this.f208886x, continuation, 2);
                nVar3.f208885w = str;
                return nVar3.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object collection;
        b0 b0Var;
        a0 a0Var;
        x xVar;
        t tVar;
        w wVar;
        String str;
        boolean z;
        y yVar;
        z zVar;
        Object eligibilityCriteria;
        Object rewardsHubWidget;
        switch (this.u) {
            case 0:
                String str2 = this.f208885w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    RewardsHubService rewardsHubService = this.f208886x.f208893a;
                    this.f208885w = null;
                    this.v = 1;
                    collection = rewardsHubService.getCollection(str2, this);
                    if (collection == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    collection = obj2;
                }
                m0 m0Var = (m0) collection;
                String str3 = "<this>";
                Intrinsics.checkNotNullParameter(m0Var, "<this>");
                String str4 = m0Var.f274369a;
                String str5 = m0Var.f274370b;
                b0[] b0VarArrValues = b0.values();
                int length = b0VarArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        b0Var = b0VarArrValues[i2];
                        if (!kotlin.text.a0.z(b0Var.name(), str5, true)) {
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
                String str6 = m0Var.f274371c;
                a0[] a0VarArrValues = a0.values();
                int length2 = a0VarArrValues.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length2) {
                        a0Var = a0VarArrValues[i3];
                        if (!kotlin.text.a0.z(a0Var.name(), str6, true)) {
                            i3++;
                        }
                    } else {
                        a0Var = null;
                    }
                }
                if (a0Var == null) {
                    a0Var = a0.UNKNOWN;
                }
                String str7 = m0Var.d;
                String str8 = m0Var.e;
                j0 j0Var = m0Var.f;
                Intrinsics.checkNotNullParameter(j0Var, "<this>");
                a0 a0Var2 = a0Var;
                u uVar = new u(j0Var.f274355a, j0Var.f274356b);
                List list = m0Var.f274372g;
                Intrinsics.checkNotNullParameter(list, "<this>");
                List list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    s0 s0Var = (s0) it8.next();
                    Intrinsics.checkNotNullParameter(s0Var, str3);
                    String str9 = s0Var.f274398a;
                    String str10 = s0Var.f274399b;
                    String str11 = s0Var.f274400c;
                    int i5 = s0Var.d;
                    String str12 = s0Var.e;
                    x[] xVarArrValues = x.values();
                    Iterator it9 = it8;
                    int length3 = xVarArrValues.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length3) {
                            xVar = xVarArrValues[i6];
                            int i21 = i6;
                            int i22 = length3;
                            if (!kotlin.text.a0.z(xVar.name(), str12, true)) {
                                i6 = i21 + 1;
                                length3 = i22;
                            }
                        } else {
                            xVar = null;
                        }
                    }
                    if (xVar == null) {
                        xVar = x.UNKNOWN;
                    }
                    x xVar2 = xVar;
                    g0 g0Var = s0Var.f;
                    Intrinsics.checkNotNullParameter(g0Var, str3);
                    String str13 = g0Var.f274343a;
                    t[] tVarArrValues = t.values();
                    int length4 = tVarArrValues.length;
                    int i32 = 0;
                    while (true) {
                        if (i32 < length4) {
                            tVar = tVarArrValues[i32];
                            int i33 = length4;
                            int i43 = i32;
                            if (!kotlin.text.a0.z(tVar.name(), str13, true)) {
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
                    s sVar = new s(tVar, g0Var.f274344b);
                    String str14 = s0Var.f274401g;
                    String str15 = s0Var.f274402h;
                    p0 p0Var = s0Var.i;
                    Intrinsics.checkNotNullParameter(p0Var, str3);
                    w wVar2 = new w(p0Var.f274392a, p0Var.f274393b);
                    v0 v0Var = s0Var.f274403j;
                    if (v0Var != null) {
                        Intrinsics.checkNotNullParameter(v0Var, str3);
                        String str16 = v0Var.f274418a;
                        z[] zVarArrValues = z.values();
                        wVar = wVar2;
                        int length5 = zVarArrValues.length;
                        str = str3;
                        int i59 = 0;
                        while (true) {
                            if (i59 < length5) {
                                zVar = zVarArrValues[i59];
                                int i66 = length5;
                                int i74 = i59;
                                z = true;
                                if (!kotlin.text.a0.z(zVar.name(), str16, true)) {
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
                        yVar = new y(zVar, v0Var.f274419b);
                    } else {
                        wVar = wVar2;
                        str = str3;
                        z = true;
                        yVar = null;
                    }
                    arrayList.add(new v(str9, str10, str11, i5, xVar2, sVar, str14, str15, wVar, yVar));
                    it8 = it9;
                    str3 = str;
                }
                return new r(str4, b0Var2, a0Var2, str7, str8, uVar, arrayList);
            case 1:
                String str17 = this.f208885w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    RewardsHubService rewardsHubService2 = this.f208886x.f208893a;
                    this.f208885w = null;
                    this.v = 1;
                    eligibilityCriteria = rewardsHubService2.getEligibilityCriteria(str17, this);
                    if (eligibilityCriteria == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    eligibilityCriteria = obj2;
                }
                t1 t1Var = (t1) eligibilityCriteria;
                Intrinsics.checkNotNullParameter(t1Var, "<this>");
                String str18 = t1Var.f274407a;
                String str19 = t1Var.f274408b;
                List<w1> list3 = t1Var.f274409c;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                for (w1 w1Var : list3) {
                    String str20 = w1Var.f274422a;
                    List list4 = w1Var.f274423b;
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                    Iterator it10 = list4.iterator();
                    while (it10.hasNext()) {
                        arrayList3.add(new d0(((q1) it10.next()).f274395a));
                    }
                    arrayList2.add(new e0(str20, arrayList3));
                }
                return new c0(str18, str19, t1Var.d, arrayList2);
            default:
                String str21 = this.f208885w;
                Object arrayList4 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    RewardsHubService rewardsHubService3 = this.f208886x.f208893a;
                    this.f208885w = null;
                    this.v = 1;
                    rewardsHubWidget = rewardsHubService3.getRewardsHubWidget(str21, this);
                    if (rewardsHubWidget != arrayList4) {
                    }
                    return arrayList4;
                }
                if (i96 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                rewardsHubWidget = obj2;
                f2 f2Var = (f2) rewardsHubWidget;
                Intrinsics.checkNotNullParameter(f2Var, "<this>");
                List list5 = f2Var.f274341a;
                arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                Iterator it11 = list5.iterator();
                while (it11.hasNext()) {
                    arrayList4.add(e1.V((ttj.u) it11.next()));
                }
                return arrayList4;
        }
    }
}
