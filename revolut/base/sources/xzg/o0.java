package xzg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class o0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o0[] $VALUES;
    public static final o0 ACTIVE;
    public static final o0 AVAILABLE;
    public static final o0 DISABLED;
    public static final o0 OFFBOARDING;
    public static final o0 ONBOARDING;
    public static final o0 SUSPENDED;
    public static final o0 TERMINATED;
    public static final o0 UNAVAILABLE;

    static {
        o0 o0Var = new o0("UNAVAILABLE", 0);
        UNAVAILABLE = o0Var;
        o0 o0Var2 = new o0("AVAILABLE", 1);
        AVAILABLE = o0Var2;
        o0 o0Var3 = new o0("ONBOARDING", 2);
        ONBOARDING = o0Var3;
        o0 o0Var4 = new o0("ACTIVE", 3);
        ACTIVE = o0Var4;
        o0 o0Var5 = new o0("SUSPENDED", 4);
        SUSPENDED = o0Var5;
        o0 o0Var6 = new o0("OFFBOARDING", 5);
        OFFBOARDING = o0Var6;
        o0 o0Var7 = new o0("TERMINATED", 6);
        TERMINATED = o0Var7;
        o0 o0Var8 = new o0("DISABLED", 7);
        DISABLED = o0Var8;
        o0[] o0VarArr = {o0Var, o0Var2, o0Var3, o0Var4, o0Var5, o0Var6, o0Var7, o0Var8};
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
