package xnd;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f307419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lzi.m f307420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lzi.h f307421c;

    public l0(AccountId accountId, lzi.m mVar, lzi.h hVar) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f307419a = accountId;
        this.f307420b = mVar;
        this.f307421c = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f307419a, l0Var.f307419a) && Intrinsics.f(this.f307420b, l0Var.f307420b) && Intrinsics.f(this.f307421c, l0Var.f307421c);
    }

    public final int hashCode() {
        int iHashCode = this.f307419a.hashCode() * 31;
        lzi.m mVar = this.f307420b;
        int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        lzi.h hVar = this.f307421c;
        return iHashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }
}
