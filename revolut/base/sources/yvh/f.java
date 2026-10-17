package yvh;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f BALANCE_ROUNDING;

    @NotNull
    public static final e Companion;
    public static final f DAILY_SAVINGS;
    public static final f SPARE_CHANGE;
    public static final f SPENDING_PERCENTAGE;
    public static final f UNKNOWN;

    @NotNull
    private final String strategyName;

    static {
        f fVar = new f("SPARE_CHANGE", 0, "SPARE_CHANGE");
        SPARE_CHANGE = fVar;
        f fVar2 = new f("DAILY_SAVINGS", 1, "DAILY_SAVINGS");
        DAILY_SAVINGS = fVar2;
        f fVar3 = new f("SPENDING_PERCENTAGE", 2, "SPENDING_PERCENTAGE");
        SPENDING_PERCENTAGE = fVar3;
        f fVar4 = new f("BALANCE_ROUNDING", 3, "BALANCE_ROUNDING");
        BALANCE_ROUNDING = fVar4;
        f fVar5 = new f("UNKNOWN", 4, "UNKNOWN");
        UNKNOWN = fVar5;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
        Companion = new e();
    }

    public f(String str, int i, String str2) {
        this.strategyName = str2;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final String a() {
        return this.strategyName;
    }
}
