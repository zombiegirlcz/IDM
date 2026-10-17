package r35;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f251150a;

    public b(String loanId) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        this.f251150a = loanId;
    }

    public final String a() {
        return this.f251150a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f251150a, ((b) obj2).f251150a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f251150a.hashCode() * 31);
    }
}
