package o55;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class r implements xx4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222366b;

    public r(String loanId) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        this.f222365a = loanId;
        this.f222366b = j6.a.q("LoanRefinancedCreditsV2CacheKey", loanId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f222365a, ((r) obj2).f222365a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f222366b;
    }

    public final int hashCode() {
        return this.f222365a.hashCode();
    }
}
