package com.revolut.feature.paynow.impl.screens.qr;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeLoadingDelegate;
import com.revolut.core.ui_kit.delegates.QrCodePlainDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.paynow.api.R$string;
import com.revolut.feature.paynow.impl.screens.qr.PayNowQrScreen;
import com.revolut.feature.paynow.impl.screens.qr.PayNowQrScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import czc.d0;
import d7a.b;
import d7a.c;
import d7a.f;
import d7a.g;
import d7a.m;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import t6a.d;
import te0.w;
import vc.s;
import xki.e;
import yhm.j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/paynow/impl/screens/qr/PayNowQrScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ld7a/f;", "Ldli/a;", "Ld7a/m;", "feature_paynow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayNowQrScreen extends ViewController<f> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PayNowQrScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerBasicNavbarActionFooterBinding;", 0))};
    public final PayNowQrScreenContract$InputData K;
    public final int L;
    public final CellDetailsAccountDelegate M;
    public final Lazy N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public PayNowQrScreen(PayNowQrScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_basic_navbar_action_footer;
        this.M = new CellDetailsAccountDelegate();
        this.N = j.b(new d0(20));
        this.O = s.t(this, b.f);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: d7a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayNowQrScreen f111896b;

            {
                this.f111896b = this;
            }

            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PayNowQrScreen payNowQrScreen = this.f111896b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PayNowQrScreen.S;
                        PayNowQrScreen payNowQrScreen2 = this.f111896b;
                        return dli.f.a(payNowQrScreen2, payNowQrScreen2.d(), zhm.v.k(new QRCodeLoadingDelegate(), new QrCodePlainDelegate(), new ListSubheaderDelegate(), payNowQrScreen2.M, (CircleActionButtonsBarDelegate) payNowQrScreen2.N.getValue()), R$id.screenRecyclerBasicNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PayNowQrScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(payNowQrScreen.m2()).a().get(t6a.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t6a.b.class, " is not found"));
                        }
                        t6a.b bVar = ((t6a.b) aVar2.b()).e;
                        PayNowQrScreenContract$InputData payNowQrScreenContract$InputData = payNowQrScreen.K;
                        payNowQrScreenContract$InputData.getClass();
                        return new t6a.d(bVar, payNowQrScreen, payNowQrScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PayNowQrScreen.S;
                        return (g) ((t6a.d) payNowQrScreen.Q.getValue()).f268283g.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: d7a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayNowQrScreen f111896b;

            {
                this.f111896b = this;
            }

            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PayNowQrScreen payNowQrScreen = this.f111896b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayNowQrScreen.S;
                        PayNowQrScreen payNowQrScreen2 = this.f111896b;
                        return dli.f.a(payNowQrScreen2, payNowQrScreen2.d(), zhm.v.k(new QRCodeLoadingDelegate(), new QrCodePlainDelegate(), new ListSubheaderDelegate(), payNowQrScreen2.M, (CircleActionButtonsBarDelegate) payNowQrScreen2.N.getValue()), R$id.screenRecyclerBasicNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PayNowQrScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(payNowQrScreen.m2()).a().get(t6a.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t6a.b.class, " is not found"));
                        }
                        t6a.b bVar = ((t6a.b) aVar2.b()).e;
                        PayNowQrScreenContract$InputData payNowQrScreenContract$InputData = payNowQrScreen.K;
                        payNowQrScreenContract$InputData.getClass();
                        return new t6a.d(bVar, payNowQrScreen, payNowQrScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PayNowQrScreen.S;
                        return (g) ((t6a.d) payNowQrScreen.Q.getValue()).f268283g.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: d7a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayNowQrScreen f111896b;

            {
                this.f111896b = this;
            }

            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PayNowQrScreen payNowQrScreen = this.f111896b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayNowQrScreen.S;
                        PayNowQrScreen payNowQrScreen2 = this.f111896b;
                        return dli.f.a(payNowQrScreen2, payNowQrScreen2.d(), zhm.v.k(new QRCodeLoadingDelegate(), new QrCodePlainDelegate(), new ListSubheaderDelegate(), payNowQrScreen2.M, (CircleActionButtonsBarDelegate) payNowQrScreen2.N.getValue()), R$id.screenRecyclerBasicNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PayNowQrScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(payNowQrScreen.m2()).a().get(t6a.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t6a.b.class, " is not found"));
                        }
                        t6a.b bVar = ((t6a.b) aVar2.b()).e;
                        PayNowQrScreenContract$InputData payNowQrScreenContract$InputData = payNowQrScreen.K;
                        payNowQrScreenContract$InputData.getClass();
                        return new t6a.d(bVar, payNowQrScreen, payNowQrScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PayNowQrScreen.S;
                        return (g) ((t6a.d) payNowQrScreen.Q.getValue()).f268283g.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        i iVar = uiState.f111906b;
        if (iVar != null) {
            d3().f174527b.setModel(iVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        BasicNavBar basicNavBar = d3().f174528c;
        basicNavBar.setTitle(new TextLocalisedClause(R$string.topup_paynow_header_title, null, null, 14));
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().d.setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
        boolean z = this.K.f80300b;
        jii.i iVarD3 = d3();
        ActionFooterView actionFooterView = iVarD3.f174527b;
        Intrinsics.checkNotNullExpressionValue(actionFooterView, "screenRecyclerBasicNavba…ionFooterActionFooterView");
        int iK = 0;
        actionFooterView.setVisibility(z ? 0 : 8);
        ScreenContentRecyclerView screenContentRecyclerView = iVarD3.d;
        if (!z) {
            Context context = screenContentRecyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iK = kli.a.k(context, 96.0f);
        }
        screenContentRecyclerView.setPaddingRelative(screenContentRecyclerView.getPaddingStart(), screenContentRecyclerView.getPaddingTop(), screenContentRecyclerView.getPaddingEnd(), iK);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174528c.f59211b), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(((CircleActionButtonsBarDelegate) this.N.getValue()).f52087c.f121375b), new d7a.d(this, null), 3);
        CellDetailsAccountDelegate cellDetailsAccountDelegate = this.M;
        ViewController.P2(this, vkm.q.J(rd0.e.b(cellDetailsAccountDelegate.e), rd0.e.b(cellDetailsAccountDelegate.d)), new cvi.j(this, (Continuation) null, 24), 3);
        ViewController.P2(this, rd0.e.b(d3().f174527b.f), new c(this, null, 1), 3);
    }

    public final jii.i d3() {
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.i) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
