package p8k;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements urf.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PaymentLinksTransferData f234170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f234171b;

    public i(PaymentLinksTransferData paymentLinksTransferData, d dVar) {
        this.f234170a = paymentLinksTransferData;
        this.f234171b = dVar;
    }

    @Override // urf.e
    public final urf.c a() {
        PaymentLinksTransferData paymentLinksTransferData = this.f234170a;
        return new urf.c(new Data(new urf.d(new dj0.d(100L, paymentLinksTransferData.f102235b), this.f234171b.f234163b), null, paymentLinksTransferData.f102234a == 0, 2, null), paymentLinksTransferData.f102234a, paymentLinksTransferData.f102235b);
    }
}
