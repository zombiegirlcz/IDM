package et0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o0 extends yp0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f129078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f129079c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(ValueAnimator valueAnimator, p0 p0Var, int i) {
        super(valueAnimator);
        this.f129078b = i;
        this.f129079c = p0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f129078b) {
        }
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f129078b) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                p0 p0Var = this.f129079c;
                p0Var.performHapticFeedback(1);
                p0Var.setExpanded(false);
                p0Var.k = BitmapDescriptorFactory.HUE_RED;
                p0Var.f129087a.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                p0Var.f129088b.setVisibility(8);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
            default:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f129078b) {
        }
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f129078b) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                p0 p0Var = this.f129079c;
                Context context = p0Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                yy0.f.e(jh.d.f(context).Q(), p0Var.f129092j, p0Var.f129087a, null, null, 12);
                p0Var.setPivotY(p0Var.d - (p0Var.e / 2.0f));
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animator, "animator");
                p0 p0Var2 = this.f129079c;
                AppCompatImageView appCompatImageView = p0Var2.f129087a;
                appCompatImageView.setScaleX(0.8f);
                appCompatImageView.setScaleY(0.8f);
                Context context2 = p0Var2.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                yy0.f.e(jh.d.f(context2).Q(), new ResourceImage(R$drawable.uikit_icn_24_stop, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), appCompatImageView, null, null, 12);
                break;
            default:
                Intrinsics.checkNotNullParameter(animator, "animator");
                p0 p0Var3 = this.f129079c;
                p0Var3.setPivotX(p0Var3.f129089c / 2.0f);
                p0Var3.setPivotY(p0Var3.e / 2.0f);
                break;
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f129078b) {
            case 0:
                float fFloatValue = ((Float) z9h.n.g(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                p0 p0Var = this.f129079c;
                float f = (p0Var.d - p0Var.e) * fFloatValue;
                p0Var.k = f;
                p0Var.f129087a.setTranslationY(f);
                float f4 = 1;
                float f5 = (0.2f * fFloatValue) + f4;
                p0Var.setScaleX(f5);
                p0Var.setScaleY(f5);
                float f6 = f4 - fFloatValue;
                AppCompatImageView appCompatImageView = p0Var.f129088b;
                appCompatImageView.setScaleX(f6);
                appCompatImageView.setScaleY(f6);
                p0Var.invalidate();
                break;
            case 1:
                this.f129079c.f129087a.setAlpha(((Float) z9h.n.g(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                break;
            default:
                float fFloatValue2 = 1.2f - (((Float) z9h.n.g(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue() * 0.2f);
                p0 p0Var2 = this.f129079c;
                p0Var2.setScaleX(fFloatValue2);
                p0Var2.setScaleY(fFloatValue2);
                break;
        }
    }
}
