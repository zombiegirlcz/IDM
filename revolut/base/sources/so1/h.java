package so1;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f264678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f264679b;

    public h(qua.p recurringPayment, AccountId accountId) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f264678a = recurringPayment;
        this.f264679b = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f264678a, hVar.f264678a) && Intrinsics.f(this.f264679b, hVar.f264679b);
    }

    public final int hashCode() {
        return this.f264679b.hashCode() + (this.f264678a.hashCode() * 31);
    }
}
