package c65;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21666a;

    public m(String loanId) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        this.f21666a = loanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f21666a, ((m) obj2).f21666a);
    }

    public final int hashCode() {
        return this.f21666a.hashCode();
    }
}
