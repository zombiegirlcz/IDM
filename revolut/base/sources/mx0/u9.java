package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class u9 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u9[] $VALUES;
    public static final u9 REASON_API_ANIMATION;
    public static final u9 REASON_DEVELOPER_ANIMATION;
    public static final u9 REASON_GESTURE;

    static {
        u9 u9Var = new u9("REASON_API_ANIMATION", 0);
        REASON_API_ANIMATION = u9Var;
        u9 u9Var2 = new u9("REASON_DEVELOPER_ANIMATION", 1);
        REASON_DEVELOPER_ANIMATION = u9Var2;
        u9 u9Var3 = new u9("REASON_GESTURE", 2);
        REASON_GESTURE = u9Var3;
        u9[] u9VarArr = {u9Var, u9Var2, u9Var3};
        $VALUES = u9VarArr;
        $ENTRIES = vc.s.n(u9VarArr);
    }

    public static u9 valueOf(String str) {
        return (u9) Enum.valueOf(u9.class, str);
    }

    public static u9[] values() {
        return (u9[]) $VALUES.clone();
    }
}
