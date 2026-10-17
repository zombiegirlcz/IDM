package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class f2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f2[] $VALUES;
    public static final f2 COMPLETED;
    public static final f2 FAILED;
    public static final f2 PENDING;

    static {
        f2 f2Var = new f2("PENDING", 0);
        PENDING = f2Var;
        f2 f2Var2 = new f2("COMPLETED", 1);
        COMPLETED = f2Var2;
        f2 f2Var3 = new f2("FAILED", 2);
        FAILED = f2Var3;
        f2[] f2VarArr = {f2Var, f2Var2, f2Var3};
        $VALUES = f2VarArr;
        $ENTRIES = vc.s.n(f2VarArr);
    }

    public static f2 valueOf(String str) {
        return (f2) Enum.valueOf(f2.class, str);
    }

    public static f2[] values() {
        return (f2[]) $VALUES.clone();
    }
}
