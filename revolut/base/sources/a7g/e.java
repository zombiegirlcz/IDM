package a7g;

import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.InputTravelSearchItemView;
import com.revolut.core.ui_kit.views.InputTravelSearchView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f1882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputTravelSearchItemView f1883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InputTravelSearchView f1884c;
    public final ActionsView d;
    public final g e;
    public final TransitionSet f;

    public e(ControllerContainerCoordinatorLayout sceneRoot, FrameLayout searchInputsContainer, BasicNavBar navBar, ScreenContentRecyclerView recyclerView, InputTravelSearchItemView collapsedView, InputTravelSearchView expandedView, ActionsView quickFiltersView, g onTransitionStateChanged) {
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        Intrinsics.checkNotNullParameter(searchInputsContainer, "searchInputsContainer");
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(collapsedView, "collapsedView");
        Intrinsics.checkNotNullParameter(expandedView, "expandedView");
        Intrinsics.checkNotNullParameter(quickFiltersView, "quickFiltersView");
        Intrinsics.checkNotNullParameter(onTransitionStateChanged, "onTransitionStateChanged");
        this.f1882a = sceneRoot;
        this.f1883b = collapsedView;
        this.f1884c = expandedView;
        this.d = quickFiltersView;
        this.e = onTransitionStateChanged;
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.setDuration(300L);
        transitionSet.setInterpolator((TimeInterpolator) new DecelerateInterpolator(2.0f));
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.addTarget(searchInputsContainer);
        changeBounds.addTarget(navBar);
        changeBounds.addTarget(recyclerView);
        transitionSet.addTransition(changeBounds);
        Fade fade = new Fade();
        fade.addTarget(collapsedView);
        fade.addTarget(expandedView);
        fade.addTarget(quickFiltersView);
        transitionSet.addTransition(fade);
        transitionSet.addListener((Transition.TransitionListener) new d(this));
        this.f = transitionSet;
    }

    public final void a(boolean z, boolean z3) {
        this.f1883b.setVisibility(!z ? 0 : 8);
        this.f1884c.setVisibility(z ? 0 : 8);
        this.d.setVisibility(z3 ? 0 : 8);
    }

    public final boolean b(boolean z, boolean z3) {
        if ((this.f1884c.getVisibility() == 0) == z) {
            if ((this.f1883b.getVisibility() == 0) != z) {
                if ((this.d.getVisibility() == 0) == z3) {
                    return true;
                }
            }
        }
        return false;
    }
}
