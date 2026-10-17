package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class w60 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w60[] $VALUES;
    public static final w60 BACKGROUND_ASSET;
    public static final w60 CIRCLE_ASSET;

    static {
        w60 w60Var = new w60("CIRCLE_ASSET", 0);
        CIRCLE_ASSET = w60Var;
        w60 w60Var2 = new w60("BACKGROUND_ASSET", 1);
        BACKGROUND_ASSET = w60Var2;
        w60[] w60VarArr = {w60Var, w60Var2};
        $VALUES = w60VarArr;
        $ENTRIES = vc.s.n(w60VarArr);
    }

    public static w60 valueOf(String str) {
        return (w60) Enum.valueOf(w60.class, str);
    }

    public static w60[] values() {
        return (w60[]) $VALUES.clone();
    }
}
