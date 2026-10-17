package eta;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f129398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f129399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActionsView f129400c;
    public final AppCompatImageView d;
    public final AppCompatImageView e;
    public final FrameLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatTextView f129401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatImageView f129402h;
    public final AppCompatImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AppCompatTextView f129403j;

    public b(ControllerContainerConstraintLayout controllerContainerConstraintLayout, NavBarWithToolbar navBarWithToolbar, ActionsView actionsView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, FrameLayout frameLayout, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatTextView appCompatTextView2) {
        this.f129398a = controllerContainerConstraintLayout;
        this.f129399b = navBarWithToolbar;
        this.f129400c = actionsView;
        this.d = appCompatImageView;
        this.e = appCompatImageView2;
        this.f = frameLayout;
        this.f129401g = appCompatTextView;
        this.f129402h = appCompatImageView3;
        this.i = appCompatImageView4;
        this.f129403j = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f129398a;
    }
}
