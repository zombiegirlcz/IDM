package a60;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core_ui_custom_font.TypefaceTextView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f1510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f1511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TypefaceTextView f1512c;
    public final ImageView d;
    public final LinearLayout e;

    public c(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithToolbar navBarWithToolbar, TypefaceTextView typefaceTextView, ImageView imageView, LinearLayout linearLayout) {
        this.f1510a = controllerContainerCoordinatorLayout;
        this.f1511b = navBarWithToolbar;
        this.f1512c = typefaceTextView;
        this.d = imageView;
        this.e = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f1510a;
    }
}
