package au0;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.core.graphics.ColorUtils;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class r5 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9344c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r5(int i, int i2, com.revolut.kompot.navigable.a aVar) {
        this.f9342a = 1;
        this.f9343b = i;
        this.f9344c = i2;
        this.d = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animator) {
        int iIntValue;
        int i = this.f9342a;
        int i2 = this.f9344c;
        int i3 = this.f9343b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                int i5 = u5.f9391g;
                ((u5) obj2).f.a(ColorUtils.blendARGB(i3, i2, ((Float) z9h.n.g(animator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue()));
                break;
            case 1:
                com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) obj2;
                Intrinsics.checkNotNullParameter(animator, "animator");
                float animatedFraction = animator.getAnimatedFraction();
                if (i3 == 0) {
                    iIntValue = io0.a.b(1 - animatedFraction, i2);
                } else if (i2 == 0) {
                    iIntValue = io0.a.b(animatedFraction, i3);
                } else {
                    Object animatedValue = animator.getAnimatedValue();
                    Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                    iIntValue = ((Integer) animatedValue).intValue();
                }
                dx0.e.a(aVar.m2(), iIntValue, true);
                break;
            case 2:
                NavBarWithToolbar.M((NavBarWithToolbar) obj2, i3, i2, animator);
                break;
            default:
                ReactionsKeyboardView.i((ReactionsKeyboardView) obj2, i3, i2, animator);
                break;
        }
    }

    public /* synthetic */ r5(ViewGroup viewGroup, int i, int i2, int i3) {
        this.f9342a = i3;
        this.d = viewGroup;
        this.f9343b = i;
        this.f9344c = i2;
    }
}
