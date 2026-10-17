package r2b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f251089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f251090b;

    public a(String portfolioId, String positionId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(positionId, "positionId");
        this.f251089a = portfolioId;
        this.f251090b = positionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f251089a, aVar.f251089a) && Intrinsics.f(this.f251090b, aVar.f251090b);
    }

    public final int hashCode() {
        return this.f251090b.hashCode() + (this.f251089a.hashCode() * 31);
    }
}
