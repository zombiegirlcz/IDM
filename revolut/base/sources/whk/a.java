package whk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static double a(hha.g originalBilling, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(originalBilling, "originalBilling");
        if (dVar == null) {
            return 100.0d;
        }
        long j2 = dVar.f115082a;
        long j3 = originalBilling.f152308c.f115082a;
        if (j3 == 0) {
            return 0.0d;
        }
        return Math.floor(((j3 - j2) / j3) * 100.0d);
    }
}
