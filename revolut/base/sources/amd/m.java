package amd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6338a;

    public m(String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f6338a = portfolioId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f6338a, ((m) obj2).f6338a);
    }

    public final int hashCode() {
        return this.f6338a.hashCode();
    }
}
