package ms0;

import android.animation.ValueAnimator;
import com.revolut.core.ui_kit.internal.views.BottomSwipeView;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class q implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208374a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f208375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f208376c;

    public /* synthetic */ q(float f, mt0.g gVar) {
        this.f208375b = f;
        this.f208376c = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f208374a) {
            case 0:
                BottomSwipeView.f0((BottomSwipeView) this.f208376c, this.f208375b, valueAnimator);
                break;
            default:
                mt0.g gVar = (mt0.g) this.f208376c;
                float fFloatValue = ((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                float fB = ix0.i1.b(this.f208375b, 0.77f, fFloatValue);
                ks0.l.d(gVar.f, gVar.e, null, Float.valueOf(fB), Float.valueOf(fB), 6);
                gVar.f208694b.setAlpha(ix0.i1.b(1.0f, 0.1f, fFloatValue));
                break;
        }
    }

    public /* synthetic */ q(BottomSwipeView bottomSwipeView, float f) {
        this.f208376c = bottomSwipeView;
        this.f208375b = f;
    }
}
