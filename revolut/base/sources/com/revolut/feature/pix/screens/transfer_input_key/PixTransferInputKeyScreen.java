package com.revolut.feature.pix.screens.transfer_input_key;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.e0;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.screens.transfer_input_key.PixTransferInputKeyScreen;
import com.revolut.feature.pix.screens.transfer_input_key.PixTransferInputKeyScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import p8a.d0;
import p8a.v0;
import skm.a2;
import te0.w;
import vc.s;
import vkm.d;
import xki.e;
import y8a.g;
import yca.b;
import yca.c;
import yca.f;
import yca.k;
import yca.m;
import yca.n;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pix/screens/transfer_input_key/PixTransferInputKeyScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lyca/k;", "Ldli/a;", "Lyca/n;", "Lno/d1;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixTransferInputKeyScreen extends ViewController<k> implements a, d1 {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(PixTransferInputKeyScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final PixTransferInputKeyScreenContract$InputData K;
    public final boolean L;
    public final h M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final InputTextDelegate R;
    public final RowDelegate S;
    public a2 T;
    public d U;
    public final Object V;

    public PixTransferInputKeyScreen(PixTransferInputKeyScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = true;
        this.M = s.t(this, b.f);
        this.N = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: yca.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixTransferInputKeyScreen f312580b;

            {
                this.f312580b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PixTransferInputKeyScreen pixTransferInputKeyScreen = this.f312580b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PixTransferInputKeyScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(pixTransferInputKeyScreen.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        d0 d0Var = ((d0) aVar2.b()).C;
                        PixTransferInputKeyScreenContract$InputData pixTransferInputKeyScreenContract$InputData = pixTransferInputKeyScreen.K;
                        pixTransferInputKeyScreenContract$InputData.getClass();
                        return new v0(d0Var, pixTransferInputKeyScreen, pixTransferInputKeyScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PixTransferInputKeyScreen.W;
                        return (m) ((v0) pixTransferInputKeyScreen.O.getValue()).f234106g.get();
                    default:
                        KProperty[] kPropertyArr3 = PixTransferInputKeyScreen.W;
                        PixTransferInputKeyScreen pixTransferInputKeyScreen2 = this.f312580b;
                        return dli.f.a(pixTransferInputKeyScreen2, pixTransferInputKeyScreen2.R2(), zhm.v.k((TextDelegate) pixTransferInputKeyScreen2.Q.getValue(), pixTransferInputKeyScreen2.R), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: yca.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixTransferInputKeyScreen f312580b;

            {
                this.f312580b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PixTransferInputKeyScreen pixTransferInputKeyScreen = this.f312580b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixTransferInputKeyScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(pixTransferInputKeyScreen.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        d0 d0Var = ((d0) aVar2.b()).C;
                        PixTransferInputKeyScreenContract$InputData pixTransferInputKeyScreenContract$InputData = pixTransferInputKeyScreen.K;
                        pixTransferInputKeyScreenContract$InputData.getClass();
                        return new v0(d0Var, pixTransferInputKeyScreen, pixTransferInputKeyScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PixTransferInputKeyScreen.W;
                        return (m) ((v0) pixTransferInputKeyScreen.O.getValue()).f234106g.get();
                    default:
                        KProperty[] kPropertyArr3 = PixTransferInputKeyScreen.W;
                        PixTransferInputKeyScreen pixTransferInputKeyScreen2 = this.f312580b;
                        return dli.f.a(pixTransferInputKeyScreen2, pixTransferInputKeyScreen2.R2(), zhm.v.k((TextDelegate) pixTransferInputKeyScreen2.Q.getValue(), pixTransferInputKeyScreen2.R), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = w.y0(new y7k.h(20));
        this.R = new InputTextDelegate(new g(this, 12));
        this.S = new RowDelegate(null, null, 7);
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: yca.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixTransferInputKeyScreen f312580b;

            {
                this.f312580b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PixTransferInputKeyScreen pixTransferInputKeyScreen = this.f312580b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixTransferInputKeyScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(pixTransferInputKeyScreen.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        d0 d0Var = ((d0) aVar2.b()).C;
                        PixTransferInputKeyScreenContract$InputData pixTransferInputKeyScreenContract$InputData = pixTransferInputKeyScreen.K;
                        pixTransferInputKeyScreenContract$InputData.getClass();
                        return new v0(d0Var, pixTransferInputKeyScreen, pixTransferInputKeyScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PixTransferInputKeyScreen.W;
                        return (m) ((v0) pixTransferInputKeyScreen.O.getValue()).f234106g.get();
                    default:
                        KProperty[] kPropertyArr3 = PixTransferInputKeyScreen.W;
                        PixTransferInputKeyScreen pixTransferInputKeyScreen2 = this.f312580b;
                        return dli.f.a(pixTransferInputKeyScreen2, pixTransferInputKeyScreen2.R2(), zhm.v.k((TextDelegate) pixTransferInputKeyScreen2.Q.getValue(), pixTransferInputKeyScreen2.R), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174564b.setEnabled(uiState.f312588b);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(uiState.f312589c, null);
        navBarWithToolbar.setSecondDescriptionText(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.pix_new_recipient_header_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.pix_new_recipient_header_caption, null, null, 14));
        navBarWithToolbar.setSecondDescriptionTextStyle(e0.CAPTION);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(R$string.pix_new_recipient_button, null, null, 14));
        largeActionButton.setLoadingButtonTag("FETCH_BENEFICIARY_BUTTON_TAG");
        ((j60.a) ((v0) this.O.getValue()).e.get()).d(u.c(this.S));
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new yca.d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new yca.d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((TextDelegate) this.Q.getValue()).f53530c), null, new yca.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f53218h), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.i.f121375b), null, new yca.g(this, null), 3);
        f3();
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m R2() {
        return (m) this.P.getValue();
    }

    public final void f3() {
        a2 a2Var = this.T;
        if (a2Var == null || !a2Var.d()) {
            a2 a2Var2 = this.T;
            if (a2Var2 != null) {
                a2Var2.f(null);
            }
            d dVar = this.U;
            this.T = dVar != null ? ViewController.P2(this, dVar, new c(this, null), 3) : null;
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
