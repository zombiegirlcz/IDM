package hfg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class x {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;
    public static final x MEMBERSHIP_ID;
    public static final x NOT_APPLICABLE;
    public static final x TAX_ID;
    public static final x UNKNOWN;

    static {
        x xVar = new x("MEMBERSHIP_ID", 0);
        MEMBERSHIP_ID = xVar;
        x xVar2 = new x("TAX_ID", 1);
        TAX_ID = xVar2;
        x xVar3 = new x("NOT_APPLICABLE", 2);
        NOT_APPLICABLE = xVar3;
        x xVar4 = new x("UNKNOWN", 3);
        UNKNOWN = xVar4;
        x[] xVarArr = {xVar, xVar2, xVar3, xVar4};
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
