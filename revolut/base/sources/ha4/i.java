package ha4;

import aii.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f150443a;

    public i(List sourceValues) {
        Intrinsics.checkNotNullParameter(sourceValues, "sourceValues");
        this.f150443a = sourceValues;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f150443a, ((i) obj2).f150443a);
    }

    public final int hashCode() {
        return this.f150443a.hashCode();
    }
}
