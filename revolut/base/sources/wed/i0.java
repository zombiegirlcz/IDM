package wed;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class i0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i0[] $VALUES;
    public static final i0 ADD_ALERT;
    public static final i0 FULL_TRIGGERED;
    public static final i0 NORMAL_TRIGGERED;

    static {
        i0 i0Var = new i0("ADD_ALERT", 0);
        ADD_ALERT = i0Var;
        i0 i0Var2 = new i0("NORMAL_TRIGGERED", 1);
        NORMAL_TRIGGERED = i0Var2;
        i0 i0Var3 = new i0("FULL_TRIGGERED", 2);
        FULL_TRIGGERED = i0Var3;
        i0[] i0VarArr = {i0Var, i0Var2, i0Var3};
        $VALUES = i0VarArr;
        $ENTRIES = vc.s.n(i0VarArr);
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) $VALUES.clone();
    }
}
