package s8h;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class f0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f0[] $VALUES;
    public static final f0 ALL;

    @NotNull
    public static final e0 Companion;
    public static final f0 GAINERS;
    public static final f0 LOSERS;

    @NotNull
    private final String value;

    static {
        f0 f0Var = new f0("ALL", 0, "ALL");
        ALL = f0Var;
        f0 f0Var2 = new f0("GAINERS", 1, "GAINERS");
        GAINERS = f0Var2;
        f0 f0Var3 = new f0("LOSERS", 2, "LOSERS");
        LOSERS = f0Var3;
        f0[] f0VarArr = {f0Var, f0Var2, f0Var3};
        $VALUES = f0VarArr;
        $ENTRIES = vc.s.n(f0VarArr);
        Companion = new e0();
    }

    public f0(String str, int i, String str2) {
        this.value = str2;
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
