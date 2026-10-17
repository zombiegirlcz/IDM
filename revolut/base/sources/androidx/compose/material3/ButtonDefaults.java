package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.BaselineButtonTokens;
import androidx.compose.material3.tokens.ButtonSmallTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.FilledButtonTokens;
import androidx.compose.material3.tokens.TextButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0006JA\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0014\u0010'\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u0017\u0010(\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$R\u0014\u0010*\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001aR\u0017\u0010+\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010$R\u0017\u0010-\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b-\u0010\u001a\u001a\u0004\b.\u0010/R\u0017\u00100\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b0\u0010\u001a\u001a\u0004\b1\u0010/R\u0017\u00102\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b2\u0010\u001a\u001a\u0004\b3\u0010/R\u0017\u00104\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b4\u0010\u001a\u001a\u0004\b5\u0010/R\u0011\u00109\u001a\u0002068G¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010;\u001a\u0002068G¢\u0006\u0006\u001a\u0004\b:\u00108R\u0018\u0010?\u001a\u00020\u0004*\u00020<8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0018\u0010A\u001a\u00020\u0004*\u00020<8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010>¨\u0006B"}, d2 = {"Landroidx/compose/material3/ButtonDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/ButtonColors;", "buttonColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ButtonColors;", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonColors;", "textButtonColors", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "Landroidx/compose/material3/ButtonElevation;", "buttonElevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonElevation;", "buttonElevation", "ButtonLeadingSpace", "F", "ButtonTrailingSpace", "ButtonWithIconStartpadding", "SmallStartPadding", "SmallEndPadding", "ButtonVerticalPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ButtonWithIconContentPadding", "getButtonWithIconContentPadding", "TextButtonHorizontalPadding", "TextButtonContentPadding", "getTextButtonContentPadding", "TextButtonWithIconHorizontalEndPadding", "TextButtonWithIconContentPadding", "getTextButtonWithIconContentPadding", "MinWidth", "getMinWidth-D9Ej5fM", "()F", "MinHeight", "getMinHeight-D9Ej5fM", "IconSize", "getIconSize-D9Ej5fM", "IconSpacing", "getIconSpacing-D9Ej5fM", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "getTextShape", "textShape", "Landroidx/compose/material3/ColorScheme;", "getDefaultButtonColors$material3", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ButtonColors;", "defaultButtonColors", "getDefaultTextButtonColors$material3", "defaultTextButtonColors", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonLeadingSpace;
    private static final float ButtonTrailingSpace;
    private static final float ButtonVerticalPadding;

    @NotNull
    private static final PaddingValues ButtonWithIconContentPadding;
    private static final float ButtonWithIconStartpadding;

    @NotNull
    private static final PaddingValues ContentPadding;

    @NotNull
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float MinHeight;
    private static final float MinWidth;
    private static final float SmallEndPadding;
    private static final float SmallStartPadding;

    @NotNull
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;

    @NotNull
    private static final PaddingValues TextButtonWithIconContentPadding;
    private static final float TextButtonWithIconHorizontalEndPadding;

    static {
        BaselineButtonTokens baselineButtonTokens = BaselineButtonTokens.INSTANCE;
        float fM1431getLeadingSpaceD9Ej5fM = baselineButtonTokens.m1431getLeadingSpaceD9Ej5fM();
        ButtonLeadingSpace = fM1431getLeadingSpaceD9Ej5fM;
        float fM1432getTrailingSpaceD9Ej5fM = baselineButtonTokens.m1432getTrailingSpaceD9Ej5fM();
        ButtonTrailingSpace = fM1432getTrailingSpaceD9Ej5fM;
        float f = 16;
        float fM3297constructorimpl = Dp.m3297constructorimpl(f);
        ButtonWithIconStartpadding = fM3297constructorimpl;
        ButtonSmallTokens buttonSmallTokens = ButtonSmallTokens.INSTANCE;
        SmallStartPadding = buttonSmallTokens.m1435getLeadingSpaceD9Ej5fM();
        SmallEndPadding = buttonSmallTokens.m1436getTrailingSpaceD9Ej5fM();
        float fM3297constructorimpl2 = Dp.m3297constructorimpl(8);
        ButtonVerticalPadding = fM3297constructorimpl2;
        PaddingValues paddingValuesM860PaddingValuesa9UjIt4 = PaddingKt.m860PaddingValuesa9UjIt4(fM1431getLeadingSpaceD9Ej5fM, fM3297constructorimpl2, fM1432getTrailingSpaceD9Ej5fM, fM3297constructorimpl2);
        ContentPadding = paddingValuesM860PaddingValuesa9UjIt4;
        ButtonWithIconContentPadding = PaddingKt.m860PaddingValuesa9UjIt4(fM3297constructorimpl, fM3297constructorimpl2, fM1432getTrailingSpaceD9Ej5fM, fM3297constructorimpl2);
        float fM3297constructorimpl3 = Dp.m3297constructorimpl(12);
        TextButtonHorizontalPadding = fM3297constructorimpl3;
        TextButtonContentPadding = PaddingKt.m860PaddingValuesa9UjIt4(fM3297constructorimpl3, paddingValuesM860PaddingValuesa9UjIt4.getTop(), fM3297constructorimpl3, paddingValuesM860PaddingValuesa9UjIt4.getBottom());
        float fM3297constructorimpl4 = Dp.m3297constructorimpl(f);
        TextButtonWithIconHorizontalEndPadding = fM3297constructorimpl4;
        TextButtonWithIconContentPadding = PaddingKt.m860PaddingValuesa9UjIt4(fM3297constructorimpl3, paddingValuesM860PaddingValuesa9UjIt4.getTop(), fM3297constructorimpl4, paddingValuesM860PaddingValuesa9UjIt4.getBottom());
        MinWidth = Dp.m3297constructorimpl(58);
        MinHeight = buttonSmallTokens.m1433getContainerHeightD9Ej5fM();
        IconSize = Dp.m3297constructorimpl(18);
        IconSpacing = buttonSmallTokens.m1434getIconLabelSpaceD9Ej5fM();
    }

    private ButtonDefaults() {
    }

    @NotNull
    public final ButtonColors buttonColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1449248637, i, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:572)");
        }
        ButtonColors defaultButtonColors$material3 = getDefaultButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultButtonColors$material3;
    }

    @NotNull
    /* JADX INFO: renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1297buttonColorsro_MJ88(long j2, long j3, long j5, long j16, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            j2 = Color.INSTANCE.m1994getUnspecified0d7_KjU();
        }
        if ((i2 & 2) != 0) {
            j3 = Color.INSTANCE.m1994getUnspecified0d7_KjU();
        }
        if ((i2 & 4) != 0) {
            j5 = Color.INSTANCE.m1994getUnspecified0d7_KjU();
        }
        if ((i2 & 8) != 0) {
            j16 = Color.INSTANCE.m1994getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-339300779, i, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:590)");
        }
        long j22 = j2;
        ButtonColors buttonColorsM1296copyjRlVdoo = getDefaultButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1296copyjRlVdoo(j22, j3, j5, j16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColorsM1296copyjRlVdoo;
    }

    @NotNull
    /* JADX INFO: renamed from: buttonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m1298buttonElevationR_JCAzs(float f, float f4, float f5, float f6, float f32, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = FilledButtonTokens.INSTANCE.m1490getContainerElevationD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f4 = FilledButtonTokens.INSTANCE.m1494getPressedContainerElevationD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            f5 = FilledButtonTokens.INSTANCE.m1492getFocusedContainerElevationD9Ej5fM();
        }
        if ((i2 & 8) != 0) {
            f6 = FilledButtonTokens.INSTANCE.m1493getHoveredContainerElevationD9Ej5fM();
        }
        float f35 = f6;
        if ((i2 & 16) != 0) {
            f32 = FilledButtonTokens.INSTANCE.m1491getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1827791191, i, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:811)");
        }
        float f36 = f32;
        float f37 = f5;
        ButtonElevation buttonElevation = new ButtonElevation(f, f4, f37, f35, f36, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonElevation;
    }

    @NotNull
    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    @NotNull
    public final ButtonColors getDefaultButtonColors$material3(@NotNull ColorScheme colorScheme) {
        ButtonColors defaultButtonColorsCached = colorScheme.getDefaultButtonColorsCached();
        if (defaultButtonColorsCached != null) {
            return defaultButtonColorsCached;
        }
        FilledButtonTokens filledButtonTokens = FilledButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getLabelTextColor()), Color.m1976copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getDisabledContainerColor()), filledButtonTokens.getDisabledContainerOpacity(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), Color.m1976copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getDisabledLabelTextColor()), filledButtonTokens.getDisabledLabelTextOpacity(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), null);
        colorScheme.setDefaultButtonColorsCached$material3(buttonColors);
        return buttonColors;
    }

    @NotNull
    public final ButtonColors getDefaultTextButtonColors$material3(@NotNull ColorScheme colorScheme) {
        ButtonColors defaultTextButtonColorsCached = colorScheme.getDefaultTextButtonColorsCached();
        if (defaultTextButtonColorsCached != null) {
            return defaultTextButtonColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jM1993getTransparent0d7_KjU = companion.m1993getTransparent0d7_KjU();
        long jFromToken = ColorSchemeKt.fromToken(colorScheme, ColorSchemeKeyTokens.Primary);
        long jM1993getTransparent0d7_KjU2 = companion.m1993getTransparent0d7_KjU();
        TextButtonTokens textButtonTokens = TextButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(jM1993getTransparent0d7_KjU, jFromToken, jM1993getTransparent0d7_KjU2, Color.m1976copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, textButtonTokens.getDisabledLabelColor()), textButtonTokens.getDisabledLabelOpacity(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), null);
        colorScheme.setDefaultTextButtonColorsCached$material3(buttonColors);
        return buttonColors;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1299getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1300getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @NotNull
    public final Shape getShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1234923021, i, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:550)");
        }
        Shape value = ShapesKt.getValue(ButtonSmallTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @NotNull
    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    @NotNull
    public final Shape getTextShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-349121587, i, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:566)");
        }
        Shape value = ShapesKt.getValue(ButtonSmallTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @NotNull
    public final ButtonColors textButtonColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1880341584, i, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:752)");
        }
        ButtonColors defaultTextButtonColors$material3 = getDefaultTextButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTextButtonColors$material3;
    }
}
