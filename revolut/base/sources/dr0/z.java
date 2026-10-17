package dr0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fp0.i f117071a;

    public z(fp0.i surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        this.f117071a = surface;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f117071a, ((z) obj2).f117071a);
    }

    public final int hashCode() {
        return this.f117071a.hashCode();
    }
}
