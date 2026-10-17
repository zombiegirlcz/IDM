package ncd;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g SAVINGS_DEPOSITS;
    public static final g SAVINGS_FIXED_TERM;
    public static final g SAVINGS_MMF;

    static {
        g gVar = new g("SAVINGS_DEPOSITS", 0);
        SAVINGS_DEPOSITS = gVar;
        g gVar2 = new g("SAVINGS_FIXED_TERM", 1);
        SAVINGS_FIXED_TERM = gVar2;
        g gVar3 = new g("SAVINGS_MMF", 2);
        SAVINGS_MMF = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
        $VALUES = gVarArr;
        $ENTRIES = s.n(gVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
