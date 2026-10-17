package qci;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f244793a;

    public d(Set transactionDestinations) {
        Intrinsics.checkNotNullParameter(transactionDestinations, "transactionDestinations");
        this.f244793a = transactionDestinations;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f244793a, ((d) obj2).f244793a);
    }

    public final int hashCode() {
        return this.f244793a.hashCode();
    }
}
