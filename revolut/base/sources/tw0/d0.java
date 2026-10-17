package tw0;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class d0 {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DecelerateInterpolator f274799a = new DecelerateInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f274800b = new AccelerateInterpolator();

    public static final class a {
        private a() {
        }
    }

    public static void a(d0 d0Var, View view, int i, cli.b bVar, int i2) {
        ts1.h onStart = new ts1.h(24);
        Function0 onEnd = bVar;
        if ((i2 & 8) != 0) {
            onEnd = new ts1.h(25);
        }
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onStart, "onStart");
        Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!jq0.a.a(context)) {
            b(view);
            onEnd.invoke();
            return;
        }
        view.animate().cancel();
        view.setAlpha(BitmapDescriptorFactory.HUE_RED);
        view.setScaleX(0.8f);
        view.setScaleY(0.8f);
        view.setPivotY(BitmapDescriptorFactory.HUE_RED);
        view.setPivotX(view.getWidth() / 2.0f);
        ViewPropertyAnimator interpolator = view.animate().alpha(1.0f).setStartDelay(((long) i) * 300).scaleX(1.05f).scaleY(1.05f).setDuration(300L).setInterpolator(d0Var.f274799a);
        Intrinsics.checkNotNullExpressionValue(interpolator, "setInterpolator(...)");
        ViewPropertyAnimator listener = interpolator.setListener(new fci.c0(onStart, d0Var, view, onEnd));
        Intrinsics.checkNotNullExpressionValue(listener, "setListener(...)");
        listener.withEndAction(new b0.d(view, 28, d0Var, onEnd)).start();
    }

    public static void b(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
    }
}
