package b35;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class g {
    public static List a() {
        return v.k(new TextLocalisedClause(R$string.credit_search_keywords_card, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_rewards, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_points, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_cashback, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_limit, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_revpoints, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_balance, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_installment, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_rates, null, null, 14));
    }

    public static List b() {
        return v.k(new TextLocalisedClause(R$string.credit_search_keywords_mortgage, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_home, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_house, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_property, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_housing, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_apartment, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_buying, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_realty, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_estate, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_land, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_rates, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_loan, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_equity, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_collateral, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_preapproval, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_secured, null, null, 14));
    }

    public static ArrayList c(fs3.b entryPoint) {
        Iterable iterableK;
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        List listC = u.c(new TextLocalisedClause(R$string.credit_search_keywords_credit, null, null, 14));
        switch (f.f12006a[entryPoint.ordinal()]) {
            case 1:
                iterableK = v.k(new TextLocalisedClause(R$string.credit_search_keywords_loan, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_cash, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_personal, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_borrow, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_advance, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_funds, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_money, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_unsecured, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_installment, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_rates, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_debt, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_lending, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_car, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_home, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_improvement, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_renovation, null, null, 14));
                break;
            case 2:
                iterableK = v.k(new TextLocalisedClause(R$string.credit_search_keywords_refinance, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_consolidation, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_consolidate, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_debt, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_restructuring, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_rates, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_lending, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_switch, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_lower, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_transfer, null, null, 14));
                break;
            case 3:
                iterableK = a();
                break;
            case 4:
                iterableK = d0.E0(a(), u.c(new TextLocalisedClause(R$string.credit_search_keywords_secured, null, null, 14)));
                break;
            case 5:
                iterableK = d0.E0(a(), u.c(new TextLocalisedClause(R$string.credit_search_keywords_builder, null, null, 14)));
                break;
            case 6:
                iterableK = b();
                break;
            case 7:
                iterableK = d0.E0(b(), u.c(new TextLocalisedClause(R$string.credit_search_keywords_refinance, null, null, 14)));
                break;
            case 8:
                iterableK = v.k(new TextLocalisedClause(R$string.credit_search_keywords_bnpl, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_installments, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_split, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_later, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_flexi, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_financing, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_checkout, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_postpone, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_spread, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_shop, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_pay, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_slice, null, null, 14));
                break;
            case 9:
                iterableK = v.k(new TextLocalisedClause(R$string.credit_search_keywords_overdraft, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_negative, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_minus, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_empty, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_emergency, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_insufficient, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_liquidity, null, null, 14));
                break;
            default:
                iterableK = f0.f322471a;
                break;
        }
        return d0.E0(iterableK, listC);
    }
}
