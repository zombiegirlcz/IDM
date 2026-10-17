package gs0;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import aw0.v1;
import com.revolut.core.ui_kit.R$style;
import jh.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends ContextThemeWrapper {

    @NotNull
    public static final a Companion = new a();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, v1 colorScheme) {
        int i;
        super(context, d.g(context) ? R$style.UiKitTheme_TransparentDayNight : R$style.UiKitTheme_DayNight);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        Companion.getClass();
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        int i2 = b.f146270a[colorScheme.ordinal()];
        if (i2 == 1) {
            i = 16;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 32;
        }
        configuration.uiMode = i | (configuration.uiMode & (-49));
        applyOverrideConfiguration(configuration);
        getTheme().applyStyle(R$style.UiKitColorsThemeOverlay_AccentNeutral_TransparentDayNight, true);
    }
}
