package ip0;

import com.revolut.core.ui_kit.R$drawable;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r ACCENT;
    public static final r REGULAR;
    public static final r REGULAR_NO_BACKGROUND;
    private final Integer backgroundResId;
    private final int imageResId;

    @NotNull
    private final ms0.h4 primaryActionButtonStyle;

    @NotNull
    private final ms0.h4 secondaryActionButtonStyle;
    private final int textResId;

    static {
        Integer numValueOf = Integer.valueOf(R$drawable.internal_action_widget_background_regular);
        int i = com.revolut.core.ui_kit_resources.R$drawable.internal_circle_gradient_grey;
        int i2 = com.revolut.core.ui_kit_resources.R$drawable.internal_rectangle_gradient_grey;
        ms0.h4 h4Var = ms0.h4.ACCENT;
        ms0.h4 h4Var2 = ms0.h4.SEMIACCENT;
        r rVar = new r("REGULAR", 0, numValueOf, i, i2, h4Var, h4Var2);
        REGULAR = rVar;
        r rVar2 = new r("ACCENT", 1, Integer.valueOf(R$drawable.internal_action_widget_background_accent), com.revolut.core.ui_kit_resources.R$drawable.internal_circle_gradient_grey, com.revolut.core.ui_kit_resources.R$drawable.internal_rectangle_gradient_grey, ms0.h4.LIGHT_ON_ACCENT, ms0.h4.DARK_ON_ACCENT);
        ACCENT = rVar2;
        r rVar3 = new r("REGULAR_NO_BACKGROUND", 2, null, com.revolut.core.ui_kit_resources.R$drawable.internal_circle_gradient_grey, com.revolut.core.ui_kit_resources.R$drawable.internal_rectangle_gradient_grey, h4Var, h4Var2);
        REGULAR_NO_BACKGROUND = rVar3;
        r[] rVarArr = {rVar, rVar2, rVar3};
        $VALUES = rVarArr;
        $ENTRIES = vc.s.n(rVarArr);
    }

    public r(String str, int i, Integer num, int i2, int i3, ms0.h4 h4Var, ms0.h4 h4Var2) {
        this.backgroundResId = num;
        this.imageResId = i2;
        this.textResId = i3;
        this.primaryActionButtonStyle = h4Var;
        this.secondaryActionButtonStyle = h4Var2;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    public final Integer a() {
        return this.backgroundResId;
    }

    public final int b() {
        return this.imageResId;
    }

    public final ms0.h4 c() {
        return this.primaryActionButtonStyle;
    }

    public final ms0.h4 d() {
        return this.secondaryActionButtonStyle;
    }

    public final int e() {
        return this.textResId;
    }
}
