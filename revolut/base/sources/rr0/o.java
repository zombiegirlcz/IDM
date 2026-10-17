package rr0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o BOTTOM_SHEET;
    public static final o FULLSCREEN_PAGED;
    public static final o POPUP;
    public static final o STATUS_SHEET;

    static {
        o oVar = new o("STATUS_SHEET", 0);
        STATUS_SHEET = oVar;
        o oVar2 = new o("BOTTOM_SHEET", 1);
        BOTTOM_SHEET = oVar2;
        o oVar3 = new o("POPUP", 2);
        POPUP = oVar3;
        o oVar4 = new o("FULLSCREEN_PAGED", 3);
        FULLSCREEN_PAGED = oVar4;
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
