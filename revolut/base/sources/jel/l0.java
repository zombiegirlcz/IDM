package jel;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class l0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l0[] $VALUES;
    public static final l0 INFRASTRUCTURE;
    public static final l0 LIQUID_ASSETS;
    public static final l0 PRIVATE_CREDIT;
    public static final l0 PRIVATE_EQUITY;
    public static final l0 REAL_ESTATE;

    static {
        l0 l0Var = new l0("PRIVATE_EQUITY", 0);
        PRIVATE_EQUITY = l0Var;
        l0 l0Var2 = new l0("PRIVATE_CREDIT", 1);
        PRIVATE_CREDIT = l0Var2;
        l0 l0Var3 = new l0("REAL_ESTATE", 2);
        REAL_ESTATE = l0Var3;
        l0 l0Var4 = new l0("INFRASTRUCTURE", 3);
        INFRASTRUCTURE = l0Var4;
        l0 l0Var5 = new l0("LIQUID_ASSETS", 4);
        LIQUID_ASSETS = l0Var5;
        l0[] l0VarArr = {l0Var, l0Var2, l0Var3, l0Var4, l0Var5};
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
