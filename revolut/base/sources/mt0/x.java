package mt0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class x {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;
    public static final x IDLE;
    public static final x SWIPING;
    public static final x TAP_PENDING;

    static {
        x xVar = new x("IDLE", 0);
        IDLE = xVar;
        x xVar2 = new x("TAP_PENDING", 1);
        TAP_PENDING = xVar2;
        x xVar3 = new x("SWIPING", 2);
        SWIPING = xVar3;
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
