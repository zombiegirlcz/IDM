package com.revolut.feature.apm.core.ui.impl.ui.transfer.amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.ui.api.R$id;
import com.revolut.feature.apm.core.ui.api.R$layout;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.c7;
import p12.l0;
import p12.v0;
import t42.d;
import t42.f;
import t42.g;
import t42.k;
import t42.l;
import t42.m;
import t42.n;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/transfer/amount/TransferAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lt42/f;", "Ldli/a;", "Lt42/g;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferAmountScreen extends ViewController<f> implements dli.a {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(TransferAmountScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/core/ui/api/databinding/ScreenTransferAmountBinding;", 0))};
    public final TransferAmountContract$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public qd0.b O;
    public final Object P;
    public final InputTextDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f62433a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f62434b0;

    public TransferAmountScreen(TransferAmountContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transfer_amount;
        this.M = true;
        this.N = s.t(this, k.f);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: t42.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferAmountScreen f267856b;

            {
                this.f267856b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransferAmountScreen transferAmountScreen = this.f267856b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransferAmountScreen.c0;
                        qd0.b bVar = transferAmountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = TransferAmountScreen.c0;
                        TransferAmountScreen transferAmountScreen2 = this.f267856b;
                        return dli.f.a(transferAmountScreen2, transferAmountScreen2.R2(), zhm.v.k(transferAmountScreen2.d3(), transferAmountScreen2.Q, new RowLoadingDelegate(), new SimpleMediaDelegate()), R$id.transferScreenAmount_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = TransferAmountScreen.c0;
                        qji.b bVarU2 = transferAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.di.TransferAmountScreenInjector");
                        l0 l0Var = (l0) bVarU2;
                        p12.v vVar = l0Var.f231717b;
                        l0 l0Var2 = l0Var.f231718c;
                        TransferAmountContract$InputData transferAmountContract$InputData = transferAmountScreen.K;
                        transferAmountContract$InputData.getClass();
                        return new v0(vVar, l0Var2, transferAmountScreen, transferAmountContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = TransferAmountScreen.c0;
                        return (h) ((v0) transferAmountScreen.f62433a0.getValue()).u.get();
                    case 4:
                        KProperty[] kPropertyArr5 = TransferAmountScreen.c0;
                        return new CenteredAmountDelegate(new suf.a(transferAmountScreen, 18));
                    default:
                        KProperty[] kPropertyArr6 = TransferAmountScreen.c0;
                        return new SelectableDelegate((RowDelegate) transferAmountScreen.W.getValue());
                }
            }
        });
        this.Q = new InputTextDelegate(null);
        final int i2 = 4;
        this.R = w.y0(new Function0(this) { // from class: t42.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferAmountScreen f267856b;

            {
                this.f267856b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransferAmountScreen transferAmountScreen = this.f267856b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferAmountScreen.c0;
                        qd0.b bVar = transferAmountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = TransferAmountScreen.c0;
                        TransferAmountScreen transferAmountScreen2 = this.f267856b;
                        return dli.f.a(transferAmountScreen2, transferAmountScreen2.R2(), zhm.v.k(transferAmountScreen2.d3(), transferAmountScreen2.Q, new RowLoadingDelegate(), new SimpleMediaDelegate()), R$id.transferScreenAmount_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = TransferAmountScreen.c0;
                        qji.b bVarU2 = transferAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.di.TransferAmountScreenInjector");
                        l0 l0Var = (l0) bVarU2;
                        p12.v vVar = l0Var.f231717b;
                        l0 l0Var2 = l0Var.f231718c;
                        TransferAmountContract$InputData transferAmountContract$InputData = transferAmountScreen.K;
                        transferAmountContract$InputData.getClass();
                        return new v0(vVar, l0Var2, transferAmountScreen, transferAmountContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = TransferAmountScreen.c0;
                        return (h) ((v0) transferAmountScreen.f62433a0.getValue()).u.get();
                    case 4:
                        KProperty[] kPropertyArr5 = TransferAmountScreen.c0;
                        return new CenteredAmountDelegate(new suf.a(transferAmountScreen, 18));
                    default:
                        KProperty[] kPropertyArr6 = TransferAmountScreen.c0;
                        return new SelectableDelegate((RowDelegate) transferAmountScreen.W.getValue());
                }
            }
        });
        this.S = w.y0(new szl.a(6));
        this.T = w.y0(new szl.a(7));
        this.U = w.y0(new szl.a(8));
        this.V = w.y0(new szl.a(9));
        this.W = w.y0(new szl.a(10));
        final int i3 = 5;
        this.X = w.y0(new Function0(this) { // from class: t42.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferAmountScreen f267856b;

            {
                this.f267856b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TransferAmountScreen transferAmountScreen = this.f267856b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferAmountScreen.c0;
                        qd0.b bVar = transferAmountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = TransferAmountScreen.c0;
                        TransferAmountScreen transferAmountScreen2 = this.f267856b;
                        return dli.f.a(transferAmountScreen2, transferAmountScreen2.R2(), zhm.v.k(transferAmountScreen2.d3(), transferAmountScreen2.Q, new RowLoadingDelegate(), new SimpleMediaDelegate()), R$id.transferScreenAmount_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = TransferAmountScreen.c0;
                        qji.b bVarU2 = transferAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.di.TransferAmountScreenInjector");
                        l0 l0Var = (l0) bVarU2;
                        p12.v vVar = l0Var.f231717b;
                        l0 l0Var2 = l0Var.f231718c;
                        TransferAmountContract$InputData transferAmountContract$InputData = transferAmountScreen.K;
                        transferAmountContract$InputData.getClass();
                        return new v0(vVar, l0Var2, transferAmountScreen, transferAmountContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = TransferAmountScreen.c0;
                        return (h) ((v0) transferAmountScreen.f62433a0.getValue()).u.get();
                    case 4:
                        KProperty[] kPropertyArr5 = TransferAmountScreen.c0;
                        return new CenteredAmountDelegate(new suf.a(transferAmountScreen, 18));
                    default:
                        KProperty[] kPropertyArr6 = TransferAmountScreen.c0;
                        return new SelectableDelegate((RowDelegate) transferAmountScreen.W.getValue());
                }
            }
        });
        this.Y = w.y0(new szl.a(5));
        final int i5 = 1;
        this.Z = w.y0(new Function0(this) { // from class: t42.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferAmountScreen f267856b;

            {
                this.f267856b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                TransferAmountScreen transferAmountScreen = this.f267856b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferAmountScreen.c0;
                        qd0.b bVar = transferAmountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = TransferAmountScreen.c0;
                        TransferAmountScreen transferAmountScreen2 = this.f267856b;
                        return dli.f.a(transferAmountScreen2, transferAmountScreen2.R2(), zhm.v.k(transferAmountScreen2.d3(), transferAmountScreen2.Q, new RowLoadingDelegate(), new SimpleMediaDelegate()), R$id.transferScreenAmount_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = TransferAmountScreen.c0;
                        qji.b bVarU2 = transferAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.di.TransferAmountScreenInjector");
                        l0 l0Var = (l0) bVarU2;
                        p12.v vVar = l0Var.f231717b;
                        l0 l0Var2 = l0Var.f231718c;
                        TransferAmountContract$InputData transferAmountContract$InputData = transferAmountScreen.K;
                        transferAmountContract$InputData.getClass();
                        return new v0(vVar, l0Var2, transferAmountScreen, transferAmountContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = TransferAmountScreen.c0;
                        return (h) ((v0) transferAmountScreen.f62433a0.getValue()).u.get();
                    case 4:
                        KProperty[] kPropertyArr5 = TransferAmountScreen.c0;
                        return new CenteredAmountDelegate(new suf.a(transferAmountScreen, 18));
                    default:
                        KProperty[] kPropertyArr6 = TransferAmountScreen.c0;
                        return new SelectableDelegate((RowDelegate) transferAmountScreen.W.getValue());
                }
            }
        });
        final int i6 = 2;
        this.f62433a0 = w.y0(new Function0(this) { // from class: t42.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferAmountScreen f267856b;

            {
                this.f267856b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                TransferAmountScreen transferAmountScreen = this.f267856b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferAmountScreen.c0;
                        qd0.b bVar = transferAmountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = TransferAmountScreen.c0;
                        TransferAmountScreen transferAmountScreen2 = this.f267856b;
                        return dli.f.a(transferAmountScreen2, transferAmountScreen2.R2(), zhm.v.k(transferAmountScreen2.d3(), transferAmountScreen2.Q, new RowLoadingDelegate(), new SimpleMediaDelegate()), R$id.transferScreenAmount_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = TransferAmountScreen.c0;
                        qji.b bVarU2 = transferAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.di.TransferAmountScreenInjector");
                        l0 l0Var = (l0) bVarU2;
                        p12.v vVar = l0Var.f231717b;
                        l0 l0Var2 = l0Var.f231718c;
                        TransferAmountContract$InputData transferAmountContract$InputData = transferAmountScreen.K;
                        transferAmountContract$InputData.getClass();
                        return new v0(vVar, l0Var2, transferAmountScreen, transferAmountContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = TransferAmountScreen.c0;
                        return (h) ((v0) transferAmountScreen.f62433a0.getValue()).u.get();
                    case 4:
                        KProperty[] kPropertyArr5 = TransferAmountScreen.c0;
                        return new CenteredAmountDelegate(new suf.a(transferAmountScreen, 18));
                    default:
                        KProperty[] kPropertyArr6 = TransferAmountScreen.c0;
                        return new SelectableDelegate((RowDelegate) transferAmountScreen.W.getValue());
                }
            }
        });
        final int i21 = 3;
        this.f62434b0 = w.y0(new Function0(this) { // from class: t42.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferAmountScreen f267856b;

            {
                this.f267856b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                TransferAmountScreen transferAmountScreen = this.f267856b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferAmountScreen.c0;
                        qd0.b bVar = transferAmountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = TransferAmountScreen.c0;
                        TransferAmountScreen transferAmountScreen2 = this.f267856b;
                        return dli.f.a(transferAmountScreen2, transferAmountScreen2.R2(), zhm.v.k(transferAmountScreen2.d3(), transferAmountScreen2.Q, new RowLoadingDelegate(), new SimpleMediaDelegate()), R$id.transferScreenAmount_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = TransferAmountScreen.c0;
                        qji.b bVarU2 = transferAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.di.TransferAmountScreenInjector");
                        l0 l0Var = (l0) bVarU2;
                        p12.v vVar = l0Var.f231717b;
                        l0 l0Var2 = l0Var.f231718c;
                        TransferAmountContract$InputData transferAmountContract$InputData = transferAmountScreen.K;
                        transferAmountContract$InputData.getClass();
                        return new v0(vVar, l0Var2, transferAmountScreen, transferAmountContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = TransferAmountScreen.c0;
                        return (h) ((v0) transferAmountScreen.f62433a0.getValue()).u.get();
                    case 4:
                        KProperty[] kPropertyArr5 = TransferAmountScreen.c0;
                        return new CenteredAmountDelegate(new suf.a(transferAmountScreen, 18));
                    default:
                        KProperty[] kPropertyArr6 = TransferAmountScreen.c0;
                        return new SelectableDelegate((RowDelegate) transferAmountScreen.W.getValue());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        e3().d.setModel(uiState.f267852b);
        LargeActionButton transferScreenAmountSubmitButton = e3().f293623g;
        Intrinsics.checkNotNullExpressionValue(transferScreenAmountSubmitButton, "transferScreenAmountSubmitButton");
        v42.a aVar = uiState.f267853c;
        v42.b.a(transferScreenAmountSubmitButton, aVar.f285929a);
        LargeActionButton transferScreenAmountSettingsButton = e3().f;
        Intrinsics.checkNotNullExpressionValue(transferScreenAmountSettingsButton, "transferScreenAmountSettingsButton");
        v42.b.a(transferScreenAmountSettingsButton, aVar.f285931c);
        LargeActionButton transferScreenAmountDraftButton = e3().f293621b;
        Intrinsics.checkNotNullExpressionValue(transferScreenAmountDraftButton, "transferScreenAmountDraftButton");
        v42.b.a(transferScreenAmountDraftButton, aVar.f285930b);
        LargeActionButton transferScreenAmountScheduleButton = e3().e;
        Intrinsics.checkNotNullExpressionValue(transferScreenAmountScheduleButton, "transferScreenAmountScheduleButton");
        v42.b.a(transferScreenAmountScheduleButton, aVar.d);
        FooterTextView footerTextView = e3().f293622c;
        Clause clause = aVar.e;
        footerTextView.setVisibility(clause != null ? 0 : 8);
        if (clause != null) {
            footerTextView.setContent(new c7(clause, false, null, 6));
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        c cVar = (c) R2();
        cVar.u.Q();
        cVar.C2(d.f267847a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v0) this.f62433a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r06 = this.f62433a0;
        qd0.b bVarN = ((v0) r06.getValue()).f231795b.o.n();
        s.j(bVarN);
        this.O = bVarN;
        pd.b.p(view, this.K.getF62430b());
        ((j60.a) ((v0) r06.getValue()).f231799j.get()).d(v.k((LargeActionButtonDelegate) this.S.getValue(), (CellDetailsDelegate) this.T.getValue(), (CellDetailsActionDelegate) this.U.getValue(), (CellDetailsNoteDelegate) this.V.getValue(), (RowDelegate) this.W.getValue(), (TextDelegate) this.Y.getValue(), (SelectableDelegate) this.X.getValue()));
        e3().d.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().d.f59338a), null, new t42.o(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().d.f59339b), null, new t42.o(this, continuation, 1), 3);
        r rVarMerge = r.merge(e3().f293623g.o.map(new sx4.c(new t3b.g(2), 22)), e3().f.o.map(new sx4.c(new t3b.g(3), 23)), e3().f293621b.o.map(new sx4.c(new t3b.g(4), 24)), e3().e.o.map(new sx4.c(new t3b.g(5), 25)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge), null, new l(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f121375b), null, new l(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(d3().f.f121375b, new t3b.g(6))), null, new l(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, h30.l.y(d3().e.f121375b, d3().f51966j.f121375b, "merge(...)"), null, new m(this, null), 3);
        ihm.f fVar = d3().f51967l.f121375b;
        InputTextDelegate inputTextDelegate = this.Q;
        com.revolut.kompot.navigable.a.g2(this, h30.l.y(fVar, inputTextDelegate.f.f121375b, "merge(...)"), null, new l(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTextDelegate.e.f121375b), null, new n(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final CenteredAmountDelegate d3() {
        return (CenteredAmountDelegate) this.R.getValue();
    }

    public final w02.b e3() {
        ViewBinding value = this.N.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w02.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final t42.h R2() {
        return (t42.h) this.f62434b0.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
