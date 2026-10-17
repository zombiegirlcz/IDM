package vea;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f288188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f288189b;

    public e(xi0.b currency, AccountId accountId) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f288188a = currency;
        this.f288189b = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f288188a, eVar.f288188a) && Intrinsics.f(this.f288189b, eVar.f288189b);
    }

    public final int hashCode() {
        return this.f288189b.hashCode() + (this.f288188a.hashCode() * 31);
    }
}
