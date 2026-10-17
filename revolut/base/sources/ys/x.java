package ys;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class x {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;
    public static final x GREGORIAN;
    public static final x HEISEI;
    public static final x REIWA;
    public static final x SHOWA;
    public static final x TAISHO;

    static {
        x xVar = new x("GREGORIAN", 0);
        GREGORIAN = xVar;
        x xVar2 = new x("TAISHO", 1);
        TAISHO = xVar2;
        x xVar3 = new x("SHOWA", 2);
        SHOWA = xVar3;
        x xVar4 = new x("HEISEI", 3);
        HEISEI = xVar4;
        x xVar5 = new x("REIWA", 4);
        REIWA = xVar5;
        x[] xVarArr = {xVar, xVar2, xVar3, xVar4, xVar5};
        $VALUES = xVarArr;
        $ENTRIES = vc.s.n(xVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }
}
