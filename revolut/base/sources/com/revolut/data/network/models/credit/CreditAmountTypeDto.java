package com.revolut.data.network.models.credit;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import lg.b;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/data/network/models/credit/CreditAmountTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "FIXED", "STATEMENT", "MINIMUM", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditAmountTypeDto {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CreditAmountTypeDto[] $VALUES;

    @b("fixed")
    public static final CreditAmountTypeDto FIXED = new CreditAmountTypeDto("FIXED", 0);

    @b("statement_balance")
    public static final CreditAmountTypeDto STATEMENT = new CreditAmountTypeDto("STATEMENT", 1);

    @b("min_repayment")
    public static final CreditAmountTypeDto MINIMUM = new CreditAmountTypeDto("MINIMUM", 2);

    private static final /* synthetic */ CreditAmountTypeDto[] $values() {
        return new CreditAmountTypeDto[]{FIXED, STATEMENT, MINIMUM};
    }

    static {
        CreditAmountTypeDto[] creditAmountTypeDtoArr$values = $values();
        $VALUES = creditAmountTypeDtoArr$values;
        $ENTRIES = s.n(creditAmountTypeDtoArr$values);
    }

    private CreditAmountTypeDto(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static CreditAmountTypeDto valueOf(String str) {
        return (CreditAmountTypeDto) Enum.valueOf(CreditAmountTypeDto.class, str);
    }

    public static CreditAmountTypeDto[] values() {
        return (CreditAmountTypeDto[]) $VALUES.clone();
    }
}
