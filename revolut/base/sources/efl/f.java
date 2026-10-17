package efl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125370b;

    public f(String sourcePortfolioId, String sourceHoldingId) {
        Intrinsics.checkNotNullParameter(sourcePortfolioId, "sourcePortfolioId");
        Intrinsics.checkNotNullParameter(sourceHoldingId, "sourceHoldingId");
        this.f125369a = sourcePortfolioId;
        this.f125370b = sourceHoldingId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f125369a, fVar.f125369a) && Intrinsics.f(this.f125370b, fVar.f125370b);
    }

    public final int hashCode() {
        return this.f125370b.hashCode() + (this.f125369a.hashCode() * 31);
    }
}
