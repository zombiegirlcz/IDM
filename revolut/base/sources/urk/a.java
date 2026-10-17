package urk;

import afl.a0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements rrk.d {
    @Override // rrk.d
    public final boolean a(afl.a stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        Boolean boolValueOf = null;
        if ((stats instanceof a0 ? (a0) stats : null) != null) {
            afl.r rVar = ((a0) stats).f;
            boolValueOf = Boolean.valueOf((rVar.f4633a == null && rVar.f4634b == null && rVar.f4635c == null) ? false : true);
        }
        return pd.b.j(boolValueOf);
    }
}
