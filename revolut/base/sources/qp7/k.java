package qp7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f248308b;

    public k(dj0.d amount, String reservationId) {
        Intrinsics.checkNotNullParameter(reservationId, "reservationId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f248307a = reservationId;
        this.f248308b = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f248307a, kVar.f248307a) && Intrinsics.f(this.f248308b, kVar.f248308b);
    }

    public final int hashCode() {
        return this.f248308b.hashCode() + (this.f248307a.hashCode() * 31);
    }
}
