package a31;

import com.revolut.data.network.models.recurringpayment.RecurringPaymentListDto;
import kotlin.jvm.internal.h0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class u extends h0 {
    public static final u f = new u();

    public u() {
        super(RecurringPaymentListDto.class, "recurringPayments", "getRecurringPayments()Ljava/util/List;", 0);
    }

    @Override // kotlin.jvm.internal.h0, wim.p
    public final Object get(Object obj2) {
        return ((RecurringPaymentListDto) obj2).getRecurringPayments();
    }
}
