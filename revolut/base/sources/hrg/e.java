package hrg;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.view.image.core.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e extends q implements Function1 {
    public static final e f = new e();

    public e() {
        super(1, irg.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/view/image/core/databinding/ScreenViewImageBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.screenViewImage_imageView;
        ImageViewTouch imageViewTouch = (ImageViewTouch) ViewBindings.findChildViewById(p0, i);
        if (imageViewTouch != null) {
            i = R$id.screenViewImage_toolbar;
            BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
            if (basicNavBar != null) {
                return new irg.a((ControllerContainerConstraintLayout) p0, imageViewTouch, basicNavBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
