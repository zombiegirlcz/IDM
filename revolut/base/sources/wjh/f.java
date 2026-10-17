package wjh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f298099b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String portfolioId) {
        super("SECURITIES");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f298099b = portfolioId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f298099b, ((f) obj2).f298099b);
    }

    public final int hashCode() {
        return this.f298099b.hashCode();
    }
}
