package ii4;

import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBindings;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class j0 extends kotlin.jvm.internal.q implements Function1 {
    public static final j0 f = new j0();

    public j0() {
        super(1, aw3.l.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditSpinnerBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.creditSpinnerScreen_progress;
        if (((ProgressBar) ViewBindings.findChildViewById(p0, i)) != null) {
            i = R$id.creditSpinnerScreen_subtitleView;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(p0, i);
            if (appCompatTextView != null) {
                i = R$id.creditSpinnerScreen_titleView;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(p0, i);
                if (appCompatTextView2 != null) {
                    return new aw3.l((ControllerContainerConstraintLayout) p0, appCompatTextView, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
