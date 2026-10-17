package ld4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194028a;

    public k(String loanId) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        this.f194028a = loanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f194028a, ((k) obj2).f194028a);
    }

    public final int hashCode() {
        return this.f194028a.hashCode();
    }
}
