package ap0;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import ap0.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class m implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f8042b;

    public /* synthetic */ m(View view, int i) {
        this.f8041a = i;
        this.f8042b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it8) {
        int i = this.f8041a;
        View view = this.f8042b;
        switch (i) {
            case 0:
                n.a aVar = n.Companion;
                float fFloatValue = ((Float) z9h.n.g(it8, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                view.setScaleX(fFloatValue);
                view.setScaleY(fFloatValue);
                break;
            case 1:
                n.a aVar2 = n.Companion;
                float fFloatValue2 = ((Float) z9h.n.g(it8, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                view.setScaleX(fFloatValue2);
                view.setScaleY(fFloatValue2);
                break;
            case 2:
                n.a aVar3 = n.Companion;
                view.setTranslationY(((Float) z9h.n.g(it8, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                break;
            case 3:
                n.a aVar4 = n.Companion;
                view.setTranslationY(((Float) z9h.n.g(it8, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                break;
            case 4:
                n.a aVar5 = n.Companion;
                view.setAlpha(((Float) z9h.n.g(it8, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                break;
            case 5:
                n.a aVar6 = n.Companion;
                float fFloatValue3 = ((Float) z9h.n.g(it8, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                view.setScaleX(fFloatValue3);
                view.setScaleY(fFloatValue3);
                break;
            case 6:
                n.a aVar7 = n.Companion;
                float fFloatValue4 = ((Float) z9h.n.g(it8, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                view.setScaleX(fFloatValue4);
                view.setScaleY(fFloatValue4);
                break;
            case 7:
                n.a aVar8 = n.Companion;
                float fFloatValue5 = ((Float) z9h.n.g(it8, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                view.setScaleX(fFloatValue5);
                view.setScaleY(fFloatValue5);
                break;
            case 8:
                n.a aVar9 = n.Companion;
                view.setTranslationY(((Float) z9h.n.g(it8, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                break;
            case 9:
                n.a aVar10 = n.Companion;
                view.setTranslationY(((Float) z9h.n.g(it8, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                break;
            case 10:
                Intrinsics.checkNotNullParameter(it8, "it");
                view.setAlpha(jq0.a.d(it8.getAnimatedFraction(), 0.8f));
                break;
            case 11:
                float fFloatValue6 = ((Float) z9h.n.g(it8, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                view.setScaleX(fFloatValue6);
                view.setScaleY(fFloatValue6);
                break;
            case 12:
                view.setRotationY(((Float) z9h.n.g(it8, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                break;
            case 13:
                Intrinsics.checkNotNullParameter(it8, "update");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Object animatedValue = it8.getAnimatedValue();
                Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.height = ((Integer) animatedValue).intValue();
                view.setLayoutParams(layoutParams);
                break;
            default:
                view.setAlpha(((Float) z9h.n.g(it8, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                break;
        }
    }
}
