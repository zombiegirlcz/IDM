package y7d;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o BOTTOM_TO_TOP_WITH_DELAY;
    public static final o TOP_TO_BOTTOM;
    public static final o TOP_TO_BOTTOM_WITH_DELAY;

    static {
        o oVar = new o("TOP_TO_BOTTOM", 0);
        TOP_TO_BOTTOM = oVar;
        o oVar2 = new o("TOP_TO_BOTTOM_WITH_DELAY", 1);
        TOP_TO_BOTTOM_WITH_DELAY = oVar2;
        o oVar3 = new o("BOTTOM_TO_TOP_WITH_DELAY", 2);
        BOTTOM_TO_TOP_WITH_DELAY = oVar3;
        o[] oVarArr = {oVar, oVar2, oVar3};
        $VALUES = oVarArr;
        $ENTRIES = vc.s.n(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
