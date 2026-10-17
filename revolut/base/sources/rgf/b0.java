package rgf;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class b0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b0[] $VALUES;
    public static final b0 CRYPTO;
    public static final b0 INVEST;

    static {
        b0 b0Var = new b0("CRYPTO", 0);
        CRYPTO = b0Var;
        b0 b0Var2 = new b0("INVEST", 1);
        INVEST = b0Var2;
        b0[] b0VarArr = {b0Var, b0Var2};
        $VALUES = b0VarArr;
        $ENTRIES = vc.s.n(b0VarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }
}
