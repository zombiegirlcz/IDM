package ip0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class xh0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ xh0[] $VALUES;
    public static final xh0 NEGATIVE;
    public static final xh0 NEUTRAL;
    public static final xh0 PRIMARY;
    private final int bgColorAttr;
    private final int fgColorAttr;

    static {
        xh0 xh0Var = new xh0("PRIMARY", 0, 0, R$attr.uikit_colorOnAccentNeutral);
        PRIMARY = xh0Var;
        int i = R$attr.uikit_colorGreyTone50;
        int i2 = R$attr.uikit_colorWhite;
        xh0 xh0Var2 = new xh0("NEUTRAL", 1, i, i2);
        NEUTRAL = xh0Var2;
        xh0 xh0Var3 = new xh0("NEGATIVE", 2, R$attr.uikit_colorStatusDanger, i2);
        NEGATIVE = xh0Var3;
        xh0[] xh0VarArr = {xh0Var, xh0Var2, xh0Var3};
        $VALUES = xh0VarArr;
        $ENTRIES = vc.s.n(xh0VarArr);
    }

    public xh0(String str, int i, int i2, int i3) {
        this.bgColorAttr = i2;
        this.fgColorAttr = i3;
    }

    public static xh0 valueOf(String str) {
        return (xh0) Enum.valueOf(xh0.class, str);
    }

    public static xh0[] values() {
        return (xh0[]) $VALUES.clone();
    }

    public final int a() {
        return this.bgColorAttr;
    }

    public final int b() {
        return this.fgColorAttr;
    }
}
