package vj5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f289655b;

    public f(String currency, String depositAddress) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(depositAddress, "depositAddress");
        this.f289654a = currency;
        this.f289655b = depositAddress;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f289654a, fVar.f289654a) && Intrinsics.f(this.f289655b, fVar.f289655b);
    }

    public final int hashCode() {
        return this.f289655b.hashCode() + (this.f289654a.hashCode() * 31);
    }
}
