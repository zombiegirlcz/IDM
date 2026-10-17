package com.revolut.domain.models.openbanking;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/domain/models/openbanking/PaymentFrequency;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DAILY", "WEEKLY", "MONTHLY", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentFrequency {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PaymentFrequency[] $VALUES;

    @NotNull
    private final String value;
    public static final PaymentFrequency DAILY = new PaymentFrequency("DAILY", 0, "EvryDay");
    public static final PaymentFrequency WEEKLY = new PaymentFrequency("WEEKLY", 1, "IntrvlWkDay");
    public static final PaymentFrequency MONTHLY = new PaymentFrequency("MONTHLY", 2, "IntrvlMnthDay");

    private static final /* synthetic */ PaymentFrequency[] $values() {
        return new PaymentFrequency[]{DAILY, WEEKLY, MONTHLY};
    }

    static {
        PaymentFrequency[] paymentFrequencyArr$values = $values();
        $VALUES = paymentFrequencyArr$values;
        $ENTRIES = s.n(paymentFrequencyArr$values);
    }

    private PaymentFrequency(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static PaymentFrequency valueOf(String str) {
        return (PaymentFrequency) Enum.valueOf(PaymentFrequency.class, str);
    }

    public static PaymentFrequency[] values() {
        return (PaymentFrequency[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
