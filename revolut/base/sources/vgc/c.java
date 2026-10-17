package vgc;

import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.c {
    public RentAndBillsLinkedPayments.Category.LinkedPayment u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f288817w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f288818x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f288817w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f288818x |= Integer.MIN_VALUE;
        return this.f288817w.a(null, null, this);
    }
}
