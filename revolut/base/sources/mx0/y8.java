package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class y8 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y8[] $VALUES;
    public static final y8 GALLERY;
    public static final y8 PREVIEW;

    static {
        y8 y8Var = new y8("GALLERY", 0);
        GALLERY = y8Var;
        y8 y8Var2 = new y8("PREVIEW", 1);
        PREVIEW = y8Var2;
        y8[] y8VarArr = {y8Var, y8Var2};
        $VALUES = y8VarArr;
        $ENTRIES = vc.s.n(y8VarArr);
    }

    public static y8 valueOf(String str) {
        return (y8) Enum.valueOf(y8.class, str);
    }

    public static y8[] values() {
        return (y8[]) $VALUES.clone();
    }
}
