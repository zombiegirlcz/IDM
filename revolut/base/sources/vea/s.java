package vea;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f288235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io3.d f288236b;

    public s(AccountId accountId, io3.d pocket) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f288235a = accountId;
        this.f288236b = pocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f288235a, sVar.f288235a) && Intrinsics.f(this.f288236b, sVar.f288236b);
    }

    public final int hashCode() {
        return this.f288236b.hashCode() + (this.f288235a.hashCode() * 31);
    }
}
