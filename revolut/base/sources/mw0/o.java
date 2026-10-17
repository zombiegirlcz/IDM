package mw0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o BELOW;
    public static final o BELOW_START;
    public static final o TOUCH_COORDINATES;
    public static final o VIEW_BOUNDS;

    static {
        o oVar = new o("TOUCH_COORDINATES", 0);
        TOUCH_COORDINATES = oVar;
        o oVar2 = new o("VIEW_BOUNDS", 1);
        VIEW_BOUNDS = oVar2;
        o oVar3 = new o("BELOW", 2);
        BELOW = oVar3;
        o oVar4 = new o("BELOW_START", 3);
        BELOW_START = oVar4;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4};
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
