package com.revolut.data.network.models.beneficiary;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import lg.b;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/data/network/models/beneficiary/BeneficiaryTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "LOCAL", "SWIFT", "UK", "US", "IBAN", "CHEQUE", "PIX_ALIAS", "BR", "PAYID_ALIAS", "SPIN_ALIAS", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BeneficiaryTypeDto {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BeneficiaryTypeDto[] $VALUES;

    @b("LOCAL")
    public static final BeneficiaryTypeDto LOCAL = new BeneficiaryTypeDto("LOCAL", 0);

    @b("SWIFT")
    public static final BeneficiaryTypeDto SWIFT = new BeneficiaryTypeDto("SWIFT", 1);

    @b("UK")
    public static final BeneficiaryTypeDto UK = new BeneficiaryTypeDto("UK", 2);

    @b("US")
    public static final BeneficiaryTypeDto US = new BeneficiaryTypeDto("US", 3);

    @b("IBAN")
    public static final BeneficiaryTypeDto IBAN = new BeneficiaryTypeDto("IBAN", 4);

    @b("CHEQUE")
    public static final BeneficiaryTypeDto CHEQUE = new BeneficiaryTypeDto("CHEQUE", 5);

    @b("PIX_ALIAS")
    public static final BeneficiaryTypeDto PIX_ALIAS = new BeneficiaryTypeDto("PIX_ALIAS", 6);

    @b("BR")
    public static final BeneficiaryTypeDto BR = new BeneficiaryTypeDto("BR", 7);

    @b("PAYID_ALIAS")
    public static final BeneficiaryTypeDto PAYID_ALIAS = new BeneficiaryTypeDto("PAYID_ALIAS", 8);

    @b("SPIN_ALIAS")
    public static final BeneficiaryTypeDto SPIN_ALIAS = new BeneficiaryTypeDto("SPIN_ALIAS", 9);

    private static final /* synthetic */ BeneficiaryTypeDto[] $values() {
        return new BeneficiaryTypeDto[]{LOCAL, SWIFT, UK, US, IBAN, CHEQUE, PIX_ALIAS, BR, PAYID_ALIAS, SPIN_ALIAS};
    }

    static {
        BeneficiaryTypeDto[] beneficiaryTypeDtoArr$values = $values();
        $VALUES = beneficiaryTypeDtoArr$values;
        $ENTRIES = s.n(beneficiaryTypeDtoArr$values);
    }

    private BeneficiaryTypeDto(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static BeneficiaryTypeDto valueOf(String str) {
        return (BeneficiaryTypeDto) Enum.valueOf(BeneficiaryTypeDto.class, str);
    }

    public static BeneficiaryTypeDto[] values() {
        return (BeneficiaryTypeDto[]) $VALUES.clone();
    }
}
