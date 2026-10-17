package urk;

import afl.a0;
import afl.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements rrk.d {
    @Override // rrk.d
    public final boolean a(afl.a stats) {
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(stats, "stats");
        boolean z = true;
        if (!(stats instanceof afl.q)) {
            if (stats instanceof a0) {
                u uVar = ((a0) stats).d;
                return (uVar.f4649a == null && uVar.f4650b == null && uVar.f4651c == null) ? false : true;
            }
            if (stats instanceof afl.f) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        afl.m mVar = ((afl.q) stats).f4629c;
        if (mVar != null) {
            if (mVar.f4614a == null && mVar.f4615b == null) {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        return pd.b.j(boolValueOf);
    }
}
