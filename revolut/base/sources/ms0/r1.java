package ms0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class r1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r1[] $VALUES;
    public static final r1 MIDDLE;
    public static final r1 START_BETWEEN_SEGMENTS;

    static {
        r1 r1Var = new r1("MIDDLE", 0);
        MIDDLE = r1Var;
        r1 r1Var2 = new r1("START_BETWEEN_SEGMENTS", 1);
        START_BETWEEN_SEGMENTS = r1Var2;
        r1[] r1VarArr = {r1Var, r1Var2};
        $VALUES = r1VarArr;
        $ENTRIES = vc.s.n(r1VarArr);
    }

    public static r1 valueOf(String str) {
        return (r1) Enum.valueOf(r1.class, str);
    }

    public static r1[] values() {
        return (r1[]) $VALUES.clone();
    }
}
