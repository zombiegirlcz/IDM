package com.revolut.data.database.models.beneficiary.embeded;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import lg.b;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/data/database/models/beneficiary/embeded/PaymentTypeEmbeddedEntity;", "", "<init>", "(Ljava/lang/String;I)V", "REGULAR", "PRIORITY", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentTypeEmbeddedEntity {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PaymentTypeEmbeddedEntity[] $VALUES;

    @b("REGULAR")
    public static final PaymentTypeEmbeddedEntity REGULAR = new PaymentTypeEmbeddedEntity("REGULAR", 0);

    @b("PRIORITY")
    public static final PaymentTypeEmbeddedEntity PRIORITY = new PaymentTypeEmbeddedEntity("PRIORITY", 1);

    private static final /* synthetic */ PaymentTypeEmbeddedEntity[] $values() {
        return new PaymentTypeEmbeddedEntity[]{REGULAR, PRIORITY};
    }

    static {
        PaymentTypeEmbeddedEntity[] paymentTypeEmbeddedEntityArr$values = $values();
        $VALUES = paymentTypeEmbeddedEntityArr$values;
        $ENTRIES = s.n(paymentTypeEmbeddedEntityArr$values);
    }

    private PaymentTypeEmbeddedEntity(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static PaymentTypeEmbeddedEntity valueOf(String str) {
        return (PaymentTypeEmbeddedEntity) Enum.valueOf(PaymentTypeEmbeddedEntity.class, str);
    }

    public static PaymentTypeEmbeddedEntity[] values() {
        return (PaymentTypeEmbeddedEntity[]) $VALUES.clone();
    }
}
