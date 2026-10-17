package urk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements rrk.d {
    @Override // rrk.d
    public final boolean a(afl.a stats) {
        afl.k kVar;
        Intrinsics.checkNotNullParameter(stats, "stats");
        afl.q qVar = stats instanceof afl.q ? (afl.q) stats : null;
        if (qVar == null || (kVar = qVar.e) == null) {
            return false;
        }
        return (kVar.f4607a == null && kVar.f4608b == null) ? false : true;
    }
}
