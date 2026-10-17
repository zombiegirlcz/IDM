package vj5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f289648b;

    public b(String currency, String depositAddress) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(depositAddress, "depositAddress");
        this.f289647a = currency;
        this.f289648b = depositAddress;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f289647a, bVar.f289647a) && Intrinsics.f(this.f289648b, bVar.f289648b);
    }

    public final int hashCode() {
        return this.f289648b.hashCode() + (this.f289647a.hashCode() * 31);
    }
}
