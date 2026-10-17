package a09;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k0[] $VALUES;
    public static final k0 BOTH;
    public static final k0 LOCAL;
    public static final k0 NETWORK;

    static {
        k0 k0Var = new k0("LOCAL", 0);
        LOCAL = k0Var;
        k0 k0Var2 = new k0("NETWORK", 1);
        NETWORK = k0Var2;
        k0 k0Var3 = new k0("BOTH", 2);
        BOTH = k0Var3;
        k0[] k0VarArr = {k0Var, k0Var2, k0Var3};
        $VALUES = k0VarArr;
        $ENTRIES = vc.s.n(k0VarArr);
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) $VALUES.clone();
    }
}
