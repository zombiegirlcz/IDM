package mtj;

import d0j.h0;
import d0j.x;
import d9.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ntj.a1;
import ntj.d1;
import ntj.g1;
import ntj.j1;
import ntj.k1;
import ntj.r;
import ntj.w0;
import ntj.w1;
import wp5.y;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ q v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(q qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.v, continuation, 0);
            case 1:
                return new m(this.v, continuation, 1);
            default:
                return new m(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        x xVar;
        int i = this.u;
        String str = "<this>";
        q qVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return y.t(Boolean.TYPE, qVar.d, "CHALLENGES_ELIGIBILITY_STORAGE_KEY");
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k1 k1Var = (k1) y.t(k1.class, qVar.d, "REWARDS_HUB_STORAGE_KEY");
                if (k1Var == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(k1Var, "<this>");
                List<a1> list = k1Var.f219084a;
                int i2 = 10;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (a1 a1Var : list) {
                    String str2 = a1Var.f219045a;
                    String str3 = a1Var.f219046b;
                    w0 w0Var = a1Var.f219047c;
                    arrayList.add(new d0j.b(str2, str3, new d0j.a(w0Var.f219136a, w0Var.f219137b)));
                }
                int i3 = k1Var.f219085b;
                int i5 = k1Var.f219086c;
                List list2 = k1Var.d;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(e1.U((r) it8.next()));
                }
                List<d1> list3 = k1Var.e;
                ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                for (d1 d1Var : list3) {
                    arrayList3.add(new d0j.c(d1Var.f219054a, d1Var.f219055b, d1Var.f219056c, d1Var.d));
                }
                List list4 = k1Var.f;
                ArrayList arrayList4 = new ArrayList(w.t(list4, 10));
                Iterator it9 = list4.iterator();
                while (it9.hasNext()) {
                    g1 g1Var = (g1) it9.next();
                    Intrinsics.checkNotNullParameter(g1Var, str);
                    String str4 = g1Var.f219069a;
                    String str5 = g1Var.f219070b;
                    String str6 = g1Var.f219071c;
                    String str7 = g1Var.d;
                    String str8 = g1Var.e;
                    List list5 = g1Var.f;
                    Iterator it10 = it9;
                    ArrayList arrayList5 = new ArrayList(w.t(list5, i2));
                    Iterator it11 = list5.iterator();
                    while (it11.hasNext()) {
                        j1 j1Var = (j1) it11.next();
                        String str9 = j1Var.f219079a;
                        Iterator it12 = it11;
                        String str10 = j1Var.f219080b;
                        String str11 = j1Var.f219081c;
                        String str12 = str8;
                        x[] xVarArrValues = x.values();
                        String str13 = str;
                        int length = xVarArrValues.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 < length) {
                                xVar = xVarArrValues[i6];
                                int i21 = i6;
                                int i22 = length;
                                if (!a0.z(xVar.name(), str11, true)) {
                                    i6 = i21 + 1;
                                    length = i22;
                                }
                            } else {
                                xVar = null;
                            }
                        }
                        if (xVar == null) {
                            xVar = x.UNKNOWN;
                        }
                        arrayList5.add(new d0j.e(str9, str10, xVar));
                        it11 = it12;
                        str8 = str12;
                        str = str13;
                    }
                    arrayList4.add(new d0j.d(str4, str5, str6, str7, str8, arrayList5));
                    it9 = it10;
                    i2 = 10;
                }
                return new d0j.f(arrayList, i3, i5, arrayList2, arrayList3, arrayList4);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w1 w1Var = (w1) y.t(w1.class, qVar.d, "UNACKNOWLEDGED_CHALLENGES_STORAGE_KEY");
                if (w1Var == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(w1Var, "<this>");
                return new h0(w1Var.f219138a);
        }
    }
}
