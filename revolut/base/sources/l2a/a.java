package l2a;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.gallery_picker.GalleryPickerView;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f191720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GalleryPickerView f191721b;

    public a(ControllerContainerFrameLayout controllerContainerFrameLayout, GalleryPickerView galleryPickerView) {
        this.f191720a = controllerContainerFrameLayout;
        this.f191721b = galleryPickerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f191720a;
    }
}
