package evf;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.ui_kit_pdf.PdfView;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f129792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f129793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f129794c;
    public final PdfView d;
    public final ScreenContentRecyclerView e;

    public e(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, PdfView pdfView, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f129792a = controllerContainerCoordinatorLayout;
        this.f129793b = largeActionButton;
        this.f129794c = navBarWithToolbar;
        this.d = pdfView;
        this.e = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f129792a;
    }
}
