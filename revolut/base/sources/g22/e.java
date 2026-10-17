package g22;

import com.revolut.feature.transfer.core.models.FundingSource;
import h30.l;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements m02.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FundingSource f139765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f139766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f139767c;
    public final boolean d;

    public e(FundingSource fundingSource, dj0.d targetMoney, xi0.b sourceCurrency, boolean z) {
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(targetMoney, "targetMoney");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        this.f139765a = fundingSource;
        this.f139766b = targetMoney;
        this.f139767c = sourceCurrency;
        this.d = z;
    }

    @Override // m02.b
    /* JADX INFO: renamed from: a */
    public final FundingSource getF72728a() {
        return this.f139765a;
    }

    @Override // m02.b
    public final xi0.b b() {
        return this.f139767c;
    }

    @Override // m02.b
    /* JADX INFO: renamed from: c */
    public final dj0.d getF72729b() {
        return this.f139766b;
    }

    @Override // m02.b
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f139765a, eVar.f139765a) && Intrinsics.f(this.f139766b, eVar.f139766b) && Intrinsics.f(this.f139767c, eVar.f139767c) && this.d == eVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + l.j(this.f139767c, v7.c(this.f139765a.hashCode() * 31, 31, this.f139766b), 31);
    }
}
