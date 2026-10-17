package k4l;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class o0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o0[] $VALUES;
    public static final o0 CANCELLED;
    public static final o0 DECLINED;
    public static final o0 FILLED;
    public static final o0 PARTIALLY_FILLED;
    public static final o0 PENDING;
    public static final o0 RECEIVED;

    static {
        o0 o0Var = new o0("RECEIVED", 0);
        RECEIVED = o0Var;
        o0 o0Var2 = new o0("PENDING", 1);
        PENDING = o0Var2;
        o0 o0Var3 = new o0("CANCELLED", 2);
        CANCELLED = o0Var3;
        o0 o0Var4 = new o0("DECLINED", 3);
        DECLINED = o0Var4;
        o0 o0Var5 = new o0("FILLED", 4);
        FILLED = o0Var5;
        o0 o0Var6 = new o0("PARTIALLY_FILLED", 5);
        PARTIALLY_FILLED = o0Var6;
        o0[] o0VarArr = {o0Var, o0Var2, o0Var3, o0Var4, o0Var5, o0Var6};
        $VALUES = o0VarArr;
        $ENTRIES = vc.s.n(o0VarArr);
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) $VALUES.clone();
    }
}
