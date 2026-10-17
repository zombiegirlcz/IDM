package tua;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f274548c;

    public c(String loanId, String repaymentId, String str) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(repaymentId, "repaymentId");
        this.f274546a = loanId;
        this.f274547b = repaymentId;
        this.f274548c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f274546a, cVar.f274546a) && Intrinsics.f(this.f274547b, cVar.f274547b) && Intrinsics.f(this.f274548c, cVar.f274548c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f274546a.hashCode() * 31, 31, this.f274547b);
        String str = this.f274548c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
