package kkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184971a;

    public u7(String loanId) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        this.f184971a = loanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u7) && Intrinsics.f(this.f184971a, ((u7) obj2).f184971a);
    }

    public final int hashCode() {
        return this.f184971a.hashCode();
    }
}
