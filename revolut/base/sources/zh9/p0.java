package zh9;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class p0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p0[] $VALUES;
    public static final p0 PAY_IN_12;
    public static final p0 PAY_IN_3;
    public static final p0 PAY_IN_30_DAYS;
    public static final p0 PAY_IN_6;
    public static final p0 PAY_IN_9;

    static {
        p0 p0Var = new p0("PAY_IN_30_DAYS", 0);
        PAY_IN_30_DAYS = p0Var;
        p0 p0Var2 = new p0("PAY_IN_3", 1);
        PAY_IN_3 = p0Var2;
        p0 p0Var3 = new p0("PAY_IN_6", 2);
        PAY_IN_6 = p0Var3;
        p0 p0Var4 = new p0("PAY_IN_9", 3);
        PAY_IN_9 = p0Var4;
        p0 p0Var5 = new p0("PAY_IN_12", 4);
        PAY_IN_12 = p0Var5;
        p0[] p0VarArr = {p0Var, p0Var2, p0Var3, p0Var4, p0Var5};
        $VALUES = p0VarArr;
        $ENTRIES = vc.s.n(p0VarArr);
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) $VALUES.clone();
    }
}
