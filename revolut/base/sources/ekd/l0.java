package ekd;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class l0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l0[] $VALUES;

    @rlm.r(names = {"DARK", "dark"})
    public static final l0 DARK;

    @rlm.r(names = {"LIGHT", "light"})
    public static final l0 LIGHT;

    @rlm.r(names = {"TRANSPARENT", "transparent"})
    public static final l0 TRANSPARENT;

    static {
        l0 l0Var = new l0("LIGHT", 0);
        LIGHT = l0Var;
        l0 l0Var2 = new l0("DARK", 1);
        DARK = l0Var2;
        l0 l0Var3 = new l0("TRANSPARENT", 2);
        TRANSPARENT = l0Var3;
        l0[] l0VarArr = {l0Var, l0Var2, l0Var3};
        $VALUES = l0VarArr;
        $ENTRIES = vc.s.n(l0VarArr);
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) $VALUES.clone();
    }
}
