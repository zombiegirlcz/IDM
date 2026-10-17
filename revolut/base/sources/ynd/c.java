package ynd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccount.Personal.CreditCard f315444a;

    public c(AnalyticsAccount.Personal.CreditCard account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f315444a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f315444a, ((c) obj2).f315444a);
    }

    @Override // ynd.h
    public final AnalyticsAccount getAccount() {
        return this.f315444a;
    }

    public final int hashCode() {
        return this.f315444a.f99193a.hashCode();
    }
}
