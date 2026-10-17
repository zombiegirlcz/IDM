package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class b5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b5[] $VALUES;
    public static final b5 INCOMING;
    public static final b5 OUTGOING;
    public static final b5 UNKNOWN;

    static {
        b5 b5Var = new b5("INCOMING", 0);
        INCOMING = b5Var;
        b5 b5Var2 = new b5("OUTGOING", 1);
        OUTGOING = b5Var2;
        b5 b5Var3 = new b5("UNKNOWN", 2);
        UNKNOWN = b5Var3;
        b5[] b5VarArr = {b5Var, b5Var2, b5Var3};
        $VALUES = b5VarArr;
        $ENTRIES = vc.s.n(b5VarArr);
    }

    public static b5 valueOf(String str) {
        return (b5) Enum.valueOf(b5.class, str);
    }

    public static b5[] values() {
        return (b5[]) $VALUES.clone();
    }
}
