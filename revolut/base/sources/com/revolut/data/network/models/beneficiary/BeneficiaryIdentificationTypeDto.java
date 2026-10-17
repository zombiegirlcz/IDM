package com.revolut.data.network.models.beneficiary;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import lg.b;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "BR_CPF", "BR_CNPJ", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BeneficiaryIdentificationTypeDto {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BeneficiaryIdentificationTypeDto[] $VALUES;

    @b("BR_CPF")
    public static final BeneficiaryIdentificationTypeDto BR_CPF = new BeneficiaryIdentificationTypeDto("BR_CPF", 0);

    @b("BR_CNPJ")
    public static final BeneficiaryIdentificationTypeDto BR_CNPJ = new BeneficiaryIdentificationTypeDto("BR_CNPJ", 1);

    private static final /* synthetic */ BeneficiaryIdentificationTypeDto[] $values() {
        return new BeneficiaryIdentificationTypeDto[]{BR_CPF, BR_CNPJ};
    }

    static {
        BeneficiaryIdentificationTypeDto[] beneficiaryIdentificationTypeDtoArr$values = $values();
        $VALUES = beneficiaryIdentificationTypeDtoArr$values;
        $ENTRIES = s.n(beneficiaryIdentificationTypeDtoArr$values);
    }

    private BeneficiaryIdentificationTypeDto(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static BeneficiaryIdentificationTypeDto valueOf(String str) {
        return (BeneficiaryIdentificationTypeDto) Enum.valueOf(BeneficiaryIdentificationTypeDto.class, str);
    }

    public static BeneficiaryIdentificationTypeDto[] values() {
        return (BeneficiaryIdentificationTypeDto[]) $VALUES.clone();
    }
}
