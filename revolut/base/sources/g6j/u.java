package g6j;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class u {
    private u() {
    }

    public static void a(String source, qta.d dVar) {
        Pair pair;
        Intrinsics.checkNotNullParameter(source, "source");
        if (dVar != null) {
            List list = dVar.e;
            if (!list.isEmpty()) {
                try {
                    pair = new Pair(String.valueOf(d0.d0(list)), String.valueOf(d0.o0(list)));
                } catch (Throwable unused) {
                    pair = new Pair(null, null);
                }
                String str = (String) pair.f186385a;
                String str2 = (String) pair.f186386b;
                int size = list.size();
                String str3 = dVar.f249052b.f306286a;
                String str4 = dVar.f249053c.f306286a;
                qta.f fVar = dVar.d;
                StringBuilder sb6 = new StringBuilder();
                sb6.append(source);
                sb6.append(", size=");
                sb6.append(size);
                sb6.append(", ");
                sb6.append(str3);
                sb6.append("/");
                sb6.append(str4);
                sb6.append(", ");
                sb6.append(fVar);
                IllegalStateException illegalStateException = new IllegalStateException(j6.a.w(sb6, ", ", str, ", ", str2));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return;
            }
        }
        IllegalStateException illegalStateException2 = new IllegalStateException(source.concat(", no chart data"));
        h0 h0Var2 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
    }
}
