package xnd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lzi.h f307400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lzi.j f307401b;

    public h(lzi.h cycle, lzi.j currentPeriod) {
        Intrinsics.checkNotNullParameter(cycle, "cycle");
        Intrinsics.checkNotNullParameter(currentPeriod, "currentPeriod");
        this.f307400a = cycle;
        this.f307401b = currentPeriod;
    }

    public static h a(h hVar, lzi.j currentPeriod) {
        lzi.h cycle = hVar.f307400a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(cycle, "cycle");
        Intrinsics.checkNotNullParameter(currentPeriod, "currentPeriod");
        return new h(cycle, currentPeriod);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f307400a, hVar.f307400a) && Intrinsics.f(this.f307401b, hVar.f307401b);
    }

    public final int hashCode() {
        return this.f307401b.hashCode() + (this.f307400a.hashCode() * 31);
    }
}
