package ma9;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f203964a;

    public d(Set phoneNumbers) {
        Intrinsics.checkNotNullParameter(phoneNumbers, "phoneNumbers");
        this.f203964a = phoneNumbers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f203964a, ((d) obj2).f203964a);
    }

    public final int hashCode() {
        return this.f203964a.hashCode();
    }
}
