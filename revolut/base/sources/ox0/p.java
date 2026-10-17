package ox0;

import android.animation.ValueAnimator;
import com.revolut.core.ui_kit.views.LargeActionButton;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class p implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f230497b;

    public /* synthetic */ p(t tVar, int i) {
        this.f230496a = i;
        this.f230497b = tVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f230496a) {
            case 0:
                this.f230497b.c(((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                break;
            case 1:
                this.f230497b.c(((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                break;
            case 2:
                float fFloatValue = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                LargeActionButton largeActionButton = this.f230497b.d;
                float f = 1.0f - fFloatValue;
                largeActionButton.setTextAlpha$ui_kit_components_release(f);
                largeActionButton.setImageAlpha$ui_kit_components_release(f);
                break;
            case 3:
                float fFloatValue2 = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                LargeActionButton largeActionButton2 = this.f230497b.d;
                float f4 = 1.0f - fFloatValue2;
                largeActionButton2.setTextAlpha$ui_kit_components_release(f4);
                largeActionButton2.setImageAlpha$ui_kit_components_release(f4);
                break;
            default:
                this.f230497b.d(((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                break;
        }
    }
}
