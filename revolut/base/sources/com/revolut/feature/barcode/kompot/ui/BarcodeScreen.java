package com.revolut.feature.barcode.kompot.ui;

import aii.q;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.y9;
import cli.a0;
import cli.o;
import cli.w;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.ScanView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.barcode.R$layout;
import com.revolut.feature.barcode.kompot.ui.BarcodeScreen;
import com.revolut.feature.barcode.kompot.ui.BarcodeScreenContract$ActionButtonConfig;
import com.revolut.feature.barcode.kompot.ui.BarcodeScreenContract$InputData;
import com.revolut.feature.barcode.kompot.ui.BarcodeScreenContract$NavBarConfig;
import com.revolut.kompot.navigable.vc.ViewController;
import dr2.b;
import dr2.g;
import io.fotoapparat.view.CameraView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.qb;
import no.m;
import srh.a;
import vc.s;
import xki.e;
import xq2.c;
import xu.f;
import yhm.d;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/barcode/kompot/ui/BarcodeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lcli/w;", "Ldr2/h;", "Lno/m;", "feature_barcode_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class BarcodeScreen extends ViewController<q> implements w, m {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(BarcodeScreen.class, "binding", "getBinding()Lcom/revolut/feature/barcode/databinding/ScreenBarcodeBinding;", 0))};
    public final BarcodeScreenContract$InputData K;
    public final h L;
    public f M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public BarcodeScreen(BarcodeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.N = R$layout.screen_barcode;
        final int i = 0;
        this.O = te0.w.y0(new Function0(this) { // from class: dr2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BarcodeScreen f117073b;

            {
                this.f117073b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BarcodeScreen barcodeScreen = this.f117073b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BarcodeScreen.R;
                        qji.b bVarU2 = barcodeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.barcode.kompot.di.BarcodeScreenInjector");
                        srh.d dVar = (srh.d) bVarU2;
                        srh.b bVar = dVar.f265223b;
                        srh.d dVar2 = dVar.f265224c;
                        BarcodeScreenContract$InputData barcodeScreenContract$InputData = barcodeScreen.K;
                        barcodeScreenContract$InputData.getClass();
                        return new srh.a(bVar, dVar2, barcodeScreen, barcodeScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = BarcodeScreen.R;
                        return (g) ((srh.a) barcodeScreen.O.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = BarcodeScreen.R;
                        return n14.e.a(barcodeScreen, (g) barcodeScreen.P.getValue());
                }
            }
        });
        final int i2 = 1;
        this.P = te0.w.y0(new Function0(this) { // from class: dr2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BarcodeScreen f117073b;

            {
                this.f117073b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BarcodeScreen barcodeScreen = this.f117073b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BarcodeScreen.R;
                        qji.b bVarU2 = barcodeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.barcode.kompot.di.BarcodeScreenInjector");
                        srh.d dVar = (srh.d) bVarU2;
                        srh.b bVar = dVar.f265223b;
                        srh.d dVar2 = dVar.f265224c;
                        BarcodeScreenContract$InputData barcodeScreenContract$InputData = barcodeScreen.K;
                        barcodeScreenContract$InputData.getClass();
                        return new srh.a(bVar, dVar2, barcodeScreen, barcodeScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = BarcodeScreen.R;
                        return (g) ((srh.a) barcodeScreen.O.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = BarcodeScreen.R;
                        return n14.e.a(barcodeScreen, (g) barcodeScreen.P.getValue());
                }
            }
        });
        final int i3 = 2;
        this.Q = te0.w.y0(new Function0(this) { // from class: dr2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BarcodeScreen f117073b;

            {
                this.f117073b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BarcodeScreen barcodeScreen = this.f117073b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BarcodeScreen.R;
                        qji.b bVarU2 = barcodeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.barcode.kompot.di.BarcodeScreenInjector");
                        srh.d dVar = (srh.d) bVarU2;
                        srh.b bVar = dVar.f265223b;
                        srh.d dVar2 = dVar.f265224c;
                        BarcodeScreenContract$InputData barcodeScreenContract$InputData = barcodeScreen.K;
                        barcodeScreenContract$InputData.getClass();
                        return new srh.a(bVar, dVar2, barcodeScreen, barcodeScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = BarcodeScreen.R;
                        return (g) ((srh.a) barcodeScreen.O.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = BarcodeScreen.R;
                        return n14.e.a(barcodeScreen, (g) barcodeScreen.P.getValue());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        qb qbVar;
        dr2.h uiState = (dr2.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ScanView scanView = d3().f;
        c cVar = uiState.f117077a;
        if (Intrinsics.f(cVar, c.d.f308056a) || Intrinsics.f(cVar, c.a.f308054a)) {
            qbVar = qb.DETECTING;
        } else if (cVar instanceof c.b) {
            qbVar = qb.ERROR;
        } else {
            if (!Intrinsics.f(cVar, c.C1707c.f308055a)) {
                throw new NoWhenBranchMatchedException();
            }
            qbVar = qb.SUCCESS;
        }
        scanView.setState(qbVar);
        scanView.setHelperContent(null);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.K.d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r122 = this.O;
        ar2.c cVar = (ar2.c) ((a) r122.getValue()).e.get();
        Activity activityM2 = m2();
        CameraView barcodeScreenCameraView = d3().d;
        Intrinsics.checkNotNullExpressionValue(barcodeScreenCameraView, "barcodeScreenCameraView");
        this.M = new f(activityM2, barcodeScreenCameraView, (cv.c) ((a) r122.getValue()).f265215g.get(), new dkm.a(1, cVar, ar2.c.class, "onFrameProcess", "onFrameProcess(Lcom/revolut/camera/PhotoVideoCameraFrame;)V", 0, 5));
        BarcodeScreenContract$InputData barcodeScreenContract$InputData = this.K;
        BarcodeScreenContract$NavBarConfig barcodeScreenContract$NavBarConfig = barcodeScreenContract$InputData.f64121a;
        if (Intrinsics.f(barcodeScreenContract$NavBarConfig, BarcodeScreenContract$NavBarConfig.Hidden.f64124a)) {
            NavBarWithToolbar barcodeScreenNavBarWithToolbar = d3().e;
            Intrinsics.checkNotNullExpressionValue(barcodeScreenNavBarWithToolbar, "barcodeScreenNavBarWithToolbar");
            barcodeScreenNavBarWithToolbar.setVisibility(8);
        } else {
            if (!(barcodeScreenContract$NavBarConfig instanceof BarcodeScreenContract$NavBarConfig.Visible)) {
                throw new NoWhenBranchMatchedException();
            }
            NavBarWithToolbar barcodeScreenNavBarWithToolbar2 = d3().e;
            Intrinsics.checkNotNullExpressionValue(barcodeScreenNavBarWithToolbar2, "barcodeScreenNavBarWithToolbar");
            BarcodeScreenContract$NavBarConfig.Visible visible = (BarcodeScreenContract$NavBarConfig.Visible) barcodeScreenContract$NavBarConfig;
            Clause clause = visible.f64126b;
            barcodeScreenNavBarWithToolbar2.setTitle(visible.f64125a, null);
            if (clause != null) {
                d3().e.setDescriptionText(clause);
                d3().e.setDescriptionVisible(true);
            } else {
                d3().e.setDescriptionVisible(false);
            }
            d3().e.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
            d3().e.setExpanded(true);
            NavBarWithToolbar barcodeScreenNavBarWithToolbar3 = d3().e;
            Intrinsics.checkNotNullExpressionValue(barcodeScreenNavBarWithToolbar3, "barcodeScreenNavBarWithToolbar");
            barcodeScreenNavBarWithToolbar3.setVisibility(0);
        }
        BarcodeScreenContract$ActionButtonConfig barcodeScreenContract$ActionButtonConfig = barcodeScreenContract$InputData.f64122b;
        if (barcodeScreenContract$ActionButtonConfig instanceof BarcodeScreenContract$ActionButtonConfig.Hidden) {
            FrameLayout barcodeScreenActionContainer = d3().f315978c;
            Intrinsics.checkNotNullExpressionValue(barcodeScreenActionContainer, "barcodeScreenActionContainer");
            barcodeScreenActionContainer.setVisibility(8);
        } else {
            if (!(barcodeScreenContract$ActionButtonConfig instanceof BarcodeScreenContract$ActionButtonConfig.Visible)) {
                throw new NoWhenBranchMatchedException();
            }
            FrameLayout barcodeScreenActionContainer2 = d3().f315978c;
            Intrinsics.checkNotNullExpressionValue(barcodeScreenActionContainer2, "barcodeScreenActionContainer");
            barcodeScreenActionContainer2.setVisibility(0);
            SmallActionButton smallActionButton = d3().f315977b;
            BarcodeScreenContract$ActionButtonConfig.Visible visible2 = (BarcodeScreenContract$ActionButtonConfig.Visible) barcodeScreenContract$ActionButtonConfig;
            smallActionButton.setText(visible2.f64118a);
            smallActionButton.setIcon(visible2.f64119b);
            smallActionButton.setEndIcon(visible2.f64120c);
            smallActionButton.i(visible2.d);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        f fVar = this.M;
        if (fVar == null) {
            Intrinsics.r("cameraDelegate");
            throw null;
        }
        fVar.b();
        e3(false);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        e3(true);
        f fVar = this.M;
        if (fVar == null) {
            Intrinsics.r("cameraDelegate");
            throw null;
        }
        ((a) this.O.getValue()).getClass();
        if (!fVar.f) {
            fVar.f308844j.postDelayed(new x.b(fVar, 7), 20L);
        }
        f fVar2 = this.M;
        if (fVar2 == null) {
            Intrinsics.r("cameraDelegate");
            throw null;
        }
        ViewController.P2(this, rd0.e.b(fVar2.f308843h), new cyc.c(2, (g) this.P.getValue(), g.class, "onCameraError", "onCameraError(Lio/fotoapparat/exception/camera/CameraException;)V", 4, 10), 3);
        ViewController.P2(this, rd0.e.b(d3().e.f59410q), new dr2.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f315977b.f56386h), new dr2.c(this, null, 1), 3);
    }

    public final yq2.a d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (yq2.a) value;
    }

    public final void e3(boolean z) {
        if (z) {
            Window window = m2().getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            dx0.e.d(window, y9.LIGHT);
        } else {
            Window window2 = m2().getWindow();
            Intrinsics.checkNotNullExpressionValue(window2, "getWindow(...)");
            dx0.e.d(window2, y9.THEME);
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.Q.getValue();
    }
}
