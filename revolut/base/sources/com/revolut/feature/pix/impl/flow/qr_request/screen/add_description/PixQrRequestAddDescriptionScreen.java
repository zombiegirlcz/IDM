package com.revolut.feature.pix.impl.flow.qr_request.screen.add_description;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bca.b;
import bca.c;
import bca.d;
import bca.f;
import bca.g;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.qr_request.screen.add_description.PixQrRequestAddDescriptionScreen;
import com.revolut.feature.pix.impl.flow.qr_request.screen.add_description.PixQrRequestAddDescriptionScreenContract$InputData;
import com.revolut.kompot.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.u;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import p8a.d0;
import p8a.n0;
import te0.w;
import vc.s;
import xki.e;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/qr_request/screen/add_description/PixQrRequestAddDescriptionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbca/f;", "Ldli/a;", "Lbca/g;", "Lno/d1;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixQrRequestAddDescriptionScreen extends ViewController<f> implements a, d1 {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PixQrRequestAddDescriptionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final PixQrRequestAddDescriptionScreenContract$InputData K;
    public final Lazy L;
    public final Lazy M;
    public final int N;
    public final Object O;
    public final Object P;
    public final h Q;
    public final Object R;

    public PixQrRequestAddDescriptionScreen(PixQrRequestAddDescriptionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = j.b(new b8g.a(14));
        this.M = j.b(new b8g.a(15));
        this.N = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: bca.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrRequestAddDescriptionScreen f14409b;

            {
                this.f14409b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PixQrRequestAddDescriptionScreen pixQrRequestAddDescriptionScreen = this.f14409b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrRequestAddDescriptionScreen.S;
                        return (h) ((n0) pixQrRequestAddDescriptionScreen.R.getValue()).f234035c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrRequestAddDescriptionScreen.S;
                        PixQrRequestAddDescriptionScreen pixQrRequestAddDescriptionScreen2 = this.f14409b;
                        return dli.f.a(pixQrRequestAddDescriptionScreen2, (h) pixQrRequestAddDescriptionScreen2.O.getValue(), v.k((InputTextDelegate) pixQrRequestAddDescriptionScreen2.L.getValue(), (LargeActionButtonDelegate) pixQrRequestAddDescriptionScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PixQrRequestAddDescriptionScreen.S;
                        qji.b bVarU2 = pixQrRequestAddDescriptionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.qr_request.screen.add_description.di.PixQrRequestAddDescriptionScreenInjector");
                        p8a.o0 o0Var = (p8a.o0) bVarU2;
                        d0 d0Var = o0Var.f234044b;
                        p8a.o0 o0Var2 = o0Var.f234045c;
                        PixQrRequestAddDescriptionScreenContract$InputData pixQrRequestAddDescriptionScreenContract$InputData = pixQrRequestAddDescriptionScreen.K;
                        pixQrRequestAddDescriptionScreenContract$InputData.getClass();
                        return new n0(d0Var, o0Var2, pixQrRequestAddDescriptionScreenContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: bca.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrRequestAddDescriptionScreen f14409b;

            {
                this.f14409b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PixQrRequestAddDescriptionScreen pixQrRequestAddDescriptionScreen = this.f14409b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrRequestAddDescriptionScreen.S;
                        return (h) ((n0) pixQrRequestAddDescriptionScreen.R.getValue()).f234035c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrRequestAddDescriptionScreen.S;
                        PixQrRequestAddDescriptionScreen pixQrRequestAddDescriptionScreen2 = this.f14409b;
                        return dli.f.a(pixQrRequestAddDescriptionScreen2, (h) pixQrRequestAddDescriptionScreen2.O.getValue(), v.k((InputTextDelegate) pixQrRequestAddDescriptionScreen2.L.getValue(), (LargeActionButtonDelegate) pixQrRequestAddDescriptionScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PixQrRequestAddDescriptionScreen.S;
                        qji.b bVarU2 = pixQrRequestAddDescriptionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.qr_request.screen.add_description.di.PixQrRequestAddDescriptionScreenInjector");
                        p8a.o0 o0Var = (p8a.o0) bVarU2;
                        d0 d0Var = o0Var.f234044b;
                        p8a.o0 o0Var2 = o0Var.f234045c;
                        PixQrRequestAddDescriptionScreenContract$InputData pixQrRequestAddDescriptionScreenContract$InputData = pixQrRequestAddDescriptionScreen.K;
                        pixQrRequestAddDescriptionScreenContract$InputData.getClass();
                        return new n0(d0Var, o0Var2, pixQrRequestAddDescriptionScreenContract$InputData);
                }
            }
        });
        this.Q = s.t(this, b.f);
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: bca.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrRequestAddDescriptionScreen f14409b;

            {
                this.f14409b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PixQrRequestAddDescriptionScreen pixQrRequestAddDescriptionScreen = this.f14409b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrRequestAddDescriptionScreen.S;
                        return (h) ((n0) pixQrRequestAddDescriptionScreen.R.getValue()).f234035c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrRequestAddDescriptionScreen.S;
                        PixQrRequestAddDescriptionScreen pixQrRequestAddDescriptionScreen2 = this.f14409b;
                        return dli.f.a(pixQrRequestAddDescriptionScreen2, (h) pixQrRequestAddDescriptionScreen2.O.getValue(), v.k((InputTextDelegate) pixQrRequestAddDescriptionScreen2.L.getValue(), (LargeActionButtonDelegate) pixQrRequestAddDescriptionScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PixQrRequestAddDescriptionScreen.S;
                        qji.b bVarU2 = pixQrRequestAddDescriptionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.qr_request.screen.add_description.di.PixQrRequestAddDescriptionScreenInjector");
                        p8a.o0 o0Var = (p8a.o0) bVarU2;
                        d0 d0Var = o0Var.f234044b;
                        p8a.o0 o0Var2 = o0Var.f234045c;
                        PixQrRequestAddDescriptionScreenContract$InputData pixQrRequestAddDescriptionScreenContract$InputData = pixQrRequestAddDescriptionScreen.K;
                        pixQrRequestAddDescriptionScreenContract$InputData.getClass();
                        return new n0(d0Var, o0Var2, pixQrRequestAddDescriptionScreenContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f14414b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n0) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (bca.h) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pix_qr_request_add_description_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.pix_qr_request_add_description_description, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new c(this, null, 0), 3);
        d3().f174564b.setText(new TextLocalisedClause(R$string.pix_qr_request_add_description_cta_button, null, null, 14));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.L.getValue()).e.f121375b), null, new d(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.Q.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
