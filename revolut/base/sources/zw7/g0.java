package zw7;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g0[] $VALUES;
    public static final g0 ADVANCED;
    public static final g0 BASIC;
    public static final g0 ULTIMATE;

    @NotNull
    private final String value;

    static {
        g0 g0Var = new g0("BASIC", 0, "BASIC");
        BASIC = g0Var;
        g0 g0Var2 = new g0("ADVANCED", 1, "ADVANCED");
        ADVANCED = g0Var2;
        g0 g0Var3 = new g0("ULTIMATE", 2, "ULTIMATE");
        ULTIMATE = g0Var3;
        g0[] g0VarArr = {g0Var, g0Var2, g0Var3};
        $VALUES = g0VarArr;
        $ENTRIES = vc.s.n(g0VarArr);
    }

    public g0(String str, int i, String str2) {
        this.value = str2;
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
