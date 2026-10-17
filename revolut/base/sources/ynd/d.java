package ynd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccount f315445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f315446b;

    public d(AnalyticsAccount account, xi0.b currency) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f315445a = account;
        this.f315446b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f315445a, dVar.f315445a) && Intrinsics.f(this.f315446b, dVar.f315446b);
    }

    @Override // ynd.h
    public final AnalyticsAccount getAccount() {
        return this.f315445a;
    }

    public final int hashCode() {
        return this.f315446b.hashCode() + (this.f315445a.hashCode() * 31);
    }
}
