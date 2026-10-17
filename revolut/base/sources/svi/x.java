package svi;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class x {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;
    public static final x ACTIVE;
    public static final x SUSPENDED;

    static {
        x xVar = new x("ACTIVE", 0);
        ACTIVE = xVar;
        x xVar2 = new x("SUSPENDED", 1);
        SUSPENDED = xVar2;
        x[] xVarArr = {xVar, xVar2};
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
