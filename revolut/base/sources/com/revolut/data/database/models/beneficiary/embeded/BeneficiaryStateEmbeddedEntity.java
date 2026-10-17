package com.revolut.data.database.models.beneficiary.embeded;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import lg.b;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryStateEmbeddedEntity;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVE", "DELETED", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BeneficiaryStateEmbeddedEntity {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BeneficiaryStateEmbeddedEntity[] $VALUES;

    @b("ACTIVE")
    public static final BeneficiaryStateEmbeddedEntity ACTIVE = new BeneficiaryStateEmbeddedEntity("ACTIVE", 0);

    @b("DELETED")
    public static final BeneficiaryStateEmbeddedEntity DELETED = new BeneficiaryStateEmbeddedEntity("DELETED", 1);

    private static final /* synthetic */ BeneficiaryStateEmbeddedEntity[] $values() {
        return new BeneficiaryStateEmbeddedEntity[]{ACTIVE, DELETED};
    }

    static {
        BeneficiaryStateEmbeddedEntity[] beneficiaryStateEmbeddedEntityArr$values = $values();
        $VALUES = beneficiaryStateEmbeddedEntityArr$values;
        $ENTRIES = s.n(beneficiaryStateEmbeddedEntityArr$values);
    }

    private BeneficiaryStateEmbeddedEntity(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static BeneficiaryStateEmbeddedEntity valueOf(String str) {
        return (BeneficiaryStateEmbeddedEntity) Enum.valueOf(BeneficiaryStateEmbeddedEntity.class, str);
    }

    public static BeneficiaryStateEmbeddedEntity[] values() {
        return (BeneficiaryStateEmbeddedEntity[]) $VALUES.clone();
    }
}
