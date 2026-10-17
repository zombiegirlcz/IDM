package com.revolut.sso.impl.ui.qr_challenge.displayer;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.HeroBannerLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeLoadingDelegate;
import com.revolut.core.ui_kit.delegates.QrCodePlainDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LogoWithTaglineView;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.R$id;
import com.revolut.sso.impl.R$layout;
import com.revolut.sso.impl.ui.qr_challenge.displayer.QrDisplayerController;
import com.revolut.sso.impl.ui.qr_challenge.displayer.QrDisplayerControllerContract$InputData;
import dli.a;
import ihm.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ljl.n0;
import ljl.q0;
import te0.w;
import vc.s;
import wol.b;
import wol.c;
import wol.d;
import wol.p;
import wol.t;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/qr_challenge/displayer/QrDisplayerController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwol/p;", "Ldli/a;", "Lwol/q;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QrDisplayerController extends ViewController<p> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(QrDisplayerController.class, "binding", "getBinding()Lcom/revolut/sso/impl/databinding/ScreenQrDisplayerBinding;", 0))};
    public final QrDisplayerControllerContract$InputData K;
    public final int L;
    public final QRCodeDelegate M;
    public final SuggestionsBarDelegate N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public QrDisplayerController(QrDisplayerControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_qr_displayer;
        this.M = new QRCodeDelegate();
        this.N = new SuggestionsBarDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: wol.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QrDisplayerController f298960b;

            {
                this.f298960b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                QrDisplayerController qrDisplayerController = this.f298960b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = QrDisplayerController.S;
                        QrDisplayerController qrDisplayerController2 = this.f298960b;
                        return dli.f.a(qrDisplayerController2, (t) qrDisplayerController2.R.getValue(), v.k(qrDisplayerController2.M, new QrCodePlainDelegate(), new QRCodeLoadingDelegate(), new RowDelegate(null, null, 7), qrDisplayerController2.N, new ListSubheaderDelegate(), new HeroBannerLoadingDelegate()), R$id.screenQrDisplayer_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = QrDisplayerController.S;
                        qji.b bVarU2 = qrDisplayerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.qr_challenge.displayer.di.QrDisplayerControllerInjector");
                        ljl.c cVar = (ljl.c) bVarU2;
                        q0 q0Var = cVar.f;
                        ljl.c cVar2 = cVar.f195894g;
                        QrDisplayerControllerContract$InputData qrDisplayerControllerContract$InputData = qrDisplayerController.K;
                        qrDisplayerControllerContract$InputData.getClass();
                        return new n0(q0Var, cVar2, qrDisplayerControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = QrDisplayerController.S;
                        return (t) ((n0) qrDisplayerController.Q.getValue()).f196040c.get();
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: wol.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QrDisplayerController f298960b;

            {
                this.f298960b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                QrDisplayerController qrDisplayerController = this.f298960b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = QrDisplayerController.S;
                        QrDisplayerController qrDisplayerController2 = this.f298960b;
                        return dli.f.a(qrDisplayerController2, (t) qrDisplayerController2.R.getValue(), v.k(qrDisplayerController2.M, new QrCodePlainDelegate(), new QRCodeLoadingDelegate(), new RowDelegate(null, null, 7), qrDisplayerController2.N, new ListSubheaderDelegate(), new HeroBannerLoadingDelegate()), R$id.screenQrDisplayer_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = QrDisplayerController.S;
                        qji.b bVarU2 = qrDisplayerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.qr_challenge.displayer.di.QrDisplayerControllerInjector");
                        ljl.c cVar = (ljl.c) bVarU2;
                        q0 q0Var = cVar.f;
                        ljl.c cVar2 = cVar.f195894g;
                        QrDisplayerControllerContract$InputData qrDisplayerControllerContract$InputData = qrDisplayerController.K;
                        qrDisplayerControllerContract$InputData.getClass();
                        return new n0(q0Var, cVar2, qrDisplayerControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = QrDisplayerController.S;
                        return (t) ((n0) qrDisplayerController.Q.getValue()).f196040c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: wol.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QrDisplayerController f298960b;

            {
                this.f298960b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                QrDisplayerController qrDisplayerController = this.f298960b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = QrDisplayerController.S;
                        QrDisplayerController qrDisplayerController2 = this.f298960b;
                        return dli.f.a(qrDisplayerController2, (t) qrDisplayerController2.R.getValue(), v.k(qrDisplayerController2.M, new QrCodePlainDelegate(), new QRCodeLoadingDelegate(), new RowDelegate(null, null, 7), qrDisplayerController2.N, new ListSubheaderDelegate(), new HeroBannerLoadingDelegate()), R$id.screenQrDisplayer_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = QrDisplayerController.S;
                        qji.b bVarU2 = qrDisplayerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.qr_challenge.displayer.di.QrDisplayerControllerInjector");
                        ljl.c cVar = (ljl.c) bVarU2;
                        q0 q0Var = cVar.f;
                        ljl.c cVar2 = cVar.f195894g;
                        QrDisplayerControllerContract$InputData qrDisplayerControllerContract$InputData = qrDisplayerController.K;
                        qrDisplayerControllerContract$InputData.getClass();
                        return new n0(q0Var, cVar2, qrDisplayerControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = QrDisplayerController.S;
                        return (t) ((n0) qrDisplayerController.Q.getValue()).f196040c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((wol.q) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n0) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (t) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f115673c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f115672b.setModel(new LogoWithTaglineView.a(new TextLocalisedClause(R$string.revolut_sso_qr_code_slogan, null, null, 14), null, 2));
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f115673c.f59410q), new wkg.e(this, null, 10), 3);
        QRCodeDelegate qRCodeDelegate = this.M;
        ViewController.P2(this, vkm.q.J(rd0.e.b(qRCodeDelegate.u()), rd0.e.b((f) qRCodeDelegate.e.getValue())), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.p().d), new d(this, null), 3);
    }

    public final dkl.o d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (dkl.o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
