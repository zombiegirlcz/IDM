package t7h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268715b;

    public s(String portfolioId, String currencyCode) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f268714a = portfolioId;
        this.f268715b = currencyCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f268714a, sVar.f268714a) && Intrinsics.f(this.f268715b, sVar.f268715b);
    }

    public final int hashCode() {
        return this.f268715b.hashCode() + (this.f268714a.hashCode() * 31);
    }
}
