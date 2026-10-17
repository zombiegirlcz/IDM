package sak;

import com.revolut.feature.transfer.core.models.FundingSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements m02.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FundingSource f261435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f261436b;

    public a(FundingSource fundingSource, dj0.d targetMoney) {
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(targetMoney, "targetMoney");
        this.f261435a = fundingSource;
        this.f261436b = targetMoney;
    }

    @Override // m02.b
    /* JADX INFO: renamed from: a */
    public final FundingSource getF62453a() {
        return this.f261435a;
    }

    @Override // m02.b
    public final xi0.b b() {
        return this.f261435a.f92241b;
    }

    @Override // m02.b
    public final dj0.d c() {
        return this.f261436b;
    }

    @Override // m02.b
    public final boolean d() {
        return !Intrinsics.f(this.f261436b.f115083b, this.f261435a.f92241b);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f261435a, aVar.f261435a) && Intrinsics.f(this.f261436b, aVar.f261436b);
    }

    public final int hashCode() {
        return this.f261436b.hashCode() + (this.f261435a.hashCode() * 31);
    }
}
