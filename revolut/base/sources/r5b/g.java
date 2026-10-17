package r5b;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g EMAIL;
    public static final g NUMERIC;
    public static final g TEXT;
    public static final g UNKNOWN;

    static {
        g gVar = new g("NUMERIC", 0);
        NUMERIC = gVar;
        g gVar2 = new g("TEXT", 1);
        TEXT = gVar2;
        g gVar3 = new g("EMAIL", 2);
        EMAIL = gVar3;
        g gVar4 = new g("UNKNOWN", 3);
        UNKNOWN = gVar4;
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
