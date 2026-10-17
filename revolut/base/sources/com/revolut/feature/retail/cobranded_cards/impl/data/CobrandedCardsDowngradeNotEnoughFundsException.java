package com.revolut.feature.retail.cobranded_cards.impl.data;

import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/data/CobrandedCardsDowngradeNotEnoughFundsException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CobrandedCardsDowngradeNotEnoughFundsException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f82508a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CobrandedCardsDowngradeNotEnoughFundsException(d lackingMoney) {
        super("Insufficient funds for downgrade");
        Intrinsics.checkNotNullParameter(lackingMoney, "lackingMoney");
        this.f82508a = lackingMoney;
    }
}
