package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class x2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x2[] $VALUES;
    public static final x2 DEFAULT;
    public static final x2 TEXT_IMAGE_DRAW_EMOJI;

    static {
        x2 x2Var = new x2("DEFAULT", 0);
        DEFAULT = x2Var;
        x2 x2Var2 = new x2("TEXT_IMAGE_DRAW_EMOJI", 1);
        TEXT_IMAGE_DRAW_EMOJI = x2Var2;
        x2[] x2VarArr = {x2Var, x2Var2};
        $VALUES = x2VarArr;
        $ENTRIES = vc.s.n(x2VarArr);
    }

    public static x2 valueOf(String str) {
        return (x2) Enum.valueOf(x2.class, str);
    }

    public static x2[] values() {
        return (x2[]) $VALUES.clone();
    }
}
