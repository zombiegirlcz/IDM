package dci;

import android.content.Context;
import aw0.o9;
import cci.g;
import com.bumptech.glide.d;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.user_declarations.shared.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ty0.c;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f112990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f112991b;

    public b(Context context, c clauseDisplayer) {
        Intrinsics.checkNotNullParameter(clauseDisplayer, "clauseDisplayer");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f112990a = clauseDisplayer;
        this.f112991b = context;
    }

    public static int a(g gVar, wi0.b bVar) {
        switch (a.f112989a[gVar.ordinal()]) {
            case 1:
                return R$string.purpose_of_account_purpose_title_atm_withdrawal_abroad;
            case 2:
                return R$string.purpose_of_account_purpose_title_atm_withdrawal_domestic;
            case 3:
                return R$string.purpose_of_account_purpose_title_budgeting;
            case 4:
                return R$string.purpose_of_account_purpose_title_cashback;
            case 5:
                return R$string.purpose_of_account_purpose_title_commodities;
            case 6:
                return R$string.purpose_of_account_purpose_title_crypto;
            case 7:
                return R$string.purpose_of_account_purpose_title_daily_purchases;
            case 8:
                return R$string.purpose_of_account_purpose_title_disposable_cards;
            case 9:
                return R$string.purpose_of_account_purpose_title_fx;
            case 10:
                return R$string.purpose_of_account_purpose_title_investing;
            case 11:
                return R$string.purpose_of_account_purpose_title_junior;
            case 12:
                return R$string.purpose_of_account_purpose_title_linked_accounts;
            case 13:
                return R$string.purpose_of_account_purpose_title_metal;
            case 14:
                return R$string.purpose_of_account_purpose_title_mortgage;
            case 15:
                return R$string.purpose_of_account_purpose_title_online_purchases;
            case 16:
                return R$string.purpose_of_account_purpose_title_p2p;
            case 17:
                return R$string.purpose_of_account_purpose_title_to_local_friends_and_family;
            case 18:
                return R$string.purpose_of_account_purpose_title_payments;
            case 19:
                return R$string.purpose_of_account_purpose_title_purchase_protection;
            case 20:
                return R$string.purpose_of_account_purpose_title_recurring_payments;
            case 21:
                return R$string.purpose_of_account_purpose_title_remittance;
            case 22:
                return R$string.purpose_of_account_purpose_title_to_friends_and_family_abroad;
            case 23:
                return R$string.purpose_of_account_purpose_title_for_living_expenses;
            case 24:
                return R$string.purpose_of_account_purpose_title_to_revolut_users;
            case 25:
                return R$string.purpose_of_account_purpose_title_to_my_local_account;
            case 26:
                return R$string.purpose_of_account_purpose_title_to_my_foreign_account;
            case 27:
                return R$string.purpose_of_account_purpose_title_rent;
            case 28:
                return R$string.purpose_of_account_purpose_title_rewards;
            case 29:
                return R$string.purpose_of_account_purpose_title_salary;
            case 30:
                return R$string.purpose_of_account_purpose_title_savings;
            case 31:
                return R$string.purpose_of_account_purpose_title_smart_delay;
            case 32:
                return R$string.purpose_of_account_purpose_title_spending;
            case 33:
                return R$string.purpose_of_account_purpose_title_spending_abroad;
            case 34:
                return R$string.purpose_of_account_purpose_title_domestic_spending;
            case 35:
                return R$string.purpose_of_account_purpose_title_stays;
            case 36:
                return R$string.purpose_of_account_purpose_title_stocks;
            case 37:
                return R$string.purpose_of_account_purpose_title_subscriptions;
            case 38:
                return R$string.purpose_of_account_purpose_title_to_my_foreign_brokerage_account;
            case 39:
                return R$string.purpose_of_account_purpose_title_purchase_of_commodities;
            case 40:
                return R$string.purpose_of_account_purpose_title_to_my_local_brokerage_account;
            case 41:
                return R$string.purpose_of_account_purpose_title_travel_insurance;
            case 42:
                return d.o(bVar) ? R$string.purpose_of_account_purpose_title_savings_pocket : R$string.purpose_of_account_purpose_title_vaults;
            case 43:
                return R$string.purpose_of_account_purpose_title_virtual_cards;
            case 44:
                return R$string.purpose_of_account_purpose_title_professional_account;
            case 45:
                return R$string.purpose_of_account_purpose_title_loans;
            case 46:
                return R$string.purpose_of_account_purpose_title_receive_eur_transfers;
            case 47:
                return R$string.purpose_of_account_purpose_title_manage_property;
            case 48:
                return R$string.purpose_of_account_purpose_title_utilities;
            case 49:
                return R$string.purpose_of_account_purpose_title_direct_debits;
            case 50:
                return R$string.purpose_of_account_purpose_title_living_abroad;
            case 51:
                return R$string.purpose_of_account_purpose_title_local_authorities;
            case 52:
                return R$string.purpose_of_account_purpose_title_joint_account;
            case 53:
                return R$string.purpose_of_account_purpose_title_credit_cards;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final String b(g purpose, wi0.b bVar) {
        int i;
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        switch (a.f112989a[purpose.ordinal()]) {
            case 1:
            case 2:
            case 45:
                i = R$string.purpose_of_account_purpose_emoji_bank;
                break;
            case 3:
                i = R$string.purpose_of_account_purpose_emoji_note;
                break;
            case 4:
                i = R$string.purpose_of_account_purpose_emoji_cash_face;
                break;
            case 5:
                i = R$string.purpose_of_account_purpose_emoji_ring;
                break;
            case 6:
                i = R$string.purpose_of_account_purpose_emoji_lock;
                break;
            case 7:
            case 18:
            case 34:
                i = R$string.purpose_of_account_purpose_emoji_shopping;
                break;
            case 8:
            case 15:
                i = R$string.purpose_of_account_purpose_emoji_phone;
                break;
            case 9:
                i = R$string.purpose_of_account_purpose_emoji_foreign_exchange;
                break;
            case 10:
            case 36:
            case 40:
                i = R$string.purpose_of_account_purpose_emoji_chart_rising;
                break;
            case 11:
                i = R$string.purpose_of_account_purpose_emoji_backpack;
                break;
            case 12:
            case 32:
                i = R$string.purpose_of_account_purpose_emoji_bar_chart;
                break;
            case 13:
            case 14:
            case 53:
                i = R$string.purpose_of_account_purpose_emoji_card;
                break;
            case 16:
            case 29:
                i = R$string.purpose_of_account_purpose_emoji_cash;
                break;
            case 17:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                i = R$string.purpose_of_account_purpose_emoji_flying_cash;
                break;
            case 19:
                i = R$string.purpose_of_account_purpose_emoji_shield;
                break;
            case 20:
            case 37:
                i = R$string.purpose_of_account_purpose_emoji_calendar;
                break;
            case 21:
            case 33:
            case 38:
                i = R$string.purpose_of_account_purpose_emoji_globe;
                break;
            case 27:
                i = R$string.purpose_of_account_purpose_emoji_house;
                break;
            case 28:
                i = R$string.purpose_of_account_purpose_emoji_present;
                break;
            case 30:
            case 42:
                i = R$string.purpose_of_account_purpose_emoji_cash_bag;
                break;
            case 31:
                i = R$string.purpose_of_account_purpose_emoji_airplane;
                break;
            case 35:
                i = R$string.purpose_of_account_purpose_emoji_hotel;
                break;
            case 39:
                i = R$string.purpose_of_account_purpose_emoji_ring;
                break;
            case 41:
                i = R$string.purpose_of_account_purpose_emoji_hospital;
                break;
            case 43:
                i = R$string.purpose_of_account_purpose_emoji_phone;
                break;
            case 44:
                i = R$string.purpose_of_account_purpose_emoji_suitcase;
                break;
            case 46:
                i = R$string.purpose_of_account_purpose_emoji_euro_flag;
                break;
            case 47:
                i = R$string.purpose_of_account_purpose_emoji_house;
                break;
            case 48:
                i = R$string.purpose_of_account_purpose_emoji_bill;
                break;
            case 49:
                i = R$string.purpose_of_account_purpose_emoji_flying_cash;
                break;
            case 50:
                i = R$string.purpose_of_account_purpose_emoji_globe;
                break;
            case 51:
                i = R$string.purpose_of_account_purpose_emoji_bank;
                break;
            case 52:
                i = R$string.purpose_of_account_purpose_emoji_twins;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        List listK = v.k(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(a(purpose, bVar), null, null, 14));
        m70.a.t(t0.f186434a);
        return c.a(this.f112990a, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), this.f112991b, null, null, null, null, Constants.TAG_FC_SPEED_MODE).toString();
    }

    public final String c(g purpose, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        return c.a(this.f112990a, new TextLocalisedClause(a(purpose, bVar), null, null, 14), this.f112991b, null, null, null, null, Constants.TAG_FC_SPEED_MODE).toString();
    }
}
