package hmd;

import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f153694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f153695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f153696c;
    public final AppCompatTextView d;
    public final BottomExpandableDialogView e;
    public final WebView f;

    public h(ControllerContainerConstraintLayout controllerContainerConstraintLayout, BasicNavBar basicNavBar, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, BottomExpandableDialogView bottomExpandableDialogView, WebView webView) {
        this.f153694a = controllerContainerConstraintLayout;
        this.f153695b = basicNavBar;
        this.f153696c = appCompatTextView;
        this.d = appCompatTextView2;
        this.e = bottomExpandableDialogView;
        this.f = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f153694a;
    }
}
