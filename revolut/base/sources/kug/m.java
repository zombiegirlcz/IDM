package kug;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189801a;

    public m(String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f189801a = portfolioId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f189801a, ((m) obj2).f189801a);
    }

    public final int hashCode() {
        return this.f189801a.hashCode();
    }
}
