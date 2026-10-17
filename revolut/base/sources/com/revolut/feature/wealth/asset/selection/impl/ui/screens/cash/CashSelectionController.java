package com.revolut.feature.wealth.asset.selection.impl.ui.screens.cash;

import aii.q;
import android.view.View;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.wealth.asset.selection.impl.ui.screens.cash.CashSelectionController;
import com.revolut.feature.wealth.asset.selection.impl.ui.screens.cash.CashSelectionControllerContract$InputData;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import d2h.c;
import dli.a;
import i2h.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/asset/selection/impl/ui/screens/cash/CashSelectionController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Li2h/g;", "feature_wealth_asset_selection_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CashSelectionController extends ViewController<q> implements a {
    public final CashSelectionControllerContract$InputData K;
    public final RowDelegate L;
    public final SelectableDelegate M;
    public final Object N;
    public final Object O;
    public final int P;
    public final Object Q;

    public CashSelectionController(CashSelectionControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.L = rowDelegate;
        this.M = new SelectableDelegate(rowDelegate);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: i2h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashSelectionController f157931b;

            {
                this.f157931b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CashSelectionController cashSelectionController = this.f157931b;
                switch (i2) {
                    case 0:
                        qji.b bVarU2 = cashSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.asset.selection.impl.ui.screens.cash.di.CashSelectionControllerComponentInjector");
                        d2h.a aVar = (d2h.a) bVarU2;
                        d2h.e eVar = aVar.f110833b;
                        d2h.a aVar2 = aVar.f110834c;
                        CashSelectionControllerContract$InputData cashSelectionControllerContract$InputData = cashSelectionController.K;
                        cashSelectionControllerContract$InputData.getClass();
                        return new d2h.c(eVar, aVar2, cashSelectionControllerContract$InputData);
                    case 1:
                        return (e) ((d2h.c) cashSelectionController.N.getValue()).f110839b.get();
                    default:
                        CashSelectionController cashSelectionController2 = this.f157931b;
                        return dli.f.a(cashSelectionController2, (e) cashSelectionController2.O.getValue(), v.k(cashSelectionController2.L, cashSelectionController2.M, new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: i2h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashSelectionController f157931b;

            {
                this.f157931b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CashSelectionController cashSelectionController = this.f157931b;
                switch (i22) {
                    case 0:
                        qji.b bVarU2 = cashSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.asset.selection.impl.ui.screens.cash.di.CashSelectionControllerComponentInjector");
                        d2h.a aVar = (d2h.a) bVarU2;
                        d2h.e eVar = aVar.f110833b;
                        d2h.a aVar2 = aVar.f110834c;
                        CashSelectionControllerContract$InputData cashSelectionControllerContract$InputData = cashSelectionController.K;
                        cashSelectionControllerContract$InputData.getClass();
                        return new d2h.c(eVar, aVar2, cashSelectionControllerContract$InputData);
                    case 1:
                        return (e) ((d2h.c) cashSelectionController.N.getValue()).f110839b.get();
                    default:
                        CashSelectionController cashSelectionController2 = this.f157931b;
                        return dli.f.a(cashSelectionController2, (e) cashSelectionController2.O.getValue(), v.k(cashSelectionController2.L, cashSelectionController2.M, new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.P = R$layout.screen_recycler_view;
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: i2h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashSelectionController f157931b;

            {
                this.f157931b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CashSelectionController cashSelectionController = this.f157931b;
                switch (i22) {
                    case 0:
                        qji.b bVarU2 = cashSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.asset.selection.impl.ui.screens.cash.di.CashSelectionControllerComponentInjector");
                        d2h.a aVar = (d2h.a) bVarU2;
                        d2h.e eVar = aVar.f110833b;
                        d2h.a aVar2 = aVar.f110834c;
                        CashSelectionControllerContract$InputData cashSelectionControllerContract$InputData = cashSelectionController.K;
                        cashSelectionControllerContract$InputData.getClass();
                        return new d2h.c(eVar, aVar2, cashSelectionControllerContract$InputData);
                    case 1:
                        return (e) ((d2h.c) cashSelectionController.N.getValue()).f110839b.get();
                    default:
                        CashSelectionController cashSelectionController2 = this.f157931b;
                        return dli.f.a(cashSelectionController2, (e) cashSelectionController2.O.getValue(), v.k(cashSelectionController2.L, cashSelectionController2.M, new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
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
        return (c) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (i2h.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.L.f53218h), new i2h.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.r()), new i2h.c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
