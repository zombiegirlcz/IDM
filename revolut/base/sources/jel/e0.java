package jel;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class e0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e0[] $VALUES;
    public static final e0 ASIA_PACIFIC;
    public static final e0 DIVERSIFIED;
    public static final e0 EUROPE;
    public static final e0 NORTH_AMERICA;
    public static final e0 REST_OF_THE_WORLD;

    static {
        e0 e0Var = new e0("NORTH_AMERICA", 0);
        NORTH_AMERICA = e0Var;
        e0 e0Var2 = new e0("EUROPE", 1);
        EUROPE = e0Var2;
        e0 e0Var3 = new e0("ASIA_PACIFIC", 2);
        ASIA_PACIFIC = e0Var3;
        e0 e0Var4 = new e0("DIVERSIFIED", 3);
        DIVERSIFIED = e0Var4;
        e0 e0Var5 = new e0("REST_OF_THE_WORLD", 4);
        REST_OF_THE_WORLD = e0Var5;
        e0[] e0VarArr = {e0Var, e0Var2, e0Var3, e0Var4, e0Var5};
        $VALUES = e0VarArr;
        $ENTRIES = vc.s.n(e0VarArr);
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }
}
