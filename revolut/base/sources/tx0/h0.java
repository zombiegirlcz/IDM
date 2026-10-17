package tx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class h0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h0[] $VALUES;
    public static final h0 SIZE_16;
    public static final h0 SIZE_24;

    static {
        h0 h0Var = new h0("SIZE_16", 0);
        SIZE_16 = h0Var;
        h0 h0Var2 = new h0("SIZE_24", 1);
        SIZE_24 = h0Var2;
        h0[] h0VarArr = {h0Var, h0Var2};
        $VALUES = h0VarArr;
        $ENTRIES = vc.s.n(h0VarArr);
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) $VALUES.clone();
    }
}
