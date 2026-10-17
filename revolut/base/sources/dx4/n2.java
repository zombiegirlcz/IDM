package dx4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class n2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n2[] $VALUES;
    public static final n2 GREY_TONE_20;

    static {
        n2 n2Var = new n2("GREY_TONE_20", 0);
        GREY_TONE_20 = n2Var;
        n2[] n2VarArr = {n2Var};
        $VALUES = n2VarArr;
        $ENTRIES = vc.s.n(n2VarArr);
    }

    public static n2 valueOf(String str) {
        return (n2) Enum.valueOf(n2.class, str);
    }

    public static n2[] values() {
        return (n2[]) $VALUES.clone();
    }
}
