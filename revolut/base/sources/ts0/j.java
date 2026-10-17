package ts0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f273875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f273876b;

    public j(i style, g geometry) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        this.f273875a = style;
        this.f273876b = geometry;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f273875a == jVar.f273875a && Intrinsics.f(this.f273876b, jVar.f273876b);
    }

    public final int hashCode() {
        return this.f273876b.hashCode() + (this.f273875a.hashCode() * 31);
    }
}
