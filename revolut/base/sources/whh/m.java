package whh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f297667a;

    public m(String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f297667a = portfolioId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f297667a, ((m) obj2).f297667a);
    }

    public final int hashCode() {
        return this.f297667a.hashCode();
    }
}
