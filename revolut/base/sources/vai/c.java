package vai;

import kotlin.jvm.internal.Intrinsics;
import l80.e;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2 f287301a;

    public c(e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f287301a = q.c(0L);
    }

    public final boolean a() {
        long jLongValue = ((Number) this.f287301a.getValue()).longValue() - System.currentTimeMillis();
        if (jLongValue < 0) {
            jLongValue = 0;
        }
        return jLongValue > 0;
    }
}
