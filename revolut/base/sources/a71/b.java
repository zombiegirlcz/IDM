package a71;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1720c;
    public final String d;

    public b(String walletRef, String accountState, String accountOpeningDate, String accountTerminatedDate) {
        Intrinsics.checkNotNullParameter(walletRef, "walletRef");
        Intrinsics.checkNotNullParameter(accountState, "accountState");
        Intrinsics.checkNotNullParameter(accountOpeningDate, "accountOpeningDate");
        Intrinsics.checkNotNullParameter(accountTerminatedDate, "accountTerminatedDate");
        this.f1718a = walletRef;
        this.f1719b = accountState;
        this.f1720c = accountOpeningDate;
        this.d = accountTerminatedDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f1718a, bVar.f1718a) && Intrinsics.f(this.f1719b, bVar.f1719b) && Intrinsics.f(this.f1720c, bVar.f1720c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f1718a.hashCode() * 31, 31, this.f1719b), 31, this.f1720c);
    }
}
