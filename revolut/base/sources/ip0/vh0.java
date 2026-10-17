package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class vh0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ vh0[] $VALUES;
    public static final vh0 CLICK;
    public static final vh0 SWIPE;

    static {
        vh0 vh0Var = new vh0("CLICK", 0);
        CLICK = vh0Var;
        vh0 vh0Var2 = new vh0("SWIPE", 1);
        SWIPE = vh0Var2;
        vh0[] vh0VarArr = {vh0Var, vh0Var2};
        $VALUES = vh0VarArr;
        $ENTRIES = vc.s.n(vh0VarArr);
    }

    public static vh0 valueOf(String str) {
        return (vh0) Enum.valueOf(vh0.class, str);
    }

    public static vh0[] values() {
        return (vh0[]) $VALUES.clone();
    }
}
