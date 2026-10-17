package f3e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f131963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f131964b;

    public d(c topLeft, c bottomRight) {
        Intrinsics.checkNotNullParameter(topLeft, "topLeft");
        Intrinsics.checkNotNullParameter(bottomRight, "bottomRight");
        this.f131963a = topLeft;
        this.f131964b = bottomRight;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f131963a, dVar.f131963a) && Intrinsics.f(this.f131964b, dVar.f131964b);
    }

    public final int hashCode() {
        return this.f131964b.hashCode() + (this.f131963a.hashCode() * 31);
    }
}
