package com.revolut.retail.feature.payments.bank_transfer.impl.payment_vendors_bene_creation.vendor_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import c3k.d;
import c3k.f;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$string;
import com.revolut.retail.feature.payments.bank_transfer.impl.payment_vendors_bene_creation.vendor_selection.VendorSelectionScreen;
import dli.c;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import p2k.a0;
import p2k.x;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/payment_vendors_bene_creation/vendor_selection/VendorSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lc3k/d;", "Ldli/a;", "Lc3k/f;", "<init>", "()V", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VendorSelectionScreen extends ViewController<d> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(VendorSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object M;
    public final Object N;
    public final Object P;
    public final RowDelegate K = new RowDelegate(null, null, 7);
    public final h L = s.t(this, a.f);
    public final int O = R$layout.screen_recycler_navbar;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public VendorSelectionScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: c3k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VendorSelectionScreen f20954b;

            {
                this.f20954b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                VendorSelectionScreen vendorSelectionScreen = this.f20954b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = VendorSelectionScreen.Q;
                        VendorSelectionScreen vendorSelectionScreen2 = this.f20954b;
                        return dli.f.a(vendorSelectionScreen2, (e) vendorSelectionScreen2.P.getValue(), v.k(vendorSelectionScreen2.K, new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = VendorSelectionScreen.Q;
                        qji.b bVarU2 = vendorSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.payments.bank_transfer.impl.payment_vendors_bene_creation.vendor_selection.di.VendorSelectionScreenInjector");
                        p2k.v vVar = (p2k.v) bVarU2;
                        x xVar = vVar.f232497c;
                        p2k.v vVar2 = vVar.d;
                        a0 a0Var = new a0();
                        int i3 = 25;
                        a0Var.f232268a = e4m.b.b(new ned.h(xVar, vVar2, a0Var, 2, i3));
                        a0Var.f232269b = e4m.b.b(new ned.h(xVar, vVar2, a0Var, 1, i3));
                        a0Var.f232270c = e4m.b.b(new ned.h(xVar, vVar2, a0Var, 0, i3));
                        return a0Var;
                    default:
                        KProperty[] kPropertyArr3 = VendorSelectionScreen.Q;
                        return (e) ((a0) vendorSelectionScreen.N.getValue()).f232270c.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: c3k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VendorSelectionScreen f20954b;

            {
                this.f20954b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                VendorSelectionScreen vendorSelectionScreen = this.f20954b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = VendorSelectionScreen.Q;
                        VendorSelectionScreen vendorSelectionScreen2 = this.f20954b;
                        return dli.f.a(vendorSelectionScreen2, (e) vendorSelectionScreen2.P.getValue(), v.k(vendorSelectionScreen2.K, new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = VendorSelectionScreen.Q;
                        qji.b bVarU2 = vendorSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.payments.bank_transfer.impl.payment_vendors_bene_creation.vendor_selection.di.VendorSelectionScreenInjector");
                        p2k.v vVar = (p2k.v) bVarU2;
                        x xVar = vVar.f232497c;
                        p2k.v vVar2 = vVar.d;
                        a0 a0Var = new a0();
                        int i3 = 25;
                        a0Var.f232268a = e4m.b.b(new ned.h(xVar, vVar2, a0Var, 2, i3));
                        a0Var.f232269b = e4m.b.b(new ned.h(xVar, vVar2, a0Var, 1, i3));
                        a0Var.f232270c = e4m.b.b(new ned.h(xVar, vVar2, a0Var, 0, i3));
                        return a0Var;
                    default:
                        KProperty[] kPropertyArr3 = VendorSelectionScreen.Q;
                        return (e) ((a0) vendorSelectionScreen.N.getValue()).f232270c.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: c3k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VendorSelectionScreen f20954b;

            {
                this.f20954b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                VendorSelectionScreen vendorSelectionScreen = this.f20954b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = VendorSelectionScreen.Q;
                        VendorSelectionScreen vendorSelectionScreen2 = this.f20954b;
                        return dli.f.a(vendorSelectionScreen2, (e) vendorSelectionScreen2.P.getValue(), v.k(vendorSelectionScreen2.K, new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = VendorSelectionScreen.Q;
                        qji.b bVarU2 = vendorSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.payments.bank_transfer.impl.payment_vendors_bene_creation.vendor_selection.di.VendorSelectionScreenInjector");
                        p2k.v vVar = (p2k.v) bVarU2;
                        x xVar = vVar.f232497c;
                        p2k.v vVar2 = vVar.d;
                        a0 a0Var = new a0();
                        int i32 = 25;
                        a0Var.f232268a = e4m.b.b(new ned.h(xVar, vVar2, a0Var, 2, i32));
                        a0Var.f232269b = e4m.b.b(new ned.h(xVar, vVar2, a0Var, 1, i32));
                        a0Var.f232270c = e4m.b.b(new ned.h(xVar, vVar2, a0Var, 0, i32));
                        return a0Var;
                    default:
                        KProperty[] kPropertyArr3 = VendorSelectionScreen.Q;
                        return (e) ((a0) vendorSelectionScreen.N.getValue()).f232270c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        if (!uiState.f20959b) {
            navBarWithToolbar.m0(j4.NO_ANIMATION);
        } else {
            navBarWithToolbar.setSearchButtonActive(true);
            navBarWithToolbar.setHints(u.c(new TextLocalisedClause(R$string.transfer_vendor_list_search_placeholder, null, null, 14)));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (c3k.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.transfer_vendor_list_header, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new brc.h(this, null, 26), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59409p.f57337m), null, new c1i.f(this, (Continuation) null, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.K.f53218h), null, new c3k.b(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.M.getValue();
    }
}
