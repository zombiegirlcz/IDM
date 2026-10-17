package com.revolut.data.network.models.security;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/revolut/data/network/models/security/SecuritySettings;", "", "settingName", "", "settingsQuery", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getSettingName", "()Ljava/lang/String;", "getSettingsQuery", "INCOGNITO", "ANALYTICS_EVENTS", "CREDIT_DATA", "PERSONALIZED_IN_APP_MARKETING", "PERSONALIZED_THIRD_PARTY_PROMOTION", "USERNAME", "PAYDAY_ACTIVITY_SETTING", "MESSAGING_WITH_FRIENDS_SETTING", "PRICING_PLAN_REVEAL_SETTING", "ADDING_TO_GROUPS_SETTINGS", "PROFILE_REVEAL_SETTING", "BIRTHDAY_SHARING", "JOINT_OBA_DATA_SHARING_CONSENT", "JOINT_OBA_DATA_SHARING_NOTIFICATIONS", "TRANSACTIONS_USAGE", "REVOLUT_PRODUCTS_USAGE", "REVPOINTS_PROFILE_USAGE", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SecuritySettings {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SecuritySettings[] $VALUES;

    @NotNull
    private final String settingName;

    @NotNull
    private final String settingsQuery;
    public static final SecuritySettings INCOGNITO = new SecuritySettings("INCOGNITO", 0, "incognito", "incognito");
    public static final SecuritySettings ANALYTICS_EVENTS = new SecuritySettings("ANALYTICS_EVENTS", 1, "analyticsEventsTracking", "analytics-events-tracking");
    public static final SecuritySettings CREDIT_DATA = new SecuritySettings("CREDIT_DATA", 2, "creditDataSharing", "credit-data-sharing");
    public static final SecuritySettings PERSONALIZED_IN_APP_MARKETING = new SecuritySettings("PERSONALIZED_IN_APP_MARKETING", 3, "personalizedInAppMarketing", "personalized-in-app-marketing");
    public static final SecuritySettings PERSONALIZED_THIRD_PARTY_PROMOTION = new SecuritySettings("PERSONALIZED_THIRD_PARTY_PROMOTION", 4, "thirdPartyTargeting", "third-party-targeting");
    public static final SecuritySettings USERNAME = new SecuritySettings("USERNAME", 5, "username", "username");
    public static final SecuritySettings PAYDAY_ACTIVITY_SETTING = new SecuritySettings("PAYDAY_ACTIVITY_SETTING", 6, "paydayActivity", "payday-activity");
    public static final SecuritySettings MESSAGING_WITH_FRIENDS_SETTING = new SecuritySettings("MESSAGING_WITH_FRIENDS_SETTING", 7, "messaging", "messaging");
    public static final SecuritySettings PRICING_PLAN_REVEAL_SETTING = new SecuritySettings("PRICING_PLAN_REVEAL_SETTING", 8, "pricingPlanReveal", "pricing-plan-reveal");
    public static final SecuritySettings ADDING_TO_GROUPS_SETTINGS = new SecuritySettings("ADDING_TO_GROUPS_SETTINGS", 9, "groups", "groups");
    public static final SecuritySettings PROFILE_REVEAL_SETTING = new SecuritySettings("PROFILE_REVEAL_SETTING", 10, "profileReveal", "profile-reveal");
    public static final SecuritySettings BIRTHDAY_SHARING = new SecuritySettings("BIRTHDAY_SHARING", 11, "birthdaySharing", "birthday-sharing");
    public static final SecuritySettings JOINT_OBA_DATA_SHARING_CONSENT = new SecuritySettings("JOINT_OBA_DATA_SHARING_CONSENT", 12, "jointObaDataSharing", "joint-oba-data-sharing");
    public static final SecuritySettings JOINT_OBA_DATA_SHARING_NOTIFICATIONS = new SecuritySettings("JOINT_OBA_DATA_SHARING_NOTIFICATIONS", 13, "jointObaDataSharingNotifications", "joint-oba-data-sharing-notifications");
    public static final SecuritySettings TRANSACTIONS_USAGE = new SecuritySettings("TRANSACTIONS_USAGE", 14, "transactionsUsage", "transactions-usage");
    public static final SecuritySettings REVOLUT_PRODUCTS_USAGE = new SecuritySettings("REVOLUT_PRODUCTS_USAGE", 15, "revolutProductsUsage", "revolut-products-usage");
    public static final SecuritySettings REVPOINTS_PROFILE_USAGE = new SecuritySettings("REVPOINTS_PROFILE_USAGE", 16, "revpointsProfileUsage", "revpoints-profile-usage");

    private static final /* synthetic */ SecuritySettings[] $values() {
        return new SecuritySettings[]{INCOGNITO, ANALYTICS_EVENTS, CREDIT_DATA, PERSONALIZED_IN_APP_MARKETING, PERSONALIZED_THIRD_PARTY_PROMOTION, USERNAME, PAYDAY_ACTIVITY_SETTING, MESSAGING_WITH_FRIENDS_SETTING, PRICING_PLAN_REVEAL_SETTING, ADDING_TO_GROUPS_SETTINGS, PROFILE_REVEAL_SETTING, BIRTHDAY_SHARING, JOINT_OBA_DATA_SHARING_CONSENT, JOINT_OBA_DATA_SHARING_NOTIFICATIONS, TRANSACTIONS_USAGE, REVOLUT_PRODUCTS_USAGE, REVPOINTS_PROFILE_USAGE};
    }

    static {
        SecuritySettings[] securitySettingsArr$values = $values();
        $VALUES = securitySettingsArr$values;
        $ENTRIES = s.n(securitySettingsArr$values);
    }

    private SecuritySettings(String str, int i, String str2, String str3) {
        this.settingName = str2;
        this.settingsQuery = str3;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static SecuritySettings valueOf(String str) {
        return (SecuritySettings) Enum.valueOf(SecuritySettings.class, str);
    }

    public static SecuritySettings[] values() {
        return (SecuritySettings[]) $VALUES.clone();
    }

    @NotNull
    public final String getSettingName() {
        return this.settingName;
    }

    @NotNull
    public final String getSettingsQuery() {
        return this.settingsQuery;
    }
}
