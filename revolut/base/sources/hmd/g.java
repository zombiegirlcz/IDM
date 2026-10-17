package hmd;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.internal.views.animated_numbers.AnimatedNumbersView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.ui_kit_artboard.PlainLabelView;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f153690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedNumbersView f153691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlainLabelView f153692c;
    public final ConstraintLayout d;
    public final ActionFooterView e;
    public final BasicNavBar f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RecyclerView f153693g;

    public g(ControllerContainerFrameLayout controllerContainerFrameLayout, AnimatedNumbersView animatedNumbersView, PlainLabelView plainLabelView, ConstraintLayout constraintLayout, ActionFooterView actionFooterView, BasicNavBar basicNavBar, RecyclerView recyclerView) {
        this.f153690a = controllerContainerFrameLayout;
        this.f153691b = animatedNumbersView;
        this.f153692c = plainLabelView;
        this.d = constraintLayout;
        this.e = actionFooterView;
        this.f = basicNavBar;
        this.f153693g = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f153690a;
    }
}
