package e0f;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class c0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c0[] $VALUES;
    public static final c0 Waiting;
    public static final c0 Warning;

    static {
        c0 c0Var = new c0("Warning", 0);
        Warning = c0Var;
        c0 c0Var2 = new c0("Waiting", 1);
        Waiting = c0Var2;
        c0[] c0VarArr = {c0Var, c0Var2};
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
