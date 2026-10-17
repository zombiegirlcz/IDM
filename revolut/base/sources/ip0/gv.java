package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class gv {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ gv[] $VALUES;
    public static final gv BOTTOM_TO_TOP;
    public static final gv LEFT_TO_RIGHT;
    public static final gv NONE;

    static {
        gv gvVar = new gv("NONE", 0);
        NONE = gvVar;
        gv gvVar2 = new gv("BOTTOM_TO_TOP", 1);
        BOTTOM_TO_TOP = gvVar2;
        gv gvVar3 = new gv("LEFT_TO_RIGHT", 2);
        LEFT_TO_RIGHT = gvVar3;
        gv[] gvVarArr = {gvVar, gvVar2, gvVar3};
        $VALUES = gvVarArr;
        $ENTRIES = vc.s.n(gvVarArr);
    }

    public static gv valueOf(String str) {
        return (gv) Enum.valueOf(gv.class, str);
    }

    public static gv[] values() {
        return (gv[]) $VALUES.clone();
    }
}
