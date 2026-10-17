package wpa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f299213b;

    public g(String cardOwnerId, long j2) {
        Intrinsics.checkNotNullParameter(cardOwnerId, "cardOwnerId");
        this.f299212a = cardOwnerId;
        this.f299213b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f299212a, gVar.f299212a) && this.f299213b == gVar.f299213b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f299213b) + (this.f299212a.hashCode() * 31);
    }
}
