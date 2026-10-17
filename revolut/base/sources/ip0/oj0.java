package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class oj0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ oj0[] $VALUES;
    public static final oj0 CLOSE;
    public static final oj0 END;
    public static final oj0 START;

    static {
        oj0 oj0Var = new oj0("START", 0);
        START = oj0Var;
        oj0 oj0Var2 = new oj0("END", 1);
        END = oj0Var2;
        oj0 oj0Var3 = new oj0("CLOSE", 2);
        CLOSE = oj0Var3;
        oj0[] oj0VarArr = {oj0Var, oj0Var2, oj0Var3};
        $VALUES = oj0VarArr;
        $ENTRIES = vc.s.n(oj0VarArr);
    }

    public static oj0 valueOf(String str) {
        return (oj0) Enum.valueOf(oj0.class, str);
    }

    public static oj0[] values() {
        return (oj0[]) $VALUES.clone();
    }
}
