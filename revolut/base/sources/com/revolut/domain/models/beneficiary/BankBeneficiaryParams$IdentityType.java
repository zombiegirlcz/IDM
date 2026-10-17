package com.revolut.domain.models.beneficiary;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/revolut/domain/models/beneficiary/BankBeneficiaryParams$IdentityType", "", "Lcom/revolut/domain/models/beneficiary/BankBeneficiaryParams$IdentityType;", "<init>", "(Ljava/lang/String;I)V", "INDIVIDUAL", "BUSINESS", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BankBeneficiaryParams$IdentityType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BankBeneficiaryParams$IdentityType[] $VALUES;
    public static final BankBeneficiaryParams$IdentityType INDIVIDUAL = new BankBeneficiaryParams$IdentityType("INDIVIDUAL", 0);
    public static final BankBeneficiaryParams$IdentityType BUSINESS = new BankBeneficiaryParams$IdentityType("BUSINESS", 1);

    private static final /* synthetic */ BankBeneficiaryParams$IdentityType[] $values() {
        return new BankBeneficiaryParams$IdentityType[]{INDIVIDUAL, BUSINESS};
    }

    static {
        BankBeneficiaryParams$IdentityType[] bankBeneficiaryParams$IdentityTypeArr$values = $values();
        $VALUES = bankBeneficiaryParams$IdentityTypeArr$values;
        $ENTRIES = s.n(bankBeneficiaryParams$IdentityTypeArr$values);
    }

    private BankBeneficiaryParams$IdentityType(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static BankBeneficiaryParams$IdentityType valueOf(String str) {
        return (BankBeneficiaryParams$IdentityType) Enum.valueOf(BankBeneficiaryParams$IdentityType.class, str);
    }

    public static BankBeneficiaryParams$IdentityType[] values() {
        return (BankBeneficiaryParams$IdentityType[]) $VALUES.clone();
    }
}
