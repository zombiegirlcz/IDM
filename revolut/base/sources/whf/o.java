package whf;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o SELECTABLE;
    public static final o SWIPE_ITEM;
    public static final o SWIPE_ITEM_NO_ACTION;

    static {
        o oVar = new o("SWIPE_ITEM_NO_ACTION", 0);
        SWIPE_ITEM_NO_ACTION = oVar;
        o oVar2 = new o("SWIPE_ITEM", 1);
        SWIPE_ITEM = oVar2;
        o oVar3 = new o("SELECTABLE", 2);
        SELECTABLE = oVar3;
        o[] oVarArr = {oVar, oVar2, oVar3};
        $VALUES = oVarArr;
        $ENTRIES = s.n(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
