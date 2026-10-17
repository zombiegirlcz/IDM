package mta;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.raffle.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, eta.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/raffle/impl/databinding/ScreenShareRaffleBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.navBarWithToolbar;
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
        if (navBarWithToolbar != null) {
            i = R$id.raffleShareActionsView;
            ActionsView actionsView = (ActionsView) ViewBindings.findChildViewById(p0, i);
            if (actionsView != null) {
                i = R$id.raffleShareAsset;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(p0, i);
                if (appCompatImageView != null) {
                    i = R$id.raffleShareAssetBackground;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(p0, i);
                    if (appCompatImageView2 != null) {
                        i = R$id.raffleShareCardContainer;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(p0, i);
                        if (frameLayout != null) {
                            i = R$id.raffleShareDescription;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(p0, i);
                            if (appCompatTextView != null) {
                                i = R$id.raffleShareQrCode;
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(p0, i);
                                if (appCompatImageView3 != null) {
                                    i = R$id.raffleShareRevolutLogo;
                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(p0, i);
                                    if (appCompatImageView4 != null) {
                                        i = R$id.raffleShareTitle;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(p0, i);
                                        if (appCompatTextView2 != null) {
                                            return new eta.b((ControllerContainerConstraintLayout) p0, navBarWithToolbar, actionsView, appCompatImageView, appCompatImageView2, frameLayout, appCompatTextView, appCompatImageView3, appCompatImageView4, appCompatTextView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
