package amd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6355a;

    public y(String loanId) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        this.f6355a = loanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f6355a, ((y) obj2).f6355a);
    }

    public final int hashCode() {
        return this.f6355a.hashCode();
    }
}
