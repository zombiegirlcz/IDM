package com.revolut.feature.pix.impl.flow.qr_request.screen.add_amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.impl.R$layout;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.qr_request.screen.add_amount.PixQrRequestAddAmountScreen;
import com.revolut.feature.pix.impl.flow.qr_request.screen.add_amount.PixQrRequestAddAmountScreenContract$InputData;
import com.revolut.kompot.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
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
import p8a.m0;
import te0.w;
import vc.s;
import xki.e;
import yhm.j;
import zaj.f;
import zba.c;
import zba.d;
import zba.g;
import zba.i;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/qr_request/screen/add_amount/PixQrRequestAddAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzba/g;", "Ldli/a;", "Lzba/h;", "Lno/d1;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixQrRequestAddAmountScreen extends ViewController<g> implements a, d1 {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(PixQrRequestAddAmountScreen.class, "binding", "getBinding()Lcom/revolut/feature/pix/impl/databinding/ScreenPixRequestAmountBinding;", 0))};
    public final PixQrRequestAddAmountScreenContract$InputData K;
    public final CenteredAmountDelegate L;
    public final Lazy M;
    public final Lazy N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final h R;
    public final Object S;

    public PixQrRequestAddAmountScreen(PixQrRequestAddAmountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new CenteredAmountDelegate(new zba.a(this, 0));
        this.M = j.b(new f(2));
        this.N = j.b(new f(3));
        this.O = R$layout.screen_pix_request_amount;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: zba.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrRequestAddAmountScreen f320854b;

            {
                this.f320854b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PixQrRequestAddAmountScreen pixQrRequestAddAmountScreen = this.f320854b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrRequestAddAmountScreen.T;
                        return (i) ((m0) pixQrRequestAddAmountScreen.S.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrRequestAddAmountScreen.T;
                        PixQrRequestAddAmountScreen pixQrRequestAddAmountScreen2 = this.f320854b;
                        return dli.f.a(pixQrRequestAddAmountScreen2, pixQrRequestAddAmountScreen2.R2(), v.k(pixQrRequestAddAmountScreen2.L, (InputTextDelegate) pixQrRequestAddAmountScreen2.M.getValue(), (LargeActionButtonDelegate) pixQrRequestAddAmountScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PixQrRequestAddAmountScreen.T;
                        qji.b bVarU2 = pixQrRequestAddAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.qr_request.screen.add_amount.di.PixQrRequestAddAmountScreenInjector");
                        p8a.o0 o0Var = (p8a.o0) bVarU2;
                        d0 d0Var = o0Var.f234044b;
                        p8a.o0 o0Var2 = o0Var.f234045c;
                        PixQrRequestAddAmountScreenContract$InputData pixQrRequestAddAmountScreenContract$InputData = pixQrRequestAddAmountScreen.K;
                        pixQrRequestAddAmountScreenContract$InputData.getClass();
                        return new m0(d0Var, o0Var2, pixQrRequestAddAmountScreenContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: zba.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrRequestAddAmountScreen f320854b;

            {
                this.f320854b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PixQrRequestAddAmountScreen pixQrRequestAddAmountScreen = this.f320854b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrRequestAddAmountScreen.T;
                        return (i) ((m0) pixQrRequestAddAmountScreen.S.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrRequestAddAmountScreen.T;
                        PixQrRequestAddAmountScreen pixQrRequestAddAmountScreen2 = this.f320854b;
                        return dli.f.a(pixQrRequestAddAmountScreen2, pixQrRequestAddAmountScreen2.R2(), v.k(pixQrRequestAddAmountScreen2.L, (InputTextDelegate) pixQrRequestAddAmountScreen2.M.getValue(), (LargeActionButtonDelegate) pixQrRequestAddAmountScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PixQrRequestAddAmountScreen.T;
                        qji.b bVarU2 = pixQrRequestAddAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.qr_request.screen.add_amount.di.PixQrRequestAddAmountScreenInjector");
                        p8a.o0 o0Var = (p8a.o0) bVarU2;
                        d0 d0Var = o0Var.f234044b;
                        p8a.o0 o0Var2 = o0Var.f234045c;
                        PixQrRequestAddAmountScreenContract$InputData pixQrRequestAddAmountScreenContract$InputData = pixQrRequestAddAmountScreen.K;
                        pixQrRequestAddAmountScreenContract$InputData.getClass();
                        return new m0(d0Var, o0Var2, pixQrRequestAddAmountScreenContract$InputData);
                }
            }
        });
        this.R = s.t(this, c.f);
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: zba.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrRequestAddAmountScreen f320854b;

            {
                this.f320854b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PixQrRequestAddAmountScreen pixQrRequestAddAmountScreen = this.f320854b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrRequestAddAmountScreen.T;
                        return (i) ((m0) pixQrRequestAddAmountScreen.S.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrRequestAddAmountScreen.T;
                        PixQrRequestAddAmountScreen pixQrRequestAddAmountScreen2 = this.f320854b;
                        return dli.f.a(pixQrRequestAddAmountScreen2, pixQrRequestAddAmountScreen2.R2(), v.k(pixQrRequestAddAmountScreen2.L, (InputTextDelegate) pixQrRequestAddAmountScreen2.M.getValue(), (LargeActionButtonDelegate) pixQrRequestAddAmountScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PixQrRequestAddAmountScreen.T;
                        qji.b bVarU2 = pixQrRequestAddAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.qr_request.screen.add_amount.di.PixQrRequestAddAmountScreenInjector");
                        p8a.o0 o0Var = (p8a.o0) bVarU2;
                        d0 d0Var = o0Var.f234044b;
                        p8a.o0 o0Var2 = o0Var.f234045c;
                        PixQrRequestAddAmountScreenContract$InputData pixQrRequestAddAmountScreenContract$InputData = pixQrRequestAddAmountScreen.K;
                        pixQrRequestAddAmountScreenContract$InputData.getClass();
                        return new m0(d0Var, o0Var2, pixQrRequestAddAmountScreenContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        zba.h uiState = (zba.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f222979b.setEnabled(uiState.f320861b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m0) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        BasicNavBar basicNavBar = d3().f222980c;
        Continuation continuation = null;
        basicNavBar.setTitle(new TextLocalisedClause(R$string.pix_qr_request_add_amount_title_short, null, null, 14));
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(basicNavBar.f59211b), null, new d(this, continuation, 0), 3);
        d3().f222979b.setText(new TextLocalisedClause(R$string.pix_qr_request_add_amount_cta_button, null, null, 14));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f222979b.o), null, new d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.M.getValue()).e.f121375b), null, new zba.e(this, null), 3);
    }

    public final o8a.f d3() {
        ViewBinding value = this.R.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (o8a.f) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
