package cl4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f {
    private f() {
    }

    public static g a(long j2, long j3, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        long j5 = j3 - j2;
        int iC = j2 != 0 ? rim.d.c(Math.min(100.0f, (j3 / j2) * 100)) : 100;
        boolean z = j5 > 0;
        xi0.b.Companion.getClass();
        return new g(z, j5, new dj0.d(j2, xi0.a.a(currency)), iC);
    }
}
