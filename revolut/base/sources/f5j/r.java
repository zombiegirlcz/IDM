package f5j;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r BR;
    public static final r BREB_ALIAS;
    public static final r CHEQUE;
    public static final r CO_ACH;
    public static final r IBAN;
    public static final r LOCAL;
    public static final r MOBILE_WALLET;
    public static final r PAYID_ALIAS;
    public static final r PIX_ALIAS;
    public static final r SPIN_ALIAS;
    public static final r SWIFT;
    public static final r UK;
    public static final r US;

    static {
        r rVar = new r("LOCAL", 0);
        LOCAL = rVar;
        r rVar2 = new r("SWIFT", 1);
        SWIFT = rVar2;
        r rVar3 = new r("UK", 2);
        UK = rVar3;
        r rVar4 = new r("US", 3);
        US = rVar4;
        r rVar5 = new r("IBAN", 4);
        IBAN = rVar5;
        r rVar6 = new r("MOBILE_WALLET", 5);
        MOBILE_WALLET = rVar6;
        r rVar7 = new r("CHEQUE", 6);
        CHEQUE = rVar7;
        r rVar8 = new r("PIX_ALIAS", 7);
        PIX_ALIAS = rVar8;
        r rVar9 = new r("BR", 8);
        BR = rVar9;
        r rVar10 = new r("PAYID_ALIAS", 9);
        PAYID_ALIAS = rVar10;
        r rVar11 = new r("SPIN_ALIAS", 10);
        SPIN_ALIAS = rVar11;
        r rVar12 = new r("BREB_ALIAS", 11);
        BREB_ALIAS = rVar12;
        r rVar13 = new r("CO_ACH", 12);
        CO_ACH = rVar13;
        r[] rVarArr = {rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9, rVar10, rVar11, rVar12, rVar13};
        $VALUES = rVarArr;
        $ENTRIES = vc.s.n(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
