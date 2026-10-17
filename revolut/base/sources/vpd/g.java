package vpd;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f291165a;

    public g(Set selectedIds) {
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        this.f291165a = selectedIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f291165a, ((g) obj2).f291165a);
    }

    public final int hashCode() {
        return this.f291165a.hashCode();
    }
}
