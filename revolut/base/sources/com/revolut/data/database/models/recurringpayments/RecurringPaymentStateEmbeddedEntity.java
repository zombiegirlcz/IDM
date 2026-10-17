package com.revolut.data.database.models.recurringpayments;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import lg.b;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentStateEmbeddedEntity;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVE", "INACTIVE", "BLOCKED", "UNKNOWN", "PENDING", "CONFIRMED", "DISCONFIRMED", "RAISED", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecurringPaymentStateEmbeddedEntity {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RecurringPaymentStateEmbeddedEntity[] $VALUES;

    @b("ACTIVE")
    public static final RecurringPaymentStateEmbeddedEntity ACTIVE = new RecurringPaymentStateEmbeddedEntity("ACTIVE", 0);

    @b("INACTIVE")
    public static final RecurringPaymentStateEmbeddedEntity INACTIVE = new RecurringPaymentStateEmbeddedEntity("INACTIVE", 1);

    @b("BLOCKED")
    public static final RecurringPaymentStateEmbeddedEntity BLOCKED = new RecurringPaymentStateEmbeddedEntity("BLOCKED", 2);

    @b("UNKNOWN")
    public static final RecurringPaymentStateEmbeddedEntity UNKNOWN = new RecurringPaymentStateEmbeddedEntity("UNKNOWN", 3);

    @b("PENDING")
    public static final RecurringPaymentStateEmbeddedEntity PENDING = new RecurringPaymentStateEmbeddedEntity("PENDING", 4);

    @b("CONFIRMED")
    public static final RecurringPaymentStateEmbeddedEntity CONFIRMED = new RecurringPaymentStateEmbeddedEntity("CONFIRMED", 5);

    @b("DISCONFIRMED")
    public static final RecurringPaymentStateEmbeddedEntity DISCONFIRMED = new RecurringPaymentStateEmbeddedEntity("DISCONFIRMED", 6);

    @b("RAISED")
    public static final RecurringPaymentStateEmbeddedEntity RAISED = new RecurringPaymentStateEmbeddedEntity("RAISED", 7);

    private static final /* synthetic */ RecurringPaymentStateEmbeddedEntity[] $values() {
        return new RecurringPaymentStateEmbeddedEntity[]{ACTIVE, INACTIVE, BLOCKED, UNKNOWN, PENDING, CONFIRMED, DISCONFIRMED, RAISED};
    }

    static {
        RecurringPaymentStateEmbeddedEntity[] recurringPaymentStateEmbeddedEntityArr$values = $values();
        $VALUES = recurringPaymentStateEmbeddedEntityArr$values;
        $ENTRIES = s.n(recurringPaymentStateEmbeddedEntityArr$values);
    }

    private RecurringPaymentStateEmbeddedEntity(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static RecurringPaymentStateEmbeddedEntity valueOf(String str) {
        return (RecurringPaymentStateEmbeddedEntity) Enum.valueOf(RecurringPaymentStateEmbeddedEntity.class, str);
    }

    public static RecurringPaymentStateEmbeddedEntity[] values() {
        return (RecurringPaymentStateEmbeddedEntity[]) $VALUES.clone();
    }
}
