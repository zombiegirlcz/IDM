package hp9;

import ap9.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {
    public static e a(cp9.a splitType, long j2) {
        Intrinsics.checkNotNullParameter(splitType, "splitType");
        int i = b.f154516a[splitType.ordinal()];
        if (i == 1) {
            return new a(j2);
        }
        if (i == 2) {
            return new a(100L);
        }
        if (i == 3) {
            return d.f154517a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
