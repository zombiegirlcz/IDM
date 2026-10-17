package sd9;

import aii.e;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f261835a;

    public b(Set kycConsents) {
        Intrinsics.checkNotNullParameter(kycConsents, "kycConsents");
        this.f261835a = kycConsents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f261835a, ((b) obj2).f261835a);
    }

    public final int hashCode() {
        return this.f261835a.hashCode();
    }
}
