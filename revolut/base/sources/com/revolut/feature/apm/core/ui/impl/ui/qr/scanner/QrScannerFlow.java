package com.revolut.feature.apm.core.ui.impl.ui.qr.scanner;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.ui.api.navigation.qr.QrScannerInputData;
import com.revolut.feature.apm.core.ui.impl.R$id;
import com.revolut.feature.apm.core.ui.impl.R$layout;
import com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.QrScannerFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import g12.l;
import g12.q;
import g12.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m12.j;
import n32.i;
import n32.k;
import p12.g;
import te0.w;
import v32.b;
import v32.c;
import vc.s;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/qr/scanner/QrScannerFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lg12/q;", "Lyki/f;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QrScannerFlow extends ViewController<q> implements f {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(QrScannerFlow.class, "binding", "getBinding()Lcom/revolut/feature/apm/core/ui/impl/databinding/ScreenQrScannerContainerBinding;", 0))};
    public final QrScannerInputData K;
    public i L;
    public final boolean M;
    public final int N;
    public final int O;
    public final h P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public QrScannerFlow(QrScannerInputData inputData, l qrHandler) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(qrHandler, "qrHandler");
        this.K = inputData;
        this.M = true;
        this.N = R$layout.screen_qr_scanner_container;
        this.O = R$style.UiKitTheme_Mono;
        this.P = s.t(this, b.f);
        this.Q = w.y0(new v0c.b(this, qrHandler, 11));
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: v32.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QrScannerFlow f285850b;

            {
                this.f285850b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                QrScannerFlow qrScannerFlow = this.f285850b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = QrScannerFlow.T;
                        return (c) ((g) qrScannerFlow.Q.getValue()).o.get();
                    default:
                        KProperty[] kPropertyArr2 = QrScannerFlow.T;
                        return czi.c.d(R$id.qrScannerContainer_container, 4, null, qrScannerFlow, (c) qrScannerFlow.R.getValue());
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: v32.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QrScannerFlow f285850b;

            {
                this.f285850b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                QrScannerFlow qrScannerFlow = this.f285850b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = QrScannerFlow.T;
                        return (c) ((g) qrScannerFlow.Q.getValue()).o.get();
                    default:
                        KProperty[] kPropertyArr2 = QrScannerFlow.T;
                        return czi.c.d(R$id.qrScannerContainer_container, 4, null, qrScannerFlow, (c) qrScannerFlow.R.getValue());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getN() {
        return Integer.valueOf(this.O);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (g) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        this.L = (i) ((g) this.Q.getValue()).f231660b.f231633h.get();
        NavBarWithToolbar navBarWithToolbar = d3().f201216b;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        navBarWithToolbar.setBackgroundColor(kli.a.s(R$attr.uikit_colorTransparent, context));
        navBarWithToolbar.setExpanded(false, false);
        navBarWithToolbar.j0(false);
        QrScannerInputData qrScannerInputData = this.K;
        navBarWithToolbar.setTitle(qrScannerInputData.f62335b, null);
        Clause clause = qrScannerInputData.f62335b;
        if (clause != null) {
            navBarWithToolbar.setToolbarTitle(clause);
        }
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246));
        i iVar = this.L;
        if (iVar == null) {
            Intrinsics.r("navBarMapper");
            throw null;
        }
        navBarWithToolbar.setMenuItems(((k) iVar).a(r.SCAN));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f201216b.f59410q), null, new uwe.f(this, null, 6), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f201216b.o.f57403b), null, new up2.q(this, null, 29), 3);
    }

    public final j d3() {
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (j) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getZ() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.S.getValue();
    }
}
