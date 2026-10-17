package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class f7 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f7[] $VALUES;
    public static final f7 CRITICAL;
    public static final f7 HEALTHY;
    public static final f7 WARNING;

    static {
        f7 f7Var = new f7("HEALTHY", 0);
        HEALTHY = f7Var;
        f7 f7Var2 = new f7("WARNING", 1);
        WARNING = f7Var2;
        f7 f7Var3 = new f7("CRITICAL", 2);
        CRITICAL = f7Var3;
        f7[] f7VarArr = {f7Var, f7Var2, f7Var3};
        $VALUES = f7VarArr;
        $ENTRIES = vc.s.n(f7VarArr);
    }

    public static f7 valueOf(String str) {
        return (f7) Enum.valueOf(f7.class, str);
    }

    public static f7[] values() {
        return (f7[]) $VALUES.clone();
    }
}
