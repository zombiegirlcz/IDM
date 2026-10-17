package com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.AccountDetailsPaymentController;
import com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.AccountDetailsPaymentControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import j6a.b;
import j6a.c;
import j6a.d;
import j6a.f;
import j6a.i;
import j6a.j;
import j6a.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/ui/screen/move_payment/account_details/AccountDetailsPaymentController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lj6a/i;", "Ldli/a;", "Lj6a/k;", "Lno/m;", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountDetailsPaymentController extends ViewController<i> implements dli.a, m {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(AccountDetailsPaymentController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final AccountDetailsPaymentControllerContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final h M;
    public final CellDetailsAccountDelegate N;
    public final FixedTabsDelegate O;
    public final FullScreenStateDelegate P;
    public final SmallActionButtonDelegate Q;
    public final int R;
    public final Object S;
    public final Object T;
    public final Object U;

    public AccountDetailsPaymentController(AccountDetailsPaymentControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.M = s.t(this, b.f);
        this.N = new CellDetailsAccountDelegate();
        this.O = new FixedTabsDelegate();
        this.P = new FullScreenStateDelegate();
        this.Q = new SmallActionButtonDelegate();
        this.R = R$layout.screen_recycler_navbar_action_footer;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: j6a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountDetailsPaymentController f171698b;

            {
                this.f171698b = this;
            }

            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AccountDetailsPaymentController accountDetailsPaymentController = this.f171698b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AccountDetailsPaymentController.V;
                        phm.a aVar = (phm.a) ue0.e.j(accountDetailsPaymentController.m2()).a().get(u5a.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u5a.j.class, " is not found"));
                        }
                        u5a.f fVar = ((u5a.f) ((u5a.j) aVar2.b())).o;
                        AccountDetailsPaymentControllerContract$InputData accountDetailsPaymentControllerContract$InputData = accountDetailsPaymentController.K;
                        accountDetailsPaymentControllerContract$InputData.getClass();
                        return new u5a.a(fVar, accountDetailsPaymentControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountDetailsPaymentController.V;
                        return (h) ((u5a.a) accountDetailsPaymentController.S.getValue()).f277404c.get();
                    default:
                        KProperty[] kPropertyArr3 = AccountDetailsPaymentController.V;
                        AccountDetailsPaymentController accountDetailsPaymentController2 = this.f171698b;
                        return dli.f.a(accountDetailsPaymentController2, accountDetailsPaymentController2.R2(), v.k(new ActionWidgetLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), accountDetailsPaymentController2.N, accountDetailsPaymentController2.O, accountDetailsPaymentController2.P, accountDetailsPaymentController2.Q), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, new koi.h(null, false, true, 3), null, 40);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: j6a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountDetailsPaymentController f171698b;

            {
                this.f171698b = this;
            }

            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AccountDetailsPaymentController accountDetailsPaymentController = this.f171698b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountDetailsPaymentController.V;
                        phm.a aVar = (phm.a) ue0.e.j(accountDetailsPaymentController.m2()).a().get(u5a.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u5a.j.class, " is not found"));
                        }
                        u5a.f fVar = ((u5a.f) ((u5a.j) aVar2.b())).o;
                        AccountDetailsPaymentControllerContract$InputData accountDetailsPaymentControllerContract$InputData = accountDetailsPaymentController.K;
                        accountDetailsPaymentControllerContract$InputData.getClass();
                        return new u5a.a(fVar, accountDetailsPaymentControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountDetailsPaymentController.V;
                        return (h) ((u5a.a) accountDetailsPaymentController.S.getValue()).f277404c.get();
                    default:
                        KProperty[] kPropertyArr3 = AccountDetailsPaymentController.V;
                        AccountDetailsPaymentController accountDetailsPaymentController2 = this.f171698b;
                        return dli.f.a(accountDetailsPaymentController2, accountDetailsPaymentController2.R2(), v.k(new ActionWidgetLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), accountDetailsPaymentController2.N, accountDetailsPaymentController2.O, accountDetailsPaymentController2.P, accountDetailsPaymentController2.Q), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, new koi.h(null, false, true, 3), null, 40);
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: j6a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountDetailsPaymentController f171698b;

            {
                this.f171698b = this;
            }

            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AccountDetailsPaymentController accountDetailsPaymentController = this.f171698b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountDetailsPaymentController.V;
                        phm.a aVar = (phm.a) ue0.e.j(accountDetailsPaymentController.m2()).a().get(u5a.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u5a.j.class, " is not found"));
                        }
                        u5a.f fVar = ((u5a.f) ((u5a.j) aVar2.b())).o;
                        AccountDetailsPaymentControllerContract$InputData accountDetailsPaymentControllerContract$InputData = accountDetailsPaymentController.K;
                        accountDetailsPaymentControllerContract$InputData.getClass();
                        return new u5a.a(fVar, accountDetailsPaymentControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountDetailsPaymentController.V;
                        return (h) ((u5a.a) accountDetailsPaymentController.S.getValue()).f277404c.get();
                    default:
                        KProperty[] kPropertyArr3 = AccountDetailsPaymentController.V;
                        AccountDetailsPaymentController accountDetailsPaymentController2 = this.f171698b;
                        return dli.f.a(accountDetailsPaymentController2, accountDetailsPaymentController2.R2(), v.k(new ActionWidgetLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), accountDetailsPaymentController2.N, accountDetailsPaymentController2.O, accountDetailsPaymentController2.P, accountDetailsPaymentController2.Q), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, new koi.h(null, false, true, 3), null, 40);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setTitle(uiState.f171707a.f171705a, null);
        j jVar = uiState.f171707a;
        navBarWithToolbar.setToolbarTitle(jVar.f171705a);
        navBarWithToolbar.setNavBarDescriptionModel(jVar.f171706b);
        ActionFooterView actionFooterView = d3().f174533b;
        aw0.i iVar = uiState.f171708b;
        actionFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            actionFooterView.setModel(iVar);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u5a.a) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setTitleAutoSize(false);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174534c.q0.f), new c(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52339c.f121375b), new d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.N.d), new d(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53336c.f121375b), new j6a.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new f(this, null), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.M.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j6a.h R2() {
        return (j6a.h) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
