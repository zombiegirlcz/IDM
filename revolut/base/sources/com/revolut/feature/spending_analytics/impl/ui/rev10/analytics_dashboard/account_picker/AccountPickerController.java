package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.account_picker;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.account_picker.AccountPickerController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.c;
import h30.l;
import jii.u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nnd.n;
import nnd.p;
import nnd.r;
import nnd.x;
import nnd.y;
import nnd.z;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/account_picker/AccountPickerController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lnnd/r;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountPickerController extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(AccountPickerController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_nextbutton;
    public final h L = s.t(this, a.f);
    public final Object M;
    public final Object N;
    public final RowDelegate O;
    public final FullScreenStateDelegate P;
    public final TabsDelegate Q;
    public final SelectableDelegate R;
    public final Object S;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public AccountPickerController() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: nnd.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountPickerController f217589b;

            {
                this.f217589b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AccountPickerController accountPickerController = this.f217589b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AccountPickerController.T;
                        return (h) ((ppd.e) accountPickerController.N.getValue()).f238397c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountPickerController.T;
                        qji.b bVarU2 = accountPickerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.account_picker.di.AccountPickerControllerInjector");
                        ppd.l lVar = (ppd.l) bVarU2;
                        return new ppd.e(lVar.f238466b, lVar.f238467c);
                    default:
                        KProperty[] kPropertyArr3 = AccountPickerController.T;
                        AccountPickerController accountPickerController2 = this.f217589b;
                        return dli.f.a(accountPickerController2, accountPickerController2.R2(), zhm.v.k(new RowLoadingDelegate(), accountPickerController2.O, accountPickerController2.P, accountPickerController2.Q, accountPickerController2.R), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: nnd.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountPickerController f217589b;

            {
                this.f217589b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AccountPickerController accountPickerController = this.f217589b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountPickerController.T;
                        return (h) ((ppd.e) accountPickerController.N.getValue()).f238397c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountPickerController.T;
                        qji.b bVarU2 = accountPickerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.account_picker.di.AccountPickerControllerInjector");
                        ppd.l lVar = (ppd.l) bVarU2;
                        return new ppd.e(lVar.f238466b, lVar.f238467c);
                    default:
                        KProperty[] kPropertyArr3 = AccountPickerController.T;
                        AccountPickerController accountPickerController2 = this.f217589b;
                        return dli.f.a(accountPickerController2, accountPickerController2.R2(), zhm.v.k(new RowLoadingDelegate(), accountPickerController2.O, accountPickerController2.P, accountPickerController2.Q, accountPickerController2.R), 0, null, null, null, 60);
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.O = rowDelegate;
        this.P = new FullScreenStateDelegate();
        this.Q = new TabsDelegate();
        this.R = new SelectableDelegate(rowDelegate);
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: nnd.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountPickerController f217589b;

            {
                this.f217589b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AccountPickerController accountPickerController = this.f217589b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountPickerController.T;
                        return (h) ((ppd.e) accountPickerController.N.getValue()).f238397c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountPickerController.T;
                        qji.b bVarU2 = accountPickerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.account_picker.di.AccountPickerControllerInjector");
                        ppd.l lVar = (ppd.l) bVarU2;
                        return new ppd.e(lVar.f238466b, lVar.f238467c);
                    default:
                        KProperty[] kPropertyArr3 = AccountPickerController.T;
                        AccountPickerController accountPickerController2 = this.f217589b;
                        return dli.f.a(accountPickerController2, accountPickerController2.R2(), zhm.v.k(new RowLoadingDelegate(), accountPickerController2.O, accountPickerController2.P, accountPickerController2.Q, accountPickerController2.R), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174565c.setMenuItems(v.l(uiState.f217583b));
        LargeActionButton largeActionButton = d3().f174564b;
        nnd.q qVar2 = uiState.f217584c;
        if (qVar2 instanceof n) {
            largeActionButton.setEnabled(false);
            largeActionButton.setVisibility(0);
            l.A(R.string.common_action_apply, null, null, 14, largeActionButton);
        } else if (qVar2 instanceof nnd.o) {
            largeActionButton.setEnabled(true);
            largeActionButton.setVisibility(0);
            largeActionButton.setText(new TextLocalisedClause(R$string.analytics_account_selection_footer_cta, zhm.u.c(new NumberClause(((nnd.o) qVar2).f217574a, (NumberClause.Format.Compact) null, (Custom) null, 6)), null, 12));
        } else {
            if (!(qVar2 instanceof p)) {
                throw new NoWhenBranchMatchedException();
            }
            largeActionButton.setVisibility(8);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ppd.e) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.analytics_account_picker_accounts, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.analytics_account_picker_accounts, null, null, 14));
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new nnd.u(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.o.f57403b), null, new nnd.v(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new njj.n(rd0.e.b(this.P.f52371h.f121375b), 7), null, new nnd.w(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f53515c.f121375b), null, new nnd.v(this, continuation, 1), 3);
        RowDelegate rowDelegate = this.O;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.k), null, new x(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new y(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.r()), null, new z(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new nnd.u(this, continuation, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final nnd.h R2() {
        return (nnd.h) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getY() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.S.getValue();
    }
}
