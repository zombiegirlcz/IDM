package c8i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i0 {
    public static j8l.m a(long j2, xi0.b sourceCurrency, xi0.b targetCurrency, j8l.j jVar) {
        dj0.d dVar;
        dj0.d dVar2;
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        if (Intrinsics.f(sourceCurrency, targetCurrency) || jVar == null) {
            dVar = new dj0.d(j2, sourceCurrency);
            dVar2 = dVar;
            return new j8l.m(dVar, dVar2);
        }
        dVar = jVar.f172235a;
        dVar2 = jVar.f172236b;
        return new j8l.m(dVar, dVar2);
    }
}
