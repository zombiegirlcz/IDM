package s7i;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f260840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f260841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f260842c;
    public final LargeActionButton d;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, BasicNavBar basicNavBar, LargeActionButton largeActionButton, LargeActionButton largeActionButton2) {
        this.f260840a = controllerContainerConstraintLayout;
        this.f260841b = basicNavBar;
        this.f260842c = largeActionButton;
        this.d = largeActionButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f260840a;
    }
}
