package e67;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.feature.full_screen_prompt.R$id;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f122936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundView f122937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f122938c;

    public a(ControllerContainerFrameLayout controllerContainerFrameLayout, AnimatedBackgroundView animatedBackgroundView, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f122936a = controllerContainerFrameLayout;
        this.f122937b = animatedBackgroundView;
        this.f122938c = screenContentRecyclerView;
    }

    public static a a(View view) {
        int i = R$id.animatedBackgroundView;
        AnimatedBackgroundView animatedBackgroundView = (AnimatedBackgroundView) ViewBindings.findChildViewById(view, i);
        if (animatedBackgroundView != null) {
            i = R$id.recyclerView;
            ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i);
            if (screenContentRecyclerView != null) {
                return new a((ControllerContainerFrameLayout) view, animatedBackgroundView, screenContentRecyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f122936a;
    }
}
