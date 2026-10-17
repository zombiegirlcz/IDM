package c90;

import android.content.Context;
import androidx.appcompat.app.AppCompatDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22265a;

    public c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f22265a = context;
    }

    public final b a() {
        float f = this.f22265a.getResources().getDisplayMetrics().density;
        return f <= 1.0f ? b.MDPI : f <= 1.5f ? b.HDPI : f <= 2.0f ? b.XHDPI : f <= 3.0f ? b.XXHDPI : b.XXXHDPI;
    }

    public final int b() {
        return this.f22265a.getResources().getDisplayMetrics().densityDpi;
    }

    public final int c() {
        return this.f22265a.getResources().getDisplayMetrics().widthPixels;
    }

    public final boolean d() {
        int defaultNightMode = AppCompatDelegate.getDefaultNightMode();
        if (defaultNightMode == 1) {
            return false;
        }
        if (defaultNightMode != 2) {
            return kli.a.q(this.f22265a);
        }
        return true;
    }
}
