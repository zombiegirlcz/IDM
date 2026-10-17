package com.revolut.feature.transfer_reasons.impl.ui.amount_allocation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.transfer_reasons.api.R$string;
import com.revolut.feature.transfer_reasons.impl.ui.amount_allocation.TransferReasonsAmountAllocationScreen;
import com.revolut.feature.transfer_reasons.impl.ui.amount_allocation.TransferReasonsAmountAllocationScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import dt4.p;
import dtf.b;
import dtf.c;
import dtf.f;
import dtf.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.c7;
import nsf.l;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/ui/amount_allocation/TransferReasonsAmountAllocationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldtf/f;", "Ldli/a;", "Ldtf/h;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferReasonsAmountAllocationScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TransferReasonsAmountAllocationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final TransferReasonsAmountAllocationScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public TransferReasonsAmountAllocationScreen(TransferReasonsAmountAllocationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_footer_nextbutton;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: dtf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReasonsAmountAllocationScreen f117441b;

            {
                this.f117441b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i2 = i;
                TransferReasonsAmountAllocationScreen transferReasonsAmountAllocationScreen = this.f117441b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransferReasonsAmountAllocationScreen.S;
                        TransferReasonsAmountAllocationScreen transferReasonsAmountAllocationScreen2 = this.f117441b;
                        return dli.f.a(transferReasonsAmountAllocationScreen2, (g) transferReasonsAmountAllocationScreen2.O.getValue(), u.c((RowDelegate) transferReasonsAmountAllocationScreen2.R.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransferReasonsAmountAllocationScreen.S;
                        qji.b bVarU2 = transferReasonsAmountAllocationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transfer_reasons.impl.ui.amount_allocation.di.TransferReasonsAmountAllocationScreenInjector");
                        nsf.k kVar = (nsf.k) ((etf.a) bVarU2).j().mo3808a(transferReasonsAmountAllocationScreen);
                        TransferReasonsAmountAllocationScreenContract$InputData transferReasonsAmountAllocationScreenContract$InputData = transferReasonsAmountAllocationScreen.K;
                        switch (kVar.f218829a) {
                            case 0:
                                transferReasonsAmountAllocationScreenContract$InputData.getClass();
                                kVar.d = transferReasonsAmountAllocationScreenContract$InputData;
                                break;
                            default:
                                transferReasonsAmountAllocationScreenContract$InputData.getClass();
                                kVar.d = transferReasonsAmountAllocationScreenContract$InputData;
                                break;
                        }
                        return (l) kVar.mo3783build();
                    case 2:
                        KProperty[] kPropertyArr3 = TransferReasonsAmountAllocationScreen.S;
                        l lVar = (l) transferReasonsAmountAllocationScreen.N.getValue();
                        switch (lVar.f218832a) {
                            case 0:
                                return (g) lVar.e.get();
                            default:
                                return (g) lVar.e.get();
                        }
                    case 3:
                        KProperty[] kPropertyArr4 = TransferReasonsAmountAllocationScreen.S;
                        l lVar2 = (l) transferReasonsAmountAllocationScreen.N.getValue();
                        switch (lVar2.f218832a) {
                            case 0:
                                bVarN = lVar2.f218834c.k.n();
                                s.j(bVarN);
                                break;
                            default:
                                bVarN = lVar2.f218834c.k.n();
                                s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr5 = TransferReasonsAmountAllocationScreen.S;
                        return new RowDelegate(new p(transferReasonsAmountAllocationScreen, 2), null, 6);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: dtf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReasonsAmountAllocationScreen f117441b;

            {
                this.f117441b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i22 = i2;
                TransferReasonsAmountAllocationScreen transferReasonsAmountAllocationScreen = this.f117441b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferReasonsAmountAllocationScreen.S;
                        TransferReasonsAmountAllocationScreen transferReasonsAmountAllocationScreen2 = this.f117441b;
                        return dli.f.a(transferReasonsAmountAllocationScreen2, (g) transferReasonsAmountAllocationScreen2.O.getValue(), u.c((RowDelegate) transferReasonsAmountAllocationScreen2.R.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransferReasonsAmountAllocationScreen.S;
                        qji.b bVarU2 = transferReasonsAmountAllocationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transfer_reasons.impl.ui.amount_allocation.di.TransferReasonsAmountAllocationScreenInjector");
                        nsf.k kVar = (nsf.k) ((etf.a) bVarU2).j().mo3808a(transferReasonsAmountAllocationScreen);
                        TransferReasonsAmountAllocationScreenContract$InputData transferReasonsAmountAllocationScreenContract$InputData = transferReasonsAmountAllocationScreen.K;
                        switch (kVar.f218829a) {
                            case 0:
                                transferReasonsAmountAllocationScreenContract$InputData.getClass();
                                kVar.d = transferReasonsAmountAllocationScreenContract$InputData;
                                break;
                            default:
                                transferReasonsAmountAllocationScreenContract$InputData.getClass();
                                kVar.d = transferReasonsAmountAllocationScreenContract$InputData;
                                break;
                        }
                        return (l) kVar.mo3783build();
                    case 2:
                        KProperty[] kPropertyArr3 = TransferReasonsAmountAllocationScreen.S;
                        l lVar = (l) transferReasonsAmountAllocationScreen.N.getValue();
                        switch (lVar.f218832a) {
                            case 0:
                                return (g) lVar.e.get();
                            default:
                                return (g) lVar.e.get();
                        }
                    case 3:
                        KProperty[] kPropertyArr4 = TransferReasonsAmountAllocationScreen.S;
                        l lVar2 = (l) transferReasonsAmountAllocationScreen.N.getValue();
                        switch (lVar2.f218832a) {
                            case 0:
                                bVarN = lVar2.f218834c.k.n();
                                s.j(bVarN);
                                break;
                            default:
                                bVarN = lVar2.f218834c.k.n();
                                s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr5 = TransferReasonsAmountAllocationScreen.S;
                        return new RowDelegate(new p(transferReasonsAmountAllocationScreen, 2), null, 6);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: dtf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReasonsAmountAllocationScreen f117441b;

            {
                this.f117441b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i22 = i3;
                TransferReasonsAmountAllocationScreen transferReasonsAmountAllocationScreen = this.f117441b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferReasonsAmountAllocationScreen.S;
                        TransferReasonsAmountAllocationScreen transferReasonsAmountAllocationScreen2 = this.f117441b;
                        return dli.f.a(transferReasonsAmountAllocationScreen2, (g) transferReasonsAmountAllocationScreen2.O.getValue(), u.c((RowDelegate) transferReasonsAmountAllocationScreen2.R.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransferReasonsAmountAllocationScreen.S;
                        qji.b bVarU2 = transferReasonsAmountAllocationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transfer_reasons.impl.ui.amount_allocation.di.TransferReasonsAmountAllocationScreenInjector");
                        nsf.k kVar = (nsf.k) ((etf.a) bVarU2).j().mo3808a(transferReasonsAmountAllocationScreen);
                        TransferReasonsAmountAllocationScreenContract$InputData transferReasonsAmountAllocationScreenContract$InputData = transferReasonsAmountAllocationScreen.K;
                        switch (kVar.f218829a) {
                            case 0:
                                transferReasonsAmountAllocationScreenContract$InputData.getClass();
                                kVar.d = transferReasonsAmountAllocationScreenContract$InputData;
                                break;
                            default:
                                transferReasonsAmountAllocationScreenContract$InputData.getClass();
                                kVar.d = transferReasonsAmountAllocationScreenContract$InputData;
                                break;
                        }
                        return (l) kVar.mo3783build();
                    case 2:
                        KProperty[] kPropertyArr3 = TransferReasonsAmountAllocationScreen.S;
                        l lVar = (l) transferReasonsAmountAllocationScreen.N.getValue();
                        switch (lVar.f218832a) {
                            case 0:
                                return (g) lVar.e.get();
                            default:
                                return (g) lVar.e.get();
                        }
                    case 3:
                        KProperty[] kPropertyArr4 = TransferReasonsAmountAllocationScreen.S;
                        l lVar2 = (l) transferReasonsAmountAllocationScreen.N.getValue();
                        switch (lVar2.f218832a) {
                            case 0:
                                bVarN = lVar2.f218834c.k.n();
                                s.j(bVarN);
                                break;
                            default:
                                bVarN = lVar2.f218834c.k.n();
                                s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr5 = TransferReasonsAmountAllocationScreen.S;
                        return new RowDelegate(new p(transferReasonsAmountAllocationScreen, 2), null, 6);
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i5 = 3;
        this.Q = w.y0(new Function0(this) { // from class: dtf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReasonsAmountAllocationScreen f117441b;

            {
                this.f117441b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i22 = i5;
                TransferReasonsAmountAllocationScreen transferReasonsAmountAllocationScreen = this.f117441b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferReasonsAmountAllocationScreen.S;
                        TransferReasonsAmountAllocationScreen transferReasonsAmountAllocationScreen2 = this.f117441b;
                        return dli.f.a(transferReasonsAmountAllocationScreen2, (g) transferReasonsAmountAllocationScreen2.O.getValue(), u.c((RowDelegate) transferReasonsAmountAllocationScreen2.R.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransferReasonsAmountAllocationScreen.S;
                        qji.b bVarU2 = transferReasonsAmountAllocationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transfer_reasons.impl.ui.amount_allocation.di.TransferReasonsAmountAllocationScreenInjector");
                        nsf.k kVar = (nsf.k) ((etf.a) bVarU2).j().mo3808a(transferReasonsAmountAllocationScreen);
                        TransferReasonsAmountAllocationScreenContract$InputData transferReasonsAmountAllocationScreenContract$InputData = transferReasonsAmountAllocationScreen.K;
                        switch (kVar.f218829a) {
                            case 0:
                                transferReasonsAmountAllocationScreenContract$InputData.getClass();
                                kVar.d = transferReasonsAmountAllocationScreenContract$InputData;
                                break;
                            default:
                                transferReasonsAmountAllocationScreenContract$InputData.getClass();
                                kVar.d = transferReasonsAmountAllocationScreenContract$InputData;
                                break;
                        }
                        return (l) kVar.mo3783build();
                    case 2:
                        KProperty[] kPropertyArr3 = TransferReasonsAmountAllocationScreen.S;
                        l lVar = (l) transferReasonsAmountAllocationScreen.N.getValue();
                        switch (lVar.f218832a) {
                            case 0:
                                return (g) lVar.e.get();
                            default:
                                return (g) lVar.e.get();
                        }
                    case 3:
                        KProperty[] kPropertyArr4 = TransferReasonsAmountAllocationScreen.S;
                        l lVar2 = (l) transferReasonsAmountAllocationScreen.N.getValue();
                        switch (lVar2.f218832a) {
                            case 0:
                                bVarN = lVar2.f218834c.k.n();
                                s.j(bVarN);
                                break;
                            default:
                                bVarN = lVar2.f218834c.k.n();
                                s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr5 = TransferReasonsAmountAllocationScreen.S;
                        return new RowDelegate(new p(transferReasonsAmountAllocationScreen, 2), null, 6);
                }
            }
        });
        final int i6 = 4;
        this.R = w.y0(new Function0(this) { // from class: dtf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReasonsAmountAllocationScreen f117441b;

            {
                this.f117441b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i22 = i6;
                TransferReasonsAmountAllocationScreen transferReasonsAmountAllocationScreen = this.f117441b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferReasonsAmountAllocationScreen.S;
                        TransferReasonsAmountAllocationScreen transferReasonsAmountAllocationScreen2 = this.f117441b;
                        return dli.f.a(transferReasonsAmountAllocationScreen2, (g) transferReasonsAmountAllocationScreen2.O.getValue(), u.c((RowDelegate) transferReasonsAmountAllocationScreen2.R.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransferReasonsAmountAllocationScreen.S;
                        qji.b bVarU2 = transferReasonsAmountAllocationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transfer_reasons.impl.ui.amount_allocation.di.TransferReasonsAmountAllocationScreenInjector");
                        nsf.k kVar = (nsf.k) ((etf.a) bVarU2).j().mo3808a(transferReasonsAmountAllocationScreen);
                        TransferReasonsAmountAllocationScreenContract$InputData transferReasonsAmountAllocationScreenContract$InputData = transferReasonsAmountAllocationScreen.K;
                        switch (kVar.f218829a) {
                            case 0:
                                transferReasonsAmountAllocationScreenContract$InputData.getClass();
                                kVar.d = transferReasonsAmountAllocationScreenContract$InputData;
                                break;
                            default:
                                transferReasonsAmountAllocationScreenContract$InputData.getClass();
                                kVar.d = transferReasonsAmountAllocationScreenContract$InputData;
                                break;
                        }
                        return (l) kVar.mo3783build();
                    case 2:
                        KProperty[] kPropertyArr3 = TransferReasonsAmountAllocationScreen.S;
                        l lVar = (l) transferReasonsAmountAllocationScreen.N.getValue();
                        switch (lVar.f218832a) {
                            case 0:
                                return (g) lVar.e.get();
                            default:
                                return (g) lVar.e.get();
                        }
                    case 3:
                        KProperty[] kPropertyArr4 = TransferReasonsAmountAllocationScreen.S;
                        l lVar2 = (l) transferReasonsAmountAllocationScreen.N.getValue();
                        switch (lVar2.f218832a) {
                            case 0:
                                bVarN = lVar2.f218834c.k.n();
                                s.j(bVarN);
                                break;
                            default:
                                bVarN = lVar2.f218834c.k.n();
                                s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr5 = TransferReasonsAmountAllocationScreen.S;
                        return new RowDelegate(new p(transferReasonsAmountAllocationScreen, 2), null, 6);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        dtf.h uiState = (dtf.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174557b.setEnabled(uiState.f117448b);
        d3().f174558c.setContent(new c7(uiState.f117449c, false, null, 6));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.transfer_reasons_amount_allocation_title, null, null, 14), null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        h30.l.A(R.string.common_action_continue, null, null, 14, d3().f174557b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174557b.o), null, new c(this, null, 1), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
