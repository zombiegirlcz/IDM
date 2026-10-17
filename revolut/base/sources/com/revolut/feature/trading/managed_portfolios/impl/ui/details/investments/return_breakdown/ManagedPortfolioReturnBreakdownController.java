package com.revolut.feature.trading.managed_portfolios.impl.ui.details.investments.return_breakdown;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.n6;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.investments.return_breakdown.ManagedPortfolioReturnBreakdownController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.investments.return_breakdown.ManagedPortfolioReturnBreakdownControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import w5f.i;
import w5f.m;
import w65.c;
import w6f.b;
import w6f.d;
import wp5.y;
import xki.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/investments/return_breakdown/ManagedPortfolioReturnBreakdownController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lw6f/d;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ManagedPortfolioReturnBreakdownController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(ManagedPortfolioReturnBreakdownController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final ManagedPortfolioReturnBreakdownControllerContract$InputData K;
    public final int L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;

    public ManagedPortfolioReturnBreakdownController(ManagedPortfolioReturnBreakdownControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_bottom_sheet_base;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: w6f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfolioReturnBreakdownController f295433b;

            {
                this.f295433b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ManagedPortfolioReturnBreakdownController managedPortfolioReturnBreakdownController = this.f295433b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ManagedPortfolioReturnBreakdownController.Q;
                        ManagedPortfolioReturnBreakdownController managedPortfolioReturnBreakdownController2 = this.f295433b;
                        return dli.f.a(managedPortfolioReturnBreakdownController2, (e) managedPortfolioReturnBreakdownController2.P.getValue(), y.w(), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ManagedPortfolioReturnBreakdownController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(managedPortfolioReturnBreakdownController.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).f295201s;
                        ManagedPortfolioReturnBreakdownControllerContract$InputData managedPortfolioReturnBreakdownControllerContract$InputData = managedPortfolioReturnBreakdownController.K;
                        managedPortfolioReturnBreakdownControllerContract$InputData.getClass();
                        return new i(mVar, managedPortfolioReturnBreakdownControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ManagedPortfolioReturnBreakdownController.Q;
                        return (e) ((i) managedPortfolioReturnBreakdownController.O.getValue()).f295181c.get();
                }
            }
        });
        this.N = s.t(this, b.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: w6f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfolioReturnBreakdownController f295433b;

            {
                this.f295433b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ManagedPortfolioReturnBreakdownController managedPortfolioReturnBreakdownController = this.f295433b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ManagedPortfolioReturnBreakdownController.Q;
                        ManagedPortfolioReturnBreakdownController managedPortfolioReturnBreakdownController2 = this.f295433b;
                        return dli.f.a(managedPortfolioReturnBreakdownController2, (e) managedPortfolioReturnBreakdownController2.P.getValue(), y.w(), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ManagedPortfolioReturnBreakdownController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(managedPortfolioReturnBreakdownController.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).f295201s;
                        ManagedPortfolioReturnBreakdownControllerContract$InputData managedPortfolioReturnBreakdownControllerContract$InputData = managedPortfolioReturnBreakdownController.K;
                        managedPortfolioReturnBreakdownControllerContract$InputData.getClass();
                        return new i(mVar, managedPortfolioReturnBreakdownControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ManagedPortfolioReturnBreakdownController.Q;
                        return (e) ((i) managedPortfolioReturnBreakdownController.O.getValue()).f295181c.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: w6f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfolioReturnBreakdownController f295433b;

            {
                this.f295433b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ManagedPortfolioReturnBreakdownController managedPortfolioReturnBreakdownController = this.f295433b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ManagedPortfolioReturnBreakdownController.Q;
                        ManagedPortfolioReturnBreakdownController managedPortfolioReturnBreakdownController2 = this.f295433b;
                        return dli.f.a(managedPortfolioReturnBreakdownController2, (e) managedPortfolioReturnBreakdownController2.P.getValue(), y.w(), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ManagedPortfolioReturnBreakdownController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(managedPortfolioReturnBreakdownController.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).f295201s;
                        ManagedPortfolioReturnBreakdownControllerContract$InputData managedPortfolioReturnBreakdownControllerContract$InputData = managedPortfolioReturnBreakdownController.K;
                        managedPortfolioReturnBreakdownControllerContract$InputData.getClass();
                        return new i(mVar, managedPortfolioReturnBreakdownControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ManagedPortfolioReturnBreakdownController.Q;
                        return (e) ((i) managedPortfolioReturnBreakdownController.O.getValue()).f295181c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (w6f.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174514c.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.managed_portfolios_template_details_investment_unrealised_return, null, null, 14), new TextLocalisedClause(R$string.managed_portfolios_template_details_investment_unrealised_return_description, null, null, 14), null, null, false, 28));
        d3().f174513b.setModel(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.managed_portfolios_template_details_investment_return_breakdown_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55));
        ScreenContentRecyclerView bottomSheetControllerBaseRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseRecyclerView, "bottomSheetControllerBaseRecyclerView");
        bottomSheetControllerBaseRecyclerView.setVisibility(0);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174513b.f), null, new c(this, null, 1), 3);
    }

    public final jii.e d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.e) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
