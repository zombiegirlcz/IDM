package wre;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f299574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f299575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f299576c;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, LargeActionButton largeActionButton2) {
        this.f299574a = controllerContainerCoordinatorLayout;
        this.f299575b = largeActionButton;
        this.f299576c = largeActionButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f299574a;
    }
}
