package com.revolut.feature.wealth.api.domain.model;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/ExchangeLimitExceededError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExchangeLimitExceededError extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f95224a;

    public ExchangeLimitExceededError(TextLocalisedClause messageClause) {
        Intrinsics.checkNotNullParameter(messageClause, "messageClause");
        this.f95224a = messageClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ExchangeLimitExceededError) && Intrinsics.f(this.f95224a, ((ExchangeLimitExceededError) obj2).f95224a);
    }

    public final int hashCode() {
        return this.f95224a.hashCode();
    }
}
