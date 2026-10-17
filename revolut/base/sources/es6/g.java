package es6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f128874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f128875c;

    public g(String id10, b automaticAllocation, Float f) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(automaticAllocation, "automaticAllocation");
        this.f128873a = id10;
        this.f128874b = automaticAllocation;
        this.f128875c = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f128873a, gVar.f128873a) && this.f128874b == gVar.f128874b && Intrinsics.f(this.f128875c, gVar.f128875c);
    }

    public final int hashCode() {
        int iHashCode = (this.f128874b.hashCode() + (this.f128873a.hashCode() * 31)) * 31;
        Float f = this.f128875c;
        return iHashCode + (f == null ? 0 : f.hashCode());
    }
}
