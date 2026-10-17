package iha;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class x {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;
    public static final x IN_3_TO_6_MONTHS;
    public static final x IN_6_TO_12_MONTHS;
    public static final x IN_LESS_THAN_3_MONTHS;
    public static final x IN_MORE_THAN_12_MONTHS;
    public static final x NOT_PLANNING_TO_UPGRADE;

    static {
        x xVar = new x("IN_LESS_THAN_3_MONTHS", 0);
        IN_LESS_THAN_3_MONTHS = xVar;
        x xVar2 = new x("IN_3_TO_6_MONTHS", 1);
        IN_3_TO_6_MONTHS = xVar2;
        x xVar3 = new x("IN_6_TO_12_MONTHS", 2);
        IN_6_TO_12_MONTHS = xVar3;
        x xVar4 = new x("IN_MORE_THAN_12_MONTHS", 3);
        IN_MORE_THAN_12_MONTHS = xVar4;
        x xVar5 = new x("NOT_PLANNING_TO_UPGRADE", 4);
        NOT_PLANNING_TO_UPGRADE = xVar5;
        x[] xVarArr = {xVar, xVar2, xVar3, xVar4, xVar5};
        $VALUES = xVarArr;
        $ENTRIES = vc.s.n(xVarArr);
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }
}
