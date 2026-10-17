package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.AddEditAssetController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import grd.g;
import grd.l;
import grd.m;
import grd.n;
import grd.p;
import jii.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ppd.f;
import ppd.u0;
import te0.w;
import vc.s;
import yy0.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/AddEditAssetController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgrd/d;", "Ltki/c;", "Lgrd/e;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddEditAssetController extends ViewController<grd.d> implements tki.c {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(AddEditAssetController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final grd.b K;
    public final int L;
    public final h M;
    public final AmountEditDelegate N;
    public final InputTextDelegate O;
    public final RowDelegate P;
    public final TextDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public AddEditAssetController(grd.b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_action_footer;
        this.M = s.t(this, g.f);
        this.N = new AmountEditDelegate(null);
        this.O = new InputTextDelegate(null);
        this.P = new RowDelegate(null, null, 7);
        this.Q = new TextDelegate();
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: grd.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddEditAssetController f145999b;

            {
                this.f145999b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddEditAssetController addEditAssetController = this.f145999b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddEditAssetController.U;
                        qji.b bVarU2 = addEditAssetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.di.AddEditAssetInjector");
                        u0 u0Var = (u0) bVarU2;
                        ppd.n nVar = u0Var.f238558b;
                        u0 u0Var2 = u0Var.f238559c;
                        b bVar = addEditAssetController.K;
                        bVar.getClass();
                        return new ppd.f(nVar, u0Var2, bVar);
                    case 1:
                        KProperty[] kPropertyArr2 = AddEditAssetController.U;
                        return (c) ((ppd.f) addEditAssetController.R.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = AddEditAssetController.U;
                        AddEditAssetController addEditAssetController2 = this.f145999b;
                        return tki.g.a(addEditAssetController2, addEditAssetController2.R2(), zhm.v.k(addEditAssetController2.N, addEditAssetController2.O, addEditAssetController2.P, addEditAssetController2.Q), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: grd.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddEditAssetController f145999b;

            {
                this.f145999b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddEditAssetController addEditAssetController = this.f145999b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddEditAssetController.U;
                        qji.b bVarU2 = addEditAssetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.di.AddEditAssetInjector");
                        u0 u0Var = (u0) bVarU2;
                        ppd.n nVar = u0Var.f238558b;
                        u0 u0Var2 = u0Var.f238559c;
                        b bVar = addEditAssetController.K;
                        bVar.getClass();
                        return new ppd.f(nVar, u0Var2, bVar);
                    case 1:
                        KProperty[] kPropertyArr2 = AddEditAssetController.U;
                        return (c) ((ppd.f) addEditAssetController.R.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = AddEditAssetController.U;
                        AddEditAssetController addEditAssetController2 = this.f145999b;
                        return tki.g.a(addEditAssetController2, addEditAssetController2.R2(), zhm.v.k(addEditAssetController2.N, addEditAssetController2.O, addEditAssetController2.P, addEditAssetController2.Q), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: grd.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddEditAssetController f145999b;

            {
                this.f145999b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddEditAssetController addEditAssetController = this.f145999b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddEditAssetController.U;
                        qji.b bVarU2 = addEditAssetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.di.AddEditAssetInjector");
                        u0 u0Var = (u0) bVarU2;
                        ppd.n nVar = u0Var.f238558b;
                        u0 u0Var2 = u0Var.f238559c;
                        b bVar = addEditAssetController.K;
                        bVar.getClass();
                        return new ppd.f(nVar, u0Var2, bVar);
                    case 1:
                        KProperty[] kPropertyArr2 = AddEditAssetController.U;
                        return (c) ((ppd.f) addEditAssetController.R.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = AddEditAssetController.U;
                        AddEditAssetController addEditAssetController2 = this.f145999b;
                        return tki.g.a(addEditAssetController2, addEditAssetController2.R2(), zhm.v.k(addEditAssetController2.N, addEditAssetController2.O, addEditAssetController2.P, addEditAssetController2.Q), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        grd.e uiState = (grd.e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        TextLocalisedClause textLocalisedClause = uiState.f145996b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setEndImage(new j(uiState.f145997c));
        d3().f174533b.setModel(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174534c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        AmountEditDelegate amountEditDelegate = this.N;
        Continuation continuation = null;
        int i = 1;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(amountEditDelegate.d.f121375b), null, new l(this, continuation, i), 3);
        InputTextDelegate inputTextDelegate = this.O;
        r rVarDistinctUntilChanged = inputTextDelegate.e.f121375b.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarDistinctUntilChanged), null, new grd.o(this, null), 3);
        int i2 = 22;
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(new g9j.q(rd0.e.b(inputTextDelegate.f52575g.f121375b), 21), new g9j.q(rd0.e.b(amountEditDelegate.e.f121375b), i2)), null, new l(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(rd0.e.b(inputTextDelegate.f.f121375b), rd0.e.b(amountEditDelegate.i.f121375b)), null, new l(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.f), null, new gii.b(this, view, continuation, i2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.f58956h), null, new p(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.e), null, new l(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.d), null, new l(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.f59410q), null, new gqh.o(this, continuation, i), 3);
        RowDelegate rowDelegate = this.P;
        com.revolut.kompot.navigable.a.g2(this, new g9j.q(rd0.e.b(rowDelegate.f53225r), 19), null, new m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new g9j.q(rd0.e.b(rowDelegate.f53224q), 20), null, new n(this, null), 3);
    }

    public final k d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final grd.c R2() {
        return (grd.c) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.T.getValue();
    }
}
