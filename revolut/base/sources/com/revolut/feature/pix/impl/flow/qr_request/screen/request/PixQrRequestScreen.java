package com.revolut.feature.pix.impl.flow.qr_request.screen.request;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import co7.c;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.ActionsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeLoadingDelegate;
import com.revolut.core.ui_kit.delegates.QrCodePlainDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.impl.R$id;
import com.revolut.feature.pix.impl.R$layout;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.qr_request.screen.request.PixQrRequestScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dca.b;
import dca.d;
import dca.f;
import dca.m;
import dca.n;
import dli.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.MutableStateFlow;
import no.d1;
import o8a.g;
import p8a.d0;
import p8a.p0;
import te0.w;
import vc.s;
import vkm.j2;
import xki.e;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/qr_request/screen/request/PixQrRequestScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldca/m;", "Ldli/a;", "Ldca/o;", "Lno/d1;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixQrRequestScreen extends ViewController<m> implements a, d1 {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(PixQrRequestScreen.class, "binding", "getBinding()Lcom/revolut/feature/pix/impl/databinding/ScreenPixRequestBinding;", 0))};
    public final MutableStateFlow K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Lazy P;
    public final Lazy Q;
    public final Lazy R;
    public final Lazy S;
    public final Object T;

    public PixQrRequestScreen(j2 inputDataFlow) {
        Intrinsics.checkNotNullParameter(inputDataFlow, "inputDataFlow");
        this.K = inputDataFlow;
        this.L = R$layout.screen_pix_request;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: dca.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrRequestScreen f112826b;

            {
                this.f112826b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PixQrRequestScreen pixQrRequestScreen = this.f112826b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrRequestScreen.U;
                        qji.b bVarU2 = pixQrRequestScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.qr_request.screen.request.di.PixQrRequestScreenInjector");
                        p8a.o0 o0Var = (p8a.o0) bVarU2;
                        d0 d0Var = o0Var.f234044b;
                        p8a.o0 o0Var2 = o0Var.f234045c;
                        MutableStateFlow mutableStateFlow = pixQrRequestScreen.K;
                        mutableStateFlow.getClass();
                        return new p0(d0Var, o0Var2, pixQrRequestScreen, mutableStateFlow);
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrRequestScreen.U;
                        return (n) ((p0) pixQrRequestScreen.N.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = PixQrRequestScreen.U;
                        PixQrRequestScreen pixQrRequestScreen2 = this.f112826b;
                        return dli.f.a(pixQrRequestScreen2, pixQrRequestScreen2.d(), v.k(new TextDelegate(), new ListSubheaderDelegate(), new QrCodePlainDelegate(), new QRCodeLoadingDelegate(), new ActionsLoadingDelegate(), (CellDetailsActionDelegate) pixQrRequestScreen2.P.getValue(), (CellDetailsNoteDelegate) pixQrRequestScreen2.Q.getValue(), new CellDetailsLoadingDelegate(), (FullScreenStateDelegate) pixQrRequestScreen2.R.getValue(), (ActionsDelegate) pixQrRequestScreen2.S.getValue()), R$id.screenPixArea_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: dca.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrRequestScreen f112826b;

            {
                this.f112826b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PixQrRequestScreen pixQrRequestScreen = this.f112826b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrRequestScreen.U;
                        qji.b bVarU2 = pixQrRequestScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.qr_request.screen.request.di.PixQrRequestScreenInjector");
                        p8a.o0 o0Var = (p8a.o0) bVarU2;
                        d0 d0Var = o0Var.f234044b;
                        p8a.o0 o0Var2 = o0Var.f234045c;
                        MutableStateFlow mutableStateFlow = pixQrRequestScreen.K;
                        mutableStateFlow.getClass();
                        return new p0(d0Var, o0Var2, pixQrRequestScreen, mutableStateFlow);
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrRequestScreen.U;
                        return (n) ((p0) pixQrRequestScreen.N.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = PixQrRequestScreen.U;
                        PixQrRequestScreen pixQrRequestScreen2 = this.f112826b;
                        return dli.f.a(pixQrRequestScreen2, pixQrRequestScreen2.d(), v.k(new TextDelegate(), new ListSubheaderDelegate(), new QrCodePlainDelegate(), new QRCodeLoadingDelegate(), new ActionsLoadingDelegate(), (CellDetailsActionDelegate) pixQrRequestScreen2.P.getValue(), (CellDetailsNoteDelegate) pixQrRequestScreen2.Q.getValue(), new CellDetailsLoadingDelegate(), (FullScreenStateDelegate) pixQrRequestScreen2.R.getValue(), (ActionsDelegate) pixQrRequestScreen2.S.getValue()), R$id.screenPixArea_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = j.b(new d8j.b(9));
        this.Q = j.b(new d8j.b(10));
        this.R = j.b(new d8j.b(11));
        this.S = j.b(new d8j.b(12));
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: dca.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrRequestScreen f112826b;

            {
                this.f112826b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PixQrRequestScreen pixQrRequestScreen = this.f112826b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrRequestScreen.U;
                        qji.b bVarU2 = pixQrRequestScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.qr_request.screen.request.di.PixQrRequestScreenInjector");
                        p8a.o0 o0Var = (p8a.o0) bVarU2;
                        d0 d0Var = o0Var.f234044b;
                        p8a.o0 o0Var2 = o0Var.f234045c;
                        MutableStateFlow mutableStateFlow = pixQrRequestScreen.K;
                        mutableStateFlow.getClass();
                        return new p0(d0Var, o0Var2, pixQrRequestScreen, mutableStateFlow);
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrRequestScreen.U;
                        return (n) ((p0) pixQrRequestScreen.N.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = PixQrRequestScreen.U;
                        PixQrRequestScreen pixQrRequestScreen2 = this.f112826b;
                        return dli.f.a(pixQrRequestScreen2, pixQrRequestScreen2.d(), v.k(new TextDelegate(), new ListSubheaderDelegate(), new QrCodePlainDelegate(), new QRCodeLoadingDelegate(), new ActionsLoadingDelegate(), (CellDetailsActionDelegate) pixQrRequestScreen2.P.getValue(), (CellDetailsNoteDelegate) pixQrRequestScreen2.Q.getValue(), new CellDetailsLoadingDelegate(), (FullScreenStateDelegate) pixQrRequestScreen2.R.getValue(), (ActionsDelegate) pixQrRequestScreen2.S.getValue()), R$id.screenPixArea_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((dca.o) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p0) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        BasicNavBar basicNavBar = ((g) value).f222982b;
        basicNavBar.setTitle(new TextLocalisedClause(R$string.pix_qr_request_title, null, null, 14));
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((g) value).f222982b.f59211b), null, new c(this, null, 28), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.R.getValue()).f52371h.f121375b), null, new dca.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ActionsDelegate) this.S.getValue()).f51611c.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsNoteDelegate) this.Q.getValue()).d), null, new dca.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsActionDelegate) this.P.getValue()).d), null, new f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
