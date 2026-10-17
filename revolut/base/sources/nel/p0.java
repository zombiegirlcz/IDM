package nel;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class p0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p0[] $VALUES;
    public static final p0 AFTER_HOURS;
    public static final p0 NONE;
    public static final p0 OPEN;
    public static final p0 PRE_MARKET;
    public static final p0 UNDEFINED;

    static {
        p0 p0Var = new p0("OPEN", 0);
        OPEN = p0Var;
        p0 p0Var2 = new p0("NONE", 1);
        NONE = p0Var2;
        p0 p0Var3 = new p0("AFTER_HOURS", 2);
        AFTER_HOURS = p0Var3;
        p0 p0Var4 = new p0("PRE_MARKET", 3);
        PRE_MARKET = p0Var4;
        p0 p0Var5 = new p0("UNDEFINED", 4);
        UNDEFINED = p0Var5;
        p0[] p0VarArr = {p0Var, p0Var2, p0Var3, p0Var4, p0Var5};
        $VALUES = p0VarArr;
        $ENTRIES = vc.s.n(p0VarArr);
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) $VALUES.clone();
    }
}
