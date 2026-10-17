package fj3;

import android.content.Context;
import androidx.appcompat.app.AppCompatDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {
    private e() {
    }

    public static boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int defaultNightMode = AppCompatDelegate.getDefaultNightMode();
        if (defaultNightMode == 1) {
            return false;
        }
        if (defaultNightMode != 2) {
            return kli.a.q(context);
        }
        return true;
    }
}
