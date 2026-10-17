package o23;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class d0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d0[] $VALUES;
    public static final d0 AUTO_COMPLETE;
    public static final d0 MANUAL;
    public static final d0 POST_CODE_LOOKUP;
    public static final d0 UNKNOWN;

    static {
        d0 d0Var = new d0("POST_CODE_LOOKUP", 0);
        POST_CODE_LOOKUP = d0Var;
        d0 d0Var2 = new d0("AUTO_COMPLETE", 1);
        AUTO_COMPLETE = d0Var2;
        d0 d0Var3 = new d0("MANUAL", 2);
        MANUAL = d0Var3;
        d0 d0Var4 = new d0("UNKNOWN", 3);
        UNKNOWN = d0Var4;
        d0[] d0VarArr = {d0Var, d0Var2, d0Var3, d0Var4};
        $VALUES = d0VarArr;
        $ENTRIES = vc.s.n(d0VarArr);
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) $VALUES.clone();
    }
}
