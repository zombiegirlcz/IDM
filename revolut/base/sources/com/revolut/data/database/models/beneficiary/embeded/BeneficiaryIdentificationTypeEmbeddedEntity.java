package com.revolut.data.database.models.beneficiary.embeded;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import lg.b;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryIdentificationTypeEmbeddedEntity;", "", "<init>", "(Ljava/lang/String;I)V", "BR_CPF", "BR_CNPJ", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BeneficiaryIdentificationTypeEmbeddedEntity {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BeneficiaryIdentificationTypeEmbeddedEntity[] $VALUES;

    @b("BR_CPF")
    public static final BeneficiaryIdentificationTypeEmbeddedEntity BR_CPF = new BeneficiaryIdentificationTypeEmbeddedEntity("BR_CPF", 0);

    @b("BR_CNPJ")
    public static final BeneficiaryIdentificationTypeEmbeddedEntity BR_CNPJ = new BeneficiaryIdentificationTypeEmbeddedEntity("BR_CNPJ", 1);

    private static final /* synthetic */ BeneficiaryIdentificationTypeEmbeddedEntity[] $values() {
        return new BeneficiaryIdentificationTypeEmbeddedEntity[]{BR_CPF, BR_CNPJ};
    }

    static {
        BeneficiaryIdentificationTypeEmbeddedEntity[] beneficiaryIdentificationTypeEmbeddedEntityArr$values = $values();
        $VALUES = beneficiaryIdentificationTypeEmbeddedEntityArr$values;
        $ENTRIES = s.n(beneficiaryIdentificationTypeEmbeddedEntityArr$values);
    }

    private BeneficiaryIdentificationTypeEmbeddedEntity(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static BeneficiaryIdentificationTypeEmbeddedEntity valueOf(String str) {
        return (BeneficiaryIdentificationTypeEmbeddedEntity) Enum.valueOf(BeneficiaryIdentificationTypeEmbeddedEntity.class, str);
    }

    public static BeneficiaryIdentificationTypeEmbeddedEntity[] values() {
        return (BeneficiaryIdentificationTypeEmbeddedEntity[]) $VALUES.clone();
    }
}
