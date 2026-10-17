package n4d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class s {
    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract void d(String str, String str2, String str3, String str4);

    public abstract List e();

    public abstract List f(String str, ArrayList arrayList);

    public abstract List g();

    public List h(ArrayList typeKeys) {
        Intrinsics.checkNotNullParameter(typeKeys, "typeKeys");
        List<o4d.e> listG = g();
        ArrayList arrayList = new ArrayList(zhm.w.t(listG, 10));
        for (o4d.e eVar : listG) {
            arrayList.add(new o4d.f(eVar, f(eVar.f222201a, typeKeys)));
        }
        return arrayList;
    }

    public abstract void i(List list);

    public abstract void j(List list);

    public abstract void k(o4d.e eVar);

    public abstract void l(String str, String str2, String str3, String str4);

    public void m(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Iterator it8 = items.iterator();
        while (it8.hasNext()) {
            o4d.d dVar = (o4d.d) it8.next();
            String str = dVar.f;
            String str2 = dVar.f222198a;
            String str3 = dVar.d;
            String str4 = dVar.f222200c;
            String str5 = dVar.f222199b;
            if (Intrinsics.f(str, "ADD")) {
                l(str5, str4, str3, str2);
            } else if (Intrinsics.f(str, "REMOVE")) {
                d(str5, str4, str3, str2);
            }
        }
    }

    public void n(ArrayList watchlists) {
        Intrinsics.checkNotNullParameter(watchlists, "watchlists");
        b();
        a();
        Iterator it8 = watchlists.iterator();
        while (it8.hasNext()) {
            o4d.f fVar = (o4d.f) it8.next();
            k(fVar.f222204a);
            i(fVar.f222205b);
        }
        c();
    }
}
