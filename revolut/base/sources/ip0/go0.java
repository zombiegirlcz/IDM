package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class go0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ go0[] $VALUES;
    public static final go0 NO_BLUR;
    public static final go0 PROGRESSIVE_BLUR;

    static {
        go0 go0Var = new go0("NO_BLUR", 0);
        NO_BLUR = go0Var;
        go0 go0Var2 = new go0("PROGRESSIVE_BLUR", 1);
        PROGRESSIVE_BLUR = go0Var2;
        go0[] go0VarArr = {go0Var, go0Var2};
        $VALUES = go0VarArr;
        $ENTRIES = vc.s.n(go0VarArr);
    }

    public static go0 valueOf(String str) {
        return (go0) Enum.valueOf(go0.class, str);
    }

    public static go0[] values() {
        return (go0[]) $VALUES.clone();
    }
}
