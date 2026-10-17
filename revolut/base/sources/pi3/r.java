package pi3;

import e93.j0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f236419c;

    public r(String cardId, String quoteToken, j0 loyaltyQuote) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(quoteToken, "quoteToken");
        Intrinsics.checkNotNullParameter(loyaltyQuote, "loyaltyQuote");
        this.f236417a = cardId;
        this.f236418b = quoteToken;
        this.f236419c = loyaltyQuote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f236417a, rVar.f236417a) && Intrinsics.f(this.f236418b, rVar.f236418b) && Intrinsics.f(this.f236419c, rVar.f236419c);
    }

    public final int hashCode() {
        return this.f236419c.hashCode() + p.a.c(this.f236417a.hashCode() * 31, 31, this.f236418b);
    }
}
