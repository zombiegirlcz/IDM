package peh;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.kompot.view.ControllerContainerLinearLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerLinearLayout f235378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FixedTabs f235379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Tabs f235380c;

    public a(ControllerContainerLinearLayout controllerContainerLinearLayout, FixedTabs fixedTabs, Tabs tabs) {
        this.f235378a = controllerContainerLinearLayout;
        this.f235379b = fixedTabs;
        this.f235380c = tabs;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f235378a;
    }
}
