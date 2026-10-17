package ynd;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qzi.h f315455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f315456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f315457c;

    public i(qzi.h hVar, AccountId accountId, xi0.b currency) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f315455a = hVar;
        this.f315456b = accountId;
        this.f315457c = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f315455a, iVar.f315455a) && Intrinsics.f(this.f315456b, iVar.f315456b) && Intrinsics.f(this.f315457c, iVar.f315457c);
    }

    public final int hashCode() {
        qzi.h hVar = this.f315455a;
        return this.f315457c.hashCode() + h30.l.b(this.f315456b, (hVar == null ? 0 : hVar.hashCode()) * 31, 31);
    }
}
