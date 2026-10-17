package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class yj0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ yj0[] $VALUES;
    public static final yj0 CENTER_HORIZONTAL;
    public static final yj0 START;

    static {
        yj0 yj0Var = new yj0("START", 0);
        START = yj0Var;
        yj0 yj0Var2 = new yj0("CENTER_HORIZONTAL", 1);
        CENTER_HORIZONTAL = yj0Var2;
        yj0[] yj0VarArr = {yj0Var, yj0Var2};
        $VALUES = yj0VarArr;
        $ENTRIES = vc.s.n(yj0VarArr);
    }

    public static yj0 valueOf(String str) {
        return (yj0) Enum.valueOf(yj0.class, str);
    }

    public static yj0[] values() {
        return (yj0[]) $VALUES.clone();
    }
}
