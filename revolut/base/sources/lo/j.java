package lo;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class j {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static String a(g snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Locale locale = Locale.US;
        Integer numValueOf = Integer.valueOf(snapshot.f197323h);
        Double dValueOf = Double.valueOf(snapshot.f197319a / 1048576.0d);
        Double dValueOf2 = Double.valueOf(snapshot.f197320b / 1048576.0d);
        Long l2 = snapshot.f197321c;
        String strB = l2 != null ? b(l2.longValue()) : "n/a";
        Long l3 = snapshot.d;
        String strB2 = l3 != null ? b(l3.longValue()) : "n/a";
        String strValueOf = String.valueOf(snapshot.e.intValue());
        if (strValueOf == null) {
            strValueOf = "n/a";
        }
        return m72.b.t(new Object[]{numValueOf, dValueOf, dValueOf2, strB, strB2, strValueOf, Long.valueOf(snapshot.f), snapshot.f197322g.toString()}, 8, locale, "Heap used: %d%% (%.1f/%.1fMB), RSS: %s, VmSize: %s, threads: %s, uptime: %ds, updated: %s", "format(...)");
    }

    public static String b(long j2) {
        return m72.b.t(new Object[]{Double.valueOf(j2 / 1048576.0d)}, 1, Locale.US, "%.1fMB", "format(...)");
    }
}
