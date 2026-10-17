package ir8;

import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderRate;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements srf.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168013a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final srf.b f168014b;

    public c(j jVar) {
        long j2 = jVar.f168018a;
        long j3 = jVar.f168019b;
        xi0.b bVar = jVar.f168020c;
        xi0.b bVar2 = jVar.d;
        h1l.a aVar = h1l.b.Companion;
        aVar.getClass();
        lrf.a aVar2 = h1l.a.f148609b;
        double d = aVar2.f199511a;
        aVar.getClass();
        this.f168014b = new srf.b(j2, j3, bVar, bVar2, d, aVar2.e);
    }

    @Override // srf.c
    public final srf.b b() {
        switch (this.f168013a) {
        }
        return this.f168014b;
    }

    public c(PaymentLinksTransferData paymentLinksTransferData, long j2, OrderQuote orderQuote) {
        OrderRate orderRate;
        BigDecimal bigDecimal;
        this.f168014b = new srf.b(paymentLinksTransferData.f102234a, j2, paymentLinksTransferData.d.f92241b, paymentLinksTransferData.f102235b, (orderQuote == null || (orderRate = orderQuote.f104757j) == null || (bigDecimal = orderRate.f104793b) == null) ? 0.0d : bigDecimal.doubleValue(), paymentLinksTransferData.f102234a);
    }
}
