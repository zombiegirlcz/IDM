package c65;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21664a;

    public k(String loanId) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        this.f21664a = loanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f21664a, ((k) obj2).f21664a);
    }

    public final int hashCode() {
        return this.f21664a.hashCode();
    }
}
