package pwg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f240475b;

    public n(String indicatorKey, String portfolioId) {
        Intrinsics.checkNotNullParameter(indicatorKey, "indicatorKey");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f240474a = indicatorKey;
        this.f240475b = portfolioId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f240474a, nVar.f240474a) && Intrinsics.f(this.f240475b, nVar.f240475b);
    }

    public final int hashCode() {
        return this.f240475b.hashCode() + (this.f240474a.hashCode() * 31);
    }
}
