package com.revolut.feature.trading.managed_portfolios.impl.ui.details.managed_portfolio_benchmark;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.managed_portfolio_benchmark.ManagedPortfolioBenchmarkScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.managed_portfolio_benchmark.ManagedPortfolioBenchmarkScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import w5f.m;
import x6f.b;
import x6f.h;
import x6f.i;
import x6f.j;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/managed_portfolio_benchmark/ManagedPortfolioBenchmarkScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lx6f/h;", "Ldli/a;", "Lx6f/j;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ManagedPortfolioBenchmarkScreen extends ViewController<h> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ManagedPortfolioBenchmarkScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final ManagedPortfolioBenchmarkScreenContract$InputData K;
    public final int L;
    public final RowDelegate M;
    public final TextDelegate N;
    public final Object O;
    public final ao.h P;
    public final Object Q;
    public final Object R;

    public ManagedPortfolioBenchmarkScreen(ManagedPortfolioBenchmarkScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_bottom_sheet_base;
        this.M = new RowDelegate(null, null, 7);
        this.N = new TextDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: x6f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfolioBenchmarkScreen f303085b;

            {
                this.f303085b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ManagedPortfolioBenchmarkScreen managedPortfolioBenchmarkScreen = this.f303085b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ManagedPortfolioBenchmarkScreen.S;
                        ManagedPortfolioBenchmarkScreen managedPortfolioBenchmarkScreen2 = this.f303085b;
                        return dli.f.a(managedPortfolioBenchmarkScreen2, (i) managedPortfolioBenchmarkScreen2.R.getValue(), v.k(managedPortfolioBenchmarkScreen2.M, new RowLoadingDelegate(), new FullScreenStateDelegate(), managedPortfolioBenchmarkScreen2.N), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ManagedPortfolioBenchmarkScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(managedPortfolioBenchmarkScreen.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).f295201s;
                        ManagedPortfolioBenchmarkScreenContract$InputData managedPortfolioBenchmarkScreenContract$InputData = managedPortfolioBenchmarkScreen.K;
                        managedPortfolioBenchmarkScreenContract$InputData.getClass();
                        return new w5f.e(mVar, managedPortfolioBenchmarkScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ManagedPortfolioBenchmarkScreen.S;
                        return (i) ((w5f.e) managedPortfolioBenchmarkScreen.Q.getValue()).f295134b.get();
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: x6f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfolioBenchmarkScreen f303085b;

            {
                this.f303085b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ManagedPortfolioBenchmarkScreen managedPortfolioBenchmarkScreen = this.f303085b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ManagedPortfolioBenchmarkScreen.S;
                        ManagedPortfolioBenchmarkScreen managedPortfolioBenchmarkScreen2 = this.f303085b;
                        return dli.f.a(managedPortfolioBenchmarkScreen2, (i) managedPortfolioBenchmarkScreen2.R.getValue(), v.k(managedPortfolioBenchmarkScreen2.M, new RowLoadingDelegate(), new FullScreenStateDelegate(), managedPortfolioBenchmarkScreen2.N), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ManagedPortfolioBenchmarkScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(managedPortfolioBenchmarkScreen.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).f295201s;
                        ManagedPortfolioBenchmarkScreenContract$InputData managedPortfolioBenchmarkScreenContract$InputData = managedPortfolioBenchmarkScreen.K;
                        managedPortfolioBenchmarkScreenContract$InputData.getClass();
                        return new w5f.e(mVar, managedPortfolioBenchmarkScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ManagedPortfolioBenchmarkScreen.S;
                        return (i) ((w5f.e) managedPortfolioBenchmarkScreen.Q.getValue()).f295134b.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: x6f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfolioBenchmarkScreen f303085b;

            {
                this.f303085b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ManagedPortfolioBenchmarkScreen managedPortfolioBenchmarkScreen = this.f303085b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ManagedPortfolioBenchmarkScreen.S;
                        ManagedPortfolioBenchmarkScreen managedPortfolioBenchmarkScreen2 = this.f303085b;
                        return dli.f.a(managedPortfolioBenchmarkScreen2, (i) managedPortfolioBenchmarkScreen2.R.getValue(), v.k(managedPortfolioBenchmarkScreen2.M, new RowLoadingDelegate(), new FullScreenStateDelegate(), managedPortfolioBenchmarkScreen2.N), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ManagedPortfolioBenchmarkScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(managedPortfolioBenchmarkScreen.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).f295201s;
                        ManagedPortfolioBenchmarkScreenContract$InputData managedPortfolioBenchmarkScreenContract$InputData = managedPortfolioBenchmarkScreen.K;
                        managedPortfolioBenchmarkScreenContract$InputData.getClass();
                        return new w5f.e(mVar, managedPortfolioBenchmarkScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ManagedPortfolioBenchmarkScreen.S;
                        return (i) ((w5f.e) managedPortfolioBenchmarkScreen.Q.getValue()).f295134b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (w5f.e) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (i) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = S;
        KProperty kProperty = kPropertyArr[0];
        ao.h hVar = this.P;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((jii.e) value).f174514c.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.managed_portfolios_template_details_benchmarks_title, null, null, 14), null, null, null, false, 30));
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ScreenContentRecyclerView bottomSheetControllerBaseRecyclerView = ((jii.e) value2).d;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseRecyclerView, "bottomSheetControllerBaseRecyclerView");
        bottomSheetControllerBaseRecyclerView.setVisibility(0);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, new wvl.b(rd0.e.b(this.M.f53218h), 19), null, new x6f.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new wvl.b(rd0.e.b(this.N.d), 18), null, new x6f.e(this, null, 1), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
