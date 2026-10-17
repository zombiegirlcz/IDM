package a8k;

import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import java.io.Serializable;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f2278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f2279c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2280g;

    public c(FlowCollector flowCollector, OrderQuote orderQuote, long j2, d dVar, PaymentLinksTransferData paymentLinksTransferData, PaymentPocketInfo paymentPocketInfo) {
        this.f2277a = 0;
        this.f2278b = flowCollector;
        this.d = orderQuote;
        this.f2279c = j2;
        this.e = dVar;
        this.f = paymentLinksTransferData;
        this.f2280g = paymentPocketInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instruction units count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a8k.c.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ c(FlowCollector flowCollector, Object obj2, Object obj3, Object obj4, long j2, Serializable serializable, int i) {
        this.f2277a = i;
        this.f2278b = flowCollector;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.f2279c = j2;
        this.f2280g = serializable;
    }
}
