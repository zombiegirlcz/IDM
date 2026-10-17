package ix0;

import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AccelerateInterpolator f169315a = new AccelerateInterpolator(2.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Interpolator f169316b;

    static {
        Interpolator interpolatorCreate = PathInterpolatorCompat.create(0.17f, 0.17f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        Intrinsics.checkNotNullExpressionValue(interpolatorCreate, "create(...)");
        f169316b = interpolatorCreate;
    }

    private u1() {
    }

    public static float a(Context context, float f) {
        Intrinsics.checkNotNullParameter(context, "context");
        float f4 = f / 0.6f;
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        return f169315a.getInterpolation(f4) * kli.a.k(context, 16.0f);
    }

    public static float b(float f) {
        float f4 = f / 0.6f;
        if (f4 > 1.0f) {
            return 1.0f;
        }
        return f4;
    }

    public static void c(View viewToShow, View viewToHide) {
        Intrinsics.checkNotNullParameter(viewToShow, "viewToShow");
        Intrinsics.checkNotNullParameter(viewToHide, "viewToHide");
        if (viewToShow.getVisibility() == 0 && viewToShow.getAlpha() == 1.0f) {
            viewToShow.animate().cancel();
        } else {
            viewToShow.animate().alpha(1.0f).setDuration((long) ((1.0f - viewToShow.getAlpha()) * 200)).withStartAction(new bb6.b(viewToShow, 3)).start();
        }
        if (viewToHide.getVisibility() != 0) {
            viewToHide.animate().cancel();
            return;
        }
        viewToHide.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration((long) (viewToHide.getAlpha() * 200)).withEndAction(new bb6.b(viewToHide, 4)).start();
    }
}
