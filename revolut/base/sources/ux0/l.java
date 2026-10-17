package ux0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tx0.q f283780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f283781b;

    public l(tx0.r parcel, tx0.q pagerIndicatorType) {
        Intrinsics.checkNotNullParameter(pagerIndicatorType, "pagerIndicatorType");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f283780a = pagerIndicatorType;
        this.f283781b = parcel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f283780a, lVar.f283780a) && Intrinsics.f(this.f283781b, lVar.f283781b);
    }

    public final int hashCode() {
        return this.f283781b.hashCode() + (this.f283780a.hashCode() * 31);
    }
}
