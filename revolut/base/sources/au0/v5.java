package au0;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import au0.u5;

/* JADX INFO: loaded from: classes19.dex */
public final class v5 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u5 f9406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u5.a f9407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u5.a f9408c;
    public final /* synthetic */ View d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;

    public v5(u5 u5Var, u5.a aVar, u5.a aVar2, View view, float f, Integer num, int i) {
        this.f9406a = u5Var;
        this.f9407b = aVar;
        this.f9408c = aVar2;
        this.d = view;
        this.e = f;
        this.f = i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        u5.c(this.f9406a, null, this.f9407b, 1);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Drawable drawable;
        u5.a aVar = this.f9408c;
        u5 u5Var = this.f9406a;
        u5.c(u5Var, null, aVar, 1);
        View view = this.d;
        float f = this.e;
        view.setAlpha(f);
        t5 t5Var = u5Var.f9394c;
        if (t5Var != null && (drawable = t5Var.f9375a) != null) {
            u5Var.a(drawable, false);
        }
        t5 t5Var2 = u5Var.f9394c;
        u5Var.f.a(ColorUtils.blendARGB(t5Var2 != null ? t5Var2.f9377c : u5Var.f9392a, this.f, f));
    }
}
