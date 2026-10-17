package lg4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ry3.a f195059a;

    public q(ry3.a photo) {
        Intrinsics.checkNotNullParameter(photo, "photo");
        this.f195059a = photo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f195059a, ((q) obj2).f195059a);
    }

    public final int hashCode() {
        return this.f195059a.f258207a.hashCode();
    }
}
