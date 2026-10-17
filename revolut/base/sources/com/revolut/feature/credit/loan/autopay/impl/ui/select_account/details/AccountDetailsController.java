package com.revolut.feature.credit.loan.autopay.impl.ui.select_account.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.details.AccountDetailsController;
import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.details.AccountDetailsControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import g45.b;
import g45.d;
import in0.g;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/loan/autopay/impl/ui/select_account/details/AccountDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lg45/d;", "Lno/k;", "Lin0/g;", "feature_credit_loan_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountDetailsController extends ViewController<q> implements a, k, g {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AccountDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final AccountDetailsControllerContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public AnalyticsContext Q;

    public AccountDetailsController(AccountDetailsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: g45.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountDetailsController f140337b;

            {
                this.f140337b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AccountDetailsController accountDetailsController = this.f140337b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AccountDetailsController.R;
                        phm.a aVar = (phm.a) ue0.e.j(accountDetailsController.m2()).a().get(z35.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z35.c.class, " is not found"));
                        }
                        z35.c cVar = ((z35.c) aVar2.b()).f319171j;
                        AccountDetailsControllerContract$InputData accountDetailsControllerContract$InputData = accountDetailsController.K;
                        accountDetailsControllerContract$InputData.getClass();
                        return new z35.a(cVar, accountDetailsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountDetailsController.R;
                        return (e) ((z35.a) accountDetailsController.N.getValue()).f319163c.get();
                    default:
                        KProperty[] kPropertyArr3 = AccountDetailsController.R;
                        AccountDetailsController accountDetailsController2 = this.f140337b;
                        return dli.f.a(accountDetailsController2, (e) accountDetailsController2.O.getValue(), v.k(new CellDetailsDelegate(), new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: g45.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountDetailsController f140337b;

            {
                this.f140337b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AccountDetailsController accountDetailsController = this.f140337b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountDetailsController.R;
                        phm.a aVar = (phm.a) ue0.e.j(accountDetailsController.m2()).a().get(z35.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z35.c.class, " is not found"));
                        }
                        z35.c cVar = ((z35.c) aVar2.b()).f319171j;
                        AccountDetailsControllerContract$InputData accountDetailsControllerContract$InputData = accountDetailsController.K;
                        accountDetailsControllerContract$InputData.getClass();
                        return new z35.a(cVar, accountDetailsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountDetailsController.R;
                        return (e) ((z35.a) accountDetailsController.N.getValue()).f319163c.get();
                    default:
                        KProperty[] kPropertyArr3 = AccountDetailsController.R;
                        AccountDetailsController accountDetailsController2 = this.f140337b;
                        return dli.f.a(accountDetailsController2, (e) accountDetailsController2.O.getValue(), v.k(new CellDetailsDelegate(), new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: g45.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountDetailsController f140337b;

            {
                this.f140337b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AccountDetailsController accountDetailsController = this.f140337b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountDetailsController.R;
                        phm.a aVar = (phm.a) ue0.e.j(accountDetailsController.m2()).a().get(z35.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z35.c.class, " is not found"));
                        }
                        z35.c cVar = ((z35.c) aVar2.b()).f319171j;
                        AccountDetailsControllerContract$InputData accountDetailsControllerContract$InputData = accountDetailsController.K;
                        accountDetailsControllerContract$InputData.getClass();
                        return new z35.a(cVar, accountDetailsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountDetailsController.R;
                        return (e) ((z35.a) accountDetailsController.N.getValue()).f319163c.get();
                    default:
                        KProperty[] kPropertyArr3 = AccountDetailsController.R;
                        AccountDetailsController accountDetailsController2 = this.f140337b;
                        return dli.f.a(accountDetailsController2, (e) accountDetailsController2.O.getValue(), v.k(new CellDetailsDelegate(), new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.Q = inputData.d;
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f140339a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        Clause clause = uiState.f140340b;
        if (clause != null) {
            navBarWithToolbar.setSecondDescriptionVisible(true);
            navBarWithToolbar.setSecondDescriptionText(clause);
        }
        navBarWithToolbar.setEndImage(uiState.f140341c);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.Q = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z35.a) this.N.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getQ() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g45.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new ft.d(this, null, 22), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return this.K.e;
    }
}
