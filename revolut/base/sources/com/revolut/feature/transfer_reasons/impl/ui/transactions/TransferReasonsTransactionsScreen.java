package com.revolut.feature.transfer_reasons.impl.ui.transactions;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.transfer_reasons.api.R$string;
import com.revolut.feature.transfer_reasons.impl.ui.transactions.TransferReasonsTransactionsScreen;
import com.revolut.feature.transfer_reasons.impl.ui.transactions.TransferReasonsTransactionsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pqc.k;
import ptf.b;
import ptf.c;
import ptf.d;
import ptf.f;
import ptf.g;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/ui/transactions/TransferReasonsTransactionsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lptf/f;", "Ldli/a;", "Lptf/h;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferReasonsTransactionsScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TransferReasonsTransactionsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final TransferReasonsTransactionsScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public TransferReasonsTransactionsScreen(TransferReasonsTransactionsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ptf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReasonsTransactionsScreen f239658b;

            {
                this.f239658b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransferReasonsTransactionsScreen transferReasonsTransactionsScreen = this.f239658b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransferReasonsTransactionsScreen.S;
                        TransferReasonsTransactionsScreen transferReasonsTransactionsScreen2 = this.f239658b;
                        return dli.f.a(transferReasonsTransactionsScreen2, transferReasonsTransactionsScreen2.R2(), v.k(new FullScreenStateDelegate(), new PlainTextDelegate(), new RowLoadingDelegate(), (SelectableDelegate) transferReasonsTransactionsScreen2.R.getValue(), (RowDelegate) transferReasonsTransactionsScreen2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransferReasonsTransactionsScreen.S;
                        qji.b bVarU2 = transferReasonsTransactionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transfer_reasons.impl.ui.transactions.di.TransferReasonsTransactionsScreenInjector");
                        nsf.f fVar = (nsf.f) bVarU2;
                        nsf.b bVar = fVar.f218815b;
                        nsf.f fVar2 = fVar.f218816c;
                        TransferReasonsTransactionsScreenContract$InputData transferReasonsTransactionsScreenContract$InputData = transferReasonsTransactionsScreen.K;
                        transferReasonsTransactionsScreenContract$InputData.getClass();
                        return new nsf.h(bVar, fVar2, transferReasonsTransactionsScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = TransferReasonsTransactionsScreen.S;
                        return (g) ((nsf.h) transferReasonsTransactionsScreen.N.getValue()).f218822c.get();
                    default:
                        KProperty[] kPropertyArr4 = TransferReasonsTransactionsScreen.S;
                        return new SelectableDelegate((RowDelegate) transferReasonsTransactionsScreen.Q.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ptf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReasonsTransactionsScreen f239658b;

            {
                this.f239658b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransferReasonsTransactionsScreen transferReasonsTransactionsScreen = this.f239658b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferReasonsTransactionsScreen.S;
                        TransferReasonsTransactionsScreen transferReasonsTransactionsScreen2 = this.f239658b;
                        return dli.f.a(transferReasonsTransactionsScreen2, transferReasonsTransactionsScreen2.R2(), v.k(new FullScreenStateDelegate(), new PlainTextDelegate(), new RowLoadingDelegate(), (SelectableDelegate) transferReasonsTransactionsScreen2.R.getValue(), (RowDelegate) transferReasonsTransactionsScreen2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransferReasonsTransactionsScreen.S;
                        qji.b bVarU2 = transferReasonsTransactionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transfer_reasons.impl.ui.transactions.di.TransferReasonsTransactionsScreenInjector");
                        nsf.f fVar = (nsf.f) bVarU2;
                        nsf.b bVar = fVar.f218815b;
                        nsf.f fVar2 = fVar.f218816c;
                        TransferReasonsTransactionsScreenContract$InputData transferReasonsTransactionsScreenContract$InputData = transferReasonsTransactionsScreen.K;
                        transferReasonsTransactionsScreenContract$InputData.getClass();
                        return new nsf.h(bVar, fVar2, transferReasonsTransactionsScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = TransferReasonsTransactionsScreen.S;
                        return (g) ((nsf.h) transferReasonsTransactionsScreen.N.getValue()).f218822c.get();
                    default:
                        KProperty[] kPropertyArr4 = TransferReasonsTransactionsScreen.S;
                        return new SelectableDelegate((RowDelegate) transferReasonsTransactionsScreen.Q.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: ptf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReasonsTransactionsScreen f239658b;

            {
                this.f239658b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TransferReasonsTransactionsScreen transferReasonsTransactionsScreen = this.f239658b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferReasonsTransactionsScreen.S;
                        TransferReasonsTransactionsScreen transferReasonsTransactionsScreen2 = this.f239658b;
                        return dli.f.a(transferReasonsTransactionsScreen2, transferReasonsTransactionsScreen2.R2(), v.k(new FullScreenStateDelegate(), new PlainTextDelegate(), new RowLoadingDelegate(), (SelectableDelegate) transferReasonsTransactionsScreen2.R.getValue(), (RowDelegate) transferReasonsTransactionsScreen2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransferReasonsTransactionsScreen.S;
                        qji.b bVarU2 = transferReasonsTransactionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transfer_reasons.impl.ui.transactions.di.TransferReasonsTransactionsScreenInjector");
                        nsf.f fVar = (nsf.f) bVarU2;
                        nsf.b bVar = fVar.f218815b;
                        nsf.f fVar2 = fVar.f218816c;
                        TransferReasonsTransactionsScreenContract$InputData transferReasonsTransactionsScreenContract$InputData = transferReasonsTransactionsScreen.K;
                        transferReasonsTransactionsScreenContract$InputData.getClass();
                        return new nsf.h(bVar, fVar2, transferReasonsTransactionsScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = TransferReasonsTransactionsScreen.S;
                        return (g) ((nsf.h) transferReasonsTransactionsScreen.N.getValue()).f218822c.get();
                    default:
                        KProperty[] kPropertyArr4 = TransferReasonsTransactionsScreen.S;
                        return new SelectableDelegate((RowDelegate) transferReasonsTransactionsScreen.Q.getValue());
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = w.y0(new pni.a(12));
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: ptf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReasonsTransactionsScreen f239658b;

            {
                this.f239658b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                TransferReasonsTransactionsScreen transferReasonsTransactionsScreen = this.f239658b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferReasonsTransactionsScreen.S;
                        TransferReasonsTransactionsScreen transferReasonsTransactionsScreen2 = this.f239658b;
                        return dli.f.a(transferReasonsTransactionsScreen2, transferReasonsTransactionsScreen2.R2(), v.k(new FullScreenStateDelegate(), new PlainTextDelegate(), new RowLoadingDelegate(), (SelectableDelegate) transferReasonsTransactionsScreen2.R.getValue(), (RowDelegate) transferReasonsTransactionsScreen2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransferReasonsTransactionsScreen.S;
                        qji.b bVarU2 = transferReasonsTransactionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transfer_reasons.impl.ui.transactions.di.TransferReasonsTransactionsScreenInjector");
                        nsf.f fVar = (nsf.f) bVarU2;
                        nsf.b bVar = fVar.f218815b;
                        nsf.f fVar2 = fVar.f218816c;
                        TransferReasonsTransactionsScreenContract$InputData transferReasonsTransactionsScreenContract$InputData = transferReasonsTransactionsScreen.K;
                        transferReasonsTransactionsScreenContract$InputData.getClass();
                        return new nsf.h(bVar, fVar2, transferReasonsTransactionsScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = TransferReasonsTransactionsScreen.S;
                        return (g) ((nsf.h) transferReasonsTransactionsScreen.N.getValue()).f218822c.get();
                    default:
                        KProperty[] kPropertyArr4 = TransferReasonsTransactionsScreen.S;
                        return new SelectableDelegate((RowDelegate) transferReasonsTransactionsScreen.Q.getValue());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        ptf.h uiState = (ptf.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(uiState.f239665b ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (nsf.h) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.transfer_reasons_refund_transaction_selection_title, null, null, 14), null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHint(new TextLocalisedClause(R.string.common_search, null, null, 14));
        d3().f174564b.setText(new TextLocalisedClause(R$string.transfer_reasons_refund_transaction_selection_action_select, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59409p.f57337m), null, new k(this, null, 12), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SelectableDelegate) this.R.getValue()).r()), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
