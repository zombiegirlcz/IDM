package com.revolut.feature.shared.savings.api.error;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/shared/savings/api/error/SavingsServerErrorContract$UnactivatedSavingsAccountAlreadyExist", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SavingsServerErrorContract$UnactivatedSavingsAccountAlreadyExist extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86456a;

    public SavingsServerErrorContract$UnactivatedSavingsAccountAlreadyExist(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f86456a = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SavingsServerErrorContract$UnactivatedSavingsAccountAlreadyExist) && Intrinsics.f(this.f86456a, ((SavingsServerErrorContract$UnactivatedSavingsAccountAlreadyExist) obj2).f86456a);
    }

    public final int hashCode() {
        return this.f86456a.hashCode();
    }
}
