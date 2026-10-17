package ekd;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class x {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;

    @rlm.r(names = {"DARK", "dark"})
    public static final x DARK;

    @rlm.r(names = {"LIGHT", "light"})
    public static final x LIGHT;

    @rlm.r(names = {"TRANSPARENT", "transparent"})
    public static final x TRANSPARENT;

    static {
        x xVar = new x("LIGHT", 0);
        LIGHT = xVar;
        x xVar2 = new x("DARK", 1);
        DARK = xVar2;
        x xVar3 = new x("TRANSPARENT", 2);
        TRANSPARENT = xVar3;
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
