package pij;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class l0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l0[] $VALUES;
    public static final l0 COMPLETED;
    public static final l0 NAVIGATING_TO_GET_PLAN;
    public static final l0 PENDING;

    static {
        l0 l0Var = new l0("PENDING", 0);
        PENDING = l0Var;
        l0 l0Var2 = new l0("NAVIGATING_TO_GET_PLAN", 1);
        NAVIGATING_TO_GET_PLAN = l0Var2;
        l0 l0Var3 = new l0("COMPLETED", 2);
        COMPLETED = l0Var3;
        l0[] l0VarArr = {l0Var, l0Var2, l0Var3};
        $VALUES = l0VarArr;
        $ENTRIES = vc.s.n(l0VarArr);
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) $VALUES.clone();
    }
}
