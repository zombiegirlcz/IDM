package or2;

import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1i.t;
import qr2.l;
import ufm.i;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f228041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f228042b;

    public /* synthetic */ c(g gVar, int i) {
        this.f228041a = i;
        this.f228042b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f228041a) {
            case 0:
                kr2.e it8 = (kr2.e) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                g gVar = this.f228042b;
                gVar.getClass();
                return v7.x(new ufm.f(new i(new ufm.c(new t(gVar, it8, 20), 2), new oq3.f(26, new c(gVar, 1)), 1), new oq3.f(27, new c(gVar, 2)), 3), "ignoreElement(...)");
            case 1:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                List<rr2.a> list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                for (rr2.a aVar : list2) {
                    a aVar2 = this.f228042b.d;
                    arrayList.add(a.b(aVar));
                }
                return arrayList;
            case 2:
                List list3 = (List) obj2;
                w4l.f fVar = this.f228042b.f;
                Unit unit = Unit.f186387a;
                Intrinsics.h(list3);
                fVar.k(unit, list3);
                return unit;
            case 3:
                String key = (String) obj2;
                Intrinsics.checkNotNullParameter(key, "key");
                return (Long) this.f228042b.f228048a.get(key);
            case 4:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return (List) this.f228042b.f228048a.get("BLOCKED_MERCHANTS_LIST_CACHE_KEY");
            case 5:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                List listA = this.f228042b.a();
                if (listA == null) {
                    return null;
                }
                List list4 = listA;
                ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                Iterator it9 = list4.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(a.b((rr2.a) it9.next()));
                }
                return arrayList2;
            case 6:
                this.f228042b.e.b("blocked_merchants_list_ttl");
                return Unit.f186387a;
            default:
                l it10 = (l) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                a aVar3 = this.f228042b.d;
                return a.a(it10);
        }
    }
}
