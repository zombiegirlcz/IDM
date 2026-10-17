package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class jh0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ jh0[] $VALUES;
    public static final jh0 FLEXBOX;
    public static final jh0 FLEXBOX_CENTERED;
    public static final jh0 HORIZONTAL_SCROLLER;

    static {
        jh0 jh0Var = new jh0("FLEXBOX", 0);
        FLEXBOX = jh0Var;
        jh0 jh0Var2 = new jh0("FLEXBOX_CENTERED", 1);
        FLEXBOX_CENTERED = jh0Var2;
        jh0 jh0Var3 = new jh0("HORIZONTAL_SCROLLER", 2);
        HORIZONTAL_SCROLLER = jh0Var3;
        jh0[] jh0VarArr = {jh0Var, jh0Var2, jh0Var3};
        $VALUES = jh0VarArr;
        $ENTRIES = vc.s.n(jh0VarArr);
    }

    public static jh0 valueOf(String str) {
        return (jh0) Enum.valueOf(jh0.class, str);
    }

    public static jh0[] values() {
        return (jh0[]) $VALUES.clone();
    }
}
