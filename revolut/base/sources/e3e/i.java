package e3e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3e.d f122258a;

    public i(f3e.d boundaries) {
        Intrinsics.checkNotNullParameter(boundaries, "boundaries");
        this.f122258a = boundaries;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f122258a, ((i) obj2).f122258a);
    }

    public final int hashCode() {
        return this.f122258a.hashCode();
    }
}
