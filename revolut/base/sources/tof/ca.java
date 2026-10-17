package tof;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class ca extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f272672a;

    public ca(Set legIds) {
        Intrinsics.checkNotNullParameter(legIds, "legIds");
        this.f272672a = legIds;
    }

    public final Set a() {
        return this.f272672a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ca) && Intrinsics.f(this.f272672a, ((ca) obj2).f272672a);
    }

    public final int hashCode() {
        return this.f272672a.hashCode();
    }
}
