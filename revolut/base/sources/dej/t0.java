package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class t0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t0[] $VALUES;
    public static final t0 BUSINESS;
    public static final t0 PRIVATE;
    public static final t0 UNKNOWN;

    static {
        t0 t0Var = new t0("PRIVATE", 0);
        PRIVATE = t0Var;
        t0 t0Var2 = new t0("BUSINESS", 1);
        BUSINESS = t0Var2;
        t0 t0Var3 = new t0("UNKNOWN", 2);
        UNKNOWN = t0Var3;
        t0[] t0VarArr = {t0Var, t0Var2, t0Var3};
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
