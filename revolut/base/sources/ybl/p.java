package ybl;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p BONDS;
    public static final p COMMODITIES;
    public static final p ROBO;
    public static final p SAVINGS;
    public static final p TRADING;

    static {
        p pVar = new p("TRADING", 0);
        TRADING = pVar;
        p pVar2 = new p("ROBO", 1);
        ROBO = pVar2;
        p pVar3 = new p("SAVINGS", 2);
        SAVINGS = pVar3;
        p pVar4 = new p("BONDS", 3);
        BONDS = pVar4;
        p pVar5 = new p("COMMODITIES", 4);
        COMMODITIES = pVar5;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4, pVar5};
        $VALUES = pVarArr;
        $ENTRIES = s.n(pVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
