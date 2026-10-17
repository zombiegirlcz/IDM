package ge6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class x {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;
    public static final x FINISHING;
    public static final x IDLE;
    public static final x LOADING;

    static {
        x xVar = new x("IDLE", 0);
        IDLE = xVar;
        x xVar2 = new x("LOADING", 1);
        LOADING = xVar2;
        x xVar3 = new x("FINISHING", 2);
        FINISHING = xVar3;
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
