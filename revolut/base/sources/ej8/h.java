package ej8;

import cli.y;
import com.revolut.feature.junior_payment_links.api.model.PaymentLinkCustomAmountBundle;
import com.revolut.feature.junior_payment_links.impl.ui.screen.custom_amount.JuniorPaymentLinkCustomAmountScreenContract$Input;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends oki.h implements dli.b {
    public final w80.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n60.a f126785p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f126786q;

    public h(j mapper, JuniorPaymentLinkCustomAmountScreenContract$Input input, w80.b amountFormatter, n60.a keyboardExtension) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        this.o = amountFormatter;
        this.f126785p = keyboardExtension;
        PaymentLinkCustomAmountBundle paymentLinkCustomAmountBundle = input.f77096a;
        this.f126786q = mra.d.b(this, new f(paymentLinkCustomAmountBundle.f77073a, paymentLinkCustomAmountBundle.f77074b), mapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f126786q;
    }
}
