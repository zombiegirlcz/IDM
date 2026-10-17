package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class xo {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ xo[] $VALUES;
    public static final xo DISABLED;
    public static final xo ENABLED;

    static {
        xo xoVar = new xo("ENABLED", 0);
        ENABLED = xoVar;
        xo xoVar2 = new xo("DISABLED", 1);
        DISABLED = xoVar2;
        xo[] xoVarArr = {xoVar, xoVar2};
        $VALUES = xoVarArr;
        $ENTRIES = vc.s.n(xoVarArr);
    }

    public static xo valueOf(String str) {
        return (xo) Enum.valueOf(xo.class, str);
    }

    public static xo[] values() {
        return (xo[]) $VALUES.clone();
    }
}
