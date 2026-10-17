package es0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f128854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f128855c;

    public /* synthetic */ z(Object obj2, int i, int i2) {
        this.f128853a = i2;
        this.f128854b = i;
        this.f128855c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f128853a) {
            case 0:
                a0 a0Var = (a0) this.f128855c;
                a0Var.d = this.f128854b;
                a0Var.e = BitmapDescriptorFactory.HUE_RED;
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((j01.e) this.f128855c).d[this.f128854b] = false;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(animation, "animation");
                View view = (View) this.f128855c;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = this.f128854b;
                view.setLayoutParams(layoutParams);
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                zu0.v vVar = (zu0.v) this.f128855c;
                if (vVar.f == animation) {
                    vVar.f = null;
                    vVar.c(this.f128854b);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f128853a) {
            case 0:
                ((a0) this.f128855c).d = this.f128854b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
