package com.revolut.data.network.models.topup.mapper;

import a0.d;
import com.revolut.data.network.models.topup.ContextDto;
import com.revolut.domain.models.topup.TopUpContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0005\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"VAULT_ID_KEY", "", "INVEST_ID_KEY", "toDto", "Lcom/revolut/data/network/models/topup/ContextDto;", "Lcom/revolut/domain/models/topup/TopUpContext;", "toWalletId", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class TopUpContextMapperKt {

    @NotNull
    public static final String VAULT_ID_KEY = "vault.id";

    @NotNull
    public static final String INVEST_ID_KEY = "portfolio.id";

    public static final ContextDto toDto(@NotNull TopUpContext topUpContext) {
        Intrinsics.checkNotNullParameter(topUpContext, "<this>");
        if (topUpContext instanceof TopUpContext.Checkout) {
            return new ContextDto("CARD_CHECKOUT", null);
        }
        if (topUpContext instanceof TopUpContext.Savings) {
            return new ContextDto("SAVINGS", d.x("vault.id", ((TopUpContext.Savings) topUpContext).f60431a));
        }
        if (topUpContext instanceof TopUpContext.Invest) {
            return new ContextDto("INVEST", d.x("portfolio.id", ((TopUpContext.Invest) topUpContext).f60427a));
        }
        if (topUpContext instanceof TopUpContext.ThreeDs) {
            return new ContextDto("THREE_DS", null);
        }
        if ((topUpContext instanceof TopUpContext.Joint) || (topUpContext instanceof TopUpContext.Amount) || (topUpContext instanceof TopUpContext.Other)) {
            return null;
        }
        if (topUpContext instanceof TopUpContext.RevX) {
            return new ContextDto("REVX", null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String toWalletId(@NotNull TopUpContext topUpContext) {
        Intrinsics.checkNotNullParameter(topUpContext, "<this>");
        if (topUpContext instanceof TopUpContext.Joint) {
            return ((TopUpContext.Joint) topUpContext).f60428a;
        }
        if (topUpContext instanceof TopUpContext.ThreeDs) {
            return ((TopUpContext.ThreeDs) topUpContext).f60432a;
        }
        if ((topUpContext instanceof TopUpContext.Amount) || (topUpContext instanceof TopUpContext.Checkout) || (topUpContext instanceof TopUpContext.Invest) || (topUpContext instanceof TopUpContext.Other) || (topUpContext instanceof TopUpContext.RevX) || (topUpContext instanceof TopUpContext.Savings)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
