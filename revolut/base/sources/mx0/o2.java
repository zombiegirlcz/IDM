package mx0;

import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class o2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o2[] $VALUES;
    public static final o2 ACCENT;
    public static final o2 GRAY;
    public static final o2 GRAYED_OUT;
    public static final o2 WHITE;
    private final int backgroundArrowResId;
    private final int backgroundResId;
    private final int titleColorAttr;

    static {
        o2 o2Var = new o2("ACCENT", 0, R$drawable.internal_bubble_view_background_ripple_accent, R$drawable.internal_bubble_view_bottom_arrow_ripple_accent, R$attr.uikit_colorWhite);
        ACCENT = o2Var;
        int i = R$drawable.internal_bubble_view_background_ripple_white;
        int i2 = R$drawable.internal_bubble_view_bottom_arrow_ripple_white;
        o2 o2Var2 = new o2("WHITE", 1, i, i2, R$attr.uikit_colorBlack);
        WHITE = o2Var2;
        int i3 = R$attr.uikit_colorGrey50;
        o2 o2Var3 = new o2("GRAYED_OUT", 2, i, i2, i3);
        GRAYED_OUT = o2Var3;
        o2 o2Var4 = new o2("GRAY", 3, R$drawable.internal_bubble_view_background_ripple_gray, R$drawable.internal_bubble_view_bottom_arrow_ripple_gray, i3);
        GRAY = o2Var4;
        o2[] o2VarArr = {o2Var, o2Var2, o2Var3, o2Var4};
        $VALUES = o2VarArr;
        $ENTRIES = vc.s.n(o2VarArr);
    }

    public o2(String str, int i, int i2, int i3, int i5) {
        this.backgroundResId = i2;
        this.backgroundArrowResId = i3;
        this.titleColorAttr = i5;
    }

    public static o2 valueOf(String str) {
        return (o2) Enum.valueOf(o2.class, str);
    }

    public static o2[] values() {
        return (o2[]) $VALUES.clone();
    }

    public final int a() {
        return this.backgroundArrowResId;
    }

    public final int b() {
        return this.backgroundResId;
    }

    public final int c() {
        return this.titleColorAttr;
    }
}
