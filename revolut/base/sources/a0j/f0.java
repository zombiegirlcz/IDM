package a0j;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class f0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f0[] $VALUES;
    public static final f0 DAY;
    public static final f0 MONTH;
    public static final f0 WEEK;
    public static final f0 YEAR;

    static {
        f0 f0Var = new f0("DAY", 0);
        DAY = f0Var;
        f0 f0Var2 = new f0("WEEK", 1);
        WEEK = f0Var2;
        f0 f0Var3 = new f0("MONTH", 2);
        MONTH = f0Var3;
        f0 f0Var4 = new f0("YEAR", 3);
        YEAR = f0Var4;
        f0[] f0VarArr = {f0Var, f0Var2, f0Var3, f0Var4};
        $VALUES = f0VarArr;
        $ENTRIES = vc.s.n(f0VarArr);
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) $VALUES.clone();
    }
}
