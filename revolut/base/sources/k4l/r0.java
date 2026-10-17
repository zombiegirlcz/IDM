package k4l;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class r0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r0[] $VALUES;
    public static final r0 LIMIT;
    public static final r0 MARKET;
    public static final r0 RECURRING;
    public static final r0 STOP;

    static {
        r0 r0Var = new r0("MARKET", 0);
        MARKET = r0Var;
        r0 r0Var2 = new r0("LIMIT", 1);
        LIMIT = r0Var2;
        r0 r0Var3 = new r0("STOP", 2);
        STOP = r0Var3;
        r0 r0Var4 = new r0("RECURRING", 3);
        RECURRING = r0Var4;
        r0[] r0VarArr = {r0Var, r0Var2, r0Var3, r0Var4};
        $VALUES = r0VarArr;
        $ENTRIES = vc.s.n(r0VarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) $VALUES.clone();
    }
}
