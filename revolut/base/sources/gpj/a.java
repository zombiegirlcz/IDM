package gpj;

import hpj.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import yoj.c;
import yoj.d;
import yoj.f;
import yoj.g;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f145453a = r0.k(new Pair("DISABLED", d.DISABLED), new Pair("INACTIVE", d.INACTIVE), new Pair("LOCKED", d.LOCKED), new Pair("PENDING", d.PENDING), new Pair("ENABLED", d.ENABLED));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f145454b = r0.k(new Pair("CREDIT", c.CREDIT), new Pair("CRYPTO", c.CRYPTO), new Pair("REVOLUT_X", c.REVOLUT_X), new Pair("LEARN", c.LEARN), new Pair("LEARN_REDESIGN", c.LEARN_REDESIGN), new Pair("LEARN_CRYPTO", c.LEARN_CRYPTO), new Pair("LEARN_CRYPTO_REWARD", c.LEARN_CRYPTO_REWARD), new Pair("LEARN_STOCKS", c.LEARN_STOCKS), new Pair("LEARN_FRAUD", c.LEARN_FRAUD), new Pair("LEARN_APP_TIPS", c.LEARN_APP_TIPS), new Pair("LEARN_GLOSSARY", c.LEARN_GLOSSARY), new Pair("TRAVEL_INSURANCE", c.TRAVEL_INSURANCE), new Pair("TRAVEL_EXPERIENCES", c.TRAVEL_EXPERIENCES), new Pair("REMOTE_TRAVEL_CONTENT", c.REMOTE_TRAVEL_CONTENT), new Pair("DEVICE_INSURANCE", c.DEVICE_INSURANCE), new Pair("WEALTH_TRADING", c.WEALTH_TRADING), new Pair("WEALTH_BONDS", c.WEALTH_BONDS), new Pair("SCHEME_AIRPORT_LOUNGES", c.SCHEME_AIRPORT_LOUNGES), new Pair("AIRPORT_LOUNGES", c.AIRPORT_LOUNGES), new Pair("AIRPORT_LOUNGES_LEGACY", c.AIRPORT_LOUNGES_LEGACY), new Pair("TRANSACTIONS_TROUBLESHOOTING", c.TRANSACTIONS_TROUBLESHOOTING), new Pair("YOUTH_ACCOUNTS", c.JUNIOR_ACCOUNTS), new Pair("YOUTH_COPARENT", c.JUNIOR_COPARENT), new Pair("YOUTH_GRADUATION", c.JUNIOR_GRADUATION), new Pair("JUNIOR_PROGRESSION", c.JUNIOR_PROGRESSION), new Pair("JOINT_ACCOUNTS", c.JOINT_ACCOUNTS), new Pair("CHARITY", c.CHARITY), new Pair("ATMS", c.ATMS), new Pair("ATMS_SURCHARGE_FREE", c.ATMS_SURCHARGE_FREE), new Pair("SMART_DELAY", c.SMART_DELAY), new Pair("CREDIT_DATA_SHARING_OPT_OUT", c.CREDIT_DATA_SHARING_OPT_OUT), new Pair("NOTIFICATION_CENTRE", c.NOTIFICATION_CENTRE), new Pair("EXTERNAL_ACCOUNTS", c.EXTERNAL_ACCOUNTS), new Pair("EXTERNAL_ACCOUNTS_TOPUP", c.EXTERNAL_ACCOUNTS_TOPUP), new Pair("OPENBANKING_STEERING", c.OPENBANKING_STEERING), new Pair("EXTERNAL_CARD_TOPUP", c.EXTERNAL_CARD_TOPUP), new Pair("STANDING_ORDERS", c.STANDING_ORDERS), new Pair("SAVINGS", c.VAULTS_SAVINGS), new Pair("CREDIT_CARD_APPLICATION", c.CREDIT_CARD_APPLICATION), new Pair("CREDIT_CARD_PREMIUM", c.CREDIT_CARD_PREMIUM), new Pair("REFINANCING_LOAN", c.REFINANCING_LOAN), new Pair("CREDIT_CARD_LIMIT_INCREASE", c.CREDIT_CARD_LIMIT_INCREASE), new Pair("LOAN_APPLICATION", c.LOAN_APPLICATION), new Pair("MORTGAGE", c.MORTGAGE), new Pair("OVERDRAFT", c.OVERDRAFT_APPLICATION), new Pair("REFINANCING_MORTGAGE", c.REFINANCING_MORTGAGE), new Pair("FTC_FORBEARANCE", c.FTC_FORBEARANCE), new Pair("PCW_CREDIT_APPLICATION", c.PCW_CREDIT_APPLICATION), new Pair("DIRECT_DEPOSIT", c.DIRECT_DEPOSIT), new Pair("COMMODITIES", c.COMMODITIES), new Pair("CHECKOUT_CRYPTO", c.CHECKOUT_CRYPTO), new Pair("VAULTS", c.VAULTS), new Pair("PERSONAL_DETAILS_TAX_RESIDENCY", c.PERSONAL_DETAILS_TAX_RESIDENCY), new Pair("CHANGE_USERNAME", c.CHANGE_USERNAME), new Pair("BENEFICIARY_SEARCH", c.BENEFICIARY_SEARCH), new Pair("GIFTS", c.GIFTS), new Pair("DEFERRED_CVV", c.DEFERRED_CVV), new Pair("RECURRING_PAYMENTS_CARD_MANDATES", c.RECURRING_PAYMENTS_CARD_MANDATES), new Pair("NEW_EEA_INSURANCE", c.NEW_EEA_INSURANCE), new Pair("CRYPTO_RECURRING_BUYS", c.CRYPTO_RECURRING_BUYS), new Pair("STOCK_BIO", c.STOCK_BIO), new Pair("PLUS_PLAN", c.PLUS_PLAN), new Pair("AUTO_TOPUP_ON_THE_FLY_REDESIGN", c.AUTO_TOPUP_ON_THE_FLY_REDESIGN), new Pair("CRYPTO_REFERRALS", c.CRYPTO_REFERRALS), new Pair("CRYPTO_WITHDRAWALS", c.CRYPTO_WITHDRAWALS), new Pair("CRYPTO_DEPOSITS", c.CRYPTO_DEPOSITS), new Pair("CRYPTO_REV_TOKEN", c.CRYPTO_REV_TOKEN), new Pair("CARDS_CRYPTO", c.CARDS_CRYPTO), new Pair("PAYMENTS_CHAT", c.PAYMENTS_CHAT), new Pair("REFER_BUSINESS", c.REFER_BUSINESS), new Pair("FREELANCER_PHASE_1", c.FREELANCER_PHASE_1), new Pair("ROBO", c.ROBO), new Pair("STAYS", c.STAYS), new Pair("FAVOURITES", c.FAVOURITES), new Pair("FAVOURITES_HOME_WATCHLIST_WIDGET", c.FAVOURITES_HOME_WATCHLIST_WIDGET), new Pair("FAVOURITES_HOME_ALERTS_WIDGET", c.FAVOURITES_HOME_ALERTS_WIDGET), new Pair("FAVOURITES_WNT_ALERTS_WIDGET", c.FAVOURITES_WNT_ALERTS_WIDGET), new Pair("PAY_LATER_APPLICATION", c.PAY_LATER_APPLICATION), new Pair("CRYPTO_STAKING", c.STAKING), new Pair("TRADING_REPORTS", c.TRADING_REPORTS), new Pair("PUSH_TO_CARD", c.PUSH_TO_CARD), new Pair("TRAVEL_STAYS_VRBO", c.STAYS_HOMES), new Pair("US_CASH_DEPOSIT", c.US_CASH_DEPOSIT), new Pair("EU_CASH_DEPOSIT", c.EU_CASH_DEPOSIT), new Pair("P2P_OUTGOING", c.P2P_OUTGOING), new Pair("MONEY_REQUEST", c.MONEY_REQUEST), new Pair("BANK_TRANSFER", c.BANK_TRANSFER), new Pair("ANONYMOUS_TRANSFER_LINK", c.ANONYMOUS_TRANSFER_LINK), new Pair("KYC_VERIFICATION", c.KYC_VERIFICATION), new Pair("PAYMENT_METHOD", c.PAYMENT_METHOD), new Pair("LIFESTYLE", c.LIFESTYLE), new Pair("MILES", c.MILES), new Pair("ACCOUNT_SWITCHING", c.ACCOUNT_SWITCHING), new Pair("REV_POINTS", c.REV_POINTS), new Pair("REVOLUT_POINTS", c.REVOLUT_POINTS), new Pair("REVOLUT_POINTS_SPARE_CHANGE", c.REVOLUT_POINTS_SPARE_CHANGE), new Pair("REVOLUT_POINTS_POINTS_POCKET", c.REVOLUT_POINTS_POINTS_POCKET), new Pair("CONNECT_ESIM", c.ESIM), new Pair("ESIM_MOBILE_PLANS", c.ESIM_MOBILE_PLANS), new Pair("BRL_EXCHANGE_ALL_FIAT_ENABLED", c.BRL_EXCHANGE_ALL_FIAT), new Pair("CHAT_REFERRALS_INVITATION", c.CHAT_REFERRALS_INVITATION), new Pair("TRANSFERS_REFERRAL_PROMO_BANNER", c.TRANSFERS_REFERRAL_PROMO_BANNER), new Pair("BANK_ALIAS_PIX_ENABLED", c.PIX_BRL), new Pair("PAY_BILLS_TAXES", c.PAY_BILLS_TAXES), new Pair("BANK_RECEIVING_METHOD", c.BANK_RECEIVING_METHOD), new Pair("CARD_RECEIVING_METHOD", c.CARD_RECEIVING_METHOD), new Pair("APM_BLIK", c.BLIK_PLN), new Pair("APM_BIZUM", c.APM_BIZUM), new Pair("APM_IDEAL", c.APM_IDEAL), new Pair("APM_MULTIBANCO", c.APM_MULTIBANCO), new Pair("APM_WERO", c.APM_WERO), new Pair("ACCOUNT_SWITCH", c.ACCOUNT_SWITCH), new Pair("OPENBANKING_MORE_BANKS_ITEM", c.OPENBANKING_MORE_BANKS_ITEM), new Pair("DONATIONS", c.DONATIONS), new Pair("EXCHANGE", c.EXCHANGE), new Pair("PREKYC_TOPUP", c.PREKYC_TOPUP), new Pair("TRUSTED_MERCHANT", c.TRUSTED_MERCHANT), new Pair("INCOME_SORTER", c.INCOME_SORTER), new Pair("REVOLUT_PAY_SETTINGS", c.REVOLUT_PAY_SETTINGS), new Pair("DISCOVERABILITY_BY_USERNAME", c.DISCOVERABILITY_BY_USERNAME), new Pair("MESSAGING_WITH_FRIENDS", c.MESSAGING_WITH_FRIENDS), new Pair("GROUP_ADDITION", c.GROUP_ADDITION), new Pair("OPT_OUT", c.OPT_OUT));

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public static final yoj.a a(hpj.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        c cVar = (c) u1.v(aVar.getType(), f145454b);
        d dVar = (d) u1.v(aVar.getState(), f145453a);
        if (cVar == null || dVar == null) {
            return null;
        }
        List<b> invites = aVar.getInvites();
        ArrayList arrayList = new ArrayList(w.t(invites, 10));
        for (b bVar : invites) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            arrayList.add(new g(bVar.getId(), bVar.getInviteeId(), bVar.getInviteeFullName()));
        }
        Map properties = aVar.getProperties();
        if (properties == null) {
            properties = r0.g();
        }
        return new yoj.a(cVar, dVar, arrayList, properties);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    public static final ArrayList b(f fVar) {
        hpj.a aVar;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        ArrayList<yoj.a> arrayList = fVar.f315686a;
        ArrayList arrayList2 = new ArrayList();
        for (yoj.a aVar2 : arrayList) {
            Intrinsics.checkNotNullParameter(aVar2, "<this>");
            String strH = u1.h(aVar2.f315682a, f145454b);
            String strH2 = u1.h(aVar2.f315683b, f145453a);
            if (strH == null || strH2 == null) {
                aVar = null;
            } else {
                List<g> list = aVar2.f315684c;
                ArrayList arrayList3 = new ArrayList(w.t(list, 10));
                for (g gVar : list) {
                    Intrinsics.checkNotNullParameter(gVar, "<this>");
                    arrayList3.add(new b(gVar.f315687a, gVar.f315688b, gVar.f315689c));
                }
                aVar = new hpj.a(strH, strH2, arrayList3, aVar2.d);
            }
            if (aVar != null) {
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }
}
