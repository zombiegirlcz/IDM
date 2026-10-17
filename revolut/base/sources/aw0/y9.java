package aw0;

import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class y9 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y9[] $VALUES;

    @NotNull
    public static final w9 Companion;
    public static final y9 DARK;
    public static final y9 LIGHT;
    public static final y9 THEME;

    static {
        y9 y9Var = new y9("LIGHT", 0);
        LIGHT = y9Var;
        y9 y9Var2 = new y9("DARK", 1);
        DARK = y9Var2;
        y9 y9Var3 = new y9("THEME", 2);
        THEME = y9Var3;
        y9[] y9VarArr = {y9Var, y9Var2, y9Var3};
        $VALUES = y9VarArr;
        $ENTRIES = vc.s.n(y9VarArr);
        Companion = new w9(0);
    }

    public static y9 valueOf(String str) {
        return (y9) Enum.valueOf(y9.class, str);
    }

    public static y9[] values() {
        return (y9[]) $VALUES.clone();
    }

    public final void a(Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        Context context = window.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        b(context, window);
    }

    public final void b(Context context, Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT <= 28) {
            ViewCompat.requestApplyInsets(window.getDecorView());
        }
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
        int i = x9.f10612a[ordinal()];
        if (i == 1) {
            windowInsetsControllerCompat.setAppearanceLightStatusBars(false);
            return;
        }
        if (i == 2) {
            windowInsetsControllerCompat.setAppearanceLightStatusBars(true);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (kli.a.q(context)) {
                LIGHT.a(window);
            } else {
                DARK.a(window);
            }
        }
    }
}
