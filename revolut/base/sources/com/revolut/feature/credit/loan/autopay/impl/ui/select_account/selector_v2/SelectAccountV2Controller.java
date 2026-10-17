package com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.loan.autopay.api.account_selector.AccountSelectorV2$InputData;
import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.SelectAccountV2Controller;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import in0.g;
import iug.j;
import j3c.y;
import j45.c;
import j45.f;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import te0.w;
import vc.s;
import xki.e;
import z35.d;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/loan/autopay/impl/ui/select_account/selector_v2/SelectAccountV2Controller;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lv35/b;", "Ldli/a;", "Lj45/g;", "Lno/k;", "Lin0/g;", "feature_credit_loan_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectAccountV2Controller extends ViewController<v35.b> implements dli.a, k, g {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(SelectAccountV2Controller.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final AccountSelectorV2$InputData K;
    public AnalyticsContext L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public SelectAccountV2Controller(AccountSelectorV2$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = inputData.f70288h;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        this.N = s.t(this, j45.b.f);
        this.O = w.y0(new y(5));
        this.P = w.y0(new y(6));
        this.Q = w.y0(new y(7));
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: j45.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectAccountV2Controller f171294b;

            {
                this.f171294b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SelectAccountV2Controller selectAccountV2Controller = this.f171294b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SelectAccountV2Controller.U;
                        phm.a aVar = (phm.a) ue0.e.j(selectAccountV2Controller.m2()).a().get(z35.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z35.c.class, " is not found"));
                        }
                        z35.c cVar = ((z35.c) aVar2.b()).f319171j;
                        AccountSelectorV2$InputData accountSelectorV2$InputData = selectAccountV2Controller.K;
                        accountSelectorV2$InputData.getClass();
                        return new z35.d(cVar, accountSelectorV2$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SelectAccountV2Controller.U;
                        return (f) ((z35.d) selectAccountV2Controller.R.getValue()).f319176c.get();
                    default:
                        KProperty[] kPropertyArr3 = SelectAccountV2Controller.U;
                        SelectAccountV2Controller selectAccountV2Controller2 = this.f171294b;
                        return dli.f.a(selectAccountV2Controller2, selectAccountV2Controller2.R2(), v.k(new RowLoadingDelegate(), (ListSubheaderDelegate) selectAccountV2Controller2.Q.getValue(), (FullScreenStateDelegate) selectAccountV2Controller2.P.getValue(), (RowDelegate) selectAccountV2Controller2.O.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: j45.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectAccountV2Controller f171294b;

            {
                this.f171294b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SelectAccountV2Controller selectAccountV2Controller = this.f171294b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SelectAccountV2Controller.U;
                        phm.a aVar = (phm.a) ue0.e.j(selectAccountV2Controller.m2()).a().get(z35.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z35.c.class, " is not found"));
                        }
                        z35.c cVar = ((z35.c) aVar2.b()).f319171j;
                        AccountSelectorV2$InputData accountSelectorV2$InputData = selectAccountV2Controller.K;
                        accountSelectorV2$InputData.getClass();
                        return new z35.d(cVar, accountSelectorV2$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SelectAccountV2Controller.U;
                        return (f) ((z35.d) selectAccountV2Controller.R.getValue()).f319176c.get();
                    default:
                        KProperty[] kPropertyArr3 = SelectAccountV2Controller.U;
                        SelectAccountV2Controller selectAccountV2Controller2 = this.f171294b;
                        return dli.f.a(selectAccountV2Controller2, selectAccountV2Controller2.R2(), v.k(new RowLoadingDelegate(), (ListSubheaderDelegate) selectAccountV2Controller2.Q.getValue(), (FullScreenStateDelegate) selectAccountV2Controller2.P.getValue(), (RowDelegate) selectAccountV2Controller2.O.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: j45.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectAccountV2Controller f171294b;

            {
                this.f171294b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SelectAccountV2Controller selectAccountV2Controller = this.f171294b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SelectAccountV2Controller.U;
                        phm.a aVar = (phm.a) ue0.e.j(selectAccountV2Controller.m2()).a().get(z35.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z35.c.class, " is not found"));
                        }
                        z35.c cVar = ((z35.c) aVar2.b()).f319171j;
                        AccountSelectorV2$InputData accountSelectorV2$InputData = selectAccountV2Controller.K;
                        accountSelectorV2$InputData.getClass();
                        return new z35.d(cVar, accountSelectorV2$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SelectAccountV2Controller.U;
                        return (f) ((z35.d) selectAccountV2Controller.R.getValue()).f319176c.get();
                    default:
                        KProperty[] kPropertyArr3 = SelectAccountV2Controller.U;
                        SelectAccountV2Controller selectAccountV2Controller2 = this.f171294b;
                        return dli.f.a(selectAccountV2Controller2, selectAccountV2Controller2.R2(), v.k(new RowLoadingDelegate(), (ListSubheaderDelegate) selectAccountV2Controller2.Q.getValue(), (FullScreenStateDelegate) selectAccountV2Controller2.P.getValue(), (RowDelegate) selectAccountV2Controller2.O.getValue()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j45.g uiState = (j45.g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
        navBarWithToolbar.j0(false);
        navBarWithToolbar.setToolbarTitle(uiState.f171297a);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setVisibility(uiState.d ? 0 : 8);
        largeActionButton.setEnabled(uiState.f171299c);
        largeActionButton.setText(uiState.f171298b);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.L = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.R.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.L;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r87 = this.O;
        ViewController.P2(this, vkm.q.J(rd0.e.b(((RowDelegate) r87.getValue()).f53218h), rd0.e.b(((ListSubheaderDelegate) this.Q.getValue()).f52707c), rd0.e.b(((FullScreenStateDelegate) this.P.getValue()).f52371h.f121375b)), new j(this, (Continuation) null, 20), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) r87.getValue()).k), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new j45.d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new j45.d(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f R2() {
        return (f) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return this.K.d;
    }
}
