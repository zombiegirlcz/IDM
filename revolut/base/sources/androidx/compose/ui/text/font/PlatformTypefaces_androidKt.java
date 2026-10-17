package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a'\u0010\b\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/font/PlatformTypefaces;", "PlatformTypefaces", "()Landroidx/compose/ui/text/font/PlatformTypefaces;", "Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "Landroid/content/Context;", "context", "setFontVariationSettings", "(Landroid/graphics/Typeface;Landroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)Landroid/graphics/Typeface;", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class PlatformTypefaces_androidKt {
    @NotNull
    public static final PlatformTypefaces PlatformTypefaces() {
        return new PlatformTypefacesApi28();
    }

    public static final Typeface setFontVariationSettings(Typeface typeface, @NotNull FontVariation.Settings settings, @NotNull Context context) {
        return TypefaceCompatApi26.INSTANCE.setFontVariationSettings(typeface, settings, context);
    }
}
