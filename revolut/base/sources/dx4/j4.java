package dx4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class j4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j4[] $VALUES;
    public static final j4 GREY_TONE_20;

    static {
        j4 j4Var = new j4("GREY_TONE_20", 0);
        GREY_TONE_20 = j4Var;
        j4[] j4VarArr = {j4Var};
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
