package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0019\u001a\u00020\u00132\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010$R\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010$R\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u001b\u001a\u0004\b(\u0010$R\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010$R\u0017\u0010+\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010$R\u0014\u0010-\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001bR\u0017\u0010.\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b/\u0010!¨\u00060"}, d2 = {"Landroidx/compose/material/ButtonDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "disabledElevation", "hoveredElevation", "focusedElevation", "Landroidx/compose/material/ButtonElevation;", "elevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "elevation", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "disabledBackgroundColor", "disabledContentColor", "Landroidx/compose/material/ButtonColors;", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "buttonColors", "textButtonColors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "textButtonColors", "ButtonHorizontalPadding", "F", "ButtonVerticalPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "MinWidth", "getMinWidth-D9Ej5fM", "()F", "MinHeight", "getMinHeight-D9Ej5fM", "IconSize", "getIconSize-D9Ej5fM", "IconSpacing", "getIconSpacing-D9Ej5fM", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "TextButtonHorizontalPadding", "TextButtonContentPadding", "getTextButtonContentPadding", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding;
    private static final float ButtonVerticalPadding;

    @NotNull
    private static final PaddingValues ContentPadding;

    @NotNull
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float MinHeight;
    private static final float MinWidth;
    private static final float OutlinedBorderSize;

    @NotNull
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;

    static {
        float fM3297constructorimpl = Dp.m3297constructorimpl(16);
        ButtonHorizontalPadding = fM3297constructorimpl;
        float f = 8;
        float fM3297constructorimpl2 = Dp.m3297constructorimpl(f);
        ButtonVerticalPadding = fM3297constructorimpl2;
        PaddingValues paddingValuesM860PaddingValuesa9UjIt4 = PaddingKt.m860PaddingValuesa9UjIt4(fM3297constructorimpl, fM3297constructorimpl2, fM3297constructorimpl, fM3297constructorimpl2);
        ContentPadding = paddingValuesM860PaddingValuesa9UjIt4;
        MinWidth = Dp.m3297constructorimpl(64);
        MinHeight = Dp.m3297constructorimpl(36);
        IconSize = Dp.m3297constructorimpl(18);
        IconSpacing = Dp.m3297constructorimpl(f);
        OutlinedBorderSize = Dp.m3297constructorimpl(1);
        float fM3297constructorimpl3 = Dp.m3297constructorimpl(f);
        TextButtonHorizontalPadding = fM3297constructorimpl3;
        TextButtonContentPadding = PaddingKt.m860PaddingValuesa9UjIt4(fM3297constructorimpl3, paddingValuesM860PaddingValuesa9UjIt4.getTop(), fM3297constructorimpl3, paddingValuesM860PaddingValuesa9UjIt4.getBottom());
    }

    private ButtonDefaults() {
    }

    @NotNull
    /* JADX INFO: renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1175buttonColorsro_MJ88(long j2, long j3, long j5, long j16, Composer composer, int i, int i2) {
        long jM1999compositeOverOWjLjI;
        long jM1191getPrimary0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1191getPrimary0d7_KjU() : j2;
        long jM1197contentColorForek8zF_U = (i2 & 2) != 0 ? ColorsKt.m1197contentColorForek8zF_U(jM1191getPrimary0d7_KjU, composer, i & 14) : j3;
        if ((i2 & 4) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            jM1999compositeOverOWjLjI = ColorKt.m1999compositeOverOWjLjI(Color.m1976copywmQWz5c$default(materialTheme.getColors(composer, 6).m1190getOnSurface0d7_KjU(), 0.12f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), materialTheme.getColors(composer, 6).m1195getSurface0d7_KjU());
        } else {
            jM1999compositeOverOWjLjI = j5;
        }
        long jM1976copywmQWz5c$default = (i2 & 8) != 0 ? Color.m1976copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1190getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j16;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1870371134, i, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:412)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(jM1191getPrimary0d7_KjU, jM1197contentColorForek8zF_U, jM1999compositeOverOWjLjI, jM1976copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultButtonColors;
    }

    @NotNull
    /* JADX INFO: renamed from: elevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m1176elevationR_JCAzs(float f, float f4, float f5, float f6, float f32, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = Dp.m3297constructorimpl(2);
        }
        float f35 = f;
        if ((i2 & 2) != 0) {
            f4 = Dp.m3297constructorimpl(8);
        }
        float f36 = f4;
        if ((i2 & 4) != 0) {
            f5 = Dp.m3297constructorimpl(0);
        }
        float f37 = f5;
        if ((i2 & 8) != 0) {
            f6 = Dp.m3297constructorimpl(4);
        }
        float f41 = f6;
        if ((i2 & 16) != 0) {
            f32 = Dp.m3297constructorimpl(4);
        }
        float f42 = f32;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-737170518, i, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:374)");
        }
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(f35)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(f36)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(f37)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(f41)) || (i & 3072) == 2048) | ((((57344 & i) ^ 24576) > 16384 && composer.changed(f42)) || (i & 24576) == 16384);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            DefaultButtonElevation defaultButtonElevation = new DefaultButtonElevation(f35, f36, f37, f41, f42, null);
            composer.updateRememberedValue(defaultButtonElevation);
            objRememberedValue = defaultButtonElevation;
        }
        DefaultButtonElevation defaultButtonElevation2 = (DefaultButtonElevation) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultButtonElevation2;
    }

    @NotNull
    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1177getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1178getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @NotNull
    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    @NotNull
    /* JADX INFO: renamed from: textButtonColors-RGew2ao, reason: not valid java name */
    public final ButtonColors m1179textButtonColorsRGew2ao(long j2, long j3, long j5, Composer composer, int i, int i2) {
        long jM1993getTransparent0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m1993getTransparent0d7_KjU() : j2;
        long jM1191getPrimary0d7_KjU = (i2 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1191getPrimary0d7_KjU() : j3;
        long jM1976copywmQWz5c$default = (i2 & 4) != 0 ? Color.m1976copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1190getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(182742216, i, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:456)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(jM1993getTransparent0d7_KjU, jM1191getPrimary0d7_KjU, jM1993getTransparent0d7_KjU, jM1976copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultButtonColors;
    }
}
