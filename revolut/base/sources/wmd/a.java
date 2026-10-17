package wmd;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f298633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f298634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f298635c;

    public a(AccountId accountId, String walletId, xi0.b baseCurrency) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        this.f298633a = accountId;
        this.f298634b = walletId;
        this.f298635c = baseCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f298633a, aVar.f298633a) && Intrinsics.f(this.f298634b, aVar.f298634b) && Intrinsics.f(this.f298635c, aVar.f298635c);
    }

    public final int hashCode() {
        return this.f298635c.hashCode() + p.a.c(this.f298633a.hashCode() * 31, 31, this.f298634b);
    }
}
