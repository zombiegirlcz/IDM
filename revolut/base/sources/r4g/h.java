package r4g;

import aii.r;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f251455a;

    public h(Set selected) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f251455a = selected;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f251455a, ((h) obj2).f251455a);
    }

    public final int hashCode() {
        return this.f251455a.hashCode();
    }
}
