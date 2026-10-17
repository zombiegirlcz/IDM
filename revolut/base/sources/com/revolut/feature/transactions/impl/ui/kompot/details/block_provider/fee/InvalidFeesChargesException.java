package com.revolut.feature.transactions.impl.ui.kompot.details.block_provider.fee;

import a0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transactions/impl/ui/kompot/details/block_provider/fee/InvalidFeesChargesException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvalidFeesChargesException extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidFeesChargesException(String transactionId, String description) {
        super(d.u(new StringBuilder("Invalid fees for transaction "), transactionId, ": ", description));
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(description, "description");
    }
}
