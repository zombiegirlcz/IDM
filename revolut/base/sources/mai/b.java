package mai;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.ui_kit_pdf.PdfView;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f204042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f204043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PdfView f204044c;
    public final ScreenContentRecyclerView d;
    public final TwinVerticalButton e;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithToolbar navBarWithToolbar, PdfView pdfView, ScreenContentRecyclerView screenContentRecyclerView, TwinVerticalButton twinVerticalButton) {
        this.f204042a = controllerContainerCoordinatorLayout;
        this.f204043b = navBarWithToolbar;
        this.f204044c = pdfView;
        this.d = screenContentRecyclerView;
        this.e = twinVerticalButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f204042a;
    }
}
