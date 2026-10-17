package hx0;

import android.animation.Animator;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.BottomSwipeView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.feature.spending_analytics.impl.ui.budget.setup_budget.SetupBudgetController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f156317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f156318c;

    public /* synthetic */ k(Object obj2, float f, int i) {
        this.f156316a = i;
        this.f156318c = obj2;
        this.f156317b = f;
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

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    private final void l(Animator animator) {
    }

    private final void m(Animator animator) {
    }

    private final void n(Animator animator) {
    }

    private final void o(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f156316a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f156316a) {
            case 0:
                ((View) this.f156318c).setPivotY(this.f156317b);
                break;
            case 1:
            case 2:
            case 3:
                break;
            default:
                SetupBudgetController setupBudgetController = (SetupBudgetController) this.f156318c;
                setupBudgetController.U = null;
                RecyclerView setupBudgetRecyclerView = setupBudgetController.g3().f153693g;
                Intrinsics.checkNotNullExpressionValue(setupBudgetRecyclerView, "setupBudgetRecyclerView");
                ActionFooterView setupBudgetFooter = setupBudgetController.g3().e;
                Intrinsics.checkNotNullExpressionValue(setupBudgetFooter, "setupBudgetFooter");
                setupBudgetRecyclerView.setAlpha(BitmapDescriptorFactory.HUE_RED);
                setupBudgetFooter.setAlpha(BitmapDescriptorFactory.HUE_RED);
                setupBudgetController.i3();
                OneShotPreDrawListener oneShotPreDrawListener = setupBudgetController.T;
                if (oneShotPreDrawListener != null) {
                    oneShotPreDrawListener.removeListener();
                }
                setupBudgetController.T = OneShotPreDrawListener.add(setupBudgetRecyclerView, new xmd.b0(setupBudgetRecyclerView, setupBudgetController, setupBudgetRecyclerView, setupBudgetFooter, this.f156317b));
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f156316a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f156316a) {
            case 1:
                ((BottomSwipeView) this.f156318c).getIcon().setTranslationY(this.f156317b);
                break;
            case 2:
                SmallActionButton smallActionButton = (SmallActionButton) this.f156318c;
                smallActionButton.setTranslationY(this.f156317b);
                smallActionButton.setVisibility(0);
                break;
            case 3:
                ConstraintLayout constraintLayout = (ConstraintLayout) this.f156318c;
                constraintLayout.setTranslationY(this.f156317b);
                constraintLayout.setVisibility(0);
                break;
        }
    }
}
