package cxe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f109949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f109950b;

    public k(dj0.d customAmount, dj0.d orderAmount) {
        Intrinsics.checkNotNullParameter(customAmount, "customAmount");
        Intrinsics.checkNotNullParameter(orderAmount, "orderAmount");
        this.f109949a = customAmount;
        this.f109950b = orderAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f109949a, kVar.f109949a) && Intrinsics.f(this.f109950b, kVar.f109950b);
    }

    public final int hashCode() {
        return this.f109950b.hashCode() + (this.f109949a.hashCode() * 31);
    }
}
