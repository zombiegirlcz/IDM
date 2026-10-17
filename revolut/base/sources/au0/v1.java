package au0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class v1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v1[] $VALUES;
    public static final v1 CENTERED;
    public static final v1 CENTERED_SMALL_BUTTONS;

    static {
        v1 v1Var = new v1("CENTERED", 0);
        CENTERED = v1Var;
        v1 v1Var2 = new v1("CENTERED_SMALL_BUTTONS", 1);
        CENTERED_SMALL_BUTTONS = v1Var2;
        v1[] v1VarArr = {v1Var, v1Var2};
        $VALUES = v1VarArr;
        $ENTRIES = vc.s.n(v1VarArr);
    }

    public static v1 valueOf(String str) {
        return (v1) Enum.valueOf(v1.class, str);
    }

    public static v1[] values() {
        return (v1[]) $VALUES.clone();
    }
}
