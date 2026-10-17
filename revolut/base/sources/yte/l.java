package yte;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f316718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f316719b;

    public l(String accountNumber, String accountBranchId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(accountBranchId, "accountBranchId");
        this.f316718a = accountNumber;
        this.f316719b = accountBranchId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f316718a, lVar.f316718a) && Intrinsics.f(this.f316719b, lVar.f316719b);
    }

    public final int hashCode() {
        return this.f316719b.hashCode() + (this.f316718a.hashCode() * 31);
    }
}
