package lf8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g FREE_TRIAL;
    public static final g PAID_PLAN;
    public static final g SKIP;

    static {
        g gVar = new g("FREE_TRIAL", 0);
        FREE_TRIAL = gVar;
        g gVar2 = new g("PAID_PLAN", 1);
        PAID_PLAN = gVar2;
        g gVar3 = new g("SKIP", 2);
        SKIP = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
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
