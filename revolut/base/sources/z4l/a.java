package z4l;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import koi.k;
import kotlin.jvm.internal.Intrinsics;
import to7.l;
import zhm.d0;
import zhm.k0;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private a() {
    }

    public static void a(List delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        List<k> list = delegates;
        for (k kVar : list) {
            Map mapA = k0.a(new l(list, 1));
            if (!mapA.isEmpty()) {
                Iterator it8 = mapA.entrySet().iterator();
                while (true) {
                    if (it8.hasNext()) {
                        if (((Number) ((Map.Entry) it8.next()).getValue()).intValue() > 1) {
                            new IllegalArgumentException(j6.a.q("Duplicate delegates detected:\n", d0.k0(mapA.entrySet(), "\n", null, null, 0, new z1i.l(26), 30)));
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
