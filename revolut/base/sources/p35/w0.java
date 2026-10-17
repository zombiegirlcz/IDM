package p35;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class w0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w0[] $VALUES;
    public static final w0 Generated;
    public static final w0 Periodic;

    static {
        w0 w0Var = new w0("Generated", 0);
        Generated = w0Var;
        w0 w0Var2 = new w0("Periodic", 1);
        Periodic = w0Var2;
        w0[] w0VarArr = {w0Var, w0Var2};
        $VALUES = w0VarArr;
        $ENTRIES = vc.s.n(w0VarArr);
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) $VALUES.clone();
    }
}
