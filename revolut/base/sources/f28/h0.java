package f28;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h0[] $VALUES;
    public static final h0 ALL;

    @NotNull
    public static final g0 Companion;
    public static final h0 DAY;
    public static final h0 HALF_YEAR;
    public static final h0 MONTH;
    public static final h0 WEEK;
    public static final h0 YEAR;

    @NotNull
    private final String timeframe;

    static {
        h0 h0Var = new h0("DAY", 0, "day");
        DAY = h0Var;
        h0 h0Var2 = new h0("WEEK", 1, "week");
        WEEK = h0Var2;
        h0 h0Var3 = new h0("MONTH", 2, "month");
        MONTH = h0Var3;
        h0 h0Var4 = new h0("HALF_YEAR", 3, "halfYear");
        HALF_YEAR = h0Var4;
        h0 h0Var5 = new h0("YEAR", 4, "year");
        YEAR = h0Var5;
        h0 h0Var6 = new h0("ALL", 5, "all");
        ALL = h0Var6;
        h0[] h0VarArr = {h0Var, h0Var2, h0Var3, h0Var4, h0Var5, h0Var6};
        $VALUES = h0VarArr;
        $ENTRIES = vc.s.n(h0VarArr);
        Companion = new g0();
    }

    public h0(String str, int i, String str2) {
        this.timeframe = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) $VALUES.clone();
    }

    public final String b() {
        return this.timeframe;
    }
}
