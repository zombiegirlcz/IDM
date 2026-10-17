package eoi;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p ALL_SHIMMERS;
    public static final p DATA;
    public static final p EMPTY;
    public static final p FULL_DATA;

    static {
        p pVar = new p("EMPTY", 0);
        EMPTY = pVar;
        p pVar2 = new p("ALL_SHIMMERS", 1);
        ALL_SHIMMERS = pVar2;
        p pVar3 = new p("DATA", 2);
        DATA = pVar3;
        p pVar4 = new p("FULL_DATA", 3);
        FULL_DATA = pVar4;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4};
        $VALUES = pVarArr;
        $ENTRIES = vc.s.n(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
