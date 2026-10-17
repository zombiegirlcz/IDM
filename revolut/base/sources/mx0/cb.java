package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class cb {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ cb[] $VALUES;
    public static final cb BOTTOM_TO_TOP;
    public static final cb TOP_TO_BOTTOM;

    static {
        cb cbVar = new cb("TOP_TO_BOTTOM", 0);
        TOP_TO_BOTTOM = cbVar;
        cb cbVar2 = new cb("BOTTOM_TO_TOP", 1);
        BOTTOM_TO_TOP = cbVar2;
        cb[] cbVarArr = {cbVar, cbVar2};
        $VALUES = cbVarArr;
        $ENTRIES = vc.s.n(cbVarArr);
    }

    public static cb valueOf(String str) {
        return (cb) Enum.valueOf(cb.class, str);
    }

    public static cb[] values() {
        return (cb[]) $VALUES.clone();
    }
}
