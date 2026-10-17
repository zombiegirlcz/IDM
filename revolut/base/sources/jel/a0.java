package jel;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 MULTI_MANAGER;
    public static final a0 SINGLE_MANAGER;

    static {
        a0 a0Var = new a0("SINGLE_MANAGER", 0);
        SINGLE_MANAGER = a0Var;
        a0 a0Var2 = new a0("MULTI_MANAGER", 1);
        MULTI_MANAGER = a0Var2;
        a0[] a0VarArr = {a0Var, a0Var2};
        $VALUES = a0VarArr;
        $ENTRIES = vc.s.n(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }
}
