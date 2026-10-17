package p7d;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f233752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChatInputView f233753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f233754c;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ChatInputView chatInputView, NavBarWithToolbar navBarWithToolbar) {
        this.f233752a = controllerContainerCoordinatorLayout;
        this.f233753b = chatInputView;
        this.f233754c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f233752a;
    }
}
