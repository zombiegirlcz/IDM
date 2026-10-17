package aw3;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.ui_kit_pdf.PdfView;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f10688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f10689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PdfView f10690c;
    public final ScreenContentRecyclerView d;
    public final TwinVerticalButton e;

    public h(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, BasicNavBar basicNavBar, PdfView pdfView, ScreenContentRecyclerView screenContentRecyclerView, TwinVerticalButton twinVerticalButton) {
        this.f10688a = controllerContainerCoordinatorLayout;
        this.f10689b = basicNavBar;
        this.f10690c = pdfView;
        this.d = screenContentRecyclerView;
        this.e = twinVerticalButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10688a;
    }
}
