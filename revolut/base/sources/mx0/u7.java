package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class u7 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u7[] $VALUES;
    public static final u7 LEFT;
    public static final u7 RIGHT;

    static {
        u7 u7Var = new u7("LEFT", 0);
        LEFT = u7Var;
        u7 u7Var2 = new u7("RIGHT", 1);
        RIGHT = u7Var2;
        u7[] u7VarArr = {u7Var, u7Var2};
        $VALUES = u7VarArr;
        $ENTRIES = vc.s.n(u7VarArr);
    }

    public static u7 valueOf(String str) {
        return (u7) Enum.valueOf(u7.class, str);
    }

    public static u7[] values() {
        return (u7[]) $VALUES.clone();
    }
}
