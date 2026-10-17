package ld4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194025a;

    public g(String loanId) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        this.f194025a = loanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f194025a, ((g) obj2).f194025a);
    }

    public final int hashCode() {
        return this.f194025a.hashCode();
    }
}
