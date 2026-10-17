package com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.change_amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.change_amount.PixQrCodeChangeAmountScreen;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.change_amount.PixQrCodeChangeAmountScreenContract$InputData;
import com.revolut.kompot.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.u;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import p8a.d0;
import p8a.k0;
import s56.i;
import sba.b;
import sba.c;
import sba.e;
import sba.f;
import te0.w;
import vc.s;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/qr_code_transaction/screen/change_amount/PixQrCodeChangeAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lsba/e;", "Ldli/a;", "Lsba/f;", "Lno/d1;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixQrCodeChangeAmountScreen extends ViewController<e> implements a, d1 {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(PixQrCodeChangeAmountScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final PixQrCodeChangeAmountScreenContract$InputData K;
    public final Lazy L;
    public final Object M;
    public final Object N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final h R;
    public final Object S;

    public PixQrCodeChangeAmountScreen(PixQrCodeChangeAmountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = j.b(new s8f.h(9));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: sba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrCodeChangeAmountScreen f261517b;

            {
                this.f261517b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PixQrCodeChangeAmountScreen pixQrCodeChangeAmountScreen = this.f261517b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrCodeChangeAmountScreen.T;
                        qd0.b bVarN = ((p8a.h0) pixQrCodeChangeAmountScreen.S.getValue()).f233978b.f233933h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrCodeChangeAmountScreen.T;
                        return new CenteredAmountDelegate(new s42.f(pixQrCodeChangeAmountScreen, 22));
                    case 2:
                        KProperty[] kPropertyArr3 = PixQrCodeChangeAmountScreen.T;
                        return (h) ((p8a.h0) pixQrCodeChangeAmountScreen.S.getValue()).f.get();
                    case 3:
                        KProperty[] kPropertyArr4 = PixQrCodeChangeAmountScreen.T;
                        PixQrCodeChangeAmountScreen pixQrCodeChangeAmountScreen2 = this.f261517b;
                        return dli.f.a(pixQrCodeChangeAmountScreen2, (h) pixQrCodeChangeAmountScreen2.P.getValue(), v.k((CenteredAmountDelegate) pixQrCodeChangeAmountScreen2.N.getValue(), (LargeActionButtonDelegate) pixQrCodeChangeAmountScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr5 = PixQrCodeChangeAmountScreen.T;
                        qji.b bVarU2 = pixQrCodeChangeAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.change_amount.di.PixQrCodeChangeAmountScreenInjector");
                        k0 k0Var = (k0) bVarU2;
                        d0 d0Var = k0Var.f234005b;
                        k0 k0Var2 = k0Var.f234006c;
                        PixQrCodeChangeAmountScreenContract$InputData pixQrCodeChangeAmountScreenContract$InputData = pixQrCodeChangeAmountScreen.K;
                        pixQrCodeChangeAmountScreenContract$InputData.getClass();
                        return new p8a.h0(d0Var, k0Var2, pixQrCodeChangeAmountScreenContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: sba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrCodeChangeAmountScreen f261517b;

            {
                this.f261517b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PixQrCodeChangeAmountScreen pixQrCodeChangeAmountScreen = this.f261517b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrCodeChangeAmountScreen.T;
                        qd0.b bVarN = ((p8a.h0) pixQrCodeChangeAmountScreen.S.getValue()).f233978b.f233933h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrCodeChangeAmountScreen.T;
                        return new CenteredAmountDelegate(new s42.f(pixQrCodeChangeAmountScreen, 22));
                    case 2:
                        KProperty[] kPropertyArr3 = PixQrCodeChangeAmountScreen.T;
                        return (h) ((p8a.h0) pixQrCodeChangeAmountScreen.S.getValue()).f.get();
                    case 3:
                        KProperty[] kPropertyArr4 = PixQrCodeChangeAmountScreen.T;
                        PixQrCodeChangeAmountScreen pixQrCodeChangeAmountScreen2 = this.f261517b;
                        return dli.f.a(pixQrCodeChangeAmountScreen2, (h) pixQrCodeChangeAmountScreen2.P.getValue(), v.k((CenteredAmountDelegate) pixQrCodeChangeAmountScreen2.N.getValue(), (LargeActionButtonDelegate) pixQrCodeChangeAmountScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr5 = PixQrCodeChangeAmountScreen.T;
                        qji.b bVarU2 = pixQrCodeChangeAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.change_amount.di.PixQrCodeChangeAmountScreenInjector");
                        k0 k0Var = (k0) bVarU2;
                        d0 d0Var = k0Var.f234005b;
                        k0 k0Var2 = k0Var.f234006c;
                        PixQrCodeChangeAmountScreenContract$InputData pixQrCodeChangeAmountScreenContract$InputData = pixQrCodeChangeAmountScreen.K;
                        pixQrCodeChangeAmountScreenContract$InputData.getClass();
                        return new p8a.h0(d0Var, k0Var2, pixQrCodeChangeAmountScreenContract$InputData);
                }
            }
        });
        this.O = R$layout.screen_recycler_navbar_nextbutton;
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: sba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrCodeChangeAmountScreen f261517b;

            {
                this.f261517b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PixQrCodeChangeAmountScreen pixQrCodeChangeAmountScreen = this.f261517b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrCodeChangeAmountScreen.T;
                        qd0.b bVarN = ((p8a.h0) pixQrCodeChangeAmountScreen.S.getValue()).f233978b.f233933h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrCodeChangeAmountScreen.T;
                        return new CenteredAmountDelegate(new s42.f(pixQrCodeChangeAmountScreen, 22));
                    case 2:
                        KProperty[] kPropertyArr3 = PixQrCodeChangeAmountScreen.T;
                        return (h) ((p8a.h0) pixQrCodeChangeAmountScreen.S.getValue()).f.get();
                    case 3:
                        KProperty[] kPropertyArr4 = PixQrCodeChangeAmountScreen.T;
                        PixQrCodeChangeAmountScreen pixQrCodeChangeAmountScreen2 = this.f261517b;
                        return dli.f.a(pixQrCodeChangeAmountScreen2, (h) pixQrCodeChangeAmountScreen2.P.getValue(), v.k((CenteredAmountDelegate) pixQrCodeChangeAmountScreen2.N.getValue(), (LargeActionButtonDelegate) pixQrCodeChangeAmountScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr5 = PixQrCodeChangeAmountScreen.T;
                        qji.b bVarU2 = pixQrCodeChangeAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.change_amount.di.PixQrCodeChangeAmountScreenInjector");
                        k0 k0Var = (k0) bVarU2;
                        d0 d0Var = k0Var.f234005b;
                        k0 k0Var2 = k0Var.f234006c;
                        PixQrCodeChangeAmountScreenContract$InputData pixQrCodeChangeAmountScreenContract$InputData = pixQrCodeChangeAmountScreen.K;
                        pixQrCodeChangeAmountScreenContract$InputData.getClass();
                        return new p8a.h0(d0Var, k0Var2, pixQrCodeChangeAmountScreenContract$InputData);
                }
            }
        });
        final int i5 = 3;
        this.Q = w.y0(new Function0(this) { // from class: sba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrCodeChangeAmountScreen f261517b;

            {
                this.f261517b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PixQrCodeChangeAmountScreen pixQrCodeChangeAmountScreen = this.f261517b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrCodeChangeAmountScreen.T;
                        qd0.b bVarN = ((p8a.h0) pixQrCodeChangeAmountScreen.S.getValue()).f233978b.f233933h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrCodeChangeAmountScreen.T;
                        return new CenteredAmountDelegate(new s42.f(pixQrCodeChangeAmountScreen, 22));
                    case 2:
                        KProperty[] kPropertyArr3 = PixQrCodeChangeAmountScreen.T;
                        return (h) ((p8a.h0) pixQrCodeChangeAmountScreen.S.getValue()).f.get();
                    case 3:
                        KProperty[] kPropertyArr4 = PixQrCodeChangeAmountScreen.T;
                        PixQrCodeChangeAmountScreen pixQrCodeChangeAmountScreen2 = this.f261517b;
                        return dli.f.a(pixQrCodeChangeAmountScreen2, (h) pixQrCodeChangeAmountScreen2.P.getValue(), v.k((CenteredAmountDelegate) pixQrCodeChangeAmountScreen2.N.getValue(), (LargeActionButtonDelegate) pixQrCodeChangeAmountScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr5 = PixQrCodeChangeAmountScreen.T;
                        qji.b bVarU2 = pixQrCodeChangeAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.change_amount.di.PixQrCodeChangeAmountScreenInjector");
                        k0 k0Var = (k0) bVarU2;
                        d0 d0Var = k0Var.f234005b;
                        k0 k0Var2 = k0Var.f234006c;
                        PixQrCodeChangeAmountScreenContract$InputData pixQrCodeChangeAmountScreenContract$InputData = pixQrCodeChangeAmountScreen.K;
                        pixQrCodeChangeAmountScreenContract$InputData.getClass();
                        return new p8a.h0(d0Var, k0Var2, pixQrCodeChangeAmountScreenContract$InputData);
                }
            }
        });
        this.R = s.t(this, b.f);
        final int i6 = 4;
        this.S = w.y0(new Function0(this) { // from class: sba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrCodeChangeAmountScreen f261517b;

            {
                this.f261517b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                PixQrCodeChangeAmountScreen pixQrCodeChangeAmountScreen = this.f261517b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrCodeChangeAmountScreen.T;
                        qd0.b bVarN = ((p8a.h0) pixQrCodeChangeAmountScreen.S.getValue()).f233978b.f233933h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrCodeChangeAmountScreen.T;
                        return new CenteredAmountDelegate(new s42.f(pixQrCodeChangeAmountScreen, 22));
                    case 2:
                        KProperty[] kPropertyArr3 = PixQrCodeChangeAmountScreen.T;
                        return (h) ((p8a.h0) pixQrCodeChangeAmountScreen.S.getValue()).f.get();
                    case 3:
                        KProperty[] kPropertyArr4 = PixQrCodeChangeAmountScreen.T;
                        PixQrCodeChangeAmountScreen pixQrCodeChangeAmountScreen2 = this.f261517b;
                        return dli.f.a(pixQrCodeChangeAmountScreen2, (h) pixQrCodeChangeAmountScreen2.P.getValue(), v.k((CenteredAmountDelegate) pixQrCodeChangeAmountScreen2.N.getValue(), (LargeActionButtonDelegate) pixQrCodeChangeAmountScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr5 = PixQrCodeChangeAmountScreen.T;
                        qji.b bVarU2 = pixQrCodeChangeAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.change_amount.di.PixQrCodeChangeAmountScreenInjector");
                        k0 k0Var = (k0) bVarU2;
                        d0 d0Var = k0Var.f234005b;
                        k0 k0Var2 = k0Var.f234006c;
                        PixQrCodeChangeAmountScreenContract$InputData pixQrCodeChangeAmountScreenContract$InputData = pixQrCodeChangeAmountScreen.K;
                        pixQrCodeChangeAmountScreenContract$InputData.getClass();
                        return new p8a.h0(d0Var, k0Var2, pixQrCodeChangeAmountScreenContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f261522b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p8a.h0) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (sba.h) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Continuation continuation = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pix_transaction_review_item_title_pix_change_amount, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        d3().f174564b.setText(new TextLocalisedClause(R$string.pix_transaction_review_pix_change_cta_button, null, null, 14));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new s1k.b(this, continuation, 21), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.L.getValue()).d.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) this.N.getValue()).d.f121375b), null, new i(this, continuation, 21), 3);
    }

    public final u d3() {
        ViewBinding value = this.R.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
