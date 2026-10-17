package androidx.compose.ui.text.font;

import a41.g0;
import android.content.Context;
import android.graphics.fonts.FontVariationAxis;
import android.os.Build;
import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.util.ListUtilsKt;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;
import z2.a;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u001a'\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\n\u001a\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u000fH\u0002¨\u0006\u0010"}, d2 = {"toAndroidString", "", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "density", "Landroidx/compose/ui/unit/Density;", "weightAdjustment", "", "toAndroidArray", "", "Landroid/graphics/fonts/FontVariationAxis;", "(Landroidx/compose/ui/text/font/FontVariation$Settings;Landroidx/compose/ui/unit/Density;I)[Landroid/graphics/fonts/FontVariationAxis;", "getFontWeightAdjustment", "context", "Landroid/content/Context;", "coerceInWeight", "", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class PlatformFontVariationSettings_androidKt {
    private static final float coerceInWeight(float f) {
        return f.f(f, 1.0f, 1000.0f);
    }

    public static final int getFontWeightAdjustment(Context context) {
        if (context == null || Build.VERSION.SDK_INT < 31 || g0.a(context.getResources().getConfiguration()) == Integer.MAX_VALUE) {
            return 0;
        }
        return g0.a(context.getResources().getConfiguration());
    }

    @NotNull
    public static final FontVariationAxis[] toAndroidArray(@NotNull FontVariation.Settings settings, @NotNull Density density, int i) {
        int size;
        int i2 = 0;
        if (i == 0) {
            int size2 = settings.getSettings().size();
            FontVariationAxis[] fontVariationAxisArr = new FontVariationAxis[size2];
            while (i2 < size2) {
                fontVariationAxisArr[i2] = new FontVariationAxis(settings.getSettings().get(i2).getAxisName(), settings.getSettings().get(i2).toVariationValue(density));
                i2++;
            }
            return fontVariationAxisArr;
        }
        int size3 = settings.getSettings().size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                size = settings.getSettings().size() + 1;
                break;
            }
            if (Intrinsics.f(settings.getSettings().get(i3).getAxisName(), "wght")) {
                size = settings.getSettings().size();
                break;
            }
            i3++;
        }
        FontVariationAxis[] fontVariationAxisArr2 = new FontVariationAxis[size];
        while (i2 < size) {
            fontVariationAxisArr2[i2] = i2 == settings.getSettings().size() ? new FontVariationAxis("wght", coerceInWeight(i + 400.0f)) : Intrinsics.f(settings.getSettings().get(i2).getAxisName(), "wght") ? new FontVariationAxis("wght", coerceInWeight(settings.getSettings().get(i2).toVariationValue(density) + i)) : new FontVariationAxis(settings.getSettings().get(i2).getAxisName(), settings.getSettings().get(i2).toVariationValue(density));
            i2++;
        }
        return fontVariationAxisArr2;
    }

    @NotNull
    public static final String toAndroidString(@NotNull FontVariation.Settings settings, @NotNull Density density, int i) {
        boolean z;
        float variationValue;
        if (i == 0) {
            return ListUtilsKt.fastJoinToString$default(settings.getSettings(), null, null, null, 0, null, new a(density, 0), 31, null);
        }
        List<FontVariation.Setting> settings2 = settings.getSettings();
        int size = settings2.size();
        int i2 = 0;
        String str = "";
        boolean z3 = false;
        while (i2 < size) {
            FontVariation.Setting setting = settings2.get(i2);
            if (Intrinsics.f(setting.getAxisName(), "wght")) {
                variationValue = coerceInWeight(setting.toVariationValue(density) + i);
                z = true;
            } else {
                z = z3;
                variationValue = setting.toVariationValue(density);
            }
            if (i2 != 0) {
                str = str + CoreConstants.COMMA_CHAR;
            }
            str = str + CoreConstants.SINGLE_QUOTE_CHAR + setting.getAxisName() + "' " + variationValue;
            i2++;
            z3 = z;
        }
        if (z3) {
            return str;
        }
        float fCoerceInWeight = coerceInWeight(i + 400.0f);
        if (!settings.getSettings().isEmpty()) {
            str = str + CoreConstants.COMMA_CHAR;
        }
        return str + "'wght' " + fCoerceInWeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toAndroidString$lambda$0(Density density, FontVariation.Setting setting) {
        return "'" + setting.getAxisName() + "' " + setting.toVariationValue(density);
    }

    @NotNull
    public static final String toAndroidString(@NotNull FontVariation.Settings settings, @NotNull Context context) {
        return toAndroidString(settings, AndroidDensity_androidKt.Density(context), getFontWeightAdjustment(context));
    }
}
