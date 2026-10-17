package com.revolut.feature.retail.restaurants.impl.domain.interactor;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/domain/interactor/InvalidGuaranteeException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvalidGuaranteeException extends IllegalArgumentException {
    public InvalidGuaranteeException() {
        this(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidGuaranteeException(int i) {
        super("Reservation guarantee is not valid for RevPay balance management");
        Intrinsics.checkNotNullParameter("Reservation guarantee is not valid for RevPay balance management", "message");
    }
}
