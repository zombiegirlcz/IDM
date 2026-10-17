package ke2;

import com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SwishRegistrationStatus.NotRegistered f182956a;

    public d(SwishRegistrationStatus.NotRegistered status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f182956a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f182956a, ((d) obj2).f182956a);
    }

    public final int hashCode() {
        return this.f182956a.hashCode();
    }
}
