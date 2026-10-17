package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class r9 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r9[] $VALUES;
    public static final r9 IDLE;
    public static final r9 MOVE_STARTED;

    static {
        r9 r9Var = new r9("MOVE_STARTED", 0);
        MOVE_STARTED = r9Var;
        r9 r9Var2 = new r9("IDLE", 1);
        IDLE = r9Var2;
        r9[] r9VarArr = {r9Var, r9Var2};
        $VALUES = r9VarArr;
        $ENTRIES = vc.s.n(r9VarArr);
    }

    public static r9 valueOf(String str) {
        return (r9) Enum.valueOf(r9.class, str);
    }

    public static r9[] values() {
        return (r9[]) $VALUES.clone();
    }
}
