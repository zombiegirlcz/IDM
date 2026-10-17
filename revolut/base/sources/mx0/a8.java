package mx0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class a8 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a8[] $VALUES;
    public static final a8 DEFAULT;
    public static final a8 ON_MEDIA_STATIC;
    private final int background;
    private final int hintColorAttr;

    static {
        a8 a8Var = new a8("DEFAULT", 0, R$attr.uikit_colorGreyTone8, R$attr.uikit_colorGreyTone50);
        DEFAULT = a8Var;
        a8 a8Var2 = new a8("ON_MEDIA_STATIC", 1, R$attr.uikit_colorPopoverBackground, R$attr.uikit_colorForeground);
        ON_MEDIA_STATIC = a8Var2;
        a8[] a8VarArr = {a8Var, a8Var2};
        $VALUES = a8VarArr;
        $ENTRIES = vc.s.n(a8VarArr);
    }

    public a8(String str, int i, int i2, int i3) {
        this.background = i2;
        this.hintColorAttr = i3;
    }

    public static a8 valueOf(String str) {
        return (a8) Enum.valueOf(a8.class, str);
    }

    public static a8[] values() {
        return (a8[]) $VALUES.clone();
    }

    public final int a() {
        return this.background;
    }

    public final int b() {
        return this.hintColorAttr;
    }
}
