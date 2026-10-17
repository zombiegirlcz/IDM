package ne2;

import aii.r;
import com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SwishRegistrationStatus f214405a;

    public b(SwishRegistrationStatus registrationStatus) {
        Intrinsics.checkNotNullParameter(registrationStatus, "registrationStatus");
        this.f214405a = registrationStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f214405a, ((b) obj2).f214405a);
    }

    public final int hashCode() {
        return this.f214405a.hashCode();
    }
}
