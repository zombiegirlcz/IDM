package zp0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f324119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f324120b;

    public h(g gVar, g gVar2) {
        Intrinsics.checkNotNullParameter(gVar2, "new");
        this.f324119a = gVar;
        this.f324120b = gVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f324119a, hVar.f324119a) && Intrinsics.f(this.f324120b, hVar.f324120b);
    }

    public final int hashCode() {
        g gVar = this.f324119a;
        return this.f324120b.hashCode() + ((gVar == null ? 0 : gVar.hashCode()) * 31);
    }
}
