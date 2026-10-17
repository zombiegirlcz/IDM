package ip0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class p4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p4[] $VALUES;
    public static final p4 DEFAULT;
    public static final p4 SMALL;
    private final int textAppearanceAttr;

    static {
        p4 p4Var = new p4("DEFAULT", 0, R$attr.internal_textAppearanceHeading1);
        DEFAULT = p4Var;
        p4 p4Var2 = new p4("SMALL", 1, R$attr.internal_textAppearanceHeading3);
        SMALL = p4Var2;
        p4[] p4VarArr = {p4Var, p4Var2};
        $VALUES = p4VarArr;
        $ENTRIES = vc.s.n(p4VarArr);
    }

    public p4(String str, int i, int i2) {
        this.textAppearanceAttr = i2;
    }

    public static p4 valueOf(String str) {
        return (p4) Enum.valueOf(p4.class, str);
    }

    public static p4[] values() {
        return (p4[]) $VALUES.clone();
    }

    public final int a() {
        return this.textAppearanceAttr;
    }
}
