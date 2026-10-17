package q67;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBindings;
import com.revolut.feature.gif_view.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, n67.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/gif_view/impl/databinding/ScreenGifViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.above_text;
        if (((TextView) ViewBindings.findChildViewById(p0, i)) != null) {
            i = R$id.below_text;
            if (((TextView) ViewBindings.findChildViewById(p0, i)) != null) {
                i = R$id.close_button;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(p0, i);
                if (imageView != null) {
                    i = R$id.gif_image;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(p0, i);
                    if (imageView2 != null) {
                        ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
                        int i2 = R$id.guidelineMiddle;
                        if (((Guideline) ViewBindings.findChildViewById(p0, i2)) != null) {
                            i2 = R$id.placeholderDetails;
                            if (((TextView) ViewBindings.findChildViewById(p0, i2)) != null) {
                                i2 = R$id.placeholderTitle;
                                if (((TextView) ViewBindings.findChildViewById(p0, i2)) != null) {
                                    return new n67.a(controllerContainerConstraintLayout, imageView, imageView2, controllerContainerConstraintLayout);
                                }
                            }
                        }
                        i = i2;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
