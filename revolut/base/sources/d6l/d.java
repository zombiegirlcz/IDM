package d6l;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f111630a;

    public d(Set states) {
        Intrinsics.checkNotNullParameter(states, "states");
        this.f111630a = states;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f111630a, ((d) obj2).f111630a);
    }

    public final int hashCode() {
        return this.f111630a.hashCode();
    }
}
