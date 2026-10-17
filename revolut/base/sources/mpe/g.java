package mpe;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g DEFAULT;
    public static final g PRIMARY_RESIDENCY_DECLARATION;

    static {
        g gVar = new g("DEFAULT", 0);
        DEFAULT = gVar;
        g gVar2 = new g("PRIMARY_RESIDENCY_DECLARATION", 1);
        PRIMARY_RESIDENCY_DECLARATION = gVar2;
        g[] gVarArr = {gVar, gVar2};
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
