package vdl;

import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f287943w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d0 f287944x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(d0 d0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f287944x = d0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c0 c0Var = new c0(this.f287944x, continuation, 0);
                c0Var.f287943w = obj2;
                return c0Var;
            default:
                c0 c0Var2 = new c0(this.f287944x, continuation, 1);
                c0Var2.f287943w = obj2;
                return c0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c0) create((Set) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objPerformSuspending;
        oel.k jVar;
        Object objPerformSuspending2;
        switch (this.u) {
            case 0:
                String str = (String) this.f287943w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    dcl.n0 n0Var = this.f287944x.f287952b;
                    this.f287943w = null;
                    this.v = 1;
                    objPerformSuspending = DBUtil.performSuspending(n0Var.f113041a, true, false, new dc4.g(n0Var, str, 29), this);
                    if (objPerformSuspending == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objPerformSuspending = obj2;
                }
                hcl.l1 l1Var = (hcl.l1) objPerformSuspending;
                if (l1Var == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(l1Var, "<this>");
                hcl.h1 h1Var = l1Var.i;
                String str2 = h1Var.f151002a;
                List<hcl.e1> list = h1Var.f151003b;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (hcl.e1 e1Var : list) {
                    arrayList.add(new oel.d(e1Var.f150976a, e1Var.f150977b, e1Var.f150978c));
                }
                oel.e eVar = new oel.e(str2, arrayList);
                hcl.b1 b1Var = l1Var.f151060j;
                String str3 = b1Var.f150933a;
                List<hcl.w1> list2 = b1Var.f150934b;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                for (hcl.w1 w1Var : list2) {
                    arrayList2.add(new oel.m(w1Var.f151201a, w1Var.f151202b));
                }
                List<hcl.p1> list3 = b1Var.f150935c;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                for (hcl.p1 p1Var : list3) {
                    arrayList3.add(new oel.f(p1Var.f151105a, p1Var.f151106b, p1Var.f151107c, p1Var.d));
                }
                oel.c cVar = new oel.c(arrayList2, arrayList3, str3);
                List<hcl.t1> list4 = l1Var.k;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                for (hcl.t1 t1Var : list4) {
                    hcl.s1 s1Var = t1Var.f151160a;
                    String str4 = t1Var.f151162c;
                    String str5 = t1Var.f151161b;
                    int i2 = ucl.a.f279054a[s1Var.ordinal()];
                    if (i2 == 1) {
                        Iterable iterable = t1Var.d;
                        if (iterable == null) {
                            iterable = zhm.f0.f322471a;
                        }
                        Iterable<hcl.k1> iterable2 = iterable;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(iterable2, 10));
                        for (hcl.k1 k1Var : iterable2) {
                            arrayList5.add(new oel.i(k1Var.f151043a, k1Var.f151044b, k1Var.f151045c));
                        }
                        jVar = new oel.j(str5, str4, arrayList5);
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Iterable iterable3 = t1Var.e;
                        if (iterable3 == null) {
                            iterable3 = zhm.f0.f322471a;
                        }
                        Iterable<hcl.y0> iterable4 = iterable3;
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(iterable4, 10));
                        for (hcl.y0 y0Var : iterable4) {
                            arrayList6.add(new oel.g(y0Var.f151227b, y0Var.f151228c, y0Var.f151226a));
                        }
                        jVar = new oel.h(str5, str4, arrayList6);
                    }
                    arrayList4.add(jVar);
                }
                Instant instant = l1Var.f151056b;
                afl.t0 t0Var = new afl.t0(hx7.a.v(l1Var.f), hx7.a.v(l1Var.f151058g));
                boolean z = l1Var.f151059h;
                String str6 = l1Var.d;
                String str7 = l1Var.e;
                Instant instant2 = l1Var.f151057c;
                Instant instant3 = l1Var.f151061l;
                hcl.v0 v0Var = l1Var.f151062m;
                oel.b bVar = v0Var != null ? new oel.b(hx7.a.v(v0Var.f151188b), v0Var.f151187a) : null;
                hcl.v0 v0Var2 = l1Var.f151063n;
                return new oel.a(eVar, cVar, arrayList4, instant, t0Var, z, str6, str7, instant2, instant3, bVar, v0Var2 != null ? new oel.b(hx7.a.v(v0Var2.f151188b), v0Var2.f151187a) : null);
            default:
                Set set = (Set) this.f287943w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    dcl.o0 o0Var = this.f287944x.f287953c;
                    this.f287943w = set;
                    this.v = 1;
                    o0Var.getClass();
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("SELECT * FROM ipo_instrument_summary WHERE ref IN (");
                    StringUtil.appendPlaceholders(sb6, set.size());
                    sb6.append(")");
                    objPerformSuspending2 = DBUtil.performSuspending(o0Var.f113044a, true, false, new d27.g0(o0Var, 16, sb6.toString(), set), this);
                    if (objPerformSuspending2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objPerformSuspending2 = obj2;
                }
                Iterable<hcl.m1> iterable5 = (Iterable) objPerformSuspending2;
                int iB = zhm.q0.b(zhm.w.t(iterable5, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (hcl.m1 m1Var : iterable5) {
                    String str8 = m1Var.f151073a;
                    Intrinsics.checkNotNullParameter(m1Var, "<this>");
                    linkedHashMap.put(str8, new oel.l(new afl.t0(hx7.a.v(m1Var.f), hx7.a.v(m1Var.f151076g)), m1Var.f151074b, m1Var.e, m1Var.f151075c, m1Var.d, m1Var.f151077h));
                }
                if (linkedHashMap.size() == set.size()) {
                    return linkedHashMap;
                }
                return null;
        }
    }
}
