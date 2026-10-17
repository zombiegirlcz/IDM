package s7i;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f260849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FooterTextView f260850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f260851c;
    public final ScreenContentRecyclerView d;
    public final LargeActionButton e;
    public final LargeActionButton f;

    public d(ControllerContainerConstraintLayout controllerContainerConstraintLayout, FooterTextView footerTextView, NavBarWithToolbar navBarWithToolbar, ScreenContentRecyclerView screenContentRecyclerView, LargeActionButton largeActionButton, LargeActionButton largeActionButton2) {
        this.f260849a = controllerContainerConstraintLayout;
        this.f260850b = footerTextView;
        this.f260851c = navBarWithToolbar;
        this.d = screenContentRecyclerView;
        this.e = largeActionButton;
        this.f = largeActionButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f260849a;
    }
}
