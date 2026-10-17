package a7g;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class x {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;
    public static final x OPEN_ONE_WAY_COMBINATION_INFO;
    public static final x OPEN_SELF_TRANSFER_INFO;

    static {
        x xVar = new x("OPEN_SELF_TRANSFER_INFO", 0);
        OPEN_SELF_TRANSFER_INFO = xVar;
        x xVar2 = new x("OPEN_ONE_WAY_COMBINATION_INFO", 1);
        OPEN_ONE_WAY_COMBINATION_INFO = xVar2;
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
