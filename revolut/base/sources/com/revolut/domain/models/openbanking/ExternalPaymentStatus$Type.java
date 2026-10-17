package com.revolut.domain.models.openbanking;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/revolut/domain/models/openbanking/ExternalPaymentStatus$Type", "", "Lcom/revolut/domain/models/openbanking/ExternalPaymentStatus$Type;", "<init>", "(Ljava/lang/String;I)V", "ONE_OFF", "LINKED", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExternalPaymentStatus$Type {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExternalPaymentStatus$Type[] $VALUES;
    public static final ExternalPaymentStatus$Type ONE_OFF = new ExternalPaymentStatus$Type("ONE_OFF", 0);
    public static final ExternalPaymentStatus$Type LINKED = new ExternalPaymentStatus$Type("LINKED", 1);

    private static final /* synthetic */ ExternalPaymentStatus$Type[] $values() {
        return new ExternalPaymentStatus$Type[]{ONE_OFF, LINKED};
    }

    static {
        ExternalPaymentStatus$Type[] externalPaymentStatus$TypeArr$values = $values();
        $VALUES = externalPaymentStatus$TypeArr$values;
        $ENTRIES = s.n(externalPaymentStatus$TypeArr$values);
    }

    private ExternalPaymentStatus$Type(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ExternalPaymentStatus$Type valueOf(String str) {
        return (ExternalPaymentStatus$Type) Enum.valueOf(ExternalPaymentStatus$Type.class, str);
    }

    public static ExternalPaymentStatus$Type[] values() {
        return (ExternalPaymentStatus$Type[]) $VALUES.clone();
    }
}
