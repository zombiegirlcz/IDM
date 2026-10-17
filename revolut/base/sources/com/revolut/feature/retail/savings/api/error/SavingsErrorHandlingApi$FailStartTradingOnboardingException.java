package com.revolut.feature.retail.savings.api.error;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/retail/savings/api/error/SavingsErrorHandlingApi$FailStartTradingOnboardingException", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SavingsErrorHandlingApi$FailStartTradingOnboardingException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83146a;

    public SavingsErrorHandlingApi$FailStartTradingOnboardingException() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SavingsErrorHandlingApi$FailStartTradingOnboardingException) && Intrinsics.f(this.f83146a, ((SavingsErrorHandlingApi$FailStartTradingOnboardingException) obj2).f83146a);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f83146a;
    }

    public final int hashCode() {
        String str = this.f83146a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public SavingsErrorHandlingApi$FailStartTradingOnboardingException(int i) {
        super("Fail to start trading onboarding step");
        this.f83146a = "Fail to start trading onboarding step";
    }
}
