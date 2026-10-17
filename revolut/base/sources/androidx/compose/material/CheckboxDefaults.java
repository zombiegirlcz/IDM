package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/material/CheckboxDefaults;", "", "<init>", "()V", "colors", "Landroidx/compose/material/CheckboxColors;", "checkedColor", "Landroidx/compose/ui/graphics/Color;", "uncheckedColor", "checkmarkColor", "disabledColor", "disabledIndeterminateColor", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/CheckboxColors;", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckboxDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final CheckboxDefaults INSTANCE = new CheckboxDefaults();

    private CheckboxDefaults() {
    }

    @NotNull
    /* JADX INFO: renamed from: colors-zjMxDiM, reason: not valid java name */
    public final CheckboxColors m1181colorszjMxDiM(long j2, long j3, long j5, long j16, long j22, Composer composer, int i, int i2) {
        long j42;
        long jM1976copywmQWz5c$default;
        long jM1193getSecondary0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1193getSecondary0d7_KjU() : j2;
        long jM1976copywmQWz5c$default2 = (i2 & 2) != 0 ? Color.m1976copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1190getOnSurface0d7_KjU(), 0.6f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j3;
        long jM1195getSurface0d7_KjU = (i2 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1195getSurface0d7_KjU() : j5;
        long jM1976copywmQWz5c$default3 = (i2 & 8) != 0 ? Color.m1976copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1190getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j16;
        if ((i2 & 16) != 0) {
            long j46 = jM1193getSecondary0d7_KjU;
            jM1976copywmQWz5c$default = Color.m1976copywmQWz5c$default(j46, ContentAlpha.INSTANCE.getDisabled(composer, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            j42 = j46;
        } else {
            j42 = jM1193getSecondary0d7_KjU;
            jM1976copywmQWz5c$default = j22;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(469524104, i, -1, "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:225)");
        }
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(j42)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(jM1976copywmQWz5c$default2)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(jM1195getSurface0d7_KjU)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(jM1976copywmQWz5c$default3)) || (i & 3072) == 2048) | ((((57344 & i) ^ 24576) > 16384 && composer.changed(jM1976copywmQWz5c$default)) || (i & 24576) == 16384);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            long j47 = j42;
            long j57 = jM1976copywmQWz5c$default3;
            DefaultCheckboxColors defaultCheckboxColors = new DefaultCheckboxColors(jM1195getSurface0d7_KjU, Color.m1976copywmQWz5c$default(jM1195getSurface0d7_KjU, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), j47, Color.m1976copywmQWz5c$default(j47, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), j57, Color.m1976copywmQWz5c$default(jM1976copywmQWz5c$default3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), jM1976copywmQWz5c$default, j47, jM1976copywmQWz5c$default2, jM1976copywmQWz5c$default3, jM1976copywmQWz5c$default, null);
            composer.updateRememberedValue(defaultCheckboxColors);
            objRememberedValue = defaultCheckboxColors;
        }
        DefaultCheckboxColors defaultCheckboxColors2 = (DefaultCheckboxColors) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultCheckboxColors2;
    }
}
