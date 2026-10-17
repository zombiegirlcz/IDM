package com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.qr;

import aii.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.feature.profile_card.BaseProfileCardScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import q7k.h;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/qr_link/qr/PaymentLinkQrScreen;", "Lcom/revolut/feature/profile_card/BaseProfileCardScreen;", "Lk8k/a;", "Laii/q;", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentLinkQrScreen extends BaseProfileCardScreen<k8k.a, q> {
    public final Integer R;
    public final Object S;
    public final Object T;

    public PaymentLinkQrScreen(PaymentLinkQrScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.R = Integer.valueOf(R$style.UiKitTheme_Transparent);
        this.S = w.y0(new k8e.a(this, inputData, 2));
        this.T = w.y0(new jj2.a(this, 28));
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (k8k.b) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.profile_card.BaseProfileCardScreen
    public final fpa.e d3() {
        return (k8k.b) this.T.getValue();
    }

    @Override // com.revolut.feature.profile_card.BaseProfileCardScreen
    /* JADX INFO: renamed from: e3 */
    public final boolean getP() {
        return false;
    }
}
