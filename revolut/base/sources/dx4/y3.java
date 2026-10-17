package dx4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class y3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y3[] $VALUES;
    public static final y3 FOREGROUND;
    public static final y3 GREY_TONE_50;
    public static final y3 STATUS_DANGER;
    public static final y3 STATUS_SUCCESS;
    public static final y3 STATUS_WARNING;

    static {
        y3 y3Var = new y3("FOREGROUND", 0);
        FOREGROUND = y3Var;
        y3 y3Var2 = new y3("GREY_TONE_50", 1);
        GREY_TONE_50 = y3Var2;
        y3 y3Var3 = new y3("STATUS_WARNING", 2);
        STATUS_WARNING = y3Var3;
        y3 y3Var4 = new y3("STATUS_DANGER", 3);
        STATUS_DANGER = y3Var4;
        y3 y3Var5 = new y3("STATUS_SUCCESS", 4);
        STATUS_SUCCESS = y3Var5;
        y3[] y3VarArr = {y3Var, y3Var2, y3Var3, y3Var4, y3Var5};
        $VALUES = y3VarArr;
        $ENTRIES = vc.s.n(y3VarArr);
    }

    public static y3 valueOf(String str) {
        return (y3) Enum.valueOf(y3.class, str);
    }

    public static y3[] values() {
        return (y3[]) $VALUES.clone();
    }
}
