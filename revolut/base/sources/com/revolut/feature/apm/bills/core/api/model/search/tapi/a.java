package com.revolut.feature.apm.bills.core.api.model.search.tapi;

import com.revolut.feature.apm.bills.core.api.model.search.tapi.BillSearchTapiResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {
    public static final boolean a(BillSearchTapiResult billSearchTapiResult) {
        Intrinsics.checkNotNullParameter(billSearchTapiResult, "<this>");
        BillSearchTapiResult.PaymentMethodDetails paymentMethodDetails = billSearchTapiResult.i;
        return (paymentMethodDetails != null ? paymentMethodDetails.f61457c : null) == xo1.a.OPEN || billSearchTapiResult.f61451b.f115082a == 0;
    }
}
