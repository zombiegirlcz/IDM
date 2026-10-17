package eh9;

import com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import com.revolut.feature.transfer.core.models.FundingSource;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FundingSource f125802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h1j.d f125803c;

    public /* synthetic */ y(FundingSource fundingSource, h1j.d dVar, int i) {
        this.f125801a = i;
        this.f125802b = fundingSource;
        this.f125803c = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f125801a) {
            case 0:
                return PaymentData.e((PaymentData) obj2, this.f125802b, 0L, null, this.f125803c.f148582c, 54);
            case 1:
                jh9.f fVar = (jh9.f) obj2;
                PaymentData paymentData = fVar.f174161b;
                if (paymentData == null) {
                    return fVar;
                }
                return jh9.f.a(fVar, PaymentData.e(paymentData, this.f125802b, 0L, null, this.f125803c.f148582c, 54), null, null, 13);
            case 2:
                return BizumTransferData.e((BizumTransferData) obj2, this.f125802b, 0L, this.f125803c.f148582c, null, 26);
            default:
                return TransferData.e((TransferData) obj2, this.f125802b, 0L, this.f125803c.f148582c, null, null, null, null, 246);
        }
    }
}
