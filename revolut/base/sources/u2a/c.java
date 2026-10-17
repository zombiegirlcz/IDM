package u2a;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.gallery_picker.GalleryPickerView;
import com.revolut.feature.payments.transfers.personalisation.impl.R$id;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, l2a.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/payments/transfers/personalisation/impl/databinding/TransferPersonalisationGalleryScreenBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.galleryPickerView;
        GalleryPickerView galleryPickerView = (GalleryPickerView) ViewBindings.findChildViewById(p0, i);
        if (galleryPickerView != null) {
            return new l2a.a((ControllerContainerFrameLayout) p0, galleryPickerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
