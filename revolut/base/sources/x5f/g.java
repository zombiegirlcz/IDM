package x5f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f302962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pdh.c f302963b;

    public g(String portfolioId, pdh.c selectedTimeSpan) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(selectedTimeSpan, "selectedTimeSpan");
        this.f302962a = portfolioId;
        this.f302963b = selectedTimeSpan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f302962a, gVar.f302962a) && this.f302963b == gVar.f302963b;
    }

    public final int hashCode() {
        return this.f302963b.hashCode() + (this.f302962a.hashCode() * 31);
    }
}
