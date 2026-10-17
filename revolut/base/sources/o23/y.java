package o23;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class y {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y[] $VALUES;
    public static final y EDITABLE;
    public static final y SELECTABLE;

    static {
        y yVar = new y("EDITABLE", 0);
        EDITABLE = yVar;
        y yVar2 = new y("SELECTABLE", 1);
        SELECTABLE = yVar2;
        y[] yVarArr = {yVar, yVar2};
        $VALUES = yVarArr;
        $ENTRIES = vc.s.n(yVarArr);
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }
}
