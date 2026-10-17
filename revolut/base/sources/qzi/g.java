package qzi;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g NOT_ON_TRACK;
    public static final g ON_TRACK;
    public static final g OVERSPENT;

    static {
        g gVar = new g("ON_TRACK", 0);
        ON_TRACK = gVar;
        g gVar2 = new g("NOT_ON_TRACK", 1);
        NOT_ON_TRACK = gVar2;
        g gVar3 = new g("OVERSPENT", 2);
        OVERSPENT = gVar3;
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
