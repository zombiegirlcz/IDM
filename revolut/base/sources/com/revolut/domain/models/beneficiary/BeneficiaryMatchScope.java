package com.revolut.domain.models.beneficiary;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/domain/models/beneficiary/BeneficiaryMatchScope;", "", "<init>", "(Ljava/lang/String;I)V", "FULL_DETAILS", "ACCOUNT_DETAILS", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BeneficiaryMatchScope {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BeneficiaryMatchScope[] $VALUES;
    public static final BeneficiaryMatchScope FULL_DETAILS = new BeneficiaryMatchScope("FULL_DETAILS", 0);
    public static final BeneficiaryMatchScope ACCOUNT_DETAILS = new BeneficiaryMatchScope("ACCOUNT_DETAILS", 1);

    private static final /* synthetic */ BeneficiaryMatchScope[] $values() {
        return new BeneficiaryMatchScope[]{FULL_DETAILS, ACCOUNT_DETAILS};
    }

    static {
        BeneficiaryMatchScope[] beneficiaryMatchScopeArr$values = $values();
        $VALUES = beneficiaryMatchScopeArr$values;
        $ENTRIES = s.n(beneficiaryMatchScopeArr$values);
    }

    private BeneficiaryMatchScope(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static BeneficiaryMatchScope valueOf(String str) {
        return (BeneficiaryMatchScope) Enum.valueOf(BeneficiaryMatchScope.class, str);
    }

    public static BeneficiaryMatchScope[] values() {
        return (BeneficiaryMatchScope[]) $VALUES.clone();
    }
}
