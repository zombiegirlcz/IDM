package gmd;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static long a(Long l2, long j2) {
        if (l2 == null || j2 == 0 || l2.longValue() == 0 || Math.abs(((j2 - l2.longValue()) / l2.longValue()) * 100) < 0.01f) {
            return 0L;
        }
        return j2 - l2.longValue();
    }
}
