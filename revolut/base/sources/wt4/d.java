package wt4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f299771b;

    public d(dj0.d overdueAmount, String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(overdueAmount, "overdueAmount");
        this.f299770a = facilityId;
        this.f299771b = overdueAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f299770a, dVar.f299770a) && Intrinsics.f(this.f299771b, dVar.f299771b);
    }

    public final int hashCode() {
        return this.f299771b.hashCode() + (this.f299770a.hashCode() * 31);
    }
}
