package krg;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LightboxGalleryView;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f188867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LightboxGalleryView f188868b;

    public a(ControllerContainerFrameLayout controllerContainerFrameLayout, LightboxGalleryView lightboxGalleryView) {
        this.f188867a = controllerContainerFrameLayout;
        this.f188868b = lightboxGalleryView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f188867a;
    }
}
