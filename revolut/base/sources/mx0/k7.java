package mx0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class k7 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k7[] $VALUES;
    public static final k7 ERROR;
    public static final k7 NORMAL;
    private final int backgroundColorAttr;

    static {
        k7 k7Var = new k7("NORMAL", 0, R$attr.uikit_colorForeground_50);
        NORMAL = k7Var;
        k7 k7Var2 = new k7("ERROR", 1, R$attr.uikit_colorRed_70);
        ERROR = k7Var2;
        k7[] k7VarArr = {k7Var, k7Var2};
        $VALUES = k7VarArr;
        $ENTRIES = vc.s.n(k7VarArr);
    }

    public k7(String str, int i, int i2) {
        this.backgroundColorAttr = i2;
    }

    public static k7 valueOf(String str) {
        return (k7) Enum.valueOf(k7.class, str);
    }

    public static k7[] values() {
        return (k7[]) $VALUES.clone();
    }

    public final int a() {
        return this.backgroundColorAttr;
    }
}
