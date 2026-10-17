package tx0;

import android.animation.Animator;
import android.view.ViewGroup;
import com.revolut.core.ui_kit.internal.views.layout.UIKitConstraintLayout;
import com.revolut.core.ui_kit.internal.views.navbar.ConstraintHeaderLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;

/* JADX INFO: loaded from: classes20.dex */
public final class w3 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f275266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NavBarWithToolbar f275267c;

    public /* synthetic */ w3(boolean z, NavBarWithToolbar navBarWithToolbar, int i) {
        this.f275265a = i;
        this.f275266b = z;
        this.f275267c = navBarWithToolbar;
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

    private final void f(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f275265a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f275265a) {
            case 0:
                boolean z = this.f275266b;
                NavBarWithToolbar navBarWithToolbar = this.f275267c;
                if (!z) {
                    navBarWithToolbar.getHeaderLayout().setVisibility(4);
                    ConstraintHeaderLayout headerLayout = navBarWithToolbar.getHeaderLayout();
                    ViewGroup.LayoutParams layoutParams = headerLayout.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.height = 1;
                    headerLayout.setLayoutParams(marginLayoutParams);
                }
                UIKitConstraintLayout navBarLayout = navBarWithToolbar.getNavBarLayout();
                ViewGroup.LayoutParams layoutParams2 = navBarLayout.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.height = -2;
                navBarLayout.setLayoutParams(marginLayoutParams2);
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f275265a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f275265a) {
            case 0:
                break;
            default:
                if (this.f275266b) {
                    this.f275267c.getHeaderLayout().setVisibility(0);
                }
                break;
        }
    }
}
