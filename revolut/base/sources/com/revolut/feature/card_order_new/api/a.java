package com.revolut.feature.card_order_new.api;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {
    public static final AccountId a(CardOrderAccountWrapper cardOrderAccountWrapper) {
        Intrinsics.checkNotNullParameter(cardOrderAccountWrapper, "<this>");
        if (cardOrderAccountWrapper instanceof CardOrderAccountWrapper.Junior) {
            return AccountId.Personal.f51414a;
        }
        if (cardOrderAccountWrapper instanceof CardOrderAccountWrapper.Regular) {
            return ((CardOrderAccountWrapper.Regular) cardOrderAccountWrapper).f64936a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
