package m12;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.ui_kit_pdf.PdfView;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f201195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f201196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f201197c;
    public final PdfView d;
    public final ScreenContentRecyclerView e;

    public c(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, PdfView pdfView, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f201195a = controllerContainerCoordinatorLayout;
        this.f201196b = largeActionButton;
        this.f201197c = navBarWithToolbar;
        this.d = pdfView;
        this.e = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f201195a;
    }
}
