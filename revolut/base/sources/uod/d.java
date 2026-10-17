package uod;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.spending_analytics.impl.R$id;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import hmd.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d extends q implements Function1 {
    public static final d f = new d();

    public d() {
        super(1, i.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/spending_analytics/impl/databinding/ScreenTripsShareBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.navBarWithToolbar;
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
        if (navBarWithToolbar != null) {
            i = R$id.tripShareActionButtonsBar;
            ActionsView actionsView = (ActionsView) ViewBindings.findChildViewById(p0, i);
            if (actionsView != null) {
                i = R$id.tripShareBackgroundImage;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(p0, i);
                if (appCompatImageView != null) {
                    i = R$id.tripShareCardBottomContent;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(p0, i);
                    if (linearLayout != null) {
                        i = R$id.tripShareCardContainer;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(p0, i);
                        if (frameLayout != null) {
                            i = R$id.tripShareCardCountriesContainer;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(p0, i);
                            if (linearLayout2 != null) {
                                i = R$id.tripShareCardCountriesCount;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(p0, i);
                                if (appCompatTextView != null) {
                                    i = R$id.tripShareCardCountriesLabel;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(p0, i);
                                    if (appCompatTextView2 != null) {
                                        i = R$id.tripShareCardJoinDate;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(p0, i);
                                        if (appCompatTextView3 != null) {
                                            i = R$id.tripShareCardMap;
                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(p0, i);
                                            if (appCompatImageView2 != null) {
                                                i = R$id.tripShareCardRevolutLogo;
                                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(p0, i);
                                                if (appCompatImageView3 != null) {
                                                    i = R$id.tripShareCardRevolutLogoNew;
                                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(p0, i);
                                                    if (appCompatImageView4 != null) {
                                                        i = R$id.tripShareCardTopIcon;
                                                        AppCompatImageView appCompatImageView5 = (AppCompatImageView) ViewBindings.findChildViewById(p0, i);
                                                        if (appCompatImageView5 != null) {
                                                            i = R$id.tripShareCardTopIconNew;
                                                            AppCompatImageView appCompatImageView6 = (AppCompatImageView) ViewBindings.findChildViewById(p0, i);
                                                            if (appCompatImageView6 != null) {
                                                                i = R$id.tripShareCardTopRightHeader;
                                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(p0, i);
                                                                if (linearLayout3 != null) {
                                                                    i = R$id.tripShareCardTripsContainer;
                                                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(p0, i);
                                                                    if (linearLayout4 != null) {
                                                                        i = R$id.tripShareCardTripsCount;
                                                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(p0, i);
                                                                        if (appCompatTextView4 != null) {
                                                                            i = R$id.tripShareCardTripsLabel;
                                                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(p0, i);
                                                                            if (appCompatTextView5 != null) {
                                                                                i = R$id.tripShareCardUserName;
                                                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(p0, i);
                                                                                if (appCompatTextView6 != null) {
                                                                                    i = R$id.tripShareCardUserTravels;
                                                                                    AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(p0, i);
                                                                                    if (appCompatTextView7 != null) {
                                                                                        i = R$id.tripShareCardWorldPercentage;
                                                                                        AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(p0, i);
                                                                                        if (appCompatTextView8 != null) {
                                                                                            i = R$id.tripShareCardWorldPercentageContainer;
                                                                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(p0, i);
                                                                                            if (linearLayout5 != null) {
                                                                                                i = R$id.tripShareCardWorldPercentageLabel;
                                                                                                AppCompatTextView appCompatTextView9 = (AppCompatTextView) ViewBindings.findChildViewById(p0, i);
                                                                                                if (appCompatTextView9 != null) {
                                                                                                    return new i((ControllerContainerFrameLayout) p0, navBarWithToolbar, actionsView, appCompatImageView, linearLayout, frameLayout, linearLayout2, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatImageView6, linearLayout3, linearLayout4, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, linearLayout5, appCompatTextView9);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
