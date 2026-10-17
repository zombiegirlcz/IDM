package mxl;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g CHROMATIC;
    public static final g CHROME_METAL;
    public static final g DEFAULT;

    static {
        g gVar = new g("DEFAULT", 0);
        DEFAULT = gVar;
        g gVar2 = new g("CHROME_METAL", 1);
        CHROME_METAL = gVar2;
        g gVar3 = new g("CHROMATIC", 2);
        CHROMATIC = gVar3;
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
