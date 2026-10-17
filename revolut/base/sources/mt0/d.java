package mt0;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import androidx.transition.RevTransitionUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.box.ShadowLayout;
import ix0.i1;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f208684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f208685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f208686c;
    public final /* synthetic */ Rect d;
    public final /* synthetic */ Rect e;

    public d(g gVar, float f, float f4, Rect rect, Rect rect2) {
        this.f208684a = gVar;
        this.f208685b = f;
        this.f208686c = f4;
        this.d = rect;
        this.e = rect2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        float fB = i1.b(1.02f, 1.0f, fFloatValue);
        g gVar = this.f208684a;
        ks0.l.d(gVar.f, gVar.e, null, Float.valueOf(fB), Float.valueOf(fB), 6);
        gVar.f208695c.setAlpha(i1.b(1.0f, BitmapDescriptorFactory.HUE_RED, fFloatValue));
        gVar.e(i1.b(this.f208685b, this.f208686c, fFloatValue));
        ShadowLayout shadowLayout = gVar.f208693a;
        Rect rect = this.d;
        int i = rect.left;
        Rect rect2 = this.e;
        RevTransitionUtils.setLeftTopRightBottom(shadowLayout, (int) i1.c(fFloatValue, i, rect2.left), (int) i1.c(fFloatValue, rect.top, rect2.top), (int) i1.c(fFloatValue, rect.right, rect2.right), (int) i1.c(fFloatValue, rect.bottom, rect2.bottom));
    }
}
