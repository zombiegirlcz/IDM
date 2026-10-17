package a8k;

import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends gim.c {
    public PaymentLinksTransferData u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f2274w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2275x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, gim.c cVar) {
        super(cVar);
        this.f2274w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f2275x |= Integer.MIN_VALUE;
        return this.f2274w.Z2(null, this);
    }
}
