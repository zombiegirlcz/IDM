package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class h7 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h7[] $VALUES;
    public static final h7 Multi;
    public static final h7 Single;

    static {
        h7 h7Var = new h7("Single", 0);
        Single = h7Var;
        h7 h7Var2 = new h7("Multi", 1);
        Multi = h7Var2;
        h7[] h7VarArr = {h7Var, h7Var2};
        $VALUES = h7VarArr;
        $ENTRIES = vc.s.n(h7VarArr);
    }

    public static h7 valueOf(String str) {
        return (h7) Enum.valueOf(h7.class, str);
    }

    public static h7[] values() {
        return (h7[]) $VALUES.clone();
    }
}
