package com.revolut.feature.retail.savings.impl.ui.fund_information;

import aii.q;
import anb.n;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PieChartVerticalLegendDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.impl.ui.fund_information.FundInfoController;
import com.revolut.feature.retail.savings.impl.ui.fund_information.FundInfoControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ec8.c;
import epb.b;
import epb.f;
import epb.g;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import vkm.d;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/ui/fund_information/FundInfoController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lepb/g;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FundInfoController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(FundInfoController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final FundInfoControllerContract$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final RowDelegate Q;
    public final ListSubheaderDelegate R;
    public final TextDelegate S;
    public final PlainTextDelegate T;
    public final Object U;

    public FundInfoController(FundInfoControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = true;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: epb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundInfoController f128131b;

            {
                this.f128131b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FundInfoController fundInfoController = this.f128131b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FundInfoController.V;
                        phm.a aVar = (phm.a) ue0.e.j(fundInfoController.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).F;
                        FundInfoControllerContract$InputData fundInfoControllerContract$InputData = fundInfoController.K;
                        fundInfoControllerContract$InputData.getClass();
                        return new anb.e(nVar, fundInfoControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FundInfoController.V;
                        return (f) ((anb.e) fundInfoController.O.getValue()).f6634c.get();
                    default:
                        KProperty[] kPropertyArr3 = FundInfoController.V;
                        FundInfoController fundInfoController2 = this.f128131b;
                        return dli.f.a(fundInfoController2, (f) fundInfoController2.P.getValue(), v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), fundInfoController2.R, fundInfoController2.Q, new CellDetailsDelegate(), new PieChartVerticalLegendDelegate(), fundInfoController2.T, fundInfoController2.S), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: epb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundInfoController f128131b;

            {
                this.f128131b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FundInfoController fundInfoController = this.f128131b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FundInfoController.V;
                        phm.a aVar = (phm.a) ue0.e.j(fundInfoController.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).F;
                        FundInfoControllerContract$InputData fundInfoControllerContract$InputData = fundInfoController.K;
                        fundInfoControllerContract$InputData.getClass();
                        return new anb.e(nVar, fundInfoControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FundInfoController.V;
                        return (f) ((anb.e) fundInfoController.O.getValue()).f6634c.get();
                    default:
                        KProperty[] kPropertyArr3 = FundInfoController.V;
                        FundInfoController fundInfoController2 = this.f128131b;
                        return dli.f.a(fundInfoController2, (f) fundInfoController2.P.getValue(), v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), fundInfoController2.R, fundInfoController2.Q, new CellDetailsDelegate(), new PieChartVerticalLegendDelegate(), fundInfoController2.T, fundInfoController2.S), 0, null, null, null, 60);
                }
            }
        });
        this.Q = new RowDelegate(null, null, 7);
        this.R = new ListSubheaderDelegate();
        this.S = new TextDelegate();
        this.T = new PlainTextDelegate();
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: epb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundInfoController f128131b;

            {
                this.f128131b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FundInfoController fundInfoController = this.f128131b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FundInfoController.V;
                        phm.a aVar = (phm.a) ue0.e.j(fundInfoController.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).F;
                        FundInfoControllerContract$InputData fundInfoControllerContract$InputData = fundInfoController.K;
                        fundInfoControllerContract$InputData.getClass();
                        return new anb.e(nVar, fundInfoControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FundInfoController.V;
                        return (f) ((anb.e) fundInfoController.O.getValue()).f6634c.get();
                    default:
                        KProperty[] kPropertyArr3 = FundInfoController.V;
                        FundInfoController fundInfoController2 = this.f128131b;
                        return dli.f.a(fundInfoController2, (f) fundInfoController2.P.getValue(), v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), fundInfoController2.R, fundInfoController2.Q, new CellDetailsDelegate(), new PieChartVerticalLegendDelegate(), fundInfoController2.T, fundInfoController2.S), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (anb.e) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174538a.setBackground(null);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.vaults_mmf_information_fund_information_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.vaults_mmf_information_fund_information_title, null, null, 14));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new c(this, null, 20), 3);
        d dVarB = rd0.e.b(this.Q.f53218h);
        ?? r06 = this.P;
        com.revolut.kompot.navigable.a.g2(this, dVarB, null, new epb.c(2, 4, f.class, (f) r06.getValue(), "onRowDelegateClick", "onRowDelegateClick(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f52707c), null, new epb.d(2, 4, f.class, (f) r06.getValue(), "onListSubheaderClick", "onListSubheaderClick(Lcom/revolut/core/ui_kit/delegates/ListSubheaderDelegate$Model;)V"), 3);
    }

    public final m d3() {
        ViewBinding value = this.N.getValue(this, V[0]);
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
        return (dli.c) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
