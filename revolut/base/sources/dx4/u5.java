package dx4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class u5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u5[] $VALUES;
    public static final u5 WHITE;

    static {
        u5 u5Var = new u5("WHITE", 0);
        WHITE = u5Var;
        u5[] u5VarArr = {u5Var};
        $VALUES = u5VarArr;
        $ENTRIES = vc.s.n(u5VarArr);
    }

    public static u5 valueOf(String str) {
        return (u5) Enum.valueOf(u5.class, str);
    }

    public static u5[] values() {
        return (u5[]) $VALUES.clone();
    }
}
