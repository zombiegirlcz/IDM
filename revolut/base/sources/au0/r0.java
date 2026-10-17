package au0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class r0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r0[] $VALUES;
    public static final r0 BLURRED_BACKGROUND;
    public static final r0 DEFAULT;

    static {
        r0 r0Var = new r0("DEFAULT", 0);
        DEFAULT = r0Var;
        r0 r0Var2 = new r0("BLURRED_BACKGROUND", 1);
        BLURRED_BACKGROUND = r0Var2;
        r0[] r0VarArr = {r0Var, r0Var2};
        $VALUES = r0VarArr;
        $ENTRIES = vc.s.n(r0VarArr);
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) $VALUES.clone();
    }
}
