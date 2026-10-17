package boc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17386a;

    public i(String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f17386a = portfolioId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f17386a, ((i) obj2).f17386a);
    }

    public final int hashCode() {
        return this.f17386a.hashCode();
    }
}
