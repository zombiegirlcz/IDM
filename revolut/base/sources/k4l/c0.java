package k4l;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class c0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c0[] $VALUES;
    public static final c0 DAY;
    public static final c0 MONTH;
    public static final c0 WEEK;

    static {
        c0 c0Var = new c0("DAY", 0);
        DAY = c0Var;
        c0 c0Var2 = new c0("WEEK", 1);
        WEEK = c0Var2;
        c0 c0Var3 = new c0("MONTH", 2);
        MONTH = c0Var3;
        c0[] c0VarArr = {c0Var, c0Var2, c0Var3};
        $VALUES = c0VarArr;
        $ENTRIES = vc.s.n(c0VarArr);
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) $VALUES.clone();
    }
}
