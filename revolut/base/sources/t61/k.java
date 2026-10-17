package t61;

import com.revolut.domain.models.topup.TopUpContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f268170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f268171c;
    public final io3.l d;
    public final TopUpContext e;

    public k(String externalCardId, long j2, String currency, io3.l pocketType, TopUpContext topUpContext) {
        Intrinsics.checkNotNullParameter(externalCardId, "externalCardId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(topUpContext, "topUpContext");
        this.f268169a = externalCardId;
        this.f268170b = j2;
        this.f268171c = currency;
        this.d = pocketType;
        this.e = topUpContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f268169a, kVar.f268169a) && this.f268170b == kVar.f268170b && Intrinsics.f(this.f268171c, kVar.f268171c) && this.d == kVar.d && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + a.c(this.d, p.a.c(a0.d.c(this.f268169a.hashCode() * 31, 31, this.f268170b), 31, this.f268171c), 31);
    }
}
