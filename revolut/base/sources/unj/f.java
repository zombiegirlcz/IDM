package unj;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static long a(long j2) {
        if (j2 <= 0) {
            return 0L;
        }
        return j2 / 60;
    }
}
