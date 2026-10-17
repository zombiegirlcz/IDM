package com.revolut.domain.models.security_settings;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/domain/models/security_settings/SecuritySettingType;", "", "<init>", "(Ljava/lang/String;I)V", "INCOGNITO", "ANALYTICS_EVENTS_TRACKING", "CREDIT_DATA_SHARING", "THIRD_PARTY_PROMOTION", "TRANSACTIONS_USAGE", "REVOLUT_PRODUCTS_USAGE", "REVPOINTS_PROFILE_USAGE", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SecuritySettingType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SecuritySettingType[] $VALUES;
    public static final SecuritySettingType INCOGNITO = new SecuritySettingType("INCOGNITO", 0);
    public static final SecuritySettingType ANALYTICS_EVENTS_TRACKING = new SecuritySettingType("ANALYTICS_EVENTS_TRACKING", 1);
    public static final SecuritySettingType CREDIT_DATA_SHARING = new SecuritySettingType("CREDIT_DATA_SHARING", 2);
    public static final SecuritySettingType THIRD_PARTY_PROMOTION = new SecuritySettingType("THIRD_PARTY_PROMOTION", 3);
    public static final SecuritySettingType TRANSACTIONS_USAGE = new SecuritySettingType("TRANSACTIONS_USAGE", 4);
    public static final SecuritySettingType REVOLUT_PRODUCTS_USAGE = new SecuritySettingType("REVOLUT_PRODUCTS_USAGE", 5);
    public static final SecuritySettingType REVPOINTS_PROFILE_USAGE = new SecuritySettingType("REVPOINTS_PROFILE_USAGE", 6);

    private static final /* synthetic */ SecuritySettingType[] $values() {
        return new SecuritySettingType[]{INCOGNITO, ANALYTICS_EVENTS_TRACKING, CREDIT_DATA_SHARING, THIRD_PARTY_PROMOTION, TRANSACTIONS_USAGE, REVOLUT_PRODUCTS_USAGE, REVPOINTS_PROFILE_USAGE};
    }

    static {
        SecuritySettingType[] securitySettingTypeArr$values = $values();
        $VALUES = securitySettingTypeArr$values;
        $ENTRIES = s.n(securitySettingTypeArr$values);
    }

    private SecuritySettingType(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static SecuritySettingType valueOf(String str) {
        return (SecuritySettingType) Enum.valueOf(SecuritySettingType.class, str);
    }

    public static SecuritySettingType[] values() {
        return (SecuritySettingType[]) $VALUES.clone();
    }
}
