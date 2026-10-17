package ms0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class l2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l2[] $VALUES;
    public static final l2 FINISH;
    public static final l2 SHOW;

    static {
        l2 l2Var = new l2("SHOW", 0);
        SHOW = l2Var;
        l2 l2Var2 = new l2("FINISH", 1);
        FINISH = l2Var2;
        l2[] l2VarArr = {l2Var, l2Var2};
        $VALUES = l2VarArr;
        $ENTRIES = vc.s.n(l2VarArr);
    }

    public static l2 valueOf(String str) {
        return (l2) Enum.valueOf(l2.class, str);
    }

    public static l2[] values() {
        return (l2[]) $VALUES.clone();
    }
}
