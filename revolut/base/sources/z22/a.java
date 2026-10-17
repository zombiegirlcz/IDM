package z22;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.FundingSource;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements m02.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FundingSource f318942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f318943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f318944c;
    public final AccountId d;

    public a(FundingSource fundingSource, long j2, xi0.b targetCurrency, AccountId accountId) {
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f318942a = fundingSource;
        this.f318943b = j2;
        this.f318944c = targetCurrency;
        this.d = accountId;
    }

    @Override // m02.b
    /* JADX INFO: renamed from: a */
    public final FundingSource getF72728a() {
        return this.f318942a;
    }

    @Override // m02.b
    public final xi0.b b() {
        return this.f318942a.f92241b;
    }

    @Override // m02.b
    /* JADX INFO: renamed from: c */
    public final dj0.d getF72729b() {
        return new dj0.d(this.f318943b, this.f318944c);
    }

    @Override // m02.b
    public final boolean d() {
        return !Intrinsics.f(this.f318944c, this.f318942a.f92241b);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f318942a, aVar.f318942a) && this.f318943b == aVar.f318943b && Intrinsics.f(this.f318944c, aVar.f318944c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + l.j(this.f318944c, a0.d.c(this.f318942a.hashCode() * 31, 31, this.f318943b), 31);
    }
}
