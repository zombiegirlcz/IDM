package vt4;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ll4.k;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements cm4.h {
    public final TextLocalisedClause b(dj0.d creditLimit, cl4.d cashback, boolean z, k entryPoint, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(creditLimit, "creditLimit");
        Intrinsics.checkNotNullParameter(cashback, "cashback");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        if (z) {
            wi0.b.Companion.getClass();
            if (Intrinsics.f(bVar, wi0.b.p0)) {
                return new TextLocalisedClause(R$string.credit_card_uk_entry_points_account_switcher_subtitle, null, null, 14);
            }
            switch (f.f291903a[entryPoint.ordinal()]) {
                case 1:
                    return new TextLocalisedClause(R$string.credit_card_premium_entry_points_search_description, null, null, 14);
                case 2:
                    return new TextLocalisedClause(R$string.credit_card_premium_entry_points_total_wealth_description, null, null, 14);
                case 3:
                    return new TextLocalisedClause(R$string.credit_card_premium_entry_points_add_money_description, null, null, 14);
                case 4:
                    return new TextLocalisedClause(R$string.credit_card_premium_entry_points_add_new_description, null, null, 14);
                case 5:
                    return new TextLocalisedClause(R$string.credit_card_premium_entry_points_account_switcher_subtitle, u.c(sx4.f.b(3, null, null, creditLimit)), null, 12);
                case 6:
                    return new TextLocalisedClause(R$string.credit_card_premium_entry_points_total_wealth_active_subtitle, u.c(sx4.f.b(3, null, null, creditLimit)), null, 12);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        switch (f.f291903a[entryPoint.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                if (cashback instanceof cl4.b) {
                    return new TextLocalisedClause(R$string.credit_get_credit_credit_card_description_no_cashback, null, null, 14);
                }
                if (cashback instanceof cl4.c) {
                    return new TextLocalisedClause(R$string.credit_get_credit_credit_card_description, u.c(new TextClause(((cl4.c) cashback).f24932a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                }
                throw new NoWhenBranchMatchedException();
            case 5:
                if (cashback instanceof cl4.b) {
                    return new TextLocalisedClause(R$string.credit_discover_credit_card_switcher_subtitle_no_cashback, null, null, 14);
                }
                if (cashback instanceof cl4.c) {
                    return new TextLocalisedClause(R$string.credit_discover_credit_card_switcher_subtitle, u.c(new TextClause(((cl4.c) cashback).f24932a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                }
                throw new NoWhenBranchMatchedException();
            case 6:
                if (cashback instanceof cl4.b) {
                    return new TextLocalisedClause(R$string.credit_card_entry_points_total_wealth_active_no_cashback_subtitle, null, null, 14);
                }
                if (cashback instanceof cl4.c) {
                    return new TextLocalisedClause(R$string.credit_card_entry_points_total_wealth_active_cashback_subtitle, u.c(new TextClause(((cl4.c) cashback).f24932a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                }
                throw new NoWhenBranchMatchedException();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cm4.g c(com.revolut.feature.credit.card.models.CreditCard r27, wi0.b r28) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vt4.g.c(com.revolut.feature.credit.card.models.CreditCard, wi0.b):cm4.g");
    }
}
