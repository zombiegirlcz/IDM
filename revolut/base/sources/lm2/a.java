package lm2;

import com.revolut.feature.backgroundpicker.api.model.BackgroundKey;
import com.revolut.feature.backgroundpicker.api.model.ThemeAgnosticBackgroundKey;
import com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import km2.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {
    public static j a(BackgroundKey key, GlobalThemeDeclaration theme) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(theme, "theme");
        if (key instanceof ThemeAgnosticBackgroundKey) {
            return j.COMMON;
        }
        if (key instanceof ThemedBackgroundKey) {
            return m70.a.j(theme);
        }
        throw new NoWhenBranchMatchedException();
    }
}
