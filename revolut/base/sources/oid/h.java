package oid;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225638a;

    public h(String brandId) {
        Intrinsics.checkNotNullParameter(brandId, "brandId");
        Intrinsics.checkNotNullParameter("GiftCardsCheckout", "source");
        this.f225638a = brandId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f225638a, ((h) obj2).f225638a);
    }

    public final int hashCode() {
        return (this.f225638a.hashCode() * 31) + 355596889;
    }
}
