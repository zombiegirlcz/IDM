package vg0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class c0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c0[] $VALUES;
    public static final c0 DISCOURAGED;
    public static final c0 PREFERRED;
    public static final c0 REQUIRED;

    static {
        c0 c0Var = new c0("DISCOURAGED", 0);
        DISCOURAGED = c0Var;
        c0 c0Var2 = new c0("PREFERRED", 1);
        PREFERRED = c0Var2;
        c0 c0Var3 = new c0("REQUIRED", 2);
        REQUIRED = c0Var3;
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
