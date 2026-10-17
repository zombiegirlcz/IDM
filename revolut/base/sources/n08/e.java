package n08;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zw7.d0 f210899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f210900b;

    public e(zw7.d0 pet, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(pet, "pet");
        this.f210899a = pet;
        this.f210900b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f210899a, eVar.f210899a) && Intrinsics.f(this.f210900b, eVar.f210900b);
    }

    public final int hashCode() {
        int iHashCode = this.f210899a.hashCode() * 31;
        dj0.d dVar = this.f210900b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
