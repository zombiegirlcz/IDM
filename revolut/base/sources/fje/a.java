package fje;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.feature.productintro.view.AccountsNavBarContentView;
import com.revolut.feature.tab.crypto.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f135605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountsNavBarContentView f135606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithContainer f135607c;
    public final ViewPager2 d;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, AccountsNavBarContentView accountsNavBarContentView, NavBarWithContainer navBarWithContainer, ViewPager2 viewPager2) {
        this.f135605a = controllerContainerCoordinatorLayout;
        this.f135606b = accountsNavBarContentView;
        this.f135607c = navBarWithContainer;
        this.d = viewPager2;
    }

    public static a a(View view) {
        int i = R$id.flowTabCrypto_navBarContentView;
        AccountsNavBarContentView accountsNavBarContentView = (AccountsNavBarContentView) ViewBindings.findChildViewById(view, i);
        if (accountsNavBarContentView != null) {
            i = R$id.flowTabCrypto_navBarWithContainer;
            NavBarWithContainer navBarWithContainer = (NavBarWithContainer) ViewBindings.findChildViewById(view, i);
            if (navBarWithContainer != null) {
                i = R$id.flowTabCrypto_Pager;
                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                if (viewPager2 != null) {
                    return new a((ControllerContainerCoordinatorLayout) view, accountsNavBarContentView, navBarWithContainer, viewPager2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f135605a;
    }
}
