package mw9;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f209408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CutoutImageView f209409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasicNavBar f209410c;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, CutoutImageView cutoutImageView, BasicNavBar basicNavBar) {
        this.f209408a = controllerContainerConstraintLayout;
        this.f209409b = cutoutImageView;
        this.f209410c = basicNavBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f209408a;
    }
}
