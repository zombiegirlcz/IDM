package t7h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268699b;

    public d(String portfolioId, String currencyCode) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f268698a = portfolioId;
        this.f268699b = currencyCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f268698a, dVar.f268698a) && Intrinsics.f(this.f268699b, dVar.f268699b);
    }

    public final int hashCode() {
        return this.f268699b.hashCode() + (this.f268698a.hashCode() * 31);
    }
}
