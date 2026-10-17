package zh9;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class f1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f1[] $VALUES;
    public static final f1 DAILY;
    public static final f1 MONTHLY;

    static {
        f1 f1Var = new f1("DAILY", 0);
        DAILY = f1Var;
        f1 f1Var2 = new f1("MONTHLY", 1);
        MONTHLY = f1Var2;
        f1[] f1VarArr = {f1Var, f1Var2};
        $VALUES = f1VarArr;
        $ENTRIES = vc.s.n(f1VarArr);
    }

    public static f1 valueOf(String str) {
        return (f1) Enum.valueOf(f1.class, str);
    }

    public static f1[] values() {
        return (f1[]) $VALUES.clone();
    }
}
