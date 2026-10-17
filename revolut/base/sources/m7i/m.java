package m7i;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m {
    public static h7i.j a(i input) {
        Intrinsics.checkNotNullParameter(input, "input");
        c7i.f fVar = input.e;
        long j2 = input.f203411c;
        int i = l.f203415a[fVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (j2 != 0) {
                return null;
            }
        } else if (j2 != 0 && input.d != 0) {
            return null;
        }
        return h7i.j.f149893a;
    }
}
