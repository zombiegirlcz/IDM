package tx0;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.CustomTabLayoutView;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mx0.e6;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class i3 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavBarWithToolbar f275160b;

    public /* synthetic */ i3(NavBarWithToolbar navBarWithToolbar, int i) {
        this.f275159a = i;
        this.f275160b = navBarWithToolbar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TabLayout.TabView tabView;
        int i = this.f275159a;
        NavBarWithToolbar navBarWithToolbar = this.f275160b;
        switch (i) {
            case 0:
                return NavBarWithToolbar.K(navBarWithToolbar);
            case 1:
                return NavBarWithToolbar.B(navBarWithToolbar);
            case 2:
                return NavBarWithToolbar.D(navBarWithToolbar);
            case 3:
                return NavBarWithToolbar.A(navBarWithToolbar);
            default:
                NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
                Context context = navBarWithToolbar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                FixedTabs fixedTabs = new FixedTabs(context, null, 6, 0);
                fixedTabs.setId(R$id.internal_fixed_tabs);
                e6 heightMode = e6.f209675a;
                Intrinsics.checkNotNullParameter(heightMode, "heightMode");
                fixedTabs.f58557m = heightMode;
                Context context2 = fixedTabs.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                CustomTabLayoutView customTabLayoutView = fixedTabs.f58555j;
                ViewGroup.LayoutParams layoutParams = customTabLayoutView.getLayoutParams();
                Intrinsics.checkNotNullExpressionValue(layoutParams, "getLayoutParams(...)");
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int iK = kli.a.k(context2, 44.0f) - (marginLayoutParams != null ? marginLayoutParams.topMargin + marginLayoutParams.bottomMargin : 0);
                Context context3 = fixedTabs.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                Intrinsics.checkNotNullParameter(context3, "context");
                int iK2 = kli.a.k(context3, 44.0f);
                ViewGroup.LayoutParams layoutParams2 = customTabLayoutView.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.height = iK;
                customTabLayoutView.setLayoutParams(layoutParams2);
                customTabLayoutView.setSelectedTabIndicatorHeight(iK);
                customTabLayoutView.setSelectedTabIndicator(fixedTabs.f58557m.b());
                FrameLayout frameLayout = fixedTabs.k;
                ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams3.height = iK2;
                frameLayout.setLayoutParams(layoutParams3);
                frameLayout.setBackgroundResource(fixedTabs.f58557m.a(fixedTabs.f58558n));
                int tabCount = customTabLayoutView.getTabCount();
                for (int i2 = 0; i2 < tabCount; i2++) {
                    TabLayout.Tab tabAt = customTabLayoutView.getTabAt(i2);
                    if (tabAt != null && (tabView = tabAt.view) != null) {
                        tabView.setBackgroundResource(fixedTabs.f58557m.c());
                    }
                }
                ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(-2, -2);
                layoutParams4.topToTop = 0;
                layoutParams4.bottomToBottom = 0;
                layoutParams4.endToEnd = 0;
                fixedTabs.setLayoutParams(layoutParams4);
                Context context4 = fixedTabs.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                int iK3 = kli.a.k(context4, 16.0f);
                Context context5 = fixedTabs.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                fixedTabs.setPaddingRelative(iK3, fixedTabs.getPaddingTop(), kli.a.k(context5, 16.0f), fixedTabs.getPaddingBottom());
                fixedTabs.setVisibility(8);
                ((ConstraintLayout) navBarWithToolbar.findViewById(R$id.navBarWithToolbar_innerMenuLayout)).addView(fixedTabs);
                return fixedTabs;
        }
    }
}
