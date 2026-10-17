package lk1;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit.views.ScanView;
import com.revolut.core.ui_kit.views.TextSwitcherView;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f196178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OverlappedIconsView f196179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextSwitcherView f196180c;
    public final ScanView d;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, OverlappedIconsView overlappedIconsView, TextSwitcherView textSwitcherView, ScanView scanView) {
        this.f196178a = controllerContainerConstraintLayout;
        this.f196179b = overlappedIconsView;
        this.f196180c = textSwitcherView;
        this.d = scanView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f196178a;
    }
}
