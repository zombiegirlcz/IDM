package a82;

import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f1995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yt8.i f1996b;

    public b(f0 card, yt8.i kycStatus) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(kycStatus, "kycStatus");
        this.f1995a = card;
        this.f1996b = kycStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f1995a, bVar.f1995a) && this.f1996b == bVar.f1996b;
    }

    public final int hashCode() {
        return this.f1996b.hashCode() + (this.f1995a.hashCode() * 31);
    }
}
