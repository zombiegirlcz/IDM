package dkl;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LightboxGalleryView;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f115646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LightboxGalleryView f115647b;

    public f(ControllerContainerFrameLayout controllerContainerFrameLayout, LightboxGalleryView lightboxGalleryView) {
        this.f115646a = controllerContainerFrameLayout;
        this.f115647b = lightboxGalleryView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f115646a;
    }
}
