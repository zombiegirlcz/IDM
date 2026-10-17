package com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.CheckoutCustomAmountScreen;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.CheckoutCustomAmountScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lxe.c;
import lxe.e;
import lxe.f;
import lxe.g;
import ove.l;
import ove.t;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/custom_amount/CheckoutCustomAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llxe/e;", "Ldli/a;", "Llxe/g;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CheckoutCustomAmountScreen extends ViewController<e> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(CheckoutCustomAmountScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final CheckoutCustomAmountScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final h S;

    public CheckoutCustomAmountScreen(CheckoutCustomAmountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: lxe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckoutCustomAmountScreen f200558b;

            {
                this.f200558b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CheckoutCustomAmountScreen checkoutCustomAmountScreen = this.f200558b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CheckoutCustomAmountScreen.T;
                        return new u80.d(((s80.b) ((qd0.b) checkoutCustomAmountScreen.M.getValue())).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CheckoutCustomAmountScreen.T;
                        qd0.b bVarN = ((l) checkoutCustomAmountScreen.P.getValue()).f230091b.o.n();
                        s.j(bVarN);
                        return bVarN;
                    case 2:
                        KProperty[] kPropertyArr3 = CheckoutCustomAmountScreen.T;
                        return new CenteredAmountDelegate(new lp2.c(checkoutCustomAmountScreen, 14));
                    case 3:
                        KProperty[] kPropertyArr4 = CheckoutCustomAmountScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(checkoutCustomAmountScreen.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).H;
                        CheckoutCustomAmountScreenContract$InputData checkoutCustomAmountScreenContract$InputData = checkoutCustomAmountScreen.K;
                        checkoutCustomAmountScreenContract$InputData.getClass();
                        return new l(tVar, checkoutCustomAmountScreenContract$InputData);
                    case 4:
                        KProperty[] kPropertyArr5 = CheckoutCustomAmountScreen.T;
                        return (f) ((l) checkoutCustomAmountScreen.P.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr6 = CheckoutCustomAmountScreen.T;
                        CheckoutCustomAmountScreen checkoutCustomAmountScreen2 = this.f200558b;
                        return dli.f.a(checkoutCustomAmountScreen2, (f) checkoutCustomAmountScreen2.Q.getValue(), u.c((CenteredAmountDelegate) checkoutCustomAmountScreen2.N.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: lxe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckoutCustomAmountScreen f200558b;

            {
                this.f200558b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CheckoutCustomAmountScreen checkoutCustomAmountScreen = this.f200558b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CheckoutCustomAmountScreen.T;
                        return new u80.d(((s80.b) ((qd0.b) checkoutCustomAmountScreen.M.getValue())).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CheckoutCustomAmountScreen.T;
                        qd0.b bVarN = ((l) checkoutCustomAmountScreen.P.getValue()).f230091b.o.n();
                        s.j(bVarN);
                        return bVarN;
                    case 2:
                        KProperty[] kPropertyArr3 = CheckoutCustomAmountScreen.T;
                        return new CenteredAmountDelegate(new lp2.c(checkoutCustomAmountScreen, 14));
                    case 3:
                        KProperty[] kPropertyArr4 = CheckoutCustomAmountScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(checkoutCustomAmountScreen.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).H;
                        CheckoutCustomAmountScreenContract$InputData checkoutCustomAmountScreenContract$InputData = checkoutCustomAmountScreen.K;
                        checkoutCustomAmountScreenContract$InputData.getClass();
                        return new l(tVar, checkoutCustomAmountScreenContract$InputData);
                    case 4:
                        KProperty[] kPropertyArr5 = CheckoutCustomAmountScreen.T;
                        return (f) ((l) checkoutCustomAmountScreen.P.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr6 = CheckoutCustomAmountScreen.T;
                        CheckoutCustomAmountScreen checkoutCustomAmountScreen2 = this.f200558b;
                        return dli.f.a(checkoutCustomAmountScreen2, (f) checkoutCustomAmountScreen2.Q.getValue(), u.c((CenteredAmountDelegate) checkoutCustomAmountScreen2.N.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: lxe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckoutCustomAmountScreen f200558b;

            {
                this.f200558b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CheckoutCustomAmountScreen checkoutCustomAmountScreen = this.f200558b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CheckoutCustomAmountScreen.T;
                        return new u80.d(((s80.b) ((qd0.b) checkoutCustomAmountScreen.M.getValue())).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CheckoutCustomAmountScreen.T;
                        qd0.b bVarN = ((l) checkoutCustomAmountScreen.P.getValue()).f230091b.o.n();
                        s.j(bVarN);
                        return bVarN;
                    case 2:
                        KProperty[] kPropertyArr3 = CheckoutCustomAmountScreen.T;
                        return new CenteredAmountDelegate(new lp2.c(checkoutCustomAmountScreen, 14));
                    case 3:
                        KProperty[] kPropertyArr4 = CheckoutCustomAmountScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(checkoutCustomAmountScreen.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).H;
                        CheckoutCustomAmountScreenContract$InputData checkoutCustomAmountScreenContract$InputData = checkoutCustomAmountScreen.K;
                        checkoutCustomAmountScreenContract$InputData.getClass();
                        return new l(tVar, checkoutCustomAmountScreenContract$InputData);
                    case 4:
                        KProperty[] kPropertyArr5 = CheckoutCustomAmountScreen.T;
                        return (f) ((l) checkoutCustomAmountScreen.P.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr6 = CheckoutCustomAmountScreen.T;
                        CheckoutCustomAmountScreen checkoutCustomAmountScreen2 = this.f200558b;
                        return dli.f.a(checkoutCustomAmountScreen2, (f) checkoutCustomAmountScreen2.Q.getValue(), u.c((CenteredAmountDelegate) checkoutCustomAmountScreen2.N.getValue()), 0, null, null, null, 60);
                }
            }
        });
        this.O = R$layout.screen_recycler_navbar_nextbutton;
        final int i5 = 3;
        this.P = w.y0(new Function0(this) { // from class: lxe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckoutCustomAmountScreen f200558b;

            {
                this.f200558b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CheckoutCustomAmountScreen checkoutCustomAmountScreen = this.f200558b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CheckoutCustomAmountScreen.T;
                        return new u80.d(((s80.b) ((qd0.b) checkoutCustomAmountScreen.M.getValue())).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CheckoutCustomAmountScreen.T;
                        qd0.b bVarN = ((l) checkoutCustomAmountScreen.P.getValue()).f230091b.o.n();
                        s.j(bVarN);
                        return bVarN;
                    case 2:
                        KProperty[] kPropertyArr3 = CheckoutCustomAmountScreen.T;
                        return new CenteredAmountDelegate(new lp2.c(checkoutCustomAmountScreen, 14));
                    case 3:
                        KProperty[] kPropertyArr4 = CheckoutCustomAmountScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(checkoutCustomAmountScreen.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).H;
                        CheckoutCustomAmountScreenContract$InputData checkoutCustomAmountScreenContract$InputData = checkoutCustomAmountScreen.K;
                        checkoutCustomAmountScreenContract$InputData.getClass();
                        return new l(tVar, checkoutCustomAmountScreenContract$InputData);
                    case 4:
                        KProperty[] kPropertyArr5 = CheckoutCustomAmountScreen.T;
                        return (f) ((l) checkoutCustomAmountScreen.P.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr6 = CheckoutCustomAmountScreen.T;
                        CheckoutCustomAmountScreen checkoutCustomAmountScreen2 = this.f200558b;
                        return dli.f.a(checkoutCustomAmountScreen2, (f) checkoutCustomAmountScreen2.Q.getValue(), u.c((CenteredAmountDelegate) checkoutCustomAmountScreen2.N.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i6 = 4;
        this.Q = w.y0(new Function0(this) { // from class: lxe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckoutCustomAmountScreen f200558b;

            {
                this.f200558b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                CheckoutCustomAmountScreen checkoutCustomAmountScreen = this.f200558b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CheckoutCustomAmountScreen.T;
                        return new u80.d(((s80.b) ((qd0.b) checkoutCustomAmountScreen.M.getValue())).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CheckoutCustomAmountScreen.T;
                        qd0.b bVarN = ((l) checkoutCustomAmountScreen.P.getValue()).f230091b.o.n();
                        s.j(bVarN);
                        return bVarN;
                    case 2:
                        KProperty[] kPropertyArr3 = CheckoutCustomAmountScreen.T;
                        return new CenteredAmountDelegate(new lp2.c(checkoutCustomAmountScreen, 14));
                    case 3:
                        KProperty[] kPropertyArr4 = CheckoutCustomAmountScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(checkoutCustomAmountScreen.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).H;
                        CheckoutCustomAmountScreenContract$InputData checkoutCustomAmountScreenContract$InputData = checkoutCustomAmountScreen.K;
                        checkoutCustomAmountScreenContract$InputData.getClass();
                        return new l(tVar, checkoutCustomAmountScreenContract$InputData);
                    case 4:
                        KProperty[] kPropertyArr5 = CheckoutCustomAmountScreen.T;
                        return (f) ((l) checkoutCustomAmountScreen.P.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr6 = CheckoutCustomAmountScreen.T;
                        CheckoutCustomAmountScreen checkoutCustomAmountScreen2 = this.f200558b;
                        return dli.f.a(checkoutCustomAmountScreen2, (f) checkoutCustomAmountScreen2.Q.getValue(), u.c((CenteredAmountDelegate) checkoutCustomAmountScreen2.N.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i21 = 5;
        this.R = w.y0(new Function0(this) { // from class: lxe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckoutCustomAmountScreen f200558b;

            {
                this.f200558b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                CheckoutCustomAmountScreen checkoutCustomAmountScreen = this.f200558b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CheckoutCustomAmountScreen.T;
                        return new u80.d(((s80.b) ((qd0.b) checkoutCustomAmountScreen.M.getValue())).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CheckoutCustomAmountScreen.T;
                        qd0.b bVarN = ((l) checkoutCustomAmountScreen.P.getValue()).f230091b.o.n();
                        s.j(bVarN);
                        return bVarN;
                    case 2:
                        KProperty[] kPropertyArr3 = CheckoutCustomAmountScreen.T;
                        return new CenteredAmountDelegate(new lp2.c(checkoutCustomAmountScreen, 14));
                    case 3:
                        KProperty[] kPropertyArr4 = CheckoutCustomAmountScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(checkoutCustomAmountScreen.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).H;
                        CheckoutCustomAmountScreenContract$InputData checkoutCustomAmountScreenContract$InputData = checkoutCustomAmountScreen.K;
                        checkoutCustomAmountScreenContract$InputData.getClass();
                        return new l(tVar, checkoutCustomAmountScreenContract$InputData);
                    case 4:
                        KProperty[] kPropertyArr5 = CheckoutCustomAmountScreen.T;
                        return (f) ((l) checkoutCustomAmountScreen.P.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr6 = CheckoutCustomAmountScreen.T;
                        CheckoutCustomAmountScreen checkoutCustomAmountScreen2 = this.f200558b;
                        return dli.f.a(checkoutCustomAmountScreen2, (f) checkoutCustomAmountScreen2.Q.getValue(), u.c((CenteredAmountDelegate) checkoutCustomAmountScreen2.N.getValue()), 0, null, null, null, 60);
                }
            }
        });
        this.S = s.t(this, lxe.b.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174564b.setEnabled(uiState.f200563b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (l) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.checkout_top_up_custom_amount_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.checkout_top_up_custom_amount_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        d3().f174564b.setText(new TextLocalisedClause(R$string.checkout_top_up_custom_amount_action, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(((CenteredAmountDelegate) this.N.getValue()).d.f121375b), new lph.h(this, null, 12), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.S.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
