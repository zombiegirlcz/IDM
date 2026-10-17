package au0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class j4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j4[] $VALUES;
    public static final j4 FADE;
    public static final j4 FROM_CLICKED_BUTTON;
    public static final j4 NO_ANIMATION;

    static {
        j4 j4Var = new j4("NO_ANIMATION", 0);
        NO_ANIMATION = j4Var;
        j4 j4Var2 = new j4("FROM_CLICKED_BUTTON", 1);
        FROM_CLICKED_BUTTON = j4Var2;
        j4 j4Var3 = new j4("FADE", 2);
        FADE = j4Var3;
        j4[] j4VarArr = {j4Var, j4Var2, j4Var3};
        $VALUES = j4VarArr;
        $ENTRIES = vc.s.n(j4VarArr);
    }

    public static j4 valueOf(String str) {
        return (j4) Enum.valueOf(j4.class, str);
    }

    public static j4[] values() {
        return (j4[]) $VALUES.clone();
    }
}
