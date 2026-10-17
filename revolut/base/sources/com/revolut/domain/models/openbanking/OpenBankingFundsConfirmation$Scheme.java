package com.revolut.domain.models.openbanking;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/revolut/domain/models/openbanking/OpenBankingFundsConfirmation$Scheme", "", "Lcom/revolut/domain/models/openbanking/OpenBankingFundsConfirmation$Scheme;", "<init>", "(Ljava/lang/String;I)V", "IBAN", "SortCodeAccountNumber", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OpenBankingFundsConfirmation$Scheme {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OpenBankingFundsConfirmation$Scheme[] $VALUES;
    public static final OpenBankingFundsConfirmation$Scheme IBAN = new OpenBankingFundsConfirmation$Scheme("IBAN", 0);
    public static final OpenBankingFundsConfirmation$Scheme SortCodeAccountNumber = new OpenBankingFundsConfirmation$Scheme("SortCodeAccountNumber", 1);

    private static final /* synthetic */ OpenBankingFundsConfirmation$Scheme[] $values() {
        return new OpenBankingFundsConfirmation$Scheme[]{IBAN, SortCodeAccountNumber};
    }

    static {
        OpenBankingFundsConfirmation$Scheme[] openBankingFundsConfirmation$SchemeArr$values = $values();
        $VALUES = openBankingFundsConfirmation$SchemeArr$values;
        $ENTRIES = s.n(openBankingFundsConfirmation$SchemeArr$values);
    }

    private OpenBankingFundsConfirmation$Scheme(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static OpenBankingFundsConfirmation$Scheme valueOf(String str) {
        return (OpenBankingFundsConfirmation$Scheme) Enum.valueOf(OpenBankingFundsConfirmation$Scheme.class, str);
    }

    public static OpenBankingFundsConfirmation$Scheme[] values() {
        return (OpenBankingFundsConfirmation$Scheme[]) $VALUES.clone();
    }
}
