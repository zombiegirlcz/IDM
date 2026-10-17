package vel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f288364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f288365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f288366c;

    public l(String portfolioId, i type, k transactionsSummary) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(transactionsSummary, "transactionsSummary");
        this.f288364a = portfolioId;
        this.f288365b = type;
        this.f288366c = transactionsSummary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f288364a, lVar.f288364a) && this.f288365b == lVar.f288365b && Intrinsics.f(this.f288366c, lVar.f288366c);
    }

    public final int hashCode() {
        return this.f288366c.hashCode() + ((this.f288365b.hashCode() + (this.f288364a.hashCode() * 31)) * 31);
    }
}
