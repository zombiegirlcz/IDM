package o7j;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k PRICE_HAS_TO_BE_HIGHER;
    public static final k PRICE_HAS_TO_BE_LOWER;
    public static final k VALUE_IS_ZERO;

    static {
        k kVar = new k("VALUE_IS_ZERO", 0);
        VALUE_IS_ZERO = kVar;
        k kVar2 = new k("PRICE_HAS_TO_BE_LOWER", 1);
        PRICE_HAS_TO_BE_LOWER = kVar2;
        k kVar3 = new k("PRICE_HAS_TO_BE_HIGHER", 2);
        PRICE_HAS_TO_BE_HIGHER = kVar3;
        k[] kVarArr = {kVar, kVar2, kVar3};
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
