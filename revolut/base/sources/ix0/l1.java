package ix0;

import android.content.Context;
import android.content.res.Configuration;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.revolut.core.ui_kit.R$attr;
import com.revolut.core.ui_kit.R$style;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l1 {
    private l1() {
    }

    public static Context a(Context base, Context readOnlyContext, int i) {
        Boolean boolValueOf;
        int i2;
        Intrinsics.checkNotNullParameter(base, "baseContext");
        Intrinsics.checkNotNullParameter(readOnlyContext, "readOnlyContext");
        if (Intrinsics.f(base, readOnlyContext)) {
            base = new ContextThemeWrapper(base, i);
        } else {
            base.getTheme().applyStyle(i, true);
        }
        int i3 = R$attr.internal_nightTheme;
        Intrinsics.checkNotNullParameter(base, "<this>");
        TypedValue typedValue = new TypedValue();
        if (base.getTheme().resolveAttribute(i3, typedValue, true)) {
            boolValueOf = Boolean.valueOf(typedValue.data != 0);
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null || Boolean.valueOf(kli.a.q(base)).equals(boolValueOf)) {
            return base;
        }
        j1 uiMode = boolValueOf.booleanValue() ? j1.NIGHT : j1.DAY;
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(uiMode, "uiMode");
        Configuration configuration = new Configuration(base.getResources().getConfiguration());
        int i5 = k1.f169253a[uiMode.ordinal()];
        if (i5 == 1) {
            i2 = (configuration.uiMode & (-49)) | 16;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = (configuration.uiMode & (-49)) | 32;
        }
        configuration.uiMode = i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(base, i);
        contextThemeWrapper.applyOverrideConfiguration(configuration);
        contextThemeWrapper.getTheme().applyStyle(R$style.UiKitTheme, false);
        return contextThemeWrapper;
    }

    public static Context b(Context baseContext, Context readOnlyContext, int i) {
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        Intrinsics.checkNotNullParameter(readOnlyContext, "readOnlyContext");
        if (Intrinsics.f(baseContext, readOnlyContext)) {
            return new ContextThemeWrapper(baseContext, i);
        }
        baseContext.getTheme().applyStyle(i, true);
        return baseContext;
    }
}
