package com.revolut.domain.models.openbanking;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/revolut/domain/models/openbanking/ExternalPaymentStatus$State", "", "Lcom/revolut/domain/models/openbanking/ExternalPaymentStatus$State;", "<init>", "(Ljava/lang/String;I)V", "CREATED", "SUBMITTED", "AWAITING_AUTHORIZATION", "AUTHORISED", "ACCEPTED", "CANCELLED", "FAILED", "REJECTED", "EXECUTED", "UNKNOWN", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExternalPaymentStatus$State {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExternalPaymentStatus$State[] $VALUES;
    public static final ExternalPaymentStatus$State CREATED = new ExternalPaymentStatus$State("CREATED", 0);
    public static final ExternalPaymentStatus$State SUBMITTED = new ExternalPaymentStatus$State("SUBMITTED", 1);
    public static final ExternalPaymentStatus$State AWAITING_AUTHORIZATION = new ExternalPaymentStatus$State("AWAITING_AUTHORIZATION", 2);
    public static final ExternalPaymentStatus$State AUTHORISED = new ExternalPaymentStatus$State("AUTHORISED", 3);
    public static final ExternalPaymentStatus$State ACCEPTED = new ExternalPaymentStatus$State("ACCEPTED", 4);
    public static final ExternalPaymentStatus$State CANCELLED = new ExternalPaymentStatus$State("CANCELLED", 5);
    public static final ExternalPaymentStatus$State FAILED = new ExternalPaymentStatus$State("FAILED", 6);
    public static final ExternalPaymentStatus$State REJECTED = new ExternalPaymentStatus$State("REJECTED", 7);
    public static final ExternalPaymentStatus$State EXECUTED = new ExternalPaymentStatus$State("EXECUTED", 8);
    public static final ExternalPaymentStatus$State UNKNOWN = new ExternalPaymentStatus$State("UNKNOWN", 9);

    private static final /* synthetic */ ExternalPaymentStatus$State[] $values() {
        return new ExternalPaymentStatus$State[]{CREATED, SUBMITTED, AWAITING_AUTHORIZATION, AUTHORISED, ACCEPTED, CANCELLED, FAILED, REJECTED, EXECUTED, UNKNOWN};
    }

    static {
        ExternalPaymentStatus$State[] externalPaymentStatus$StateArr$values = $values();
        $VALUES = externalPaymentStatus$StateArr$values;
        $ENTRIES = s.n(externalPaymentStatus$StateArr$values);
    }

    private ExternalPaymentStatus$State(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ExternalPaymentStatus$State valueOf(String str) {
        return (ExternalPaymentStatus$State) Enum.valueOf(ExternalPaymentStatus$State.class, str);
    }

    public static ExternalPaymentStatus$State[] values() {
        return (ExternalPaymentStatus$State[]) $VALUES.clone();
    }
}
