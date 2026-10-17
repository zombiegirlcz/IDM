package xka;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.lightprompt.LightPromptFullScreenView;
import com.revolut.feature.product_article.impl.R$id;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.q implements Function1 {
    public static final d f = new d();

    public d() {
        super(1, gka.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/product_article/impl/databinding/ProductArticleDetailsScreenBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.productArticleDetails_prompt;
        LightPromptFullScreenView lightPromptFullScreenView = (LightPromptFullScreenView) ViewBindings.findChildViewById(p0, i);
        if (lightPromptFullScreenView != null) {
            return new gka.a((ControllerContainerFrameLayout) p0, lightPromptFullScreenView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
