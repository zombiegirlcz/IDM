package mt0;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import androidx.transition.RevTransitionUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.box.ShadowLayout;
import ix0.i1;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f208687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f208688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rect f208689c;
    public final /* synthetic */ Rect d;

    public e(g gVar, float f, Rect rect, Rect rect2) {
        this.f208687a = gVar;
        this.f208688b = f;
        this.f208689c = rect;
        this.d = rect2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        double d = fFloatValue;
        g gVar = this.f208687a;
        if (d <= 0.2d) {
            gVar.f208694b.setAlpha(i1.b(0.1f, BitmapDescriptorFactory.HUE_RED, 5 * fFloatValue));
        }
        gVar.f208695c.setAlpha(i1.b(BitmapDescriptorFactory.HUE_RED, 1.0f, fFloatValue));
        gVar.e(i1.b(this.f208688b, 28.0f, fFloatValue));
        ShadowLayout shadowLayout = gVar.f208693a;
        Rect rect = this.f208689c;
        int i = rect.left;
        Rect rect2 = this.d;
        RevTransitionUtils.setLeftTopRightBottom(shadowLayout, (int) i1.c(fFloatValue, i, rect2.left), (int) i1.c(fFloatValue, rect.top, rect2.top), (int) i1.c(fFloatValue, rect.right, rect2.right), (int) i1.c(fFloatValue, rect.bottom, rect2.bottom));
    }
}
