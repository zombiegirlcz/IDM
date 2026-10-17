package jel;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class f0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f0[] $VALUES;
    public static final f0 BIMONTHLY;
    public static final f0 BIWEEKLY;
    public static final f0 DAILY;
    public static final f0 MONTHLY;
    public static final f0 QUARTERLY;
    public static final f0 SEMESTRAL;
    public static final f0 WEEKLY;
    public static final f0 YEARLY;

    static {
        f0 f0Var = new f0("DAILY", 0);
        DAILY = f0Var;
        f0 f0Var2 = new f0("WEEKLY", 1);
        WEEKLY = f0Var2;
        f0 f0Var3 = new f0("BIWEEKLY", 2);
        BIWEEKLY = f0Var3;
        f0 f0Var4 = new f0("MONTHLY", 3);
        MONTHLY = f0Var4;
        f0 f0Var5 = new f0("BIMONTHLY", 4);
        BIMONTHLY = f0Var5;
        f0 f0Var6 = new f0("SEMESTRAL", 5);
        SEMESTRAL = f0Var6;
        f0 f0Var7 = new f0("QUARTERLY", 6);
        QUARTERLY = f0Var7;
        f0 f0Var8 = new f0("YEARLY", 7);
        YEARLY = f0Var8;
        f0[] f0VarArr = {f0Var, f0Var2, f0Var3, f0Var4, f0Var5, f0Var6, f0Var7, f0Var8};
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
