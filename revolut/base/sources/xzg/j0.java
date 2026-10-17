package xzg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class j0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j0[] $VALUES;
    public static final j0 CRYPTO;
    public static final j0 STOCK;

    static {
        j0 j0Var = new j0("STOCK", 0);
        STOCK = j0Var;
        j0 j0Var2 = new j0("CRYPTO", 1);
        CRYPTO = j0Var2;
        j0[] j0VarArr = {j0Var, j0Var2};
        $VALUES = j0VarArr;
        $ENTRIES = vc.s.n(j0VarArr);
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }
}
