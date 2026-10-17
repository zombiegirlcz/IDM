package jpk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public abstract class c {
    public abstract long a(a aVar);

    public void b(a chart, ArrayList points) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(points, "points");
        long jA = a(chart);
        ArrayList arrayList = new ArrayList(w.t(points, 10));
        Iterator it8 = points.iterator();
        while (it8.hasNext()) {
            arrayList.add(b.a((b) it8.next(), jA));
        }
        c(arrayList);
    }

    public abstract void c(ArrayList arrayList);

    public abstract List d(String str, String str2);
}
