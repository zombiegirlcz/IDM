package vr;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g AVAILABLE;
    public static final g MANDATORY;
    public static final g NOT_AVAILABLE;

    static {
        g gVar = new g("NOT_AVAILABLE", 0);
        NOT_AVAILABLE = gVar;
        g gVar2 = new g("AVAILABLE", 1);
        AVAILABLE = gVar2;
        g gVar3 = new g("MANDATORY", 2);
        MANDATORY = gVar3;
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
