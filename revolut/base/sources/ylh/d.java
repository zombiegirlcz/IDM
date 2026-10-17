package ylh;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f314714a;

    public d(Set types) {
        Intrinsics.checkNotNullParameter(types, "types");
        this.f314714a = types;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f314714a, ((d) obj2).f314714a);
    }

    public final int hashCode() {
        return this.f314714a.hashCode();
    }
}
