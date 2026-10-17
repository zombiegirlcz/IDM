package com.revolut.feature.retail.restaurants.impl.domain.model;

import com.revolut.feature.retail.restaurants.impl.domain.model.Reservation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f {
    public static final boolean a(Reservation.Guarantee guarantee) {
        Intrinsics.checkNotNullParameter(guarantee, "<this>");
        Reservation.Guarantee.Order order = guarantee.f82823c;
        b bVar = guarantee.f82821a;
        c cVar = guarantee.f82822b;
        if (order != null && order.f82824a != a.UNKNOWN && order.f82825b != null) {
            Intrinsics.checkNotNullParameter(guarantee, "<this>");
            c cVar2 = c.DEPOSIT;
            if (cVar == cVar2 && bVar == b.PENDING) {
                Intrinsics.checkNotNullParameter(guarantee, "<this>");
                if (cVar == cVar2) {
                    Reservation.Guarantee.Order order2 = guarantee.f82823c;
                    String str = order2 != null ? order2.f82826c : null;
                    if (str != null && !d0.W(str)) {
                        return true;
                    }
                }
                return false;
            }
            Intrinsics.checkNotNullParameter(guarantee, "<this>");
            c cVar3 = c.CANCELLATION_FEES;
            if (cVar == cVar3 && bVar == b.PENDING) {
                return true;
            }
            Intrinsics.checkNotNullParameter(guarantee, "<this>");
            if (cVar == cVar3 && bVar == b.ACTIVE) {
                return true;
            }
        }
        return false;
    }
}
