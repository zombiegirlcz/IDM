package com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr;

import android.content.Context;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.TiltGlowCardContainerView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.payments.splitbill.api.R$string;
import com.revolut.feature.payments.splitbill.api.navigation.SplitBillQrInputData;
import com.revolut.feature.payments.splitbill.impl.R$id;
import com.revolut.feature.payments.splitbill.impl.R$layout;
import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.SplitBillQrScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import j1a.g;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import u1a.d;
import u1a.i;
import u1a.k;
import vc.s;
import xki.e;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/splitbill/impl/ui_new/link_context/qr/SplitBillQrScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lu1a/i;", "Ldli/a;", "Lu1a/k;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SplitBillQrScreen extends ViewController<i> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(SplitBillQrScreen.class, "binding", "getBinding()Lcom/revolut/feature/payments/splitbill/impl/databinding/ScreenSplitBillQrBinding;", 0))};
    public final SplitBillQrInputData K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final Object O;
    public final Object P;
    public final Lazy Q;

    public SplitBillQrScreen(SplitBillQrInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_split_bill_qr;
        this.M = s.t(this, d.f);
        this.N = new RowDelegate(null, null, 7);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: u1a.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplitBillQrScreen f276368b;

            {
                this.f276368b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SplitBillQrScreen splitBillQrScreen = this.f276368b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SplitBillQrScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(splitBillQrScreen.m2()).a().get(v0a.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v0a.b.class, " is not found"));
                        }
                        j1a.i iVar = ((j1a.i) aVar2.b()).f170313p;
                        SplitBillQrInputData splitBillQrInputData = splitBillQrScreen.K;
                        splitBillQrInputData.getClass();
                        return new j1a.g(iVar, splitBillQrInputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SplitBillQrScreen.R;
                        return (j) ((j1a.g) splitBillQrScreen.O.getValue()).f170301c.get();
                    default:
                        KProperty[] kPropertyArr3 = SplitBillQrScreen.R;
                        SplitBillQrScreen splitBillQrScreen2 = this.f276368b;
                        return dli.f.a(splitBillQrScreen2, (j) splitBillQrScreen2.P.getValue(), v.k(new RowLoadingDelegate(), splitBillQrScreen2.N), R$id.splitBillQr_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: u1a.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplitBillQrScreen f276368b;

            {
                this.f276368b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SplitBillQrScreen splitBillQrScreen = this.f276368b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SplitBillQrScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(splitBillQrScreen.m2()).a().get(v0a.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v0a.b.class, " is not found"));
                        }
                        j1a.i iVar = ((j1a.i) aVar2.b()).f170313p;
                        SplitBillQrInputData splitBillQrInputData = splitBillQrScreen.K;
                        splitBillQrInputData.getClass();
                        return new j1a.g(iVar, splitBillQrInputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SplitBillQrScreen.R;
                        return (j) ((j1a.g) splitBillQrScreen.O.getValue()).f170301c.get();
                    default:
                        KProperty[] kPropertyArr3 = SplitBillQrScreen.R;
                        SplitBillQrScreen splitBillQrScreen2 = this.f276368b;
                        return dli.f.a(splitBillQrScreen2, (j) splitBillQrScreen2.P.getValue(), v.k(new RowLoadingDelegate(), splitBillQrScreen2.N), R$id.splitBillQr_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = j.b(new Function0(this) { // from class: u1a.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplitBillQrScreen f276368b;

            {
                this.f276368b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SplitBillQrScreen splitBillQrScreen = this.f276368b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SplitBillQrScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(splitBillQrScreen.m2()).a().get(v0a.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v0a.b.class, " is not found"));
                        }
                        j1a.i iVar = ((j1a.i) aVar2.b()).f170313p;
                        SplitBillQrInputData splitBillQrInputData = splitBillQrScreen.K;
                        splitBillQrInputData.getClass();
                        return new j1a.g(iVar, splitBillQrInputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SplitBillQrScreen.R;
                        return (j) ((j1a.g) splitBillQrScreen.O.getValue()).f170301c.get();
                    default:
                        KProperty[] kPropertyArr3 = SplitBillQrScreen.R;
                        SplitBillQrScreen splitBillQrScreen2 = this.f276368b;
                        return dli.f.a(splitBillQrScreen2, (j) splitBillQrScreen2.P.getValue(), v.k(new RowLoadingDelegate(), splitBillQrScreen2.N), R$id.splitBillQr_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f139570c.setModel(uiState.f276373a);
        d3().f139569b.setTitle(new TextLocalisedClause(R$string.split_with_anyone_qr_screen_title, null, null, 14));
        d3().f139569b.setMenuItems(uiState.f276374b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (u1a.j) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f139569b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TiltGlowCardContainerView tiltGlowCardContainerView = d3().d;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_colorForeground_10, context);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        tiltGlowCardContainerView.setChildDominantColor(ColorUtils.compositeColors(iS, kli.a.s(R$attr.uikit_colorBackground, context2)));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f139569b.f59211b), new u1a.e(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f139570c.f()), new u1a.e(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f139570c.g()), new u1a.e(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().f139569b.f59210a.f57403b), new tz6.e(this, (Continuation) null, 5), 3);
    }

    public final g1a.a d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (g1a.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
