package d8k;

import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends gim.c {
    public PaymentLinksTransferData u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f112286w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f112287x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, gim.c cVar) {
        super(cVar);
        this.f112286w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f112287x |= Integer.MIN_VALUE;
        return this.f112286w.a(this);
    }
}
