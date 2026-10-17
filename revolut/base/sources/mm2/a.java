package mm2;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerLinearLayout;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerLinearLayout f207129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f207130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewPager2 f207131c;
    public final Tabs d;

    public a(ControllerContainerLinearLayout controllerContainerLinearLayout, BasicNavBar basicNavBar, ViewPager2 viewPager2, Tabs tabs) {
        this.f207129a = controllerContainerLinearLayout;
        this.f207130b = basicNavBar;
        this.f207131c = viewPager2;
        this.d = tabs;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f207129a;
    }
}
