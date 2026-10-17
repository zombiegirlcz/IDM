package amd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6330a;

    public h0(String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f6330a = portfolioId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h0) && Intrinsics.f(this.f6330a, ((h0) obj2).f6330a);
    }

    public final int hashCode() {
        return this.f6330a.hashCode();
    }
}
