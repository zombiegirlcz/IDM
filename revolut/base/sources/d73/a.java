package d73;

import cr9.v;
import h93.f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f111775b;

    public /* synthetic */ a(List list, int i) {
        this.f111774a = i;
        this.f111775b = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f111774a) {
            case 0:
                List<f0> list = this.f111775b;
                boolean z = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (f0 f0Var : list) {
                        if (f0Var.b0() || f0Var.d0()) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                List<f0> list2 = this.f111775b;
                boolean z3 = false;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (f0 f0Var2 : list2) {
                        if (f0Var2.b0() || f0Var2.d0()) {
                            z3 = true;
                        }
                    }
                }
                return Boolean.valueOf(z3);
            case 2:
                List list3 = this.f111775b;
                Intrinsics.checkNotNullParameter(list3, "<this>");
                List list4 = list3;
                ArrayList arrayList = new ArrayList(w.t(list4, 10));
                Iterator it8 = list4.iterator();
                while (it8.hasNext()) {
                    arrayList.add(yoj.b.E((v) it8.next()));
                }
                return arrayList;
            case 3:
                List list5 = this.f111775b;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list5) {
                    if (((kv9.h) obj2).getType() == kv9.j.REACTIONS) {
                        arrayList2.add(obj2);
                    } else {
                        arrayList3.add(obj2);
                    }
                }
                return new Pair(arrayList2, arrayList3);
            default:
                List<d71.m> list6 = this.f111775b;
                Intrinsics.h(list6);
                ArrayList arrayList4 = new ArrayList();
                for (d71.m mVar : list6) {
                    d71.a aVar = mVar instanceof d71.a ? (d71.a) mVar : null;
                    if (aVar != null) {
                        arrayList4.add(aVar);
                    }
                }
                return (d71.a) d0.d0(arrayList4);
        }
    }
}
