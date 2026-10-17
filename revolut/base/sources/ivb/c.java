package ivb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f168806b;

    public c(String auctionId, String bidId) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(bidId, "bidId");
        this.f168805a = auctionId;
        this.f168806b = bidId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f168805a, cVar.f168805a) && Intrinsics.f(this.f168806b, cVar.f168806b);
    }

    public final int hashCode() {
        return this.f168806b.hashCode() + (this.f168805a.hashCode() * 31);
    }
}
