package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class u2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u2[] $VALUES;
    public static final u2 CHARITY;
    public static final u2 CRYPTO;
    public static final u2 REVPOINTS;
    public static final u2 ROBO;
    public static final u2 VAULT;

    static {
        u2 u2Var = new u2("VAULT", 0);
        VAULT = u2Var;
        u2 u2Var2 = new u2("ROBO", 1);
        ROBO = u2Var2;
        u2 u2Var3 = new u2("REVPOINTS", 2);
        REVPOINTS = u2Var3;
        u2 u2Var4 = new u2("CRYPTO", 3);
        CRYPTO = u2Var4;
        u2 u2Var5 = new u2("CHARITY", 4);
        CHARITY = u2Var5;
        u2[] u2VarArr = {u2Var, u2Var2, u2Var3, u2Var4, u2Var5};
        $VALUES = u2VarArr;
        $ENTRIES = vc.s.n(u2VarArr);
    }

    public static u2 valueOf(String str) {
        return (u2) Enum.valueOf(u2.class, str);
    }

    public static u2[] values() {
        return (u2[]) $VALUES.clone();
    }
}
