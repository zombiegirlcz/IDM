package com.revolut.feature.apm.bills.tapi.impl.screen.transfer.amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.amount.TapiTransferAmountScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import h30.l;
import jii.b0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import org.jetbrains.annotations.NotNull;
import rr1.c;
import te0.w;
import vc.s;
import wr1.b;
import wr1.d;
import wr1.f;
import wr1.k;
import wr1.m;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/apm/bills/tapi/impl/screen/transfer/amount/TapiTransferAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwr1/k;", "Ldli/a;", "Lwr1/m;", "Lno/d1;", "Companion", "a", "feature_apm_bills_tapi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TapiTransferAmountScreen extends ViewController<k> implements a, d1 {
    public final boolean K;
    public final int L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(TapiTransferAmountScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithavatarNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.apm.bills.tapi.impl.screen.transfer.amount.TapiTransferAmountScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public TapiTransferAmountScreen(TapiTransferAmountScreenContract$Input inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = true;
        this.L = R$layout.screen_recycler_navbarwithavatar_nextbutton;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: wr1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TapiTransferAmountScreen f299485b;

            {
                this.f299485b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TapiTransferAmountScreen tapiTransferAmountScreen = this.f299485b;
                switch (i2) {
                    case 0:
                        TapiTransferAmountScreen.Companion companion = TapiTransferAmountScreen.INSTANCE;
                        return (l) ((rr1.c) tapiTransferAmountScreen.P.getValue()).f.get();
                    case 1:
                        TapiTransferAmountScreen.Companion companion2 = TapiTransferAmountScreen.INSTANCE;
                        TapiTransferAmountScreen tapiTransferAmountScreen2 = this.f299485b;
                        return dli.f.a(tapiTransferAmountScreen2, tapiTransferAmountScreen2.R2(), v.k((CenteredAmountDelegate) tapiTransferAmountScreen2.U.getValue(), (InputTextDelegate) tapiTransferAmountScreen2.T.getValue(), (RowLoadingDelegate) tapiTransferAmountScreen2.V.getValue(), (TextDelegate) tapiTransferAmountScreen2.S.getValue(), (LargeActionButtonDelegate) tapiTransferAmountScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        TapiTransferAmountScreen.Companion companion3 = TapiTransferAmountScreen.INSTANCE;
                        qd0.b bVarN = ((rr1.c) tapiTransferAmountScreen.P.getValue()).f256644b.f256633c.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        TapiTransferAmountScreen.Companion companion4 = TapiTransferAmountScreen.INSTANCE;
                        return new CenteredAmountDelegate(new wde.f(tapiTransferAmountScreen, 27));
                }
            }
        });
        this.N = s.t(this, b.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: wr1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TapiTransferAmountScreen f299485b;

            {
                this.f299485b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TapiTransferAmountScreen tapiTransferAmountScreen = this.f299485b;
                switch (i22) {
                    case 0:
                        TapiTransferAmountScreen.Companion companion = TapiTransferAmountScreen.INSTANCE;
                        return (l) ((rr1.c) tapiTransferAmountScreen.P.getValue()).f.get();
                    case 1:
                        TapiTransferAmountScreen.Companion companion2 = TapiTransferAmountScreen.INSTANCE;
                        TapiTransferAmountScreen tapiTransferAmountScreen2 = this.f299485b;
                        return dli.f.a(tapiTransferAmountScreen2, tapiTransferAmountScreen2.R2(), v.k((CenteredAmountDelegate) tapiTransferAmountScreen2.U.getValue(), (InputTextDelegate) tapiTransferAmountScreen2.T.getValue(), (RowLoadingDelegate) tapiTransferAmountScreen2.V.getValue(), (TextDelegate) tapiTransferAmountScreen2.S.getValue(), (LargeActionButtonDelegate) tapiTransferAmountScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        TapiTransferAmountScreen.Companion companion3 = TapiTransferAmountScreen.INSTANCE;
                        qd0.b bVarN = ((rr1.c) tapiTransferAmountScreen.P.getValue()).f256644b.f256633c.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        TapiTransferAmountScreen.Companion companion4 = TapiTransferAmountScreen.INSTANCE;
                        return new CenteredAmountDelegate(new wde.f(tapiTransferAmountScreen, 27));
                }
            }
        });
        this.P = w.y0(new w83.a(this, inputData, 28));
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: wr1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TapiTransferAmountScreen f299485b;

            {
                this.f299485b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TapiTransferAmountScreen tapiTransferAmountScreen = this.f299485b;
                switch (i22) {
                    case 0:
                        TapiTransferAmountScreen.Companion companion = TapiTransferAmountScreen.INSTANCE;
                        return (l) ((rr1.c) tapiTransferAmountScreen.P.getValue()).f.get();
                    case 1:
                        TapiTransferAmountScreen.Companion companion2 = TapiTransferAmountScreen.INSTANCE;
                        TapiTransferAmountScreen tapiTransferAmountScreen2 = this.f299485b;
                        return dli.f.a(tapiTransferAmountScreen2, tapiTransferAmountScreen2.R2(), v.k((CenteredAmountDelegate) tapiTransferAmountScreen2.U.getValue(), (InputTextDelegate) tapiTransferAmountScreen2.T.getValue(), (RowLoadingDelegate) tapiTransferAmountScreen2.V.getValue(), (TextDelegate) tapiTransferAmountScreen2.S.getValue(), (LargeActionButtonDelegate) tapiTransferAmountScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        TapiTransferAmountScreen.Companion companion3 = TapiTransferAmountScreen.INSTANCE;
                        qd0.b bVarN = ((rr1.c) tapiTransferAmountScreen.P.getValue()).f256644b.f256633c.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        TapiTransferAmountScreen.Companion companion4 = TapiTransferAmountScreen.INSTANCE;
                        return new CenteredAmountDelegate(new wde.f(tapiTransferAmountScreen, 27));
                }
            }
        });
        this.R = w.y0(new wq1.a(4));
        this.S = w.y0(new wq1.a(5));
        this.T = w.y0(new wq1.a(6));
        final int i5 = 3;
        this.U = w.y0(new Function0(this) { // from class: wr1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TapiTransferAmountScreen f299485b;

            {
                this.f299485b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                TapiTransferAmountScreen tapiTransferAmountScreen = this.f299485b;
                switch (i22) {
                    case 0:
                        TapiTransferAmountScreen.Companion companion = TapiTransferAmountScreen.INSTANCE;
                        return (l) ((rr1.c) tapiTransferAmountScreen.P.getValue()).f.get();
                    case 1:
                        TapiTransferAmountScreen.Companion companion2 = TapiTransferAmountScreen.INSTANCE;
                        TapiTransferAmountScreen tapiTransferAmountScreen2 = this.f299485b;
                        return dli.f.a(tapiTransferAmountScreen2, tapiTransferAmountScreen2.R2(), v.k((CenteredAmountDelegate) tapiTransferAmountScreen2.U.getValue(), (InputTextDelegate) tapiTransferAmountScreen2.T.getValue(), (RowLoadingDelegate) tapiTransferAmountScreen2.V.getValue(), (TextDelegate) tapiTransferAmountScreen2.S.getValue(), (LargeActionButtonDelegate) tapiTransferAmountScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        TapiTransferAmountScreen.Companion companion3 = TapiTransferAmountScreen.INSTANCE;
                        qd0.b bVarN = ((rr1.c) tapiTransferAmountScreen.P.getValue()).f256644b.f256633c.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        TapiTransferAmountScreen.Companion companion4 = TapiTransferAmountScreen.INSTANCE;
                        return new CenteredAmountDelegate(new wde.f(tapiTransferAmountScreen, 27));
                }
            }
        });
        this.V = w.y0(new wq1.a(7));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174500c.setModel(uiState.f299497b);
        d3().f174499b.setEnabled(uiState.f299498c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174500c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        LargeActionButton largeActionButton = d3().f174499b;
        largeActionButton.setLoadingButtonTag("SUBMIT_BUTTON_TAG");
        l.A(R.string.common_action_continue, null, null, 14, largeActionButton);
        largeActionButton.setVisibility(0);
        largeActionButton.setEnabled(false);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174500c.f59338a), null, new wr1.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174499b.o), null, new wr1.c(this, null, 1), 3);
        ?? r62 = this.U;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) r62.getValue()).d.f121375b), null, new wka.e(this, null, 18), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) r62.getValue()).f.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174500c.f59338a), null, new wr1.c(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.R.getValue()).d.f121375b), null, new wr1.e(this, null), 3);
        ViewController.P2(this, l.y(((CenteredAmountDelegate) r62.getValue()).e.f121375b, ((CenteredAmountDelegate) r62.getValue()).f51966j.f121375b, "merge(...)"), new f(this, null), 3);
    }

    public final b0 d3() {
        ViewBinding value = this.N.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (b0) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final wr1.l R2() {
        return (wr1.l) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.K);
    }
}
