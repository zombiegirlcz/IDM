package vpd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f291183a;

    public p0(String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f291183a = portfolioId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p0) && Intrinsics.f(this.f291183a, ((p0) obj2).f291183a);
    }

    public final int hashCode() {
        return this.f291183a.hashCode();
    }
}
