package fnk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f136702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f136703b;

    public h(g originalPlan, g givenPlan) {
        Intrinsics.checkNotNullParameter(originalPlan, "originalPlan");
        Intrinsics.checkNotNullParameter(givenPlan, "givenPlan");
        this.f136702a = originalPlan;
        this.f136703b = givenPlan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f136702a, hVar.f136702a) && Intrinsics.f(this.f136703b, hVar.f136703b);
    }

    public final int hashCode() {
        return this.f136703b.hashCode() + (this.f136702a.hashCode() * 31);
    }
}
