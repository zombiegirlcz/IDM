package b7j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xi0.b f13055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f13056c;

    public /* synthetic */ d(Set set, xi0.b bVar) {
        this.f13054a = 0;
        this.f13056c = set;
        this.f13055b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Object next2;
        Object next3;
        switch (this.f13054a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                xi0.b bVar = (xi0.b) pair.f186385a;
                return Boolean.valueOf(this.f13056c.contains(bVar) || Intrinsics.f(bVar, this.f13055b));
            case 1:
                List list = (List) obj2;
                String str = this.f13055b.f306286a;
                Set<xi0.b> set = this.f13056c;
                ArrayList arrayList = new ArrayList(w.t(set, 10));
                for (xi0.b bVar2 : set) {
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (Intrinsics.f(((cw5.b) next).f109534a, bVar2.f306286a)) {
                            }
                        } else {
                            next = null;
                        }
                        break;
                    }
                    arrayList.add(new Pair(bVar2, next));
                }
                return new ge5.b(str, arrayList);
            case 2:
                List list2 = (List) obj2;
                String str2 = this.f13055b.f306286a;
                Set<xi0.b> set2 = this.f13056c;
                ArrayList arrayList2 = new ArrayList(w.t(set2, 10));
                for (xi0.b bVar3 : set2) {
                    Iterator it9 = list2.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next2 = it9.next();
                            if (Intrinsics.f(((cw5.b) next2).f109534a, bVar3.f306286a)) {
                            }
                        } else {
                            next2 = null;
                        }
                        break;
                    }
                    arrayList2.add(new Pair(bVar3, next2));
                }
                return new nw5.b(str2, arrayList2);
            default:
                List list3 = (List) obj2;
                String str3 = this.f13055b.f306286a;
                Set<xi0.b> set3 = this.f13056c;
                ArrayList arrayList3 = new ArrayList(w.t(set3, 10));
                for (xi0.b bVar4 : set3) {
                    Iterator it10 = list3.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            next3 = it10.next();
                            if (Intrinsics.f(((cw5.b) next3).f109534a, bVar4.f306286a)) {
                            }
                        } else {
                            next3 = null;
                        }
                        break;
                    }
                    arrayList3.add(new Pair(bVar4, next3));
                }
                return new x8b.b(str3, arrayList3);
        }
    }

    public /* synthetic */ d(xi0.b bVar, Set set, int i) {
        this.f13054a = i;
        this.f13055b = bVar;
        this.f13056c = set;
    }
}
