package com.revolut.feature.payments.transfers.personalisation.impl.ui.flow;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.transfers.personalisation.impl.R$id;
import com.revolut.feature.payments.transfers.personalisation.impl.R$layout;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.flow.TransfersPersonalisationFlow;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.flow.TransfersPersonalisationFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import g2a.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import o2a.c;
import t05.m;
import t2a.b;
import t2a.d;
import t2a.g;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/transfers/personalisation/impl/ui/flow/TransfersPersonalisationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lg2a/f;", "Lwki/a;", "Lt2a/g;", "feature_payments_transfers_personalisation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransfersPersonalisationFlow extends ViewController<f> implements wki.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TransfersPersonalisationFlow.class, "binding", "getBinding()Lcom/revolut/feature/payments/transfers/personalisation/impl/databinding/TransfersPersonalisationFlowBinding;", 0))};
    public final TransfersPersonalisationFlowContract$InputData K;
    public final h L;
    public final int M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public TransfersPersonalisationFlow(TransfersPersonalisationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.transfers_personalisation_flow;
        this.N = R$style.UiKitTheme_Mono;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: t2a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransfersPersonalisationFlow f267519b;

            {
                this.f267519b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransfersPersonalisationFlow transfersPersonalisationFlow = this.f267519b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransfersPersonalisationFlow.R;
                        return md6.s.a(transfersPersonalisationFlow, (d) transfersPersonalisationFlow.Q.getValue(), R$id.transfersPersonalisationFlow_container, 4);
                    case 1:
                        KProperty[] kPropertyArr2 = TransfersPersonalisationFlow.R;
                        phm.a aVar = (phm.a) ue0.e.j(transfersPersonalisationFlow.m2()).a().get(o2a.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o2a.b.class, " is not found"));
                        }
                        o2a.b bVar = ((o2a.b) aVar2.b()).e;
                        TransfersPersonalisationFlowContract$InputData transfersPersonalisationFlowContract$InputData = transfersPersonalisationFlow.K;
                        transfersPersonalisationFlowContract$InputData.getClass();
                        return new o2a.c(bVar, transfersPersonalisationFlowContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TransfersPersonalisationFlow.R;
                        return (d) ((o2a.c) transfersPersonalisationFlow.P.getValue()).f221602b.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: t2a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransfersPersonalisationFlow f267519b;

            {
                this.f267519b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransfersPersonalisationFlow transfersPersonalisationFlow = this.f267519b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransfersPersonalisationFlow.R;
                        return md6.s.a(transfersPersonalisationFlow, (d) transfersPersonalisationFlow.Q.getValue(), R$id.transfersPersonalisationFlow_container, 4);
                    case 1:
                        KProperty[] kPropertyArr2 = TransfersPersonalisationFlow.R;
                        phm.a aVar = (phm.a) ue0.e.j(transfersPersonalisationFlow.m2()).a().get(o2a.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o2a.b.class, " is not found"));
                        }
                        o2a.b bVar = ((o2a.b) aVar2.b()).e;
                        TransfersPersonalisationFlowContract$InputData transfersPersonalisationFlowContract$InputData = transfersPersonalisationFlow.K;
                        transfersPersonalisationFlowContract$InputData.getClass();
                        return new o2a.c(bVar, transfersPersonalisationFlowContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TransfersPersonalisationFlow.R;
                        return (d) ((o2a.c) transfersPersonalisationFlow.P.getValue()).f221602b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: t2a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransfersPersonalisationFlow f267519b;

            {
                this.f267519b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TransfersPersonalisationFlow transfersPersonalisationFlow = this.f267519b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransfersPersonalisationFlow.R;
                        return md6.s.a(transfersPersonalisationFlow, (d) transfersPersonalisationFlow.Q.getValue(), R$id.transfersPersonalisationFlow_container, 4);
                    case 1:
                        KProperty[] kPropertyArr2 = TransfersPersonalisationFlow.R;
                        phm.a aVar = (phm.a) ue0.e.j(transfersPersonalisationFlow.m2()).a().get(o2a.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o2a.b.class, " is not found"));
                        }
                        o2a.b bVar = ((o2a.b) aVar2.b()).e;
                        TransfersPersonalisationFlowContract$InputData transfersPersonalisationFlowContract$InputData = transfersPersonalisationFlow.K;
                        transfersPersonalisationFlowContract$InputData.getClass();
                        return new o2a.c(bVar, transfersPersonalisationFlowContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TransfersPersonalisationFlow.R;
                        return (d) ((o2a.c) transfersPersonalisationFlow.P.getValue()).f221602b.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getK() {
        return Integer.valueOf(this.N);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f191729b.setHeaderContent(uiState.f267522a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (c) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (d) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        BasicNavBar basicNavBar = d3().f191729b;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        basicNavBar.setBackgroundColor(kli.a.s(R$attr.uikit_colorTransparent, context));
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f191729b.o), new t2a.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f191729b.f59211b), new m(this, null, 5), 3);
    }

    public final l2a.d d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (l2a.d) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (wki.c) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (wki.c) this.O.getValue();
    }
}
