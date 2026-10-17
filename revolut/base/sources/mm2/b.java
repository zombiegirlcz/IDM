package mm2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.TwoViewsSwitcherView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerLinearLayout;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerLinearLayout f207132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f207133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TwoViewsSwitcherView f207134c;
    public final RecyclerView d;
    public final FooterTextView e;
    public final BasicNavBar f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TwoViewsSwitcherView f207135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RecyclerView f207136h;

    public b(ControllerContainerLinearLayout controllerContainerLinearLayout, ActionFooterView actionFooterView, TwoViewsSwitcherView twoViewsSwitcherView, RecyclerView recyclerView, FooterTextView footerTextView, BasicNavBar basicNavBar, TwoViewsSwitcherView twoViewsSwitcherView2, RecyclerView recyclerView2) {
        this.f207132a = controllerContainerLinearLayout;
        this.f207133b = actionFooterView;
        this.f207134c = twoViewsSwitcherView;
        this.d = recyclerView;
        this.e = footerTextView;
        this.f = basicNavBar;
        this.f207135g = twoViewsSwitcherView2;
        this.f207136h = recyclerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f207132a;
    }
}
