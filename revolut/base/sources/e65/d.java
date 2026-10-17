package e65;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f122896a;

    public d(String loanId) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        this.f122896a = loanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f122896a, ((d) obj2).f122896a);
    }

    public final int hashCode() {
        return this.f122896a.hashCode();
    }
}
