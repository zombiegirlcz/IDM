package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ry {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ry[] $VALUES;
    public static final ry COMPACT;
    public static final ry COMPACT_NO_PADDING;
    public static final ry DEFAULT;
    public static final ry LARGE;

    static {
        ry ryVar = new ry("DEFAULT", 0);
        DEFAULT = ryVar;
        ry ryVar2 = new ry("LARGE", 1);
        LARGE = ryVar2;
        ry ryVar3 = new ry("COMPACT", 2);
        COMPACT = ryVar3;
        ry ryVar4 = new ry("COMPACT_NO_PADDING", 3);
        COMPACT_NO_PADDING = ryVar4;
        ry[] ryVarArr = {ryVar, ryVar2, ryVar3, ryVar4};
        $VALUES = ryVarArr;
        $ENTRIES = vc.s.n(ryVarArr);
    }

    public static ry valueOf(String str) {
        return (ry) Enum.valueOf(ry.class, str);
    }

    public static ry[] values() {
        return (ry[]) $VALUES.clone();
    }
}
