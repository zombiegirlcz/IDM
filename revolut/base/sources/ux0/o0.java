package ux0;

import android.animation.Animator;
import android.view.View;
import androidx.core.view.ViewCompat;
import au0.m1;
import com.revolut.core.ui_kit.internal.views.navbar.CollapsingAppBarLayout$Behavior;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import ix0.a2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes20.dex */
public final class o0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f283789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f283790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0 f283791c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Ref$ObjectRef e;
    public final /* synthetic */ NavBarWithContainer f;

    public o0(Ref$ObjectRef ref$ObjectRef, boolean z, s0 s0Var, boolean z3, Ref$ObjectRef ref$ObjectRef2, NavBarWithContainer navBarWithContainer) {
        this.f283789a = ref$ObjectRef;
        this.f283790b = z;
        this.f283791c = s0Var;
        this.d = z3;
        this.e = ref$ObjectRef2;
        this.f = navBarWithContainer;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a2 a2Var = (a2) this.f283789a.f186409a;
        if (a2Var != null) {
            a2Var.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        m1 m1Var;
        boolean z = this.f283790b;
        NavBarWithContainer navBarWithContainer = this.f;
        s0 s0Var = this.f283791c;
        if (!z) {
            s0Var.m();
            s0Var.f283810q.b(s0Var.getAccountsSelectionView());
            CollapsingAppBarLayout$Behavior currentBehaviourOrNull$ui_kit_components_release = navBarWithContainer.getCurrentBehaviourOrNull$ui_kit_components_release();
            if (currentBehaviourOrNull$ui_kit_components_release == null) {
                return;
            }
            currentBehaviourOrNull$ui_kit_components_release.setTopAndBottomOffset(0);
            return;
        }
        t0 t0Var = s0Var.f283801b;
        if (t0Var.getParent() == null) {
            s0Var.addView(t0Var);
            if (s0Var.isInLayout()) {
                s0Var.f283813t++;
            }
        }
        if (!this.d) {
            s0Var.f();
        }
        View rootView = s0Var.getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
        if (!ViewCompat.isLaidOut(rootView) || rootView.isLayoutRequested()) {
            m1 m1Var2 = new m1(rootView, navBarWithContainer, s0Var, 6);
            rootView.addOnLayoutChangeListener(m1Var2);
            m1Var = m1Var2;
        } else {
            int height = s0Var.getProductIntroContentView().getHeight() - s0Var.getAccountsSelectionView().getHeight();
            CollapsingAppBarLayout$Behavior currentBehaviourOrNull$ui_kit_components_release2 = navBarWithContainer.getCurrentBehaviourOrNull$ui_kit_components_release();
            if (currentBehaviourOrNull$ui_kit_components_release2 != null) {
                i = height < 0 ? height : 0;
                currentBehaviourOrNull$ui_kit_components_release2.setTopAndBottomOffset(i);
            }
            s0Var.getProductIntroContentView().setTranslationY(Math.abs(i));
            m1Var = null;
        }
        this.e.f186409a = m1Var;
    }
}
