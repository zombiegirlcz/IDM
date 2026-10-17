package xd7;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.ChatInputLayoutView;
import com.revolut.core.ui_kit.views.ExpandableTextView;
import com.revolut.core.ui_kit.views.LightboxGalleryView;
import com.revolut.feature.image_gallery.R$id;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, sd7.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/image_gallery/databinding/ScreenImageGalleryLightboxBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.imageGalleryLightboxScreen_caption;
        ExpandableTextView expandableTextView = (ExpandableTextView) ViewBindings.findChildViewById(p0, i);
        if (expandableTextView != null) {
            ControllerContainerFrameLayout controllerContainerFrameLayout = (ControllerContainerFrameLayout) p0;
            int i2 = R$id.imageGalleryLightboxScreen_inputLayout;
            ChatInputLayoutView chatInputLayoutView = (ChatInputLayoutView) ViewBindings.findChildViewById(p0, i2);
            if (chatInputLayoutView != null) {
                i2 = R$id.imageGalleryLightboxScreen_lightboxGallery;
                LightboxGalleryView lightboxGalleryView = (LightboxGalleryView) ViewBindings.findChildViewById(p0, i2);
                if (lightboxGalleryView != null) {
                    return new sd7.b(controllerContainerFrameLayout, expandableTextView, chatInputLayoutView, lightboxGalleryView);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
