package com.revolut.retail.feature.payments.bank_transfer.impl.comparison.ui;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$string;
import com.revolut.retail.feature.payments.bank_transfer.impl.comparison.ui.PriceComparisonScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.comparison.ui.PriceComparisonScreenContract$InputData;
import dli.c;
import hwi.l0;
import i13.d;
import i2k.i;
import i2k.j;
import i2k.l;
import i2k.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p2k.d0;
import p2k.o;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/comparison/ui/PriceComparisonScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Li2k/m;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PriceComparisonScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PriceComparisonScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final PriceComparisonScreenContract$InputData K;
    public final RowDelegate L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public PriceComparisonScreen(PriceComparisonScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new RowDelegate(null, null, 7);
        this.M = R$layout.screen_recycler_navbar;
        this.N = s.t(this, i2k.h.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: i2k.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PriceComparisonScreen f157996b;

            {
                this.f157996b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PriceComparisonScreen priceComparisonScreen = this.f157996b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PriceComparisonScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(priceComparisonScreen.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        p2k.n nVar = ((p2k.n) aVar2.b()).f232406h0;
                        PriceComparisonScreenContract$InputData priceComparisonScreenContract$InputData = priceComparisonScreen.K;
                        priceComparisonScreenContract$InputData.getClass();
                        return new o(nVar, priceComparisonScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PriceComparisonScreen.R;
                        return (l) ((o) priceComparisonScreen.O.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = PriceComparisonScreen.R;
                        PriceComparisonScreen priceComparisonScreen2 = this.f157996b;
                        return dli.f.a(priceComparisonScreen2, (l) priceComparisonScreen2.P.getValue(), v.k(priceComparisonScreen2.L, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: i2k.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PriceComparisonScreen f157996b;

            {
                this.f157996b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PriceComparisonScreen priceComparisonScreen = this.f157996b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PriceComparisonScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(priceComparisonScreen.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        p2k.n nVar = ((p2k.n) aVar2.b()).f232406h0;
                        PriceComparisonScreenContract$InputData priceComparisonScreenContract$InputData = priceComparisonScreen.K;
                        priceComparisonScreenContract$InputData.getClass();
                        return new o(nVar, priceComparisonScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PriceComparisonScreen.R;
                        return (l) ((o) priceComparisonScreen.O.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = PriceComparisonScreen.R;
                        PriceComparisonScreen priceComparisonScreen2 = this.f157996b;
                        return dli.f.a(priceComparisonScreen2, (l) priceComparisonScreen2.P.getValue(), v.k(priceComparisonScreen2.L, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: i2k.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PriceComparisonScreen f157996b;

            {
                this.f157996b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PriceComparisonScreen priceComparisonScreen = this.f157996b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PriceComparisonScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(priceComparisonScreen.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        p2k.n nVar = ((p2k.n) aVar2.b()).f232406h0;
                        PriceComparisonScreenContract$InputData priceComparisonScreenContract$InputData = priceComparisonScreen.K;
                        priceComparisonScreenContract$InputData.getClass();
                        return new o(nVar, priceComparisonScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PriceComparisonScreen.R;
                        return (l) ((o) priceComparisonScreen.O.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = PriceComparisonScreen.R;
                        PriceComparisonScreen priceComparisonScreen2 = this.f157996b;
                        return dli.f.a(priceComparisonScreen2, (l) priceComparisonScreen2.P.getValue(), v.k(priceComparisonScreen2.L, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Clause clause = uiState.f158000b;
        navBarWithToolbar.setDescriptionVisible(clause != null);
        d3().f174539b.setDescriptionText(clause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (l) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.remittance_price_comparison_screen_title, null, null, 14), null);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new l0(this, null, 10), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.p0()), new d(this, (Continuation) null, 5), 3);
        RowDelegate rowDelegate = this.L;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53224q), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new j(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
