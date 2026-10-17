package q33;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g BASELINE;
    public static final g VARIANT_1;
    public static final g VARIANT_2;
    public static final g VARIANT_3;
    public static final g VIRTUAL_CARD_ONLY;

    static {
        g gVar = new g("BASELINE", 0);
        BASELINE = gVar;
        g gVar2 = new g("VARIANT_1", 1);
        VARIANT_1 = gVar2;
        g gVar3 = new g("VARIANT_2", 2);
        VARIANT_2 = gVar3;
        g gVar4 = new g("VARIANT_3", 3);
        VARIANT_3 = gVar4;
        g gVar5 = new g("VIRTUAL_CARD_ONLY", 4);
        VIRTUAL_CARD_ONLY = gVar5;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5};
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
