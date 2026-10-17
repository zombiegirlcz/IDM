package jq0;

import a41.h0;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: jq0.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class C1007a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1007a f177336a = new C1007a();

        private C1007a() {
        }

        public final float a(ContentResolver cr10) {
            Intrinsics.checkNotNullParameter(cr10, "cr");
            Intrinsics.checkNotNullParameter("animator_duration_scale", "name");
            return Settings.Global.getFloat(cr10, "animator_duration_scale", 1.0f);
        }

        public final boolean b() {
            return ValueAnimator.areAnimatorsEnabled();
        }

        public final float c() {
            return h0.a();
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class b {
        private b() {
        }

        public static float a(float f, float f4) {
            return f / (2 * ((float) Math.sqrt(f4 * 1.0f)));
        }
    }

    private a() {
    }

    public static boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C1007a.f177336a.b();
    }

    public static float b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = Build.VERSION.SDK_INT;
        C1007a c1007a = C1007a.f177336a;
        if (i >= 33) {
            return c1007a.c();
        }
        ContentResolver contentResolver = context.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        return c1007a.a(contentResolver);
    }

    public static float c(float f, float f4) {
        return (f < f4 || f4 == 1.0f) ? BitmapDescriptorFactory.HUE_RED : kotlin.ranges.f.f((f - f4) / (1.0f - f4), BitmapDescriptorFactory.HUE_RED, 1.0f);
    }

    public static float d(float f, float f4) {
        return f4 == BitmapDescriptorFactory.HUE_RED ? BitmapDescriptorFactory.HUE_RED : kotlin.ranges.f.f(f / f4, BitmapDescriptorFactory.HUE_RED, 1.0f);
    }
}
