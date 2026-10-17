package com.youTransactor.uCube.payment.task;

import com.youTransactor.uCube.ITask;
import com.youTransactor.uCube.payment.PaymentContext;

/* JADX INFO: loaded from: classes17.dex */
public interface IPaymentTask extends ITask {
    PaymentContext getContext();

    void setContext(PaymentContext paymentContext);
}
