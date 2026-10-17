package hfg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class e0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e0[] $VALUES;
    public static final e0 BUSINESS;
    public static final e0 ECONOMY;
    public static final e0 FIRST;
    public static final e0 PREMIUM;

    static {
        e0 e0Var = new e0("ECONOMY", 0);
        ECONOMY = e0Var;
        e0 e0Var2 = new e0("PREMIUM", 1);
        PREMIUM = e0Var2;
        e0 e0Var3 = new e0("BUSINESS", 2);
        BUSINESS = e0Var3;
        e0 e0Var4 = new e0("FIRST", 3);
        FIRST = e0Var4;
        e0[] e0VarArr = {e0Var, e0Var2, e0Var3, e0Var4};
        $VALUES = e0VarArr;
        $ENTRIES = vc.s.n(e0VarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }
}
