package bfi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15007c;

    public b(String ratesId, String bedOptionId, String occupancy) {
        Intrinsics.checkNotNullParameter(ratesId, "ratesId");
        Intrinsics.checkNotNullParameter(bedOptionId, "bedOptionId");
        Intrinsics.checkNotNullParameter(occupancy, "occupancy");
        this.f15005a = ratesId;
        this.f15006b = bedOptionId;
        this.f15007c = occupancy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f15005a, bVar.f15005a) && Intrinsics.f(this.f15006b, bVar.f15006b) && Intrinsics.f(this.f15007c, bVar.f15007c);
    }

    public final int hashCode() {
        return this.f15007c.hashCode() + p.a.c(this.f15005a.hashCode() * 31, 31, this.f15006b);
    }
}
