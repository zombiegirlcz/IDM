package vrb;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f291549a;

    public d(Set holdings) {
        Intrinsics.checkNotNullParameter(holdings, "holdings");
        this.f291549a = holdings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f291549a, ((d) obj2).f291549a);
    }

    public final int hashCode() {
        return this.f291549a.hashCode();
    }
}
