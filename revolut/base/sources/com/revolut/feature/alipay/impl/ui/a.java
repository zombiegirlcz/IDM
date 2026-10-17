package com.revolut.feature.alipay.impl.ui;

import com.revolut.feature.alipay.impl.ui.PaymentFlowContract$StartType;
import com.revolut.feature.alipay.impl.ui.PaymentFlowContract$Step;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.kompot.navigable.flow.FlowStep;
import d8l.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import sk1.b;
import tk1.c;
import yki.i;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {
    public final PaymentFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f61067p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ProductArticleParams f61068q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f61069r;

    public a(PaymentFlowContract$InputData inputData, c pendingPaymentExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pendingPaymentExtension, "pendingPaymentExtension");
        this.o = inputData;
        this.f61067p = pendingPaymentExtension;
        this.f61068q = new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(AlipayArticles.ONBOARDING));
        this.f61069r = d.a(this, new scl.h(this, 12));
    }

    @Override // yki.j
    public final void M0() {
        FlowStep confirmation;
        PaymentFlowContract$StartType paymentFlowContract$StartType = this.o.f61062a;
        if (paymentFlowContract$StartType instanceof PaymentFlowContract$StartType.PendingPayment) {
            confirmation = new PaymentFlowContract$Step.Confirmation(((PaymentFlowContract$StartType.PendingPayment) paymentFlowContract$StartType).f61063a);
        } else {
            if (paymentFlowContract$StartType != null) {
                throw new NoWhenBranchMatchedException();
            }
            confirmation = PaymentFlowContract$Step.QR.f61066a;
        }
        h.t2(this, this.f61069r, confirmation, false, null, false, 12);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f61069r;
    }
}
