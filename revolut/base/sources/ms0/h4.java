package ms0;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class h4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h4[] $VALUES;
    public static final h4 ACCENT;
    public static final h4 BLACK;
    public static final h4 CONTEXTUAL;
    public static final h4 DARK_ON_ACCENT;
    public static final h4 FLAT;
    public static final h4 INVERTED_PRIMARY;
    public static final h4 LIGHT_ON_ACCENT;
    public static final h4 NEGATIVE;
    public static final h4 NEGATIVE_ACCENT;
    public static final h4 PRIMARY_NEUTRAL;
    public static final h4 SECONDARY_WHITE;
    public static final h4 SEMIACCENT;
    public static final h4 SEMIACCENT_BRIGHT_DARK;
    public static final h4 SEMIBLACK;
    public static final h4 SHIMMER;
    public static final h4 WHITE;
    public static final h4 WHITE_OR_BLACK;
    public static final h4 WHITE_OR_BLACK_INVERTED;

    @NotNull
    private final LargeActionButton.ButtonStyle buttonStyle;

    static {
        h4 h4Var = new h4("ACCENT", 0, LargeActionButton.ButtonStyle.f58725a);
        ACCENT = h4Var;
        LargeActionButton.ButtonStyle.INSTANCE.getClass();
        h4 h4Var2 = new h4("NEGATIVE_ACCENT", 1, LargeActionButton.ButtonStyle.f58735q);
        NEGATIVE_ACCENT = h4Var2;
        h4 h4Var3 = new h4("NEGATIVE", 2, LargeActionButton.ButtonStyle.f58731l);
        NEGATIVE = h4Var3;
        h4 h4Var4 = new h4("SEMIACCENT", 3, new LargeActionButton.ButtonStyle.DefaultFilledButton(new Color.Solid(R$attr.uikit_colorActionBackgroundNeutral), R$attr.uikit_colorDisabledBackground_20, R$attr.uikit_colorAccentNeutral, 0.5f, null, null, 48));
        SEMIACCENT = h4Var4;
        h4 h4Var5 = new h4("SEMIACCENT_BRIGHT_DARK", 4, new LargeActionButton.ButtonStyle.LegacyResourceButton(R$drawable.internal_small_action_background_ripple_semiaccent_bright_enabled, R$drawable.internal_small_action_background_ripple_semiaccent_bright_disabled, R$attr.uikit_colorActionPhotoHeaderTextNeutral));
        SEMIACCENT_BRIGHT_DARK = h4Var5;
        h4 h4Var6 = new h4("SEMIBLACK", 5, new LargeActionButton.ButtonStyle.LegacyResourceButton(R$drawable.internal_small_action_background_ripple_semiblack_enabled, R$drawable.internal_small_action_background_ripple_semiblack_disabled, R$attr.uikit_colorForeground));
        SEMIBLACK = h4Var6;
        h4 h4Var7 = new h4("DARK_ON_ACCENT", 6, new LargeActionButton.ButtonStyle.DefaultFilledButton(new Color.Composite(R$attr.uikit_colorAccent, R$attr.uikit_colorBlack_20, ho0.a.SRC_OVER), R$attr.uikit_colorAccent_40, R$attr.uikit_colorOnAccent, 0.6f, new Color.Solid(R$attr.uikit_colorTransparent), null, 32));
        DARK_ON_ACCENT = h4Var7;
        h4 h4Var8 = new h4("LIGHT_ON_ACCENT", 7, new LargeActionButton.ButtonStyle.DefaultFilledButton(new Color.Solid(R$attr.uikit_colorOnAccent), R$attr.uikit_colorAccent_40, R$attr.uikit_colorAccent, 0.6f, new Color.Solid(R$attr.uikit_colorTransparent), null, 32));
        LIGHT_ON_ACCENT = h4Var8;
        h4 h4Var9 = new h4("BLACK", 8, LargeActionButton.ButtonStyle.f58727c);
        BLACK = h4Var9;
        h4 h4Var10 = new h4("WHITE", 9, LargeActionButton.ButtonStyle.d);
        WHITE = h4Var10;
        int i = R$drawable.internal_small_action_background_ripple_secondary_white;
        h4 h4Var11 = new h4("SECONDARY_WHITE", 10, new LargeActionButton.ButtonStyle.LegacyResourceButton(i, i, R$attr.uikit_colorWhite));
        SECONDARY_WHITE = h4Var11;
        h4 h4Var12 = new h4("WHITE_OR_BLACK", 11, LargeActionButton.ButtonStyle.f);
        WHITE_OR_BLACK = h4Var12;
        h4 h4Var13 = new h4("WHITE_OR_BLACK_INVERTED", 12, LargeActionButton.ButtonStyle.e);
        WHITE_OR_BLACK_INVERTED = h4Var13;
        h4 h4Var14 = new h4("CONTEXTUAL", 13, LargeActionButton.ButtonStyle.f58732m);
        CONTEXTUAL = h4Var14;
        h4 h4Var15 = new h4("FLAT", 14, LargeActionButton.ButtonStyle.o);
        FLAT = h4Var15;
        Color.Solid solid = null;
        h4 h4Var16 = new h4("INVERTED_PRIMARY", 15, new LargeActionButton.ButtonStyle.DefaultFilledButton(new Color.Solid(R$attr.uikit_colorPopoverBackground), 0, R$attr.uikit_colorForeground, 0.6f, null, solid, 50));
        INVERTED_PRIMARY = h4Var16;
        h4 h4Var17 = new h4("PRIMARY_NEUTRAL", 16, new LargeActionButton.ButtonStyle.DefaultFilledButton(new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorForeground), 0.1f), R$attr.uikit_colorGroupedBackground_30, R$attr.uikit_colorForeground, 0.6f, solid, null, 48));
        PRIMARY_NEUTRAL = h4Var17;
        h4 h4Var18 = new h4("SHIMMER", 17, LargeActionButton.ButtonStyle.f58737s);
        SHIMMER = h4Var18;
        h4[] h4VarArr = {h4Var, h4Var2, h4Var3, h4Var4, h4Var5, h4Var6, h4Var7, h4Var8, h4Var9, h4Var10, h4Var11, h4Var12, h4Var13, h4Var14, h4Var15, h4Var16, h4Var17, h4Var18};
        $VALUES = h4VarArr;
        $ENTRIES = vc.s.n(h4VarArr);
    }

    public h4(String str, int i, LargeActionButton.ButtonStyle buttonStyle) {
        this.buttonStyle = buttonStyle;
    }

    public static h4 valueOf(String str) {
        return (h4) Enum.valueOf(h4.class, str);
    }

    public static h4[] values() {
        return (h4[]) $VALUES.clone();
    }

    public final LargeActionButton.ButtonStyle a() {
        return this.buttonStyle;
    }
}
