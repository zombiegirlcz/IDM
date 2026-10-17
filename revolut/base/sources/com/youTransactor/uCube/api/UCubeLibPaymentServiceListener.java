package com.youTransactor.uCube.api;

import com.youTransactor.uCube.payment.PaymentContext;
import com.youTransactor.uCube.payment.PaymentState;

/* JADX INFO: loaded from: classes17.dex */
public interface UCubeLibPaymentServiceListener {
    void onFinish(PaymentContext paymentContext);

    void onProgress(PaymentState paymentState, PaymentContext paymentContext);
}
