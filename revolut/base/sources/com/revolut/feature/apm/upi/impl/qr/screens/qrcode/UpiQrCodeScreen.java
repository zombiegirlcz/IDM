package com.revolut.feature.apm.upi.impl.qr.screens.qrcode;

import aii.q;
import android.view.View;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeLoadingDelegate;
import com.revolut.core.ui_kit.delegates.QrCodePlainDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalSmallButtonDelegate;
import com.revolut.feature.apm.upi.impl.R$id;
import com.revolut.feature.apm.upi.impl.R$layout;
import com.revolut.feature.apm.upi.impl.qr.screens.qrcode.UpiQrCodeScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import if2.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mg2.c;
import mg2.j;
import pki.b;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/qr/screens/qrcode/UpiQrCodeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lmg2/j;", "<init>", "()V", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpiQrCodeScreen extends ViewController<q> implements a {
    public final Object L;
    public final Object O;
    public final Object P;
    public final int K = R$layout.screen_upi_qrcode;
    public final TwinHorizontalSmallButtonDelegate M = new TwinHorizontalSmallButtonDelegate();
    public final TextDelegate N = new TextDelegate();

    public UpiQrCodeScreen() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: mg2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiQrCodeScreen f205140b;

            {
                this.f205140b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                UpiQrCodeScreen upiQrCodeScreen = this.f205140b;
                switch (i2) {
                    case 0:
                        return (e) ((if2.l) upiQrCodeScreen.O.getValue()).d.get();
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(upiQrCodeScreen.m2()).a().get(if2.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new if2.l(((if2.f) aVar2.b()).f160865w, upiQrCodeScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", if2.f.class, " is not found"));
                    default:
                        UpiQrCodeScreen upiQrCodeScreen2 = this.f205140b;
                        return dli.f.a(upiQrCodeScreen2, (e) upiQrCodeScreen2.L.getValue(), v.k(new QrCodePlainDelegate(), new QRCodeLoadingDelegate(), upiQrCodeScreen2.M, new SimpleMediaDelegate(), new FullScreenStateDelegate(), upiQrCodeScreen2.N), R$id.upiQrCode_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: mg2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiQrCodeScreen f205140b;

            {
                this.f205140b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                UpiQrCodeScreen upiQrCodeScreen = this.f205140b;
                switch (i22) {
                    case 0:
                        return (e) ((if2.l) upiQrCodeScreen.O.getValue()).d.get();
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(upiQrCodeScreen.m2()).a().get(if2.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new if2.l(((if2.f) aVar2.b()).f160865w, upiQrCodeScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", if2.f.class, " is not found"));
                    default:
                        UpiQrCodeScreen upiQrCodeScreen2 = this.f205140b;
                        return dli.f.a(upiQrCodeScreen2, (e) upiQrCodeScreen2.L.getValue(), v.k(new QrCodePlainDelegate(), new QRCodeLoadingDelegate(), upiQrCodeScreen2.M, new SimpleMediaDelegate(), new FullScreenStateDelegate(), upiQrCodeScreen2.N), R$id.upiQrCode_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: mg2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiQrCodeScreen f205140b;

            {
                this.f205140b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                UpiQrCodeScreen upiQrCodeScreen = this.f205140b;
                switch (i22) {
                    case 0:
                        return (e) ((if2.l) upiQrCodeScreen.O.getValue()).d.get();
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(upiQrCodeScreen.m2()).a().get(if2.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new if2.l(((if2.f) aVar2.b()).f160865w, upiQrCodeScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", if2.f.class, " is not found"));
                    default:
                        UpiQrCodeScreen upiQrCodeScreen2 = this.f205140b;
                        return dli.f.a(upiQrCodeScreen2, (e) upiQrCodeScreen2.L.getValue(), v.k(new QrCodePlainDelegate(), new QRCodeLoadingDelegate(), upiQrCodeScreen2.M, new SimpleMediaDelegate(), new FullScreenStateDelegate(), upiQrCodeScreen2.N), R$id.upiQrCode_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (mg2.e) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TwinHorizontalSmallButtonDelegate twinHorizontalSmallButtonDelegate = this.M;
        ViewController.P2(this, rd0.e.b(twinHorizontalSmallButtonDelegate.f53573c.f121375b), new mg2.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalSmallButtonDelegate.d.f121375b), null, new mg2.b(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53530c), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
