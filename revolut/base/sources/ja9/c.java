package ja9;

import aii.r;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f172467a;

    public c(Set kycConsents) {
        Intrinsics.checkNotNullParameter(kycConsents, "kycConsents");
        this.f172467a = kycConsents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f172467a, ((c) obj2).f172467a);
    }

    public final int hashCode() {
        return this.f172467a.hashCode();
    }
}
