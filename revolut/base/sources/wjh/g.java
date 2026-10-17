package wjh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f298100b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String portfolioId) {
        super("SECURITIES_JOINT");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f298100b = portfolioId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f298100b, ((g) obj2).f298100b);
    }

    public final int hashCode() {
        return this.f298100b.hashCode();
    }
}
