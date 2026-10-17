package soh;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g MONEY;
    public static final g NUMBER;
    public static final g PERCENTAGE;
    public static final g YEARS;

    static {
        g gVar = new g("PERCENTAGE", 0);
        PERCENTAGE = gVar;
        g gVar2 = new g("NUMBER", 1);
        NUMBER = gVar2;
        g gVar3 = new g("MONEY", 2);
        MONEY = gVar3;
        g gVar4 = new g("YEARS", 3);
        YEARS = gVar4;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4};
        $VALUES = gVarArr;
        $ENTRIES = s.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
