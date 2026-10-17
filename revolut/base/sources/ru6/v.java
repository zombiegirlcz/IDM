package ru6;

import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderPayment;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((AcquiringOrderPayment) obj2).d, ((AcquiringOrderPayment) obj3).d);
    }
}
