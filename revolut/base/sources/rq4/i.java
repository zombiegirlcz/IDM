package rq4;

import com.revolut.feature.credit.card.api.models.credit_limit_increase.CreditLimitIncreaseStatus;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jl4.a f256462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f256463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f256464c;
    public final CreditLimitIncreaseStatus d;
    public final kl4.b e;
    public final um4.a f;

    public i(jl4.a creditLimitCap, dj0.d spent, wi0.b countryCode, CreditLimitIncreaseStatus creditLimitIncreaseStatus, kl4.b bVar, um4.a limitsInfo) {
        Intrinsics.checkNotNullParameter(creditLimitCap, "creditLimitCap");
        Intrinsics.checkNotNullParameter(spent, "spent");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(creditLimitIncreaseStatus, "creditLimitIncreaseStatus");
        Intrinsics.checkNotNullParameter(limitsInfo, "limitsInfo");
        this.f256462a = creditLimitCap;
        this.f256463b = spent;
        this.f256464c = countryCode;
        this.d = creditLimitIncreaseStatus;
        this.e = bVar;
        this.f = limitsInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f256462a, iVar.f256462a) && Intrinsics.f(this.f256463b, iVar.f256463b) && Intrinsics.f(this.f256464c, iVar.f256464c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(v7.c(this.f256462a.hashCode() * 31, 31, this.f256463b), 31, this.f256464c.f297794a)) * 31;
        kl4.b bVar = this.e;
        return this.f.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }
}
