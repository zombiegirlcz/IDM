package com.revolut.domain.models.openbanking;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/domain/models/openbanking/ConsentType;", "", "<init>", "(Ljava/lang/String;I)V", "ACCOUNTS", "PAYMENTS", "FUND_CONFIRMATIONS", "AU_READ_ONLY", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConsentType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ConsentType[] $VALUES;
    public static final ConsentType ACCOUNTS = new ConsentType("ACCOUNTS", 0);
    public static final ConsentType PAYMENTS = new ConsentType("PAYMENTS", 1);
    public static final ConsentType FUND_CONFIRMATIONS = new ConsentType("FUND_CONFIRMATIONS", 2);
    public static final ConsentType AU_READ_ONLY = new ConsentType("AU_READ_ONLY", 3);

    private static final /* synthetic */ ConsentType[] $values() {
        return new ConsentType[]{ACCOUNTS, PAYMENTS, FUND_CONFIRMATIONS, AU_READ_ONLY};
    }

    static {
        ConsentType[] consentTypeArr$values = $values();
        $VALUES = consentTypeArr$values;
        $ENTRIES = s.n(consentTypeArr$values);
    }

    private ConsentType(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ConsentType valueOf(String str) {
        return (ConsentType) Enum.valueOf(ConsentType.class, str);
    }

    public static ConsentType[] values() {
        return (ConsentType[]) $VALUES.clone();
    }
}
