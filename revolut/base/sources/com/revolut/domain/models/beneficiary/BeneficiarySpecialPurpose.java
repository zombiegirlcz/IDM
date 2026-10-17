package com.revolut.domain.models.beneficiary;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/domain/models/beneficiary/BeneficiarySpecialPurpose;", "", "<init>", "(Ljava/lang/String;I)V", "INDIA_MCY_WITHDRAWAL", "PAYID_ALIAS", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BeneficiarySpecialPurpose {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BeneficiarySpecialPurpose[] $VALUES;
    public static final BeneficiarySpecialPurpose INDIA_MCY_WITHDRAWAL = new BeneficiarySpecialPurpose("INDIA_MCY_WITHDRAWAL", 0);
    public static final BeneficiarySpecialPurpose PAYID_ALIAS = new BeneficiarySpecialPurpose("PAYID_ALIAS", 1);

    private static final /* synthetic */ BeneficiarySpecialPurpose[] $values() {
        return new BeneficiarySpecialPurpose[]{INDIA_MCY_WITHDRAWAL, PAYID_ALIAS};
    }

    static {
        BeneficiarySpecialPurpose[] beneficiarySpecialPurposeArr$values = $values();
        $VALUES = beneficiarySpecialPurposeArr$values;
        $ENTRIES = s.n(beneficiarySpecialPurposeArr$values);
    }

    private BeneficiarySpecialPurpose(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static BeneficiarySpecialPurpose valueOf(String str) {
        return (BeneficiarySpecialPurpose) Enum.valueOf(BeneficiarySpecialPurpose.class, str);
    }

    public static BeneficiarySpecialPurpose[] values() {
        return (BeneficiarySpecialPurpose[]) $VALUES.clone();
    }
}
