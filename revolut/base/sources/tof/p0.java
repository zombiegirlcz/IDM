package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class p0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p0[] $VALUES;
    public static final p0 BUY;
    public static final p0 SELL;
    public static final p0 UNKNOWN;

    static {
        p0 p0Var = new p0("SELL", 0);
        SELL = p0Var;
        p0 p0Var2 = new p0("BUY", 1);
        BUY = p0Var2;
        p0 p0Var3 = new p0("UNKNOWN", 2);
        UNKNOWN = p0Var3;
        p0[] p0VarArr = {p0Var, p0Var2, p0Var3};
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
