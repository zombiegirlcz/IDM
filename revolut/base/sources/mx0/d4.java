package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class d4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d4[] $VALUES;
    public static final d4 CANCELLED;
    public static final d4 HANDS_FREE;
    public static final d4 HOLD_HINT;
    public static final d4 IDLE;
    public static final d4 PREVIEW;
    public static final d4 RECORDING;

    static {
        d4 d4Var = new d4("IDLE", 0);
        IDLE = d4Var;
        d4 d4Var2 = new d4("HOLD_HINT", 1);
        HOLD_HINT = d4Var2;
        d4 d4Var3 = new d4("RECORDING", 2);
        RECORDING = d4Var3;
        d4 d4Var4 = new d4("CANCELLED", 3);
        CANCELLED = d4Var4;
        d4 d4Var5 = new d4("HANDS_FREE", 4);
        HANDS_FREE = d4Var5;
        d4 d4Var6 = new d4("PREVIEW", 5);
        PREVIEW = d4Var6;
        d4[] d4VarArr = {d4Var, d4Var2, d4Var3, d4Var4, d4Var5, d4Var6};
        $VALUES = d4VarArr;
        $ENTRIES = vc.s.n(d4VarArr);
    }

    public static d4 valueOf(String str) {
        return (d4) Enum.valueOf(d4.class, str);
    }

    public static d4[] values() {
        return (d4[]) $VALUES.clone();
    }
}
