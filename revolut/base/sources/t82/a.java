package t82;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.FundingSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h02.g f268798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f268799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FundingSource f268800c;
    public final AccountId d;

    public a(h02.g config, long j2, FundingSource fundingSource, AccountId accountId) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f268798a = config;
        this.f268799b = j2;
        this.f268800c = fundingSource;
        this.d = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f268798a, aVar.f268798a) && this.f268799b == aVar.f268799b && Intrinsics.f(this.f268800c, aVar.f268800c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f268800c.hashCode() + a0.d.c(this.f268798a.hashCode() * 31, 31, this.f268799b)) * 31);
    }
}
