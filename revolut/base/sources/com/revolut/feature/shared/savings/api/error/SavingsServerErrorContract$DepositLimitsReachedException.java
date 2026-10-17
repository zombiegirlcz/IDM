package com.revolut.feature.shared.savings.api.error;

import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/shared/savings/api/error/SavingsServerErrorContract$DepositLimitsReachedException", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SavingsServerErrorContract$DepositLimitsReachedException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f86451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f86452b;

    public SavingsServerErrorContract$DepositLimitsReachedException(d depositLimit, d limitLeft) {
        Intrinsics.checkNotNullParameter(depositLimit, "depositLimit");
        Intrinsics.checkNotNullParameter(limitLeft, "limitLeft");
        this.f86451a = depositLimit;
        this.f86452b = limitLeft;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SavingsServerErrorContract$DepositLimitsReachedException)) {
            return false;
        }
        SavingsServerErrorContract$DepositLimitsReachedException savingsServerErrorContract$DepositLimitsReachedException = (SavingsServerErrorContract$DepositLimitsReachedException) obj2;
        return Intrinsics.f(this.f86451a, savingsServerErrorContract$DepositLimitsReachedException.f86451a) && Intrinsics.f(this.f86452b, savingsServerErrorContract$DepositLimitsReachedException.f86452b);
    }

    public final int hashCode() {
        return this.f86452b.hashCode() + (this.f86451a.hashCode() * 31);
    }
}
