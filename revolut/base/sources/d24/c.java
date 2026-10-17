package d24;

import d24.b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class c {
    public static b a(fz3.b domain) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        ArrayList arrayList = domain.f139082a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(new b.a(((fz3.a) it8.next()).f139081a));
        }
        return new b(arrayList2);
    }
}
