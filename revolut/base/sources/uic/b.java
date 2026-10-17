package uic;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f280371b;

    public b(String merchantRef, String planTier) {
        Intrinsics.checkNotNullParameter(merchantRef, "merchantRef");
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        this.f280370a = merchantRef;
        this.f280371b = planTier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f280370a, bVar.f280370a) && Intrinsics.f(this.f280371b, bVar.f280371b);
    }

    public final int hashCode() {
        return this.f280371b.hashCode() + (this.f280370a.hashCode() * 31);
    }
}
