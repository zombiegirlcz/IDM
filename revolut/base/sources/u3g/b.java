package u3g;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.browser.InAppBrowserView;
import com.revolut.feature.travel.experiences.impl.R$id;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, w0g.c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenExperiencesBookingVoucherBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.experiencesBookingVoucher_inAppBrowserView;
        InAppBrowserView inAppBrowserView = (InAppBrowserView) ViewBindings.findChildViewById(p0, i);
        if (inAppBrowserView != null) {
            return new w0g.c((ControllerContainerFrameLayout) p0, inAppBrowserView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
