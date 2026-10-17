package r35;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f251151a;

    public c(String loanId) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        this.f251151a = loanId;
    }

    public final String a() {
        return this.f251151a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f251151a, ((c) obj2).f251151a);
    }

    public final int hashCode() {
        return this.f251151a.hashCode();
    }
}
