package g3b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f140247b;

    public a(String portfolioId, String positionId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(positionId, "positionId");
        this.f140246a = portfolioId;
        this.f140247b = positionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f140246a, aVar.f140246a) && Intrinsics.f(this.f140247b, aVar.f140247b);
    }

    public final int hashCode() {
        return this.f140247b.hashCode() + (this.f140246a.hashCode() * 31);
    }
}
