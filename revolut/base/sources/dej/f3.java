package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class f3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f3[] $VALUES;
    public static final f3 COMPLETED;
    public static final f3 ELIGIBLE;
    public static final f3 NON_ELIGIBLE;
    public static final f3 PENDING;
    public static final f3 UNKNOWN;

    static {
        f3 f3Var = new f3("NON_ELIGIBLE", 0);
        NON_ELIGIBLE = f3Var;
        f3 f3Var2 = new f3("ELIGIBLE", 1);
        ELIGIBLE = f3Var2;
        f3 f3Var3 = new f3("PENDING", 2);
        PENDING = f3Var3;
        f3 f3Var4 = new f3("COMPLETED", 3);
        COMPLETED = f3Var4;
        f3 f3Var5 = new f3("UNKNOWN", 4);
        UNKNOWN = f3Var5;
        f3[] f3VarArr = {f3Var, f3Var2, f3Var3, f3Var4, f3Var5};
        $VALUES = f3VarArr;
        $ENTRIES = vc.s.n(f3VarArr);
    }

    public static f3 valueOf(String str) {
        return (f3) Enum.valueOf(f3.class, str);
    }

    public static f3[] values() {
        return (f3[]) $VALUES.clone();
    }
}
