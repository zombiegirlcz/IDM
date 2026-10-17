package m1c;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class p0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p0[] $VALUES;
    public static final p0 NONE;
    public static final p0 SC_OR_PLAN_REQUIRED;
    public static final p0 SC_REQUIRED;
    public static final p0 SC_REQUIRED_PLAN_NOT_REQUIRED;

    static {
        p0 p0Var = new p0("SC_OR_PLAN_REQUIRED", 0);
        SC_OR_PLAN_REQUIRED = p0Var;
        p0 p0Var2 = new p0("SC_REQUIRED_PLAN_NOT_REQUIRED", 1);
        SC_REQUIRED_PLAN_NOT_REQUIRED = p0Var2;
        p0 p0Var3 = new p0("SC_REQUIRED", 2);
        SC_REQUIRED = p0Var3;
        p0 p0Var4 = new p0("NONE", 3);
        NONE = p0Var4;
        p0[] p0VarArr = {p0Var, p0Var2, p0Var3, p0Var4};
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
