package aad;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerLinearLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerLinearLayout f2800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f2801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FixedTabs f2802c;

    public a(ControllerContainerLinearLayout controllerContainerLinearLayout, BasicNavBar basicNavBar, FixedTabs fixedTabs) {
        this.f2800a = controllerContainerLinearLayout;
        this.f2801b = basicNavBar;
        this.f2802c = fixedTabs;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f2800a;
    }
}
