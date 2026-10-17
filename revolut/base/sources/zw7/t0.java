package zw7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class t0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t0[] $VALUES;
    public static final t0 ACTIVE;
    public static final t0 CANCELLED;
    public static final t0 INACTIVE;
    public static final t0 LAPSED;

    static {
        t0 t0Var = new t0("ACTIVE", 0);
        ACTIVE = t0Var;
        t0 t0Var2 = new t0("CANCELLED", 1);
        CANCELLED = t0Var2;
        t0 t0Var3 = new t0("INACTIVE", 2);
        INACTIVE = t0Var3;
        t0 t0Var4 = new t0("LAPSED", 3);
        LAPSED = t0Var4;
        t0[] t0VarArr = {t0Var, t0Var2, t0Var3, t0Var4};
        $VALUES = t0VarArr;
        $ENTRIES = vc.s.n(t0VarArr);
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) $VALUES.clone();
    }
}
