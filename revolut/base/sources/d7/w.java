package d7;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.airbnb.lottie.LottieDrawable;
import com.revolut.core.ui_kit.internal.drawables.TransitionColorDrawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Drawable f111728b;

    public /* synthetic */ w(Drawable drawable, int i) {
        this.f111727a = i;
        this.f111728b = drawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it8) {
        int i = this.f111727a;
        Drawable drawable = this.f111728b;
        switch (i) {
            case 0:
                LottieDrawable lottieDrawable = (LottieDrawable) drawable;
                List list = LottieDrawable.S;
                a aVar = lottieDrawable.N;
                if (aVar == null) {
                    aVar = d.f111646a;
                }
                if (aVar != a.ENABLED) {
                    n7.d dVar = lottieDrawable.f25598q;
                    if (dVar != null) {
                        dVar.p(lottieDrawable.f25589b.a());
                    }
                } else {
                    lottieDrawable.invalidateSelf();
                }
                break;
            default:
                TransitionColorDrawable transitionColorDrawable = (TransitionColorDrawable) drawable;
                int i2 = TransitionColorDrawable.d;
                Intrinsics.checkNotNullParameter(it8, "it");
                Paint paint = transitionColorDrawable.f56022b;
                Object animatedValue = it8.getAnimatedValue();
                Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                paint.setColor(((Integer) animatedValue).intValue());
                transitionColorDrawable.invalidateSelf();
                break;
        }
    }
}
