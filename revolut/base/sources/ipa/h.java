package ipa;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h ACCESS_RECOVERY;
    public static final h BADGE_UPDATE;
    public static final h BUDGETING;
    public static final h CARDS_UPDATE;
    public static final h CHALLENGES_UPDATE;
    public static final h COMMODITIES_VOLATILITY;
    public static final h COMPANY_CHANGED;
    public static final h CONTEXTUAL_PUSH;
    public static final h CREDIT;
    public static final h CRYPTOCURRENCY_VOLATILITY;
    public static final h INTERACTIVE_FEED_UPDATE;
    public static final h JOINT_SUBACCOUNT_UPDATE;
    public static final h KYC;
    public static final h MARKETING;
    public static final h OFFERS;
    public static final h OTHER;
    public static final h PROFILE_PICTURE_UPDATED;
    public static final h RETAIL_NPS;
    public static final h REWARDS_HUB_CHALLENGE_STATE_UPDATED;
    public static final h REWARDS_HUB_STEP_COMPLETION;
    public static final h SAVINGS_ACCOUNT_BALANCE_UPDATED;
    public static final h SAVINGS_ACCOUNT_UPDATED;
    public static final h SAVINGS_CHALLENGE_ACCOUNT_UPDATED;
    public static final h SAVINGS_ONBOARDING_UPDATED;
    public static final h SAVINGS_PRODUCTS_UPDATED;
    public static final h SHARED_VAULT_INVITE;
    public static final h SHARED_VAULT_MEMBER_STATE;
    public static final h SUBACCOUNT_BILLS_UPDATE;
    public static final h THREE_DS;
    public static final h TRANSACTIONAL;
    public static final h VERIFY_TOKEN;
    public static final h WALLETS_UPDATE;
    public static final h WELCOME_PUSH;

    static {
        h hVar = new h("VERIFY_TOKEN", 0);
        VERIFY_TOKEN = hVar;
        h hVar2 = new h("MARKETING", 1);
        MARKETING = hVar2;
        h hVar3 = new h("TRANSACTIONAL", 2);
        TRANSACTIONAL = hVar3;
        h hVar4 = new h("BUDGETING", 3);
        BUDGETING = hVar4;
        h hVar5 = new h("OFFERS", 4);
        OFFERS = hVar5;
        h hVar6 = new h("WELCOME_PUSH", 5);
        WELCOME_PUSH = hVar6;
        h hVar7 = new h("SHARED_VAULT_INVITE", 6);
        SHARED_VAULT_INVITE = hVar7;
        h hVar8 = new h("SHARED_VAULT_MEMBER_STATE", 7);
        SHARED_VAULT_MEMBER_STATE = hVar8;
        h hVar9 = new h("CRYPTOCURRENCY_VOLATILITY", 8);
        CRYPTOCURRENCY_VOLATILITY = hVar9;
        h hVar10 = new h("COMMODITIES_VOLATILITY", 9);
        COMMODITIES_VOLATILITY = hVar10;
        h hVar11 = new h("INTERACTIVE_FEED_UPDATE", 10);
        INTERACTIVE_FEED_UPDATE = hVar11;
        h hVar12 = new h("ACCESS_RECOVERY", 11);
        ACCESS_RECOVERY = hVar12;
        h hVar13 = new h("CONTEXTUAL_PUSH", 12);
        CONTEXTUAL_PUSH = hVar13;
        h hVar14 = new h("RETAIL_NPS", 13);
        RETAIL_NPS = hVar14;
        h hVar15 = new h("THREE_DS", 14);
        THREE_DS = hVar15;
        h hVar16 = new h("KYC", 15);
        KYC = hVar16;
        h hVar17 = new h("WALLETS_UPDATE", 16);
        WALLETS_UPDATE = hVar17;
        h hVar18 = new h("CREDIT", 17);
        CREDIT = hVar18;
        h hVar19 = new h("SAVINGS_ONBOARDING_UPDATED", 18);
        SAVINGS_ONBOARDING_UPDATED = hVar19;
        h hVar20 = new h("SAVINGS_ACCOUNT_BALANCE_UPDATED", 19);
        SAVINGS_ACCOUNT_BALANCE_UPDATED = hVar20;
        h hVar21 = new h("SAVINGS_ACCOUNT_UPDATED", 20);
        SAVINGS_ACCOUNT_UPDATED = hVar21;
        h hVar22 = new h("SAVINGS_CHALLENGE_ACCOUNT_UPDATED", 21);
        SAVINGS_CHALLENGE_ACCOUNT_UPDATED = hVar22;
        h hVar23 = new h("SAVINGS_PRODUCTS_UPDATED", 22);
        SAVINGS_PRODUCTS_UPDATED = hVar23;
        h hVar24 = new h("SUBACCOUNT_BILLS_UPDATE", 23);
        SUBACCOUNT_BILLS_UPDATE = hVar24;
        h hVar25 = new h("JOINT_SUBACCOUNT_UPDATE", 24);
        JOINT_SUBACCOUNT_UPDATE = hVar25;
        h hVar26 = new h("COMPANY_CHANGED", 25);
        COMPANY_CHANGED = hVar26;
        h hVar27 = new h("CHALLENGES_UPDATE", 26);
        CHALLENGES_UPDATE = hVar27;
        h hVar28 = new h("CARDS_UPDATE", 27);
        CARDS_UPDATE = hVar28;
        h hVar29 = new h("PROFILE_PICTURE_UPDATED", 28);
        PROFILE_PICTURE_UPDATED = hVar29;
        h hVar30 = new h("REWARDS_HUB_STEP_COMPLETION", 29);
        REWARDS_HUB_STEP_COMPLETION = hVar30;
        h hVar31 = new h("REWARDS_HUB_CHALLENGE_STATE_UPDATED", 30);
        REWARDS_HUB_CHALLENGE_STATE_UPDATED = hVar31;
        h hVar32 = new h("BADGE_UPDATE", 31);
        BADGE_UPDATE = hVar32;
        h hVar33 = new h("OTHER", 32);
        OTHER = hVar33;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, hVar14, hVar15, hVar16, hVar17, hVar18, hVar19, hVar20, hVar21, hVar22, hVar23, hVar24, hVar25, hVar26, hVar27, hVar28, hVar29, hVar30, hVar31, hVar32, hVar33};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
