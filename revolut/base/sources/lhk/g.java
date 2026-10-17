package lhk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.i f195341b;

    public g(String planId, hha.i billing) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(billing, "billing");
        this.f195340a = planId;
        this.f195341b = billing;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f195340a, gVar.f195340a) && this.f195341b == gVar.f195341b;
    }

    public final int hashCode() {
        return this.f195341b.hashCode() + (this.f195340a.hashCode() * 31);
    }
}
