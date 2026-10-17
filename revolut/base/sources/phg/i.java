package phg;

import aii.r;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f236305a;

    public i(Set selected) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f236305a = selected;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f236305a, ((i) obj2).f236305a);
    }

    public final int hashCode() {
        return this.f236305a.hashCode();
    }
}
