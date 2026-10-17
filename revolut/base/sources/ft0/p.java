package ft0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p BOTTOM;
    public static final p SINGLE;
    public static final p TOP;

    static {
        p pVar = new p("TOP", 0);
        TOP = pVar;
        p pVar2 = new p("BOTTOM", 1);
        BOTTOM = pVar2;
        p pVar3 = new p("SINGLE", 2);
        SINGLE = pVar3;
        p[] pVarArr = {pVar, pVar2, pVar3};
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
