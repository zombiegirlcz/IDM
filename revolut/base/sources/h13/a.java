package h13;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.code.CodeEditor;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f148452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CodeEditor f148453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f148454c;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, CodeEditor codeEditor, NavBarWithToolbar navBarWithToolbar) {
        this.f148452a = controllerContainerConstraintLayout;
        this.f148453b = codeEditor;
        this.f148454c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f148452a;
    }
}
