package mx0;

import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class o9 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o9[] $VALUES;
    public static final o9 REVOLUT;
    public static final o9 REVOLUT_BUSINESS;
    public static final o9 REVOLUT_X;
    private final int drawable;

    static {
        o9 o9Var = new o9("REVOLUT", 0, R$drawable.uikit_icn_revolut_logo);
        REVOLUT = o9Var;
        o9 o9Var2 = new o9("REVOLUT_BUSINESS", 1, R$drawable.uikit_icn_revolut_business_logo);
        REVOLUT_BUSINESS = o9Var2;
        o9 o9Var3 = new o9("REVOLUT_X", 2, R$drawable.uikit_icn_revolut_x_logo);
        REVOLUT_X = o9Var3;
        o9[] o9VarArr = {o9Var, o9Var2, o9Var3};
        $VALUES = o9VarArr;
        $ENTRIES = vc.s.n(o9VarArr);
    }

    public o9(String str, int i, int i2) {
        this.drawable = i2;
    }

    public static o9 valueOf(String str) {
        return (o9) Enum.valueOf(o9.class, str);
    }

    public static o9[] values() {
        return (o9[]) $VALUES.clone();
    }

    public final int a() {
        return this.drawable;
    }
}
