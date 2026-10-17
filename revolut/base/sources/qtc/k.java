package qtc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k CARD_PAYMENTS;
    public static final k COMMODITIES_WITHDRAWAL;
    public static final k CRYPTO_WITHDRAWAL;
    public static final k POCKETS_WITHDRAWAL;
    public static final k SAVINGS_WITHDRAWAL;
    public static final k STOCKS_WITHDRAWAL;
    public static final k TRANSFERS;

    static {
        k kVar = new k("SAVINGS_WITHDRAWAL", 0);
        SAVINGS_WITHDRAWAL = kVar;
        k kVar2 = new k("POCKETS_WITHDRAWAL", 1);
        POCKETS_WITHDRAWAL = kVar2;
        k kVar3 = new k("STOCKS_WITHDRAWAL", 2);
        STOCKS_WITHDRAWAL = kVar3;
        k kVar4 = new k("COMMODITIES_WITHDRAWAL", 3);
        COMMODITIES_WITHDRAWAL = kVar4;
        k kVar5 = new k("CRYPTO_WITHDRAWAL", 4);
        CRYPTO_WITHDRAWAL = kVar5;
        k kVar6 = new k("TRANSFERS", 5);
        TRANSFERS = kVar6;
        k kVar7 = new k("CARD_PAYMENTS", 6);
        CARD_PAYMENTS = kVar7;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7};
        $VALUES = kVarArr;
        $ENTRIES = vc.s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
