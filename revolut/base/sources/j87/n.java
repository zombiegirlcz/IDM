package j87;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a(String str, e eVar) {
        List list = eVar.f172137b;
        wi0.b bVar = eVar.d;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((wi0.b) it8.next()).f297794a);
        }
        List listU = d0.U(arrayList);
        return u.c(new fyl.a(new iyl.d(str, new hyl.m(hyl.l.HIGH, listU, eVar.f172138c, bVar != null ? bVar.f297794a : null, v.k(hyl.j.TOP, hyl.j.BOTTOM)), listU, eVar.f172138c, bVar != null ? bVar.f297794a : null)));
    }
}
