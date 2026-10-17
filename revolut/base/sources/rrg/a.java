package rrg;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LightboxGalleryView;
import com.revolut.feature.view.image.impl.R$id;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a extends q implements Function1 {
    public static final a f = new a();

    public a() {
        super(1, krg.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/view/image/impl/databinding/ScreenImageGalleryBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.lightboxGallery;
        LightboxGalleryView lightboxGalleryView = (LightboxGalleryView) ViewBindings.findChildViewById(p0, i);
        if (lightboxGalleryView != null) {
            return new krg.a((ControllerContainerFrameLayout) p0, lightboxGalleryView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
