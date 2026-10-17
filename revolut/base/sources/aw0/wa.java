package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class wa {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ wa[] $VALUES;
    public static final wa SHOW_ALL_ZEROES;
    public static final wa STRIP_ALL_TRAILING_ZEROES;
    public static final wa STRIP_ONE_TRAILING_ZERO;

    static {
        wa waVar = new wa("STRIP_ALL_TRAILING_ZEROES", 0);
        STRIP_ALL_TRAILING_ZEROES = waVar;
        wa waVar2 = new wa("STRIP_ONE_TRAILING_ZERO", 1);
        STRIP_ONE_TRAILING_ZERO = waVar2;
        wa waVar3 = new wa("SHOW_ALL_ZEROES", 2);
        SHOW_ALL_ZEROES = waVar3;
        wa[] waVarArr = {waVar, waVar2, waVar3};
        $VALUES = waVarArr;
        $ENTRIES = vc.s.n(waVarArr);
    }

    public static wa valueOf(String str) {
        return (wa) Enum.valueOf(wa.class, str);
    }

    public static wa[] values() {
        return (wa[]) $VALUES.clone();
    }
}
