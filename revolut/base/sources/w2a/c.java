package w2a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.internal.views.UIKitImageView;
import com.revolut.core.ui_kit.views.buttons.SearchButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.feature.payments.transfers.personalisation.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, l2a.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/payments/transfers/personalisation/impl/databinding/TransferPersonalisationGifScreenBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.gifSelector_categories;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(p0, i);
        if (recyclerView != null) {
            i = R$id.gifSelector_closeSearchButton;
            UIKitImageView uIKitImageView = (UIKitImageView) ViewBindings.findChildViewById(p0, i);
            if (uIKitImageView != null) {
                i = R$id.gifSelector_gifs;
                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(p0, i);
                if (recyclerView2 != null) {
                    i = R$id.gifSelector_searchButton;
                    SearchButton searchButton = (SearchButton) ViewBindings.findChildViewById(p0, i);
                    if (searchButton != null) {
                        i = R$id.gifSelector_searchInput;
                        InputText inputText = (InputText) ViewBindings.findChildViewById(p0, i);
                        if (inputText != null) {
                            return new l2a.b((ControllerContainerConstraintLayout) p0, recyclerView, uIKitImageView, recyclerView2, searchButton, inputText);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
