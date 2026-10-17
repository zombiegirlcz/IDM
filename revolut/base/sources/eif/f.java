package eif;

import efm.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nif.y0;
import pfm.m;
import skm.p0;
import tof.q6;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f126608b;

    public /* synthetic */ f(k kVar, int i) {
        this.f126607a = i;
        this.f126608b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f126607a) {
            case 0:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f126608b.j(it8);
            case 1:
                Pair timeTransactions = (Pair) obj2;
                Intrinsics.checkNotNullParameter(timeTransactions, "timeTransactions");
                Long l2 = (Long) timeTransactions.f186385a;
                List list = (List) timeTransactions.f186386b;
                if (list.isEmpty()) {
                    return d0.m(new Pair(l2, list));
                }
                k kVar = this.f126608b;
                return tif.d.a(kVar.f126617a, list).e(pd.b.n(p0.f264003c, new j(kVar, list, null, 0))).f(d0.m(new Pair(l2, list)));
            case 2:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Long l3 = (Long) pair.f186385a;
                List list2 = (List) pair.f186386b;
                if (list2.isEmpty()) {
                    return d0.m(new Pair(l3, list2));
                }
                mif.j jVar = this.f126608b.f126618b;
                List list3 = list2;
                ArrayList arrayList = new ArrayList(w.t(list3, 10));
                Iterator it9 = list3.iterator();
                while (it9.hasNext()) {
                    arrayList.add(((y0) it9.next()).f216073a.f215798a);
                }
                return jVar.a(arrayList).f(d0.m(new Pair(l3, list2)));
            case 3:
                List it10 = (List) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                k kVar2 = this.f126608b;
                return kVar2.c(kVar2.h().o1(), kVar2.h().getPocketId(), it10);
            case 4:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list4 = (List) pair2.f186386b;
                k kVar3 = this.f126608b;
                if (!Intrinsics.f(kVar3.d.b(kVar3.h()), Boolean.TRUE) || list4.isEmpty()) {
                    return m.f235744a;
                }
                List list5 = list4;
                ArrayList arrayList2 = new ArrayList(w.t(list5, 10));
                Iterator it11 = list5.iterator();
                while (it11.hasNext()) {
                    arrayList2.add(((y0) it11.next()).f216073a.f215800b);
                }
                return pd.b.n(p0.f264003c, new e8e.w(kVar3, zhm.d0.i1(arrayList2), null, 29));
            case 5:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return this.f126608b.j(it12);
            case 6:
                y0 y0Var = (y0) zhm.d0.o0((List) ((Pair) obj2).f186386b);
                this.f126608b.l(y0Var != null ? Long.valueOf(y0Var.f216073a.f215805g) : null);
                return Unit.f186387a;
            case 7:
                List it13 = (List) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return this.f126608b.j(it13);
            case 8:
                Long l4 = (Long) ((Pair) obj2).f186385a;
                if (l4 != null) {
                    k kVar4 = this.f126608b;
                    kVar4.d.f(kVar4.h(), l4.longValue());
                }
                return Unit.f186387a;
            case 9:
                i params = (i) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                k kVar5 = this.f126608b;
                d0 d0VarA = kVar5.g().a(params.f126613a, params.f126614b);
                h hVar = new h(new f(kVar5, 0), 1);
                d0VarA.getClass();
                int i = 0;
                ufm.i iVar = new ufm.i(new ufm.f(new ufm.i(d0VarA, hVar, 0).g(new h(new c(1, kVar5, k.class, "clearUpdatedTransactionsCache", "clearUpdatedTransactionsCache(Lio/reactivex/Single;)Lio/reactivex/Single;", i, 5), 8)).g(new h(new c(1, kVar5, k.class, "saveTransactions", "saveTransactions(Lio/reactivex/Single;)Lio/reactivex/Single;", i, 6), 14)), new h(new f(kVar5, 10), 15), 3), new h(new efb.i(26), 16), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            case 10:
                k kVar6 = this.f126608b;
                tif.b bVar = kVar6.d;
                Pair pair3 = (Pair) obj2;
                Long l5 = (Long) pair3.f186385a;
                List list6 = (List) pair3.f186386b;
                if (l5 != null) {
                    bVar.f(kVar6.h(), l5.longValue());
                }
                y0 y0Var2 = (y0) zhm.d0.d0(list6);
                Long lValueOf = y0Var2 != null ? Long.valueOf(y0Var2.f216073a.f) : null;
                if (lValueOf != null) {
                    q6 transactionScope = kVar6.h();
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(transactionScope, "transactionScope");
                    if (((mif.g) bVar.f271493a).a(bVar.d(transactionScope)) == null) {
                        bVar.g(kVar6.h(), lValueOf.longValue());
                    }
                }
                return Unit.f186387a;
            default:
                x71.c timeData = (x71.c) obj2;
                Intrinsics.checkNotNullParameter(timeData, "timeData");
                x71.f fVar = (x71.f) timeData.f303137a;
                k kVar7 = this.f126608b;
                if (fVar != null) {
                    return kVar7.f(fVar);
                }
                d0 d0VarD = kVar7.d();
                d0VarD.getClass();
                return new pfm.h(d0VarD, 4);
        }
    }
}
