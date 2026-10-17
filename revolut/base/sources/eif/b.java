package eif;

import do3.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nif.y0;
import skm.p0;
import xhf.d1;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f126597b;

    public /* synthetic */ b(d dVar, int i) {
        this.f126596a = i;
        this.f126597b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f126596a) {
            case 0:
                d dVar = this.f126597b;
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                synchronized (dVar) {
                    try {
                        boolean z = transactions.size() < 100;
                        if (z && !transactions.isEmpty()) {
                            List list = transactions;
                            ArrayList arrayList = new ArrayList(w.t(list, 10));
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(((d1) it8.next()).getLegId());
                            }
                            Set setI1 = d0.i1(arrayList);
                            boolean zF = Intrinsics.f(setI1, dVar.f126603r);
                            dVar.f126603r.clear();
                            if (!zF) {
                                dVar.f126603r.addAll(setI1);
                            }
                            z = zF;
                        }
                        if (z) {
                            transactions = f0.f322471a;
                        }
                    } finally {
                    }
                    break;
                }
                return transactions;
            case 1:
                d dVar2 = this.f126597b;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Long l2 = (Long) pair.f186385a;
                List list2 = (List) pair.f186386b;
                if (list2.isEmpty()) {
                    return efm.d0.m(new Pair(l2, list2));
                }
                mif.j jVar = dVar2.f126599m;
                List list3 = list2;
                ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                Iterator it9 = list3.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(((y0) it9.next()).f216073a.f215798a);
                }
                return jVar.a(arrayList2).f(efm.d0.m(new Pair(l2, list2)));
            case 2:
                d dVar3 = this.f126597b;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                Pair pair3 = (Pair) pair2.f186385a;
                n nVar = (n) pair2.f186386b;
                Long l3 = (Long) pair3.f186385a;
                ArrayList arrayListA = dVar3.f126600n.a((List) pair3.f186386b, nVar.f116408a, null);
                return !arrayListA.isEmpty() ? tif.d.a(dVar3.f126598l, arrayListA).e(pd.b.n(p0.f264003c, new e8e.w(dVar3, arrayListA, null, 28))).f(efm.d0.m(new Pair(l3, arrayListA))) : efm.d0.m(new Pair(l3, arrayListA));
            default:
                d dVar4 = this.f126597b;
                Long l4 = (Long) ((Pair) obj2).f186385a;
                if (l4 != null) {
                    dVar4.o.f(dVar4.h(), l4.longValue());
                }
                return Unit.f186387a;
        }
    }
}
