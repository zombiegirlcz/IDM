package kl7;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j0[] $VALUES;
    public static final j0 ONE_MONTH;
    public static final j0 ONE_YEAR;
    public static final j0 SIX_MONTHS;
    public static final j0 TWO_MONTHS;

    @NotNull
    private final String code;

    static {
        j0 j0Var = new j0("ONE_MONTH", 0, "1m");
        ONE_MONTH = j0Var;
        j0 j0Var2 = new j0("TWO_MONTHS", 1, "2m");
        TWO_MONTHS = j0Var2;
        j0 j0Var3 = new j0("SIX_MONTHS", 2, "6m");
        SIX_MONTHS = j0Var3;
        j0 j0Var4 = new j0("ONE_YEAR", 3, "1y");
        ONE_YEAR = j0Var4;
        j0[] j0VarArr = {j0Var, j0Var2, j0Var3, j0Var4};
        $VALUES = j0VarArr;
        $ENTRIES = vc.s.n(j0VarArr);
    }

    public j0(String str, int i, String str2) {
        this.code = str2;
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }

    public final String getCode() {
        return this.code;
    }
}
