package com.revolut.data.database.models.beneficiary.embeded;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import lg.b;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryTypeEmbeddedEntity;", "", "<init>", "(Ljava/lang/String;I)V", "LOCAL", "SWIFT", "UK", "US", "IBAN", "MOBILE_WALLET", "CHEQUE", "PIX_ALIAS", "BR", "PAYID_ALIAS", "SPIN_ALIAS", "BREB_ALIAS", "CO_ACH", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BeneficiaryTypeEmbeddedEntity {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BeneficiaryTypeEmbeddedEntity[] $VALUES;

    @b("LOCAL")
    public static final BeneficiaryTypeEmbeddedEntity LOCAL = new BeneficiaryTypeEmbeddedEntity("LOCAL", 0);

    @b("SWIFT")
    public static final BeneficiaryTypeEmbeddedEntity SWIFT = new BeneficiaryTypeEmbeddedEntity("SWIFT", 1);

    @b("UK")
    public static final BeneficiaryTypeEmbeddedEntity UK = new BeneficiaryTypeEmbeddedEntity("UK", 2);

    @b("US")
    public static final BeneficiaryTypeEmbeddedEntity US = new BeneficiaryTypeEmbeddedEntity("US", 3);

    @b("IBAN")
    public static final BeneficiaryTypeEmbeddedEntity IBAN = new BeneficiaryTypeEmbeddedEntity("IBAN", 4);

    @b("MOBILE_WALLET")
    public static final BeneficiaryTypeEmbeddedEntity MOBILE_WALLET = new BeneficiaryTypeEmbeddedEntity("MOBILE_WALLET", 5);

    @b("CHEQUE")
    public static final BeneficiaryTypeEmbeddedEntity CHEQUE = new BeneficiaryTypeEmbeddedEntity("CHEQUE", 6);

    @b("PIX_ALIAS")
    public static final BeneficiaryTypeEmbeddedEntity PIX_ALIAS = new BeneficiaryTypeEmbeddedEntity("PIX_ALIAS", 7);

    @b("BR")
    public static final BeneficiaryTypeEmbeddedEntity BR = new BeneficiaryTypeEmbeddedEntity("BR", 8);

    @b("PAYID_ALIAS")
    public static final BeneficiaryTypeEmbeddedEntity PAYID_ALIAS = new BeneficiaryTypeEmbeddedEntity("PAYID_ALIAS", 9);

    @b("SPIN_ALIAS")
    public static final BeneficiaryTypeEmbeddedEntity SPIN_ALIAS = new BeneficiaryTypeEmbeddedEntity("SPIN_ALIAS", 10);

    @b("BREB_ALIAS")
    public static final BeneficiaryTypeEmbeddedEntity BREB_ALIAS = new BeneficiaryTypeEmbeddedEntity("BREB_ALIAS", 11);

    @b("CO_ACH")
    public static final BeneficiaryTypeEmbeddedEntity CO_ACH = new BeneficiaryTypeEmbeddedEntity("CO_ACH", 12);

    private static final /* synthetic */ BeneficiaryTypeEmbeddedEntity[] $values() {
        return new BeneficiaryTypeEmbeddedEntity[]{LOCAL, SWIFT, UK, US, IBAN, MOBILE_WALLET, CHEQUE, PIX_ALIAS, BR, PAYID_ALIAS, SPIN_ALIAS, BREB_ALIAS, CO_ACH};
    }

    static {
        BeneficiaryTypeEmbeddedEntity[] beneficiaryTypeEmbeddedEntityArr$values = $values();
        $VALUES = beneficiaryTypeEmbeddedEntityArr$values;
        $ENTRIES = s.n(beneficiaryTypeEmbeddedEntityArr$values);
    }

    private BeneficiaryTypeEmbeddedEntity(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static BeneficiaryTypeEmbeddedEntity valueOf(String str) {
        return (BeneficiaryTypeEmbeddedEntity) Enum.valueOf(BeneficiaryTypeEmbeddedEntity.class, str);
    }

    public static BeneficiaryTypeEmbeddedEntity[] values() {
        return (BeneficiaryTypeEmbeddedEntity[]) $VALUES.clone();
    }
}
