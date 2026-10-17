package com.revolut.shared.feature.wealth.domain.api.interactors;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/wealth/domain/api/interactors/PartialPortfolioBalanceException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_domain_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PartialPortfolioBalanceException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f105075a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartialPortfolioBalanceException(List refs) {
        super("Partial Balance Exception, following tickers are missing: " + refs);
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.f105075a = refs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PartialPortfolioBalanceException) && Intrinsics.f(this.f105075a, ((PartialPortfolioBalanceException) obj2).f105075a);
    }

    public final int hashCode() {
        return this.f105075a.hashCode();
    }
}
