package com.revolut.domain.models.openbanking;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/domain/models/openbanking/PaymentConsentType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DOMESTIC_PAYMENT", "DOMESTIC_SCHEDULED_PAYMENT", "DOMESTIC_RECURRING_ORDER", "INTERNATIONAL_PAYMENT", "INTERNATIONAL_SCHEDULED_PAYMENT", "INTERNATIONAL_RECURRING_ORDER", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentConsentType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PaymentConsentType[] $VALUES;

    @NotNull
    private final String value;
    public static final PaymentConsentType DOMESTIC_PAYMENT = new PaymentConsentType("DOMESTIC_PAYMENT", 0, "DomesticPaymentConsent");
    public static final PaymentConsentType DOMESTIC_SCHEDULED_PAYMENT = new PaymentConsentType("DOMESTIC_SCHEDULED_PAYMENT", 1, "DomesticScheduledPaymentConsent");
    public static final PaymentConsentType DOMESTIC_RECURRING_ORDER = new PaymentConsentType("DOMESTIC_RECURRING_ORDER", 2, "DomesticStandingOrderConsent");
    public static final PaymentConsentType INTERNATIONAL_PAYMENT = new PaymentConsentType("INTERNATIONAL_PAYMENT", 3, "InternationalPaymentConsent");
    public static final PaymentConsentType INTERNATIONAL_SCHEDULED_PAYMENT = new PaymentConsentType("INTERNATIONAL_SCHEDULED_PAYMENT", 4, "InternationalScheduledPaymentConsent");
    public static final PaymentConsentType INTERNATIONAL_RECURRING_ORDER = new PaymentConsentType("INTERNATIONAL_RECURRING_ORDER", 5, "InternationalStandingOrderConsent");

    private static final /* synthetic */ PaymentConsentType[] $values() {
        return new PaymentConsentType[]{DOMESTIC_PAYMENT, DOMESTIC_SCHEDULED_PAYMENT, DOMESTIC_RECURRING_ORDER, INTERNATIONAL_PAYMENT, INTERNATIONAL_SCHEDULED_PAYMENT, INTERNATIONAL_RECURRING_ORDER};
    }

    static {
        PaymentConsentType[] paymentConsentTypeArr$values = $values();
        $VALUES = paymentConsentTypeArr$values;
        $ENTRIES = s.n(paymentConsentTypeArr$values);
    }

    private PaymentConsentType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static PaymentConsentType valueOf(String str) {
        return (PaymentConsentType) Enum.valueOf(PaymentConsentType.class, str);
    }

    public static PaymentConsentType[] values() {
        return (PaymentConsentType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
