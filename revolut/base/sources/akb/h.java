package akb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qib.i f5770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io3.d f5772c;

    public h(qib.i challengeAccount, String challengeAccountName, io3.d dVar) {
        Intrinsics.checkNotNullParameter(challengeAccount, "challengeAccount");
        Intrinsics.checkNotNullParameter(challengeAccountName, "challengeAccountName");
        this.f5770a = challengeAccount;
        this.f5771b = challengeAccountName;
        this.f5772c = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f5770a, hVar.f5770a) && Intrinsics.f(this.f5771b, hVar.f5771b) && Intrinsics.f(this.f5772c, hVar.f5772c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f5770a.hashCode() * 31, 31, this.f5771b);
        io3.d dVar = this.f5772c;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }
}
