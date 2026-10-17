package com.revolut.data.database.models.recurringpayments;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import lg.b;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentFrequencyEmbeddedEntity;", "", "<init>", "(Ljava/lang/String;I)V", "ADHOC", "WEEKLY", "BI_WEEKLY", "MONTHLY", "QUARTERLY", "HALF_YEARLY", "YEARLY", "DAILY", "TWICE_WEEKLY", "TEN_DAYS", "BI_MONTHLY", "TRIMESTER", "UNKNOWN", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecurringPaymentFrequencyEmbeddedEntity {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RecurringPaymentFrequencyEmbeddedEntity[] $VALUES;

    @b("ADHOC")
    public static final RecurringPaymentFrequencyEmbeddedEntity ADHOC = new RecurringPaymentFrequencyEmbeddedEntity("ADHOC", 0);

    @b("WEEKLY")
    public static final RecurringPaymentFrequencyEmbeddedEntity WEEKLY = new RecurringPaymentFrequencyEmbeddedEntity("WEEKLY", 1);

    @b("BI_WEEKLY")
    public static final RecurringPaymentFrequencyEmbeddedEntity BI_WEEKLY = new RecurringPaymentFrequencyEmbeddedEntity("BI_WEEKLY", 2);

    @b("MONTHLY")
    public static final RecurringPaymentFrequencyEmbeddedEntity MONTHLY = new RecurringPaymentFrequencyEmbeddedEntity("MONTHLY", 3);

    @b("QUARTERLY")
    public static final RecurringPaymentFrequencyEmbeddedEntity QUARTERLY = new RecurringPaymentFrequencyEmbeddedEntity("QUARTERLY", 4);

    @b("HALF_YEARLY")
    public static final RecurringPaymentFrequencyEmbeddedEntity HALF_YEARLY = new RecurringPaymentFrequencyEmbeddedEntity("HALF_YEARLY", 5);

    @b("YEARLY")
    public static final RecurringPaymentFrequencyEmbeddedEntity YEARLY = new RecurringPaymentFrequencyEmbeddedEntity("YEARLY", 6);

    @b("DAILY")
    public static final RecurringPaymentFrequencyEmbeddedEntity DAILY = new RecurringPaymentFrequencyEmbeddedEntity("DAILY", 7);

    @b("TWICE_WEEKLY")
    public static final RecurringPaymentFrequencyEmbeddedEntity TWICE_WEEKLY = new RecurringPaymentFrequencyEmbeddedEntity("TWICE_WEEKLY", 8);

    @b("TEN_DAYS")
    public static final RecurringPaymentFrequencyEmbeddedEntity TEN_DAYS = new RecurringPaymentFrequencyEmbeddedEntity("TEN_DAYS", 9);

    @b("BI_MONTHLY")
    public static final RecurringPaymentFrequencyEmbeddedEntity BI_MONTHLY = new RecurringPaymentFrequencyEmbeddedEntity("BI_MONTHLY", 10);

    @b("TRIMESTER")
    public static final RecurringPaymentFrequencyEmbeddedEntity TRIMESTER = new RecurringPaymentFrequencyEmbeddedEntity("TRIMESTER", 11);

    @b("UNKNOWN")
    public static final RecurringPaymentFrequencyEmbeddedEntity UNKNOWN = new RecurringPaymentFrequencyEmbeddedEntity("UNKNOWN", 12);

    private static final /* synthetic */ RecurringPaymentFrequencyEmbeddedEntity[] $values() {
        return new RecurringPaymentFrequencyEmbeddedEntity[]{ADHOC, WEEKLY, BI_WEEKLY, MONTHLY, QUARTERLY, HALF_YEARLY, YEARLY, DAILY, TWICE_WEEKLY, TEN_DAYS, BI_MONTHLY, TRIMESTER, UNKNOWN};
    }

    static {
        RecurringPaymentFrequencyEmbeddedEntity[] recurringPaymentFrequencyEmbeddedEntityArr$values = $values();
        $VALUES = recurringPaymentFrequencyEmbeddedEntityArr$values;
        $ENTRIES = s.n(recurringPaymentFrequencyEmbeddedEntityArr$values);
    }

    private RecurringPaymentFrequencyEmbeddedEntity(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static RecurringPaymentFrequencyEmbeddedEntity valueOf(String str) {
        return (RecurringPaymentFrequencyEmbeddedEntity) Enum.valueOf(RecurringPaymentFrequencyEmbeddedEntity.class, str);
    }

    public static RecurringPaymentFrequencyEmbeddedEntity[] values() {
        return (RecurringPaymentFrequencyEmbeddedEntity[]) $VALUES.clone();
    }
}
