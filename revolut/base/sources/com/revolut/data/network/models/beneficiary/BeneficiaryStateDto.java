package com.revolut.data.network.models.beneficiary;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import lg.b;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/data/network/models/beneficiary/BeneficiaryStateDto;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVE", "DELETED", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BeneficiaryStateDto {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BeneficiaryStateDto[] $VALUES;

    @b("ACTIVE")
    public static final BeneficiaryStateDto ACTIVE = new BeneficiaryStateDto("ACTIVE", 0);

    @b("DELETED")
    public static final BeneficiaryStateDto DELETED = new BeneficiaryStateDto("DELETED", 1);

    private static final /* synthetic */ BeneficiaryStateDto[] $values() {
        return new BeneficiaryStateDto[]{ACTIVE, DELETED};
    }

    static {
        BeneficiaryStateDto[] beneficiaryStateDtoArr$values = $values();
        $VALUES = beneficiaryStateDtoArr$values;
        $ENTRIES = s.n(beneficiaryStateDtoArr$values);
    }

    private BeneficiaryStateDto(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static BeneficiaryStateDto valueOf(String str) {
        return (BeneficiaryStateDto) Enum.valueOf(BeneficiaryStateDto.class, str);
    }

    public static BeneficiaryStateDto[] values() {
        return (BeneficiaryStateDto[]) $VALUES.clone();
    }
}
