package svi;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p METAL;
    public static final p NORMAL;
    public static final p PRIVATE;
    public static final p ULTRA;
    public static final p UNKNOWN;

    static {
        p pVar = new p("METAL", 0);
        METAL = pVar;
        p pVar2 = new p("ULTRA", 1);
        ULTRA = pVar2;
        p pVar3 = new p("PRIVATE", 2);
        PRIVATE = pVar3;
        p pVar4 = new p("NORMAL", 3);
        NORMAL = pVar4;
        p pVar5 = new p("UNKNOWN", 4);
        UNKNOWN = pVar5;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4, pVar5};
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
