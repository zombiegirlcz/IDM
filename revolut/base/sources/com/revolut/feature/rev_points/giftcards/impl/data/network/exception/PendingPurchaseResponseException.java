package com.revolut.feature.rev_points.giftcards.impl.data.network.exception;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/impl/data/network/exception/PendingPurchaseResponseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PendingPurchaseResponseException extends Exception {
    public PendingPurchaseResponseException() {
        super("Giftcard purchase is Processing");
    }
}
