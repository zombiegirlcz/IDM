package com.revolut.domain.models.beneficiary;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/domain/models/beneficiary/BankInformationCopFlow;", "", "<init>", "(Ljava/lang/String;I)V", "TRANSFER", "BENEFICIARY", "SKIP", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BankInformationCopFlow {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BankInformationCopFlow[] $VALUES;
    public static final BankInformationCopFlow TRANSFER = new BankInformationCopFlow("TRANSFER", 0);
    public static final BankInformationCopFlow BENEFICIARY = new BankInformationCopFlow("BENEFICIARY", 1);
    public static final BankInformationCopFlow SKIP = new BankInformationCopFlow("SKIP", 2);

    private static final /* synthetic */ BankInformationCopFlow[] $values() {
        return new BankInformationCopFlow[]{TRANSFER, BENEFICIARY, SKIP};
    }

    static {
        BankInformationCopFlow[] bankInformationCopFlowArr$values = $values();
        $VALUES = bankInformationCopFlowArr$values;
        $ENTRIES = s.n(bankInformationCopFlowArr$values);
    }

    private BankInformationCopFlow(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static BankInformationCopFlow valueOf(String str) {
        return (BankInformationCopFlow) Enum.valueOf(BankInformationCopFlow.class, str);
    }

    public static BankInformationCopFlow[] values() {
        return (BankInformationCopFlow[]) $VALUES.clone();
    }
}
