package iv0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.OneShotPreDrawListener;
import au0.x5;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f168675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f168676c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ View f;

    public /* synthetic */ e(Object obj2, Object obj3, View view, Object obj4, View view2, int i) {
        this.f168674a = i;
        this.f168676c = obj2;
        this.d = obj3;
        this.f168675b = view;
        this.e = obj4;
        this.f = view2;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f168674a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f168674a) {
            case 0:
                f fVar = (f) this.f168676c;
                fVar.d((uw0.i) this.d, this.f168675b);
                fVar.f = null;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f168674a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f168674a) {
            case 0:
                ((f) this.f168676c).e((uw0.i) this.e, this.f);
                break;
            default:
                AppCompatImageView appCompatImageView = (AppCompatImageView) this.d;
                ViewParent parent = ((View) ((jji.e) this.f168676c).f174964c).getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.addView(appCompatImageView);
                }
                this.f168675b.setVisibility(4);
                OneShotPreDrawListener.add(appCompatImageView, new x5(appCompatImageView, (AnimatorSet) this.e, (AppCompatImageView) this.f, 20));
                break;
        }
    }
}
