package p35;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class p0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p0[] $VALUES;
    public static final p0 ACTIVE;
    public static final p0 CANCELLED;
    public static final p0 DISABLED;
    public static final p0 FAILED;
    public static final p0 PENDING;

    static {
        p0 p0Var = new p0("ACTIVE", 0);
        ACTIVE = p0Var;
        p0 p0Var2 = new p0("DISABLED", 1);
        DISABLED = p0Var2;
        p0 p0Var3 = new p0("FAILED", 2);
        FAILED = p0Var3;
        p0 p0Var4 = new p0("CANCELLED", 3);
        CANCELLED = p0Var4;
        p0 p0Var5 = new p0("PENDING", 4);
        PENDING = p0Var5;
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
