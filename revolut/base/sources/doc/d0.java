package doc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final koc.g f116494a;

    public d0(koc.g point) {
        Intrinsics.checkNotNullParameter(point, "point");
        this.f116494a = point;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d0) && Intrinsics.f(this.f116494a, ((d0) obj2).f116494a);
    }

    public final int hashCode() {
        return this.f116494a.hashCode();
    }
}
