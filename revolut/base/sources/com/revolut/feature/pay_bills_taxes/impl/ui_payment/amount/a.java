package com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount;

import com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountContract$InputData;
import gim.c;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends c {
    public PaymentAmountContract$InputData.NewTransfer u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f78773w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f78774x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f78775y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f78774x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f78773w = obj2;
        this.f78775y |= Integer.MIN_VALUE;
        return this.f78774x.a(null, this);
    }
}
