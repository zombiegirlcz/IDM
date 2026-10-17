package com.revolut.feature.pix.impl.flow.refund.screen.amount;

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
import com.revolut.feature.pix.impl.flow.refund.screen.amount.PixRefundAmountScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import gca.b;
import gca.c;
import gca.d;
import gca.g;
import gca.m;
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
import p8a.q0;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/refund/screen/amount/PixRefundAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgca/g;", "Ldli/a;", "Lgca/h;", "Lno/d1;", "Companion", "a", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixRefundAmountScreen extends ViewController<g> implements a, d1 {
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
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(PixRefundAmountScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithavatarNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.pix.impl.flow.refund.screen.amount.PixRefundAmountScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public PixRefundAmountScreen(PixRefundAmountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = true;
        this.L = R$layout.screen_recycler_navbarwithavatar_nextbutton;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: gca.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixRefundAmountScreen f142374b;

            {
                this.f142374b = this;
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
                PixRefundAmountScreen pixRefundAmountScreen = this.f142374b;
                switch (i2) {
                    case 0:
                        PixRefundAmountScreen.Companion companion = PixRefundAmountScreen.INSTANCE;
                        return (m) ((q0) pixRefundAmountScreen.P.getValue()).f.get();
                    case 1:
                        PixRefundAmountScreen.Companion companion2 = PixRefundAmountScreen.INSTANCE;
                        PixRefundAmountScreen pixRefundAmountScreen2 = this.f142374b;
                        return dli.f.a(pixRefundAmountScreen2, pixRefundAmountScreen2.d(), v.k((CenteredAmountDelegate) pixRefundAmountScreen2.U.getValue(), (InputTextDelegate) pixRefundAmountScreen2.T.getValue(), (RowLoadingDelegate) pixRefundAmountScreen2.V.getValue(), (TextDelegate) pixRefundAmountScreen2.S.getValue(), (LargeActionButtonDelegate) pixRefundAmountScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        PixRefundAmountScreen.Companion companion3 = PixRefundAmountScreen.INSTANCE;
                        qd0.b bVarN = ((q0) pixRefundAmountScreen.P.getValue()).f234061b.f233933h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        PixRefundAmountScreen.Companion companion4 = PixRefundAmountScreen.INSTANCE;
                        return new CenteredAmountDelegate(new g75.i(pixRefundAmountScreen, 15));
                }
            }
        });
        this.N = s.t(this, b.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: gca.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixRefundAmountScreen f142374b;

            {
                this.f142374b = this;
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
                PixRefundAmountScreen pixRefundAmountScreen = this.f142374b;
                switch (i22) {
                    case 0:
                        PixRefundAmountScreen.Companion companion = PixRefundAmountScreen.INSTANCE;
                        return (m) ((q0) pixRefundAmountScreen.P.getValue()).f.get();
                    case 1:
                        PixRefundAmountScreen.Companion companion2 = PixRefundAmountScreen.INSTANCE;
                        PixRefundAmountScreen pixRefundAmountScreen2 = this.f142374b;
                        return dli.f.a(pixRefundAmountScreen2, pixRefundAmountScreen2.d(), v.k((CenteredAmountDelegate) pixRefundAmountScreen2.U.getValue(), (InputTextDelegate) pixRefundAmountScreen2.T.getValue(), (RowLoadingDelegate) pixRefundAmountScreen2.V.getValue(), (TextDelegate) pixRefundAmountScreen2.S.getValue(), (LargeActionButtonDelegate) pixRefundAmountScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        PixRefundAmountScreen.Companion companion3 = PixRefundAmountScreen.INSTANCE;
                        qd0.b bVarN = ((q0) pixRefundAmountScreen.P.getValue()).f234061b.f233933h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        PixRefundAmountScreen.Companion companion4 = PixRefundAmountScreen.INSTANCE;
                        return new CenteredAmountDelegate(new g75.i(pixRefundAmountScreen, 15));
                }
            }
        });
        this.P = w.y0(new fx5.a(this, inputData, 21));
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: gca.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixRefundAmountScreen f142374b;

            {
                this.f142374b = this;
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
                PixRefundAmountScreen pixRefundAmountScreen = this.f142374b;
                switch (i22) {
                    case 0:
                        PixRefundAmountScreen.Companion companion = PixRefundAmountScreen.INSTANCE;
                        return (m) ((q0) pixRefundAmountScreen.P.getValue()).f.get();
                    case 1:
                        PixRefundAmountScreen.Companion companion2 = PixRefundAmountScreen.INSTANCE;
                        PixRefundAmountScreen pixRefundAmountScreen2 = this.f142374b;
                        return dli.f.a(pixRefundAmountScreen2, pixRefundAmountScreen2.d(), v.k((CenteredAmountDelegate) pixRefundAmountScreen2.U.getValue(), (InputTextDelegate) pixRefundAmountScreen2.T.getValue(), (RowLoadingDelegate) pixRefundAmountScreen2.V.getValue(), (TextDelegate) pixRefundAmountScreen2.S.getValue(), (LargeActionButtonDelegate) pixRefundAmountScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        PixRefundAmountScreen.Companion companion3 = PixRefundAmountScreen.INSTANCE;
                        qd0.b bVarN = ((q0) pixRefundAmountScreen.P.getValue()).f234061b.f233933h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        PixRefundAmountScreen.Companion companion4 = PixRefundAmountScreen.INSTANCE;
                        return new CenteredAmountDelegate(new g75.i(pixRefundAmountScreen, 15));
                }
            }
        });
        this.R = w.y0(new gaa.b(2));
        this.S = w.y0(new gaa.b(3));
        this.T = w.y0(new gaa.b(4));
        final int i5 = 3;
        this.U = w.y0(new Function0(this) { // from class: gca.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixRefundAmountScreen f142374b;

            {
                this.f142374b = this;
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
                PixRefundAmountScreen pixRefundAmountScreen = this.f142374b;
                switch (i22) {
                    case 0:
                        PixRefundAmountScreen.Companion companion = PixRefundAmountScreen.INSTANCE;
                        return (m) ((q0) pixRefundAmountScreen.P.getValue()).f.get();
                    case 1:
                        PixRefundAmountScreen.Companion companion2 = PixRefundAmountScreen.INSTANCE;
                        PixRefundAmountScreen pixRefundAmountScreen2 = this.f142374b;
                        return dli.f.a(pixRefundAmountScreen2, pixRefundAmountScreen2.d(), v.k((CenteredAmountDelegate) pixRefundAmountScreen2.U.getValue(), (InputTextDelegate) pixRefundAmountScreen2.T.getValue(), (RowLoadingDelegate) pixRefundAmountScreen2.V.getValue(), (TextDelegate) pixRefundAmountScreen2.S.getValue(), (LargeActionButtonDelegate) pixRefundAmountScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        PixRefundAmountScreen.Companion companion3 = PixRefundAmountScreen.INSTANCE;
                        qd0.b bVarN = ((q0) pixRefundAmountScreen.P.getValue()).f234061b.f233933h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        PixRefundAmountScreen.Companion companion4 = PixRefundAmountScreen.INSTANCE;
                        return new CenteredAmountDelegate(new g75.i(pixRefundAmountScreen, 15));
                }
            }
        });
        this.V = w.y0(new gaa.b(5));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        gca.h uiState = (gca.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174500c.setModel(uiState.f142383b);
        d3().f174499b.setEnabled(uiState.f142384c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (q0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object, kotlin.Lazy] */
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
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174500c.f59338a), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174499b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) this.U.getValue()).d.f121375b), null, new gaa.g(this, null, 6), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.T.getValue()).e.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174500c.f59338a), null, new c(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.R.getValue()).d.f121375b), null, new gca.e(this, null), 3);
    }

    public final b0 d3() {
        ViewBinding value = this.N.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (b0) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m d() {
        return (m) this.M.getValue();
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
