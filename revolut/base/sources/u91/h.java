package u91;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f278354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h91.a f278355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f278356c;

    public h(g progress, h91.a entryPoint, a aVar) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.f278354a = progress;
        this.f278355b = entryPoint;
        this.f278356c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f278354a == hVar.f278354a && Intrinsics.f(this.f278355b, hVar.f278355b) && Intrinsics.f(this.f278356c, hVar.f278356c);
    }

    public final int hashCode() {
        int iHashCode = (this.f278355b.hashCode() + (this.f278354a.hashCode() * 31)) * 31;
        a aVar = this.f278356c;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
