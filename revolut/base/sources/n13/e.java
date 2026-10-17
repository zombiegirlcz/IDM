package n13;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f211234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FooterTextView f211235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f211236c;

    public e(ControllerContainerConstraintLayout controllerContainerConstraintLayout, FooterTextView footerTextView, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f211234a = controllerContainerConstraintLayout;
        this.f211235b = footerTextView;
        this.f211236c = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f211234a;
    }
}
