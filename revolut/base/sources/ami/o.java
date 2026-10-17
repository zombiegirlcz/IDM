package ami;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q06.j f6459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q06.k f6460b;

    public o(q06.j route, q06.k resolver) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        this.f6459a = route;
        this.f6460b = resolver;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f6459a, oVar.f6459a) && Intrinsics.f(this.f6460b, oVar.f6460b);
    }

    public final int hashCode() {
        return this.f6460b.hashCode() + (this.f6459a.hashCode() * 31);
    }
}
