package o55;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements xx4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222326b;

    public d(String loanId) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        this.f222325a = loanId;
        this.f222326b = j6.a.q("LoanDetailsCacheKey", loanId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f222325a, ((d) obj2).f222325a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f222326b;
    }

    public final int hashCode() {
        return this.f222325a.hashCode();
    }
}
