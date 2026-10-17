package aw0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class q9 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q9[] $VALUES;
    public static final q9 STATIC;
    public static final q9 WARNING;
    private final int colorAttr;

    static {
        q9 q9Var = new q9("STATIC", 0, R$attr.uikit_colorPerformanceStatic);
        STATIC = q9Var;
        q9 q9Var2 = new q9("WARNING", 1, R$attr.uikit_colorStatusWarning);
        WARNING = q9Var2;
        q9[] q9VarArr = {q9Var, q9Var2};
        $VALUES = q9VarArr;
        $ENTRIES = vc.s.n(q9VarArr);
    }

    public q9(String str, int i, int i2) {
        this.colorAttr = i2;
    }

    public static q9 valueOf(String str) {
        return (q9) Enum.valueOf(q9.class, str);
    }

    public static q9[] values() {
        return (q9[]) $VALUES.clone();
    }

    public final int a() {
        return this.colorAttr;
    }
}
