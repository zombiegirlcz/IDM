package tv0;

import android.animation.ValueAnimator;
import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final PathInterpolator f274664g = new PathInterpolator(0.2f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final PathInterpolator f274665h = new PathInterpolator(0.4f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f274666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ValueAnimator f274667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function0 f274668c;
    public WindowInsetsCompat d;
    public List e;
    public WindowInsetsAnimation f;

    public e(View contentView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.f274666a = contentView;
        this.e = f0.f322471a;
    }

    public final void a(final int i, final int i2, final Function1 onFrame, Function0 onEnd) {
        Intrinsics.checkNotNullParameter(onFrame, "onFrame");
        Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        WindowInsetsAnimation windowInsetsAnimation = this.f;
        if (windowInsetsAnimation != null) {
            ValueAnimator valueAnimator = this.f274667b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            c(windowInsetsAnimation);
        }
        boolean z = i2 > i;
        m4.a.C();
        final WindowInsetsAnimation windowInsetsAnimationL = m4.a.l(WindowInsets.Type.ime(), z ? f274664g : f274665h, z ? 285L : 200L);
        windowInsetsAnimationL.setFraction(BitmapDescriptorFactory.HUE_RED);
        this.f = windowInsetsAnimationL;
        this.f274668c = onEnd;
        View view = this.f274666a;
        view.dispatchWindowInsetsAnimationPrepare(windowInsetsAnimationL);
        b(i2, i2 > 0);
        onFrame.invoke(Integer.valueOf(i));
        aam.a.m();
        Insets insets = Insets.NONE;
        WindowInsetsAnimation.Bounds boundsK = m4.a.k(Insets.of(0, 0, 0, Math.max(i, i2)));
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        this.d = rootWindowInsets != null ? WindowInsetsCompat.toWindowInsetsCompat(rootWindowInsets, view) : null;
        this.e = u.c(windowInsetsAnimationL);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(windowInsetsAnimationL.getDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tv0.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                WindowInsetsAnimation windowInsetsAnimation2 = windowInsetsAnimationL;
                Intrinsics.checkNotNullParameter(valueAnimator2, "valueAnimator");
                windowInsetsAnimation2.setFraction(valueAnimator2.getAnimatedFraction());
                int i3 = i2;
                int iC = rim.d.c(windowInsetsAnimation2.getInterpolatedFraction() * (i3 - r1)) + i;
                onFrame.invoke(Integer.valueOf(iC));
                e eVar = this;
                View view2 = eVar.f274666a;
                WindowInsetsCompat windowInsetsCompat = eVar.d;
                if (windowInsetsCompat == null) {
                    WindowInsets rootWindowInsets2 = view2.getRootWindowInsets();
                    windowInsetsCompat = rootWindowInsets2 != null ? WindowInsetsCompat.toWindowInsetsCompat(rootWindowInsets2, view2) : null;
                    if (windowInsetsCompat == null) {
                        return;
                    }
                }
                WindowInsets windowInsets = new WindowInsetsCompat.Builder(windowInsetsCompat).setInsets(WindowInsetsCompat.Type.ime(), androidx.core.graphics.Insets.of(0, 0, 0, iC)).setVisible(WindowInsetsCompat.Type.ime(), true).build().toWindowInsets();
                if (windowInsets == null) {
                    return;
                }
                view2.dispatchWindowInsetsAnimationProgress(windowInsets, eVar.e);
            }
        });
        valueAnimatorOfFloat.addListener(new d(windowInsetsAnimationL, onFrame, i2, this));
        this.f274667b = valueAnimatorOfFloat;
        OneShotPreDrawListener.add(view, new b0.d(this, 27, windowInsetsAnimationL, boundsK));
    }

    public final void b(int i, boolean z) {
        View view = this.f274666a;
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(view);
        if (rootWindowInsets == null) {
            return;
        }
        WindowInsetsCompat windowInsetsCompatBuild = new WindowInsetsCompat.Builder(rootWindowInsets).setInsets(WindowInsetsCompat.Type.ime(), androidx.core.graphics.Insets.of(0, 0, 0, i)).setVisible(WindowInsetsCompat.Type.ime(), z).build();
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatBuild, "build(...)");
        ViewCompat.dispatchApplyWindowInsets(view, windowInsetsCompatBuild);
    }

    public final void c(WindowInsetsAnimation windowInsetsAnimation) {
        if (this.f != windowInsetsAnimation) {
            return;
        }
        Function0 function0 = this.f274668c;
        this.f = null;
        this.f274667b = null;
        this.f274668c = null;
        this.d = null;
        this.e = f0.f322471a;
        this.f274666a.dispatchWindowInsetsAnimationEnd(windowInsetsAnimation);
        if (function0 != null) {
            function0.invoke();
        }
    }
}
