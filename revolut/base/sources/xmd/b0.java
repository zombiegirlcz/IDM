package xmd;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.feature.spending_analytics.impl.ui.budget.setup_budget.SetupBudgetController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mx0.a5;
import sgm.j1;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SetupBudgetController f307161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f307162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionFooterView f307163c;
    public final /* synthetic */ float d;

    public b0(RecyclerView recyclerView, SetupBudgetController setupBudgetController, RecyclerView recyclerView2, ActionFooterView actionFooterView, float f) {
        this.f307161a = setupBudgetController;
        this.f307162b = recyclerView2;
        this.f307163c = actionFooterView;
        this.d = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScreenContentRecyclerView recyclerView;
        koi.b bVarF;
        View view;
        SetupBudgetController setupBudgetController = this.f307161a;
        Float fValueOf = null;
        setupBudgetController.T = null;
        RecyclerView recyclerView2 = this.f307162b;
        koi.b bVarF2 = yp0.y.f(recyclerView2, "adjustment_container");
        View view2 = bVarF2 != null ? bVarF2.itemView : null;
        a5 a5Var = view2 instanceof a5 ? (a5) view2 : null;
        if (a5Var != null && (recyclerView = a5Var.getRecyclerView()) != null && (bVarF = yp0.y.f(recyclerView, "adjustment_amount")) != null && (view = bVarF.itemView) != null) {
            view.getLocationInWindow(new int[2]);
            fValueOf = Float.valueOf((view.getHeight() / 2.0f) + r1[1]);
        }
        recyclerView2.setTranslationY(fValueOf != null ? this.d - fValueOf.floatValue() : 0.0f);
        long j2 = SetupBudgetController.Y;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = recyclerView2.animate();
        viewPropertyAnimatorAnimate.cancel();
        ViewPropertyAnimator startAnimation = viewPropertyAnimatorAnimate.setDuration(kotlin.time.b.f(j2));
        Intrinsics.checkNotNullExpressionValue(startAnimation, "setDuration(...)");
        Intrinsics.checkNotNullParameter(startAnimation, "$this$startAnimation");
        startAnimation.alpha(1.0f);
        startAnimation.translationY(BitmapDescriptorFactory.HUE_RED);
        startAnimation.withEndAction(new j1(setupBudgetController, 10));
        Unit unit = Unit.f186387a;
        startAnimation.start();
        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = this.f307163c.animate();
        viewPropertyAnimatorAnimate2.cancel();
        ViewPropertyAnimator duration = viewPropertyAnimatorAnimate2.setDuration(kotlin.time.b.f(j2));
        Intrinsics.checkNotNullExpressionValue(duration, "setDuration(...)");
        c0.f307166a.invoke(duration);
        duration.start();
    }
}
