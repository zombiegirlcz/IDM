package gyi;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.ScrollingPagerIndicatorView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.retail.feature.airportlounges.impl.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class w extends kotlin.jvm.internal.q implements Function1 {
    public static final w f = new w();

    public w() {
        super(1, zvi.d.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/airportlounges/impl/databinding/ScreenAirportLoungesPassListBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.airportLoungesPassListActivateButton;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
        if (largeActionButton != null) {
            i = R$id.airportLoungesPassListFooterView;
            FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(p0, i);
            if (footerTextView != null) {
                i = R$id.airportLoungesPassListIndicator;
                ScrollingPagerIndicatorView scrollingPagerIndicatorView = (ScrollingPagerIndicatorView) ViewBindings.findChildViewById(p0, i);
                if (scrollingPagerIndicatorView != null) {
                    i = R$id.airportLoungesPassListNavBar;
                    BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
                    if (basicNavBar != null) {
                        i = R$id.airportLoungesPassListPager;
                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(p0, i);
                        if (viewPager2 != null) {
                            return new zvi.d((ControllerContainerConstraintLayout) p0, largeActionButton, footerTextView, scrollingPagerIndicatorView, basicNavBar, viewPager2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
