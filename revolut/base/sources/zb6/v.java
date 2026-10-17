package zb6;

import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        PaymentMethod.Pocket pocket;
        dj0.d dVar;
        Data data = (Data) obj2;
        com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a aVar = (com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a) this.receiver;
        aVar.getClass();
        od0.i iVar = (od0.i) data.getContent();
        aVar.H2(aVar.z, new yrk.e((iVar == null || (pocket = (PaymentMethod.Pocket) iVar.f224257a) == null || (dVar = pocket.i) == null) ? null : dVar.f115083b, 13, aVar, data));
        return Unit.f186387a;
    }
}
