package com.revolut.domain.models.transactions;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/domain/models/transactions/PaymentSystem;", "", "<init>", "(Ljava/lang/String;I)V", "MASTERCARD", "VISA", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentSystem {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PaymentSystem[] $VALUES;
    public static final PaymentSystem MASTERCARD = new PaymentSystem("MASTERCARD", 0);
    public static final PaymentSystem VISA = new PaymentSystem("VISA", 1);

    private static final /* synthetic */ PaymentSystem[] $values() {
        return new PaymentSystem[]{MASTERCARD, VISA};
    }

    static {
        PaymentSystem[] paymentSystemArr$values = $values();
        $VALUES = paymentSystemArr$values;
        $ENTRIES = s.n(paymentSystemArr$values);
    }

    private PaymentSystem(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static PaymentSystem valueOf(String str) {
        return (PaymentSystem) Enum.valueOf(PaymentSystem.class, str);
    }

    public static PaymentSystem[] values() {
        return (PaymentSystem[]) $VALUES.clone();
    }
}
