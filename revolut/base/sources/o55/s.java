package o55;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s implements xx4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222368b;

    public s(String loanId) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        this.f222367a = loanId;
        this.f222368b = j6.a.q("LoanRepaymentsListCacheKey", loanId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f222367a, ((s) obj2).f222367a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f222368b;
    }

    public final int hashCode() {
        return this.f222367a.hashCode();
    }
}
