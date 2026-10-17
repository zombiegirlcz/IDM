package t7h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268709b;

    public o(String portfolioId, String instrumentRef) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        this.f268708a = portfolioId;
        this.f268709b = instrumentRef;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f268708a, oVar.f268708a) && Intrinsics.f(this.f268709b, oVar.f268709b);
    }

    public final int hashCode() {
        return this.f268709b.hashCode() + (this.f268708a.hashCode() * 31);
    }
}
