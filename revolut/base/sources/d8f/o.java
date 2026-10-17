package d8f;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o MULTIPLE_TABS;
    public static final o SINGLE_TAB;

    static {
        o oVar = new o("MULTIPLE_TABS", 0);
        MULTIPLE_TABS = oVar;
        o oVar2 = new o("SINGLE_TAB", 1);
        SINGLE_TAB = oVar2;
        o[] oVarArr = {oVar, oVar2};
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
