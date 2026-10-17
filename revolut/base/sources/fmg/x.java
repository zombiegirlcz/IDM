package fmg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class x {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;
    public static final x BLUE;
    public static final x GREEN;
    public static final x ORANGE;

    static {
        x xVar = new x("ORANGE", 0);
        ORANGE = xVar;
        x xVar2 = new x("BLUE", 1);
        BLUE = xVar2;
        x xVar3 = new x("GREEN", 2);
        GREEN = xVar3;
        x[] xVarArr = {xVar, xVar2, xVar3};
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
