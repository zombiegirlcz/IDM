package ej9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126820b;

    public n(String transactionId, String facilityId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f126819a = transactionId;
        this.f126820b = facilityId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f126819a, nVar.f126819a) && Intrinsics.f(this.f126820b, nVar.f126820b);
    }

    public final int hashCode() {
        return this.f126820b.hashCode() + (this.f126819a.hashCode() * 31);
    }
}
