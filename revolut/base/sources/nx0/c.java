package nx0;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AmountEditView f220043b;

    public /* synthetic */ c(AmountEditView amountEditView, int i) {
        this.f220042a = i;
        this.f220043b = amountEditView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it8) {
        int i = this.f220042a;
        AmountEditView amountEditView = this.f220043b;
        switch (i) {
            case 0:
                AmountEditView.a aVar = AmountEditView.Companion;
                Intrinsics.checkNotNullParameter(it8, "it");
                Paint paint = amountEditView.H;
                Object animatedValue = it8.getAnimatedValue();
                Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                paint.setAlpha(((Integer) animatedValue).intValue());
                amountEditView.invalidate();
                break;
            default:
                AmountEditView.g0(amountEditView, it8);
                break;
        }
    }
}
