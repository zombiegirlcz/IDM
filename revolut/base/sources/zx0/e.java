package zx0;

import android.animation.ValueAnimator;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class e implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f325988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReactionsKeyboardView f325989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f325990c;

    public /* synthetic */ e(ReactionsKeyboardView reactionsKeyboardView, int i, int i2) {
        this.f325988a = i2;
        this.f325989b = reactionsKeyboardView;
        this.f325990c = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f325988a) {
            case 0:
                ReactionsKeyboardView.m(this.f325989b, this.f325990c, valueAnimator);
                break;
            default:
                ReactionsKeyboardView.g(this.f325989b, this.f325990c, valueAnimator);
                break;
        }
    }
}
