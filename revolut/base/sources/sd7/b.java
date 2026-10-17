package sd7;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.ChatInputLayoutView;
import com.revolut.core.ui_kit.views.ExpandableTextView;
import com.revolut.core.ui_kit.views.LightboxGalleryView;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f261831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExpandableTextView f261832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ChatInputLayoutView f261833c;
    public final LightboxGalleryView d;

    public b(ControllerContainerFrameLayout controllerContainerFrameLayout, ExpandableTextView expandableTextView, ChatInputLayoutView chatInputLayoutView, LightboxGalleryView lightboxGalleryView) {
        this.f261831a = controllerContainerFrameLayout;
        this.f261832b = expandableTextView;
        this.f261833c = chatInputLayoutView;
        this.d = lightboxGalleryView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f261831a;
    }
}
