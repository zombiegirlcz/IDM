package com.revolut.feature.apm.core.ui.impl.ui.qr.details.screen;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.QRCodeLoadingDelegate;
import com.revolut.core.ui_kit.delegates.QrCodePlainDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.apm.core.ui.impl.R$id;
import com.revolut.feature.apm.core.ui.impl.R$layout;
import com.revolut.feature.apm.core.ui.impl.ui.qr.details.screen.QrDetailsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import pt4.d;
import q1l.e;
import q32.c;
import q32.h;
import q32.i;
import q32.k;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/qr/details/screen/QrDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lq32/h;", "Ldli/a;", "Lq32/i;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QrDetailsScreen extends ViewController<h> implements a {
    public static final /* synthetic */ int T = 0;
    public final boolean K;
    public final int L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public QrDetailsScreen(QrDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = true;
        this.L = R$layout.screen_qr_details;
        this.M = R$style.UiKitTheme_Transparent;
        this.N = w.y0(new d(this, inputData, 17));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: q32.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QrDetailsScreen f241772b;

            {
                this.f241772b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        p12.i iVar = (p12.i) this.f241772b.N.getValue();
                        switch (iVar.f231679a) {
                            case 0:
                                return (k) iVar.f.get();
                            default:
                                return (k) iVar.f.get();
                        }
                    default:
                        QrDetailsScreen qrDetailsScreen = this.f241772b;
                        return dli.f.a(qrDetailsScreen, (k) qrDetailsScreen.O.getValue(), v.k(new QrCodePlainDelegate(), new QRCodeLoadingDelegate(), (ScrollerBoxDelegate) qrDetailsScreen.R.getValue(), (SmallActionButtonDelegate) qrDetailsScreen.Q.getValue(), (TextDelegate) qrDetailsScreen.P.getValue()), R$id.qrDetails_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new e(10));
        this.Q = w.y0(new e(11));
        this.R = w.y0(new e(12));
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: q32.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QrDetailsScreen f241772b;

            {
                this.f241772b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        p12.i iVar = (p12.i) this.f241772b.N.getValue();
                        switch (iVar.f231679a) {
                            case 0:
                                return (k) iVar.f.get();
                            default:
                                return (k) iVar.f.get();
                        }
                    default:
                        QrDetailsScreen qrDetailsScreen = this.f241772b;
                        return dli.f.a(qrDetailsScreen, (k) qrDetailsScreen.O.getValue(), v.k(new QrCodePlainDelegate(), new QRCodeLoadingDelegate(), (ScrollerBoxDelegate) qrDetailsScreen.R.getValue(), (SmallActionButtonDelegate) qrDetailsScreen.Q.getValue(), (TextDelegate) qrDetailsScreen.P.getValue()), R$id.qrDetails_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((k) this.O.getValue()).C2(h.f241777a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p12.i) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b k3() {
        return (k) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((TextDelegate) this.P.getValue()).f53530c), null, new q32.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SmallActionButtonDelegate) this.Q.getValue()).f53336c.f121375b), null, new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.K);
    }
}
