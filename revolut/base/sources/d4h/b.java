package d4h;

import hdh.c;
import hdh.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import x2h.b;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public final x2h.b a(e actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        List list = actions.f151437a;
        ArrayList<c> arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof c) {
                arrayList.add(obj2);
            }
        }
        Lazy lazyY0 = w.y0(new a(list, 0));
        if (arrayList.isEmpty()) {
            return !((List) lazyY0.getValue()).isEmpty() ? b.a.f302572a : b.C1676b.f302573a;
        }
        c cVar = (c) d0.b0(arrayList);
        x2h.a aVar = new x2h.a(cVar.f151435b, cVar.f151436c);
        for (c cVar2 : arrayList) {
            boolean z = true;
            boolean z3 = aVar.f302570a || cVar2.f151435b;
            if (!aVar.f302571b && !cVar2.f151436c) {
                z = false;
            }
            aVar = new x2h.a(z3, z);
        }
        return aVar;
    }
}
