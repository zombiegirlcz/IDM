package c65;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21667a;

    public n(String loanId) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        this.f21667a = loanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f21667a, ((n) obj2).f21667a);
    }

    public final int hashCode() {
        return this.f21667a.hashCode();
    }
}
