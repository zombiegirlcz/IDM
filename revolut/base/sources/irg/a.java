package irg;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f168045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageViewTouch f168046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasicNavBar f168047c;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, ImageViewTouch imageViewTouch, BasicNavBar basicNavBar) {
        this.f168045a = controllerContainerConstraintLayout;
        this.f168046b = imageViewTouch;
        this.f168047c = basicNavBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f168045a;
    }
}
