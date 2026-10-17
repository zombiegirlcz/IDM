package nh9;

import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public PaymentData u;
    public xo1.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f215380w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f215381x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f215382y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f215381x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f215380w = obj2;
        this.f215382y |= Integer.MIN_VALUE;
        return this.f215381x.Z2(null, null, this);
    }
}
