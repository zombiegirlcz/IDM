package com.revolut.feature.retail.restaurants.impl.domain.model;

import com.revolut.feature.retail.restaurants.impl.domain.model.Reservation;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e {
    public static final xdb.c a(Reservation.Guarantee guarantee, int i) {
        dj0.d dVar;
        Reservation.Guarantee.Order order = guarantee.f82823c;
        if (order == null || (dVar = order.f82825b) == null || i <= 0 || order.f82824a == a.UNKNOWN) {
            return null;
        }
        return new xdb.c(i, dj0.d.c(dVar, BigDecimal.valueOf(dVar.f115082a).divide(BigDecimal.valueOf(i), 0, RoundingMode.HALF_EVEN).longValueExact(), null, 2), dVar);
    }
}
