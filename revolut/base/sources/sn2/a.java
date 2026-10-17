package sn2;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.ui_kit_pdf.PdfView;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f264474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f264475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f264476c;
    public final PdfView d;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, PdfView pdfView) {
        this.f264474a = controllerContainerCoordinatorLayout;
        this.f264475b = largeActionButton;
        this.f264476c = navBarWithToolbar;
        this.d = pdfView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f264474a;
    }
}
