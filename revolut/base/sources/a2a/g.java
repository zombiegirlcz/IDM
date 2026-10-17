package a2a;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g CARD_MANDATE;
    public static final g EXTERNAL_MANDATE;
    public static final g STANDING_ORDER;

    static {
        g gVar = new g("CARD_MANDATE", 0);
        CARD_MANDATE = gVar;
        g gVar2 = new g("EXTERNAL_MANDATE", 1);
        EXTERNAL_MANDATE = gVar2;
        g gVar3 = new g("STANDING_ORDER", 2);
        STANDING_ORDER = gVar3;
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
