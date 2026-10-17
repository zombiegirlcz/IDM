package c18;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public void a(ArrayList feed) {
        Intrinsics.checkNotNullParameter(feed, "feed");
        b(Instant.now().minusSeconds(518400L).toEpochMilli());
        g(feed);
    }

    public abstract void b(long j2);

    public abstract List c(int i, Instant instant, ArrayList arrayList, boolean z);

    public abstract List d(int i, String str, Instant instant);

    public abstract void e(ArrayList arrayList);

    public abstract void f(ArrayList arrayList);

    public void g(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        f(items);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = items.iterator();
        while (it8.hasNext()) {
            e18.e eVar = (e18.e) it8.next();
            List list = eVar.f121915g;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                arrayList2.add(new e18.c(eVar.f121912a, (e18.b) it9.next()));
            }
            a0.x(arrayList2, arrayList);
        }
        e(arrayList);
    }
}
