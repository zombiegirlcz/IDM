package n88;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f213280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f213281b;

    public d(String walletId, String cardId) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f213280a = walletId;
        this.f213281b = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f213280a, dVar.f213280a) && Intrinsics.f(this.f213281b, dVar.f213281b);
    }

    public final int hashCode() {
        return this.f213281b.hashCode() + (this.f213280a.hashCode() * 31);
    }
}
