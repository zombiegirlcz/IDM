package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class c5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c5[] $VALUES;
    public static final c5 CLAIMED;
    public static final c5 RESPONDED;
    public static final c5 SCHEDULED;
    public static final c5 UNCLAIMED;
    public static final c5 UNKNOWN;

    static {
        c5 c5Var = new c5("SCHEDULED", 0);
        SCHEDULED = c5Var;
        c5 c5Var2 = new c5("UNCLAIMED", 1);
        UNCLAIMED = c5Var2;
        c5 c5Var3 = new c5("CLAIMED", 2);
        CLAIMED = c5Var3;
        c5 c5Var4 = new c5("RESPONDED", 3);
        RESPONDED = c5Var4;
        c5 c5Var5 = new c5("UNKNOWN", 4);
        UNKNOWN = c5Var5;
        c5[] c5VarArr = {c5Var, c5Var2, c5Var3, c5Var4, c5Var5};
        $VALUES = c5VarArr;
        $ENTRIES = vc.s.n(c5VarArr);
    }

    public static c5 valueOf(String str) {
        return (c5) Enum.valueOf(c5.class, str);
    }

    public static c5[] values() {
        return (c5[]) $VALUES.clone();
    }
}
