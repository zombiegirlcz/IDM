package com.revolut.domain.models.openbanking;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/domain/models/openbanking/ConsentAccountType;", "", "<init>", "(Ljava/lang/String;I)V", "UK", "US", "IBAN", "PULLED_TRANSFER", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConsentAccountType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ConsentAccountType[] $VALUES;
    public static final ConsentAccountType UK = new ConsentAccountType("UK", 0);
    public static final ConsentAccountType US = new ConsentAccountType("US", 1);
    public static final ConsentAccountType IBAN = new ConsentAccountType("IBAN", 2);
    public static final ConsentAccountType PULLED_TRANSFER = new ConsentAccountType("PULLED_TRANSFER", 3);

    private static final /* synthetic */ ConsentAccountType[] $values() {
        return new ConsentAccountType[]{UK, US, IBAN, PULLED_TRANSFER};
    }

    static {
        ConsentAccountType[] consentAccountTypeArr$values = $values();
        $VALUES = consentAccountTypeArr$values;
        $ENTRIES = s.n(consentAccountTypeArr$values);
    }

    private ConsentAccountType(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ConsentAccountType valueOf(String str) {
        return (ConsentAccountType) Enum.valueOf(ConsentAccountType.class, str);
    }

    public static ConsentAccountType[] values() {
        return (ConsentAccountType[]) $VALUES.clone();
    }
}
