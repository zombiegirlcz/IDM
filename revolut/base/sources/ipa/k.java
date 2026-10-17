package ipa;

import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f167703a;

    static {
        Integer[] elements = {6, 8};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f167703a = kotlin.collections.d.y0(elements);
    }

    public static final String a(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return (String) jVar.get("abbreviated_name");
    }

    public static final String b(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return (String) jVar.get("category");
    }

    public static final String c(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return (String) jVar.get("user_code");
    }

    public static final String d(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return (String) jVar.get("code");
    }

    public static final String e(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return (String) jVar.get("app_link");
    }

    public static final String f(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return (String) jVar.get("feedContext");
    }

    public static final String g(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return (String) jVar.get("group_id");
    }

    public static final String h(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return (String) jVar.get("id");
    }

    public static final String i(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return (String) jVar.get("message");
    }

    public static final String j(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return (String) jVar.get("message_id");
    }

    public static final String k(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return (String) jVar.get("push_id");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final h l(j jVar) {
        String strJ;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        String strB = b(jVar);
        if (strB != null) {
            Locale locale = Locale.UK;
            strJ = v0.a.j(locale, "UK", strB, locale, "toUpperCase(...)");
        } else {
            strJ = null;
        }
        if (strJ != null) {
            switch (strJ.hashCode()) {
                case -2053803529:
                    if (strJ.equals("WELCOME_PUSH")) {
                        return h.WELCOME_PUSH;
                    }
                    break;
                case -1966463593:
                    if (strJ.equals("OFFERS")) {
                        return h.OFFERS;
                    }
                    break;
                case -1752429427:
                    if (strJ.equals("INTERACTIVE_FEED_UPDATE")) {
                        return h.INTERACTIVE_FEED_UPDATE;
                    }
                    break;
                case -1707201620:
                    if (strJ.equals("REWARDS_HUB_CHALLENGE_STATE_UPDATED")) {
                        return h.REWARDS_HUB_CHALLENGE_STATE_UPDATED;
                    }
                    break;
                case -1327914349:
                    if (strJ.equals("VERIFY_TOKEN")) {
                        return h.VERIFY_TOKEN;
                    }
                    break;
                case -1303939196:
                    if (strJ.equals("PROFILE_PICTURE_UPDATED")) {
                        return h.PROFILE_PICTURE_UPDATED;
                    }
                    break;
                case -1207361970:
                    if (strJ.equals("SUBACCOUNT_BILLS_UPDATE")) {
                        return h.SUBACCOUNT_BILLS_UPDATE;
                    }
                    break;
                case -730482839:
                    if (strJ.equals("TRANSACTIONAL")) {
                        return h.TRANSACTIONAL;
                    }
                    break;
                case -347256816:
                    if (strJ.equals("ACCESS_RECOVERY")) {
                        return h.ACCESS_RECOVERY;
                    }
                    break;
                case 51202:
                    if (strJ.equals("3DS")) {
                        return h.THREE_DS;
                    }
                    break;
                case 74901:
                    if (strJ.equals("KYC")) {
                        return h.KYC;
                    }
                    break;
                case 51322117:
                    if (strJ.equals("BADGE_UPDATE")) {
                        return h.BADGE_UPDATE;
                    }
                    break;
                case 141406386:
                    if (strJ.equals("COMPANY_CHANGED")) {
                        return h.COMPANY_CHANGED;
                    }
                    break;
                case 393533638:
                    if (strJ.equals("JOINT_SUBACCOUNT_UPDATE")) {
                        return h.JOINT_SUBACCOUNT_UPDATE;
                    }
                    break;
                case 418732554:
                    if (strJ.equals("REWARDS_HUB_STEP_COMPLETION")) {
                        return h.REWARDS_HUB_STEP_COMPLETION;
                    }
                    break;
                case 656827767:
                    if (strJ.equals("CRYPTOCURRENCYVOLATILITY")) {
                        return h.CRYPTOCURRENCY_VOLATILITY;
                    }
                    break;
                case 697738096:
                    if (strJ.equals("SHARED_VAULT_INVITE")) {
                        return h.SHARED_VAULT_INVITE;
                    }
                    break;
                case 831190318:
                    if (strJ.equals("WALLETS_UPDATE")) {
                        return h.WALLETS_UPDATE;
                    }
                    break;
                case 848763975:
                    if (strJ.equals("SAVINGS_CHALLENGE_ACCOUNT_UPDATED")) {
                        return h.SAVINGS_CHALLENGE_ACCOUNT_UPDATED;
                    }
                    break;
                case 990561856:
                    if (strJ.equals("SAVINGS_ACCOUNT_BALANCE_UPDATED")) {
                        return h.SAVINGS_ACCOUNT_BALANCE_UPDATED;
                    }
                    break;
                case 992396134:
                    if (strJ.equals("RETAIL.NPS")) {
                        return h.RETAIL_NPS;
                    }
                    break;
                case 1101788765:
                    if (strJ.equals("BUDGETING")) {
                        return h.BUDGETING;
                    }
                    break;
                case 1196707704:
                    if (strJ.equals("CHALLENGES_UPDATE")) {
                        return h.CHALLENGES_UPDATE;
                    }
                    break;
                case 1436035792:
                    if (strJ.equals("COMMODITIESVOLATILITY")) {
                        return h.COMMODITIES_VOLATILITY;
                    }
                    break;
                case 1481120069:
                    if (strJ.equals("CARDS_UPDATE")) {
                        return h.CARDS_UPDATE;
                    }
                    break;
                case 1495809958:
                    if (strJ.equals("SAVINGS_PRODUCTS_UPDATED")) {
                        return h.SAVINGS_PRODUCTS_UPDATED;
                    }
                    break;
                case 1546070451:
                    if (strJ.equals("SHARED_VAULT_MEMBER_STATE")) {
                        return h.SHARED_VAULT_MEMBER_STATE;
                    }
                    break;
                case 1593810034:
                    if (strJ.equals("IN_APP_PUSH")) {
                        return h.CONTEXTUAL_PUSH;
                    }
                    break;
                case 1852824070:
                    if (strJ.equals("MARKETING")) {
                        return h.MARKETING;
                    }
                    break;
                case 1898596547:
                    if (strJ.equals("SAVINGS_ACCOUNT_UPDATED")) {
                        return h.SAVINGS_ACCOUNT_UPDATED;
                    }
                    break;
                case 1992677341:
                    if (strJ.equals("SAVINGS_ONBOARDING_UPDATED")) {
                        return h.SAVINGS_ONBOARDING_UPDATED;
                    }
                    break;
                case 1996005113:
                    if (strJ.equals("CREDIT")) {
                        return h.CREDIT;
                    }
                    break;
            }
        }
        return h.OTHER;
    }

    public static final String m(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return (String) jVar.get("savings_account_id");
    }

    public static final String n(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return (String) jVar.get("template_id");
    }

    public static final String o(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return (String) jVar.get("title");
    }

    public static final boolean p(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        String strI = i(jVar);
        return !(strI == null || strI.length() == 0);
    }

    public static final boolean q(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (l(jVar) != h.TRANSACTIONAL) {
            return false;
        }
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (Intrinsics.f((String) jVar.get("type"), "auth")) {
            return true;
        }
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return Intrinsics.f((String) jVar.get("type"), "topup");
    }

    public static final boolean r(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (l(jVar) != h.VERIFY_TOKEN) {
            return false;
        }
        Set set = f167703a;
        String strD = d(jVar);
        return d0.T(set, strD != null ? Integer.valueOf(strD.length()) : null);
    }

    public static final boolean s(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        String strE = e(jVar);
        return !(strE == null || strE.length() == 0);
    }

    public static final boolean t(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return a0.z((String) jVar.get("domain_type"), "LOAN", true);
    }
}
