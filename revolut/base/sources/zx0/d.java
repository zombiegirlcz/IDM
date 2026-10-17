package zx0;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class d implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f325986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReactionsKeyboardView f325987b;

    public /* synthetic */ d(ReactionsKeyboardView reactionsKeyboardView, int i) {
        this.f325986a = i;
        this.f325987b = reactionsKeyboardView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator value) {
        int i = this.f325986a;
        ReactionsKeyboardView reactionsKeyboardView = this.f325987b;
        switch (i) {
            case 0:
                ReactionsKeyboardView.a aVar = ReactionsKeyboardView.Companion;
                Intrinsics.checkNotNullParameter(value, "value");
                Drawable background = reactionsKeyboardView.getBackground();
                Object animatedValue = value.getAnimatedValue();
                Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                background.setAlpha(((Integer) animatedValue).intValue());
                break;
            default:
                ReactionsKeyboardView.a aVar2 = ReactionsKeyboardView.Companion;
                Intrinsics.checkNotNullParameter(value, "value");
                Drawable background2 = reactionsKeyboardView.getBackground();
                Object animatedValue2 = value.getAnimatedValue();
                Intrinsics.i(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                background2.setAlpha(((Integer) animatedValue2).intValue());
                break;
        }
    }
}
