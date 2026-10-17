package tgb;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k FREE_PREMIUM;
    public static final k INCOME_INSURANCE;
    public static final k SALARY_DRAW;
    public static final k SAVINGS_BOOST;

    static {
        k kVar = new k("SALARY_DRAW", 0);
        SALARY_DRAW = kVar;
        k kVar2 = new k("FREE_PREMIUM", 1);
        FREE_PREMIUM = kVar2;
        k kVar3 = new k("SAVINGS_BOOST", 2);
        SAVINGS_BOOST = kVar3;
        k kVar4 = new k("INCOME_INSURANCE", 3);
        INCOME_INSURANCE = kVar4;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
