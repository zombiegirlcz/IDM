package com.revolut.feature.alipay.impl.ui.qr.scanner;

import android.view.View;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit.views.ScanView;
import com.revolut.core.ui_kit.views.TextSwitcherView;
import com.revolut.feature.alipay.impl.R$id;
import com.revolut.feature.alipay.impl.R$layout;
import com.revolut.feature.alipay.impl.ui.qr.scanner.AlipayPlusQrScannerFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import mx0.qb;
import ok1.g;
import qji.b;
import te0.w;
import vc.s;
import xk1.c;
import xk1.f;
import xki.e;
import yp0.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/alipay/impl/ui/qr/scanner/AlipayPlusQrScannerFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lxk1/f;", "Lwki/a;", "Lxk1/h;", "<init>", "()V", "feature_alipay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AlipayPlusQrScannerFlow extends ViewController<f> implements wki.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(AlipayPlusQrScannerFlow.class, "binding", "getBinding()Lcom/revolut/feature/alipay/impl/databinding/FlowAlipayPlusQrScannerBinding;", 0))};
    public final Object M;
    public final Object N;
    public final Object P;
    public final int K = R$layout.flow_alipay_plus_qr_scanner;
    public final int L = R$style.UiKitTheme_Mono;
    public final h O = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, lk1.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/alipay/impl/databinding/FlowAlipayPlusQrScannerBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.alipayPlusQrScanner_avatars;
            OverlappedIconsView overlappedIconsView = (OverlappedIconsView) ViewBindings.findChildViewById(p0, i);
            if (overlappedIconsView != null) {
                i = R$id.alipayPlusQrScanner_cameraContainer;
                if (((ControllerContainerFrameLayout) ViewBindings.findChildViewById(p0, i)) != null) {
                    i = R$id.alipayPlusQrScanner_frameTopGuideline;
                    if (((Guideline) ViewBindings.findChildViewById(p0, i)) != null) {
                        i = R$id.alipayPlusQrScanner_prompt;
                        TextSwitcherView textSwitcherView = (TextSwitcherView) ViewBindings.findChildViewById(p0, i);
                        if (textSwitcherView != null) {
                            i = R$id.alipayPlusQrScanner_scanView;
                            ScanView scanView = (ScanView) ViewBindings.findChildViewById(p0, i);
                            if (scanView != null) {
                                return new lk1.a((ControllerContainerConstraintLayout) p0, overlappedIconsView, textSwitcherView, scanView);
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public AlipayPlusQrScannerFlow() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: xk1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlipayPlusQrScannerFlow f306593b;

            {
                this.f306593b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AlipayPlusQrScannerFlow alipayPlusQrScannerFlow = this.f306593b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AlipayPlusQrScannerFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(alipayPlusQrScannerFlow.m2()).a().get(ok1.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ok1.d.class, " is not found"));
                        }
                        ok1.d dVar = ((ok1.d) aVar2.b()).f225863h;
                        ok1.g gVar = new ok1.g();
                        gVar.f225875a = e4m.b.b(new ogf.b(dVar, 5));
                        return gVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AlipayPlusQrScannerFlow.Q;
                        return (c) ((ok1.g) alipayPlusQrScannerFlow.M.getValue()).f225875a.get();
                    default:
                        KProperty[] kPropertyArr3 = AlipayPlusQrScannerFlow.Q;
                        return md6.s.a(alipayPlusQrScannerFlow, (c) alipayPlusQrScannerFlow.N.getValue(), R$id.alipayPlusQrScanner_cameraContainer, 4);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: xk1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlipayPlusQrScannerFlow f306593b;

            {
                this.f306593b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AlipayPlusQrScannerFlow alipayPlusQrScannerFlow = this.f306593b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AlipayPlusQrScannerFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(alipayPlusQrScannerFlow.m2()).a().get(ok1.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ok1.d.class, " is not found"));
                        }
                        ok1.d dVar = ((ok1.d) aVar2.b()).f225863h;
                        ok1.g gVar = new ok1.g();
                        gVar.f225875a = e4m.b.b(new ogf.b(dVar, 5));
                        return gVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AlipayPlusQrScannerFlow.Q;
                        return (c) ((ok1.g) alipayPlusQrScannerFlow.M.getValue()).f225875a.get();
                    default:
                        KProperty[] kPropertyArr3 = AlipayPlusQrScannerFlow.Q;
                        return md6.s.a(alipayPlusQrScannerFlow, (c) alipayPlusQrScannerFlow.N.getValue(), R$id.alipayPlusQrScanner_cameraContainer, 4);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: xk1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlipayPlusQrScannerFlow f306593b;

            {
                this.f306593b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AlipayPlusQrScannerFlow alipayPlusQrScannerFlow = this.f306593b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AlipayPlusQrScannerFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(alipayPlusQrScannerFlow.m2()).a().get(ok1.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ok1.d.class, " is not found"));
                        }
                        ok1.d dVar = ((ok1.d) aVar2.b()).f225863h;
                        ok1.g gVar = new ok1.g();
                        gVar.f225875a = e4m.b.b(new ogf.b(dVar, 5));
                        return gVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AlipayPlusQrScannerFlow.Q;
                        return (c) ((ok1.g) alipayPlusQrScannerFlow.M.getValue()).f225875a.get();
                    default:
                        KProperty[] kPropertyArr3 = AlipayPlusQrScannerFlow.Q;
                        return md6.s.a(alipayPlusQrScannerFlow, (c) alipayPlusQrScannerFlow.N.getValue(), R$id.alipayPlusQrScanner_cameraContainer, 4);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getK() {
        return Integer.valueOf(this.L);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        xk1.h uiState = (xk1.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f196180c.setText(uiState.f306597a, true);
        OverlappedIconsView alipayPlusQrScannerAvatars = d3().f196179b;
        Intrinsics.checkNotNullExpressionValue(alipayPlusQrScannerAvatars, "alipayPlusQrScannerAvatars");
        u.a(alipayPlusQrScannerAvatars, uiState.f306598b, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().d.setState(qb.DETECTING);
        TextSwitcherView textSwitcherView = d3().f196180c;
        textSwitcherView.setInAnimatorFactory(new x2l.a(7, false));
        textSwitcherView.setOutAnimatorFactory(new x2l.a(8, false));
    }

    public final lk1.a d3() {
        ViewBinding value = this.O.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (lk1.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (wki.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.FALSE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (wki.c) this.P.getValue();
    }
}
