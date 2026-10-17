package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class ic {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ic[] $VALUES;
    public static final ic GIA;
    public static final ic MARGIN;
    public static final ic ROBO;
    public static final ic TAX_ADVANTAGED;
    public static final ic UNKNOWN;

    static {
        ic icVar = new ic("ROBO", 0);
        ROBO = icVar;
        ic icVar2 = new ic("MARGIN", 1);
        MARGIN = icVar2;
        ic icVar3 = new ic("GIA", 2);
        GIA = icVar3;
        ic icVar4 = new ic("TAX_ADVANTAGED", 3);
        TAX_ADVANTAGED = icVar4;
        ic icVar5 = new ic("UNKNOWN", 4);
        UNKNOWN = icVar5;
        ic[] icVarArr = {icVar, icVar2, icVar3, icVar4, icVar5};
        $VALUES = icVarArr;
        $ENTRIES = vc.s.n(icVarArr);
    }

    public static ic valueOf(String str) {
        return (ic) Enum.valueOf(ic.class, str);
    }

    public static ic[] values() {
        return (ic[]) $VALUES.clone();
    }
}
