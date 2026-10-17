package com.revolut.feature.payments.who_to_transfer.impl.transfer.search;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.payments.who_to_transfer.impl.R$id;
import com.revolut.feature.payments.who_to_transfer.impl.R$layout;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.search.PaymentsSearchScreen;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.search.PaymentsSearchScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.payments.core.R$string;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import q1l.e;
import q3d.i;
import q43.m;
import q4a.b;
import q4a.k;
import s3a.r;
import te0.w;
import tki.c;
import vc.s;
import yp0.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/transfer/search/PaymentsSearchScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lq4a/k;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentsSearchScreen extends ViewController<q> implements c {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f80124a0 = {o0.f186429a.j(new h0(PaymentsSearchScreen.class, "binding", "getBinding()Lcom/revolut/feature/payments/who_to_transfer/impl/databinding/ScreenPaymentsSearchBinding;", 0))};
    public final PaymentsSearchScreenContract$InputData K;
    public final boolean L;
    public final int M;
    public final Integer N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final IconDelegate V;
    public final GridBoxDelegate W;
    public final FullScreenStateDelegate X;
    public final Object Y;
    public final Object Z;

    public PaymentsSearchScreen(PaymentsSearchScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = true;
        this.M = R$layout.screen_payments_search;
        this.N = Integer.valueOf(R$style.UiKitTheme_Transparent);
        this.O = s.t(this, b.f);
        final int i = 2;
        this.P = w.y0(new Function0(this) { // from class: q4a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentsSearchScreen f242093b;

            {
                this.f242093b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PaymentsSearchScreen paymentsSearchScreen = this.f242093b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentsSearchScreen.f80124a0;
                        return (h) ((s3a.h) paymentsSearchScreen.P.getValue()).f259519g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentsSearchScreen.f80124a0;
                        PaymentsSearchScreen paymentsSearchScreen2 = this.f242093b;
                        return tki.g.a(paymentsSearchScreen2, paymentsSearchScreen2.R2(), v.k((BannerDelegate) paymentsSearchScreen2.Q.getValue(), (ActionsDelegate) paymentsSearchScreen2.U.getValue(), new ListSubheaderDelegate(), (RowDelegate) paymentsSearchScreen2.R.getValue(), (ScrollerBoxDelegate) paymentsSearchScreen2.T.getValue(), new RowLoadingDelegate(), paymentsSearchScreen2.W, paymentsSearchScreen2.X), R$id.paymentsSearchScreen_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    case 2:
                        KProperty[] kPropertyArr3 = PaymentsSearchScreen.f80124a0;
                        phm.a aVar = (phm.a) ue0.e.j(paymentsSearchScreen.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
                        }
                        s3a.k kVar = ((s3a.k) ((r) aVar2.b())).g0;
                        PaymentsSearchScreenContract$InputData paymentsSearchScreenContract$InputData = paymentsSearchScreen.K;
                        paymentsSearchScreenContract$InputData.getClass();
                        return new s3a.h(kVar, paymentsSearchScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = PaymentsSearchScreen.f80124a0;
                        return new ScrollerBoxDelegate(u.c((ReferralContactDelegate) paymentsSearchScreen.S.getValue()));
                }
            }
        });
        this.Q = w.y0(new e(25));
        this.R = w.y0(new e(26));
        this.S = w.y0(new e(27));
        final int i2 = 3;
        this.T = w.y0(new Function0(this) { // from class: q4a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentsSearchScreen f242093b;

            {
                this.f242093b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PaymentsSearchScreen paymentsSearchScreen = this.f242093b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentsSearchScreen.f80124a0;
                        return (h) ((s3a.h) paymentsSearchScreen.P.getValue()).f259519g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentsSearchScreen.f80124a0;
                        PaymentsSearchScreen paymentsSearchScreen2 = this.f242093b;
                        return tki.g.a(paymentsSearchScreen2, paymentsSearchScreen2.R2(), v.k((BannerDelegate) paymentsSearchScreen2.Q.getValue(), (ActionsDelegate) paymentsSearchScreen2.U.getValue(), new ListSubheaderDelegate(), (RowDelegate) paymentsSearchScreen2.R.getValue(), (ScrollerBoxDelegate) paymentsSearchScreen2.T.getValue(), new RowLoadingDelegate(), paymentsSearchScreen2.W, paymentsSearchScreen2.X), R$id.paymentsSearchScreen_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    case 2:
                        KProperty[] kPropertyArr3 = PaymentsSearchScreen.f80124a0;
                        phm.a aVar = (phm.a) ue0.e.j(paymentsSearchScreen.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
                        }
                        s3a.k kVar = ((s3a.k) ((r) aVar2.b())).g0;
                        PaymentsSearchScreenContract$InputData paymentsSearchScreenContract$InputData = paymentsSearchScreen.K;
                        paymentsSearchScreenContract$InputData.getClass();
                        return new s3a.h(kVar, paymentsSearchScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = PaymentsSearchScreen.f80124a0;
                        return new ScrollerBoxDelegate(u.c((ReferralContactDelegate) paymentsSearchScreen.S.getValue()));
                }
            }
        });
        this.U = w.y0(new e(28));
        IconDelegate iconDelegate = new IconDelegate();
        this.V = iconDelegate;
        this.W = new GridBoxDelegate(u.c(iconDelegate), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
        this.X = new FullScreenStateDelegate();
        final int i3 = 0;
        this.Y = w.y0(new Function0(this) { // from class: q4a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentsSearchScreen f242093b;

            {
                this.f242093b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PaymentsSearchScreen paymentsSearchScreen = this.f242093b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentsSearchScreen.f80124a0;
                        return (h) ((s3a.h) paymentsSearchScreen.P.getValue()).f259519g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentsSearchScreen.f80124a0;
                        PaymentsSearchScreen paymentsSearchScreen2 = this.f242093b;
                        return tki.g.a(paymentsSearchScreen2, paymentsSearchScreen2.R2(), v.k((BannerDelegate) paymentsSearchScreen2.Q.getValue(), (ActionsDelegate) paymentsSearchScreen2.U.getValue(), new ListSubheaderDelegate(), (RowDelegate) paymentsSearchScreen2.R.getValue(), (ScrollerBoxDelegate) paymentsSearchScreen2.T.getValue(), new RowLoadingDelegate(), paymentsSearchScreen2.W, paymentsSearchScreen2.X), R$id.paymentsSearchScreen_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    case 2:
                        KProperty[] kPropertyArr3 = PaymentsSearchScreen.f80124a0;
                        phm.a aVar = (phm.a) ue0.e.j(paymentsSearchScreen.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
                        }
                        s3a.k kVar = ((s3a.k) ((r) aVar2.b())).g0;
                        PaymentsSearchScreenContract$InputData paymentsSearchScreenContract$InputData = paymentsSearchScreen.K;
                        paymentsSearchScreenContract$InputData.getClass();
                        return new s3a.h(kVar, paymentsSearchScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = PaymentsSearchScreen.f80124a0;
                        return new ScrollerBoxDelegate(u.c((ReferralContactDelegate) paymentsSearchScreen.S.getValue()));
                }
            }
        });
        final int i5 = 1;
        this.Z = w.y0(new Function0(this) { // from class: q4a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentsSearchScreen f242093b;

            {
                this.f242093b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PaymentsSearchScreen paymentsSearchScreen = this.f242093b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentsSearchScreen.f80124a0;
                        return (h) ((s3a.h) paymentsSearchScreen.P.getValue()).f259519g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentsSearchScreen.f80124a0;
                        PaymentsSearchScreen paymentsSearchScreen2 = this.f242093b;
                        return tki.g.a(paymentsSearchScreen2, paymentsSearchScreen2.R2(), v.k((BannerDelegate) paymentsSearchScreen2.Q.getValue(), (ActionsDelegate) paymentsSearchScreen2.U.getValue(), new ListSubheaderDelegate(), (RowDelegate) paymentsSearchScreen2.R.getValue(), (ScrollerBoxDelegate) paymentsSearchScreen2.T.getValue(), new RowLoadingDelegate(), paymentsSearchScreen2.W, paymentsSearchScreen2.X), R$id.paymentsSearchScreen_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    case 2:
                        KProperty[] kPropertyArr3 = PaymentsSearchScreen.f80124a0;
                        phm.a aVar = (phm.a) ue0.e.j(paymentsSearchScreen.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
                        }
                        s3a.k kVar = ((s3a.k) ((r) aVar2.b())).g0;
                        PaymentsSearchScreenContract$InputData paymentsSearchScreenContract$InputData = paymentsSearchScreen.K;
                        paymentsSearchScreenContract$InputData.getClass();
                        return new s3a.h(kVar, paymentsSearchScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = PaymentsSearchScreen.f80124a0;
                        return new ScrollerBoxDelegate(u.c((ReferralContactDelegate) paymentsSearchScreen.S.getValue()));
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getN() {
        return this.N;
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f241919b.setSearchFieldActionButtons(uiState.f242108b.f242103a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (s3a.h) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.payments_descriptor_search_title, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f241920c.setItemAnimator(null);
        ScreenContentRecyclerView paymentsSearchScreenRecyclerView = d3().f241920c;
        Intrinsics.checkNotNullExpressionValue(paymentsSearchScreenRecyclerView, "paymentsSearchScreenRecyclerView");
        y.g(paymentsSearchScreenRecyclerView, m2());
        NavBarWithToolbar navBarWithToolbar = d3().f241919b;
        navBarWithToolbar.j0(false);
        navBarWithToolbar.K0(j4.NO_ANIMATION);
        navBarWithToolbar.setHint(new TextLocalisedClause(com.revolut.feature.payments.who_to_transfer.impl.R$string.payments_global_search_bar, null, null, 14));
        navBarWithToolbar.post(new p6.e(navBarWithToolbar, this, 6));
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.w0()), new q4a.c(this, null, 0), 3);
        SearchView searchView = d3().f241919b.f59409p;
        ViewController.P2(this, rd0.e.b(searchView.f57337m), new q4a.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(searchView.f57336l), new m(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(w.a0(((ActionsDelegate) this.U.getValue()).f51611c.f121375b, new i(6))), new q4a.c(this, null, 3), 3);
        efm.r rVarMerge = efm.r.merge(w.a0(((ReferralContactDelegate) this.S.getValue()).q(), new i(7)), w.a0(((RowDelegate) this.R.getValue()).f53218h, new i(8)), w.a0(this.X.f52371h.f121375b, new i(9)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        ViewController.P2(this, rd0.e.b(rVarMerge), new q4a.c(this, null, 4), 3);
        ViewController.P2(this, rd0.e.b(((BannerDelegate) this.Q.getValue()).e), new q4a.e(this, null), 3);
        ViewController.P2(this, new pvk.i(rd0.e.b(this.V.p()), 20), new q4a.c(this, null, 2), 3);
    }

    public final q3a.b d3() {
        ViewBinding value = this.O.getValue(this, f80124a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (q3a.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final q4a.h R2() {
        return (q4a.h) this.Y.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
