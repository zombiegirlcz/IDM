package urk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements rrk.d {
    @Override // rrk.d
    public final boolean a(afl.a stats) {
        afl.j jVar;
        Intrinsics.checkNotNullParameter(stats, "stats");
        afl.q qVar = stats instanceof afl.q ? (afl.q) stats : null;
        if (qVar == null || (jVar = qVar.d) == null) {
            return false;
        }
        return (jVar.f4604a == null && jVar.f4605b == null) ? false : true;
    }
}
