package lg4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ry3.a f195050a;

    public h(ry3.a photo) {
        Intrinsics.checkNotNullParameter(photo, "photo");
        this.f195050a = photo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f195050a, ((h) obj2).f195050a);
    }

    public final int hashCode() {
        return this.f195050a.f258207a.hashCode();
    }
}
