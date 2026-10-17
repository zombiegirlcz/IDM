package aw0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class c4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c4[] $VALUES;
    public static final c4 DEFAULT;
    public static final c4 LARGE;
    public static final c4 MEDIUM;
    public static final c4 ON_MEDIA;
    private final float backgroundOpacity;
    private final int textAppearanceAttr;
    private final int textColorAttr;

    static {
        int i = R$attr.internal_textAppearanceFcaDisclaimerEmphasised;
        c4 c4Var = new c4("DEFAULT", 0, 0.05f, i, R$attr.uikit_colorGreyTone50);
        DEFAULT = c4Var;
        int i2 = R$attr.uikit_colorForeground;
        c4 c4Var2 = new c4("ON_MEDIA", 1, 0.05f, i, i2);
        ON_MEDIA = c4Var2;
        c4 c4Var3 = new c4("MEDIUM", 2, 0.1f, R$attr.internal_textAppearanceFcaDisclaimerMedium, i2);
        MEDIUM = c4Var3;
        c4 c4Var4 = new c4("LARGE", 3, 0.1f, R$attr.internal_textAppearanceFcaDisclaimerLarge, i2);
        LARGE = c4Var4;
        c4[] c4VarArr = {c4Var, c4Var2, c4Var3, c4Var4};
        $VALUES = c4VarArr;
        $ENTRIES = vc.s.n(c4VarArr);
    }

    public c4(String str, int i, float f, int i2, int i3) {
        this.textAppearanceAttr = i2;
        this.textColorAttr = i3;
        this.backgroundOpacity = f;
    }

    public static c4 valueOf(String str) {
        return (c4) Enum.valueOf(c4.class, str);
    }

    public static c4[] values() {
        return (c4[]) $VALUES.clone();
    }

    public final float a() {
        return this.backgroundOpacity;
    }

    public final int b() {
        return this.textAppearanceAttr;
    }

    public final int c() {
        return this.textColorAttr;
    }
}
