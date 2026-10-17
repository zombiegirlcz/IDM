package uyh;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.feature_crypto_order_flow.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, pyh.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature_crypto_order_flow/impl/databinding/ScreenCryptoExchangeBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.crypto_exchange_navBarWithAvatar;
        NavBarWithAvatar navBarWithAvatar = (NavBarWithAvatar) ViewBindings.findChildViewById(p0, i);
        if (navBarWithAvatar != null) {
            i = R$id.crypto_exchange_recyclerView;
            if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                i = R$id.footer;
                ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
                if (actionFooterView != null) {
                    return new pyh.a(actionFooterView, navBarWithAvatar, (ControllerContainerConstraintLayout) p0);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
