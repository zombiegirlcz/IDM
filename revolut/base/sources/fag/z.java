package fag;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f133405b;

    public z(String bookingId, xi0.b currency) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f133404a = bookingId;
        this.f133405b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f133404a, zVar.f133404a) && Intrinsics.f(this.f133405b, zVar.f133405b);
    }

    public final int hashCode() {
        return this.f133405b.hashCode() + (this.f133404a.hashCode() * 31);
    }
}
