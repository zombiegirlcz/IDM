package au0;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import aw0.x8;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class s5 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9362a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9364c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s5(View view, u5 u5Var, Integer num, int i) {
        this.f9364c = view;
        this.d = u5Var;
        this.f9363b = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Drawable drawable;
        int i = this.f9362a;
        Object obj2 = this.d;
        int i2 = this.f9363b;
        Object obj3 = this.f9364c;
        switch (i) {
            case 0:
                u5 u5Var = (u5) obj2;
                int i3 = u5.f9391g;
                float fFloatValue = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                ((View) obj3).setAlpha(fFloatValue);
                t5 t5Var = u5Var.f9394c;
                if (t5Var != null && (drawable = t5Var.f9375a) != null) {
                    u5Var.a(drawable, false);
                }
                t5 t5Var2 = u5Var.f9394c;
                u5Var.f.a(ColorUtils.blendARGB(t5Var2 != null ? t5Var2.f9377c : u5Var.f9392a, i2, fFloatValue));
                break;
            default:
                wp0.e eVar = (wp0.e) obj3;
                x8 x8Var = (x8) obj2;
                float fFloatValue2 = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                ms0.p pVar = eVar.f;
                if (pVar != null) {
                    pVar.setProgress(fFloatValue2);
                }
                eVar.f298999g.a(ColorUtils.blendARGB(i2, x8Var.e, fFloatValue2));
                break;
        }
    }

    public /* synthetic */ s5(wp0.e eVar, int i, x8 x8Var) {
        this.f9364c = eVar;
        this.f9363b = i;
        this.d = x8Var;
    }
}
