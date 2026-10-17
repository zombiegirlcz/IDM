package r0b;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f250768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AsyncDiffRecyclerView f250769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AsyncDiffRecyclerView f250770c;
    public final ControllerContainerConstraintLayout d;
    public final BasicNavBar e;
    public final AsyncDiffRecyclerView f;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, AsyncDiffRecyclerView asyncDiffRecyclerView, AsyncDiffRecyclerView asyncDiffRecyclerView2, ControllerContainerConstraintLayout controllerContainerConstraintLayout2, BasicNavBar basicNavBar, AsyncDiffRecyclerView asyncDiffRecyclerView3) {
        this.f250768a = controllerContainerConstraintLayout;
        this.f250769b = asyncDiffRecyclerView;
        this.f250770c = asyncDiffRecyclerView2;
        this.d = controllerContainerConstraintLayout2;
        this.e = basicNavBar;
        this.f = asyncDiffRecyclerView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f250768a;
    }
}
