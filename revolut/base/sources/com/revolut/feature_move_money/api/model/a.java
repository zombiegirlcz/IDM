package com.revolut.feature_move_money.api.model;

import com.revolut.feature.credit.card.api.models.limits.CreditCardLimits;
import com.revolut.feature_move_money.api.model.AccountSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    public static final CreditCardLimits.Direction a(AccountSource.CreditCardSource creditCardSource, boolean z) {
        Intrinsics.checkNotNullParameter(creditCardSource, "<this>");
        if (z) {
            CreditCardLimits creditCardLimits = creditCardSource.f97194c;
            if (creditCardLimits != null) {
                return creditCardLimits.f68817b;
            }
            return null;
        }
        CreditCardLimits creditCardLimits2 = creditCardSource.f97194c;
        if (creditCardLimits2 != null) {
            return creditCardLimits2.f68816a;
        }
        return null;
    }
}
