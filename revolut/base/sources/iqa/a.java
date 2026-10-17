package iqa;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f167810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FooterTextView f167811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithAvatar f167812c;
    public final LargeActionButton d;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, FooterTextView footerTextView, NavBarWithAvatar navBarWithAvatar, LargeActionButton largeActionButton) {
        this.f167810a = controllerContainerConstraintLayout;
        this.f167811b = footerTextView;
        this.f167812c = navBarWithAvatar;
        this.d = largeActionButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f167810a;
    }
}
