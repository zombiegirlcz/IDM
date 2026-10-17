package com.revolut.feature.crypto.receive_widget.impl.ui.customize;

import aii.r;
import com.revolut.feature.crypto.receive_widget.impl.ui.customize.CryptoReceiveWidgetCustomizationController;
import com.revolut.feature.crypto.remittance.impl.ui.currency_picker.flow.CurrencyChooserFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/receive_widget/impl/ui/customize/CryptoReceiveWidgetCustomizationController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/r;", "Lyki/f;", "feature_crypto_receive_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoReceiveWidgetCustomizationController extends ViewController<r> implements f {
    public final CurrencyChooserFlow K;
    public final Object L;
    public final Object M;
    public final Object N;

    public CryptoReceiveWidgetCustomizationController(CurrencyChooserFlow onboardedController) {
        Intrinsics.checkNotNullParameter(onboardedController, "onboardedController");
        this.K = onboardedController;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: kj5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoReceiveWidgetCustomizationController f184291b;

            {
                this.f184291b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CryptoReceiveWidgetCustomizationController cryptoReceiveWidgetCustomizationController = this.f184291b;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoReceiveWidgetCustomizationController.m2()).a().get(jj5.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jj5.b.class, " is not found"));
                        }
                        jj5.c cVar = new jj5.c(((jj5.b) aVar2.b()).f174639h);
                        a aVar3 = (a) cVar.f174641b.get();
                        CurrencyChooserFlow onboardedController2 = cryptoReceiveWidgetCustomizationController.K;
                        com.revolut.feature.crypto.receive_widget.impl.ui.customize.c cVar2 = (com.revolut.feature.crypto.receive_widget.impl.ui.customize.c) aVar3;
                        cVar2.getClass();
                        Intrinsics.checkNotNullParameter(onboardedController2, "onboardedController");
                        cVar2.z = onboardedController2;
                        return cVar;
                    case 1:
                        return (a) ((jj5.c) this.f184291b.L.getValue()).f174641b.get();
                    default:
                        CryptoReceiveWidgetCustomizationController cryptoReceiveWidgetCustomizationController2 = this.f184291b;
                        return czi.c.d(0, 6, null, cryptoReceiveWidgetCustomizationController2, (a) cryptoReceiveWidgetCustomizationController2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: kj5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoReceiveWidgetCustomizationController f184291b;

            {
                this.f184291b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CryptoReceiveWidgetCustomizationController cryptoReceiveWidgetCustomizationController = this.f184291b;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoReceiveWidgetCustomizationController.m2()).a().get(jj5.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jj5.b.class, " is not found"));
                        }
                        jj5.c cVar = new jj5.c(((jj5.b) aVar2.b()).f174639h);
                        a aVar3 = (a) cVar.f174641b.get();
                        CurrencyChooserFlow onboardedController2 = cryptoReceiveWidgetCustomizationController.K;
                        com.revolut.feature.crypto.receive_widget.impl.ui.customize.c cVar2 = (com.revolut.feature.crypto.receive_widget.impl.ui.customize.c) aVar3;
                        cVar2.getClass();
                        Intrinsics.checkNotNullParameter(onboardedController2, "onboardedController");
                        cVar2.z = onboardedController2;
                        return cVar;
                    case 1:
                        return (a) ((jj5.c) this.f184291b.L.getValue()).f174641b.get();
                    default:
                        CryptoReceiveWidgetCustomizationController cryptoReceiveWidgetCustomizationController2 = this.f184291b;
                        return czi.c.d(0, 6, null, cryptoReceiveWidgetCustomizationController2, (a) cryptoReceiveWidgetCustomizationController2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: kj5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoReceiveWidgetCustomizationController f184291b;

            {
                this.f184291b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CryptoReceiveWidgetCustomizationController cryptoReceiveWidgetCustomizationController = this.f184291b;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoReceiveWidgetCustomizationController.m2()).a().get(jj5.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jj5.b.class, " is not found"));
                        }
                        jj5.c cVar = new jj5.c(((jj5.b) aVar2.b()).f174639h);
                        a aVar3 = (a) cVar.f174641b.get();
                        CurrencyChooserFlow onboardedController2 = cryptoReceiveWidgetCustomizationController.K;
                        com.revolut.feature.crypto.receive_widget.impl.ui.customize.c cVar2 = (com.revolut.feature.crypto.receive_widget.impl.ui.customize.c) aVar3;
                        cVar2.getClass();
                        Intrinsics.checkNotNullParameter(onboardedController2, "onboardedController");
                        cVar2.z = onboardedController2;
                        return cVar;
                    case 1:
                        return (a) ((jj5.c) this.f184291b.L.getValue()).f174641b.get();
                    default:
                        CryptoReceiveWidgetCustomizationController cryptoReceiveWidgetCustomizationController2 = this.f184291b;
                        return czi.c.d(0, 6, null, cryptoReceiveWidgetCustomizationController2, (a) cryptoReceiveWidgetCustomizationController2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (jj5.c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (jj5.c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (kj5.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
