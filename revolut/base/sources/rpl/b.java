package rpl;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LightboxGalleryView;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.sso.impl.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, dkl.f.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/sso/impl/databinding/ScreenDocumentPhotoBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerFrameLayout controllerContainerFrameLayout = (ControllerContainerFrameLayout) p0;
        int i = R$id.revolutId_documentPhotoScreen_lightboxGallery;
        LightboxGalleryView lightboxGalleryView = (LightboxGalleryView) ViewBindings.findChildViewById(p0, i);
        if (lightboxGalleryView != null) {
            return new dkl.f(controllerContainerFrameLayout, lightboxGalleryView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
