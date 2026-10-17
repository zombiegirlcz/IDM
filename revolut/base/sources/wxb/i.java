package wxb;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.ui_kit_pdf.PdfView;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f300828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f300829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PdfView f300830c;
    public final ScreenContentRecyclerView d;
    public final TwinVerticalButton e;

    public i(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithToolbar navBarWithToolbar, PdfView pdfView, ScreenContentRecyclerView screenContentRecyclerView, TwinVerticalButton twinVerticalButton) {
        this.f300828a = controllerContainerCoordinatorLayout;
        this.f300829b = navBarWithToolbar;
        this.f300830c = pdfView;
        this.d = screenContentRecyclerView;
        this.e = twinVerticalButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f300828a;
    }
}
