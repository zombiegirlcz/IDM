package jn4;

import il4.b;
import il4.c;
import il4.d;
import il4.e;
import il4.f;
import il4.g;
import in4.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class a {
    public static final g a(in4.a aVar) {
        il4.a aVar2;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        a.C0931a cashback = aVar.getCashback();
        d dVar = null;
        if (cashback != null) {
            a.b defaultCashback = cashback.getDefaultCashback();
            b bVar = new b(defaultCashback.getOfferId(), defaultCashback.getCashbackPocketId(), defaultCashback.getStartDate(), defaultCashback.getEndDate(), defaultCashback.getDisbursalDate(), defaultCashback.getRate(), mo3.a.o(defaultCashback.getEarnsCap()));
            a.d welcomePromo = cashback.getWelcomePromo();
            e eVar = welcomePromo != null ? new e(welcomePromo.getOfferId(), welcomePromo.getCashbackPocketId(), welcomePromo.getStartDate(), welcomePromo.getEndDate(), welcomePromo.getDisbursalDate(), welcomePromo.getRate(), mo3.a.o(welcomePromo.getEarnsCap()), welcomePromo.getPeriodOfMonth(), mo3.a.o(welcomePromo.getSpendsCap())) : null;
            a.e xmasPromo = cashback.getXmasPromo();
            aVar2 = new il4.a(bVar, eVar, xmasPromo != null ? new f(xmasPromo.getCategoryPocketId(), xmasPromo.getPromoPocketId(), xmasPromo.getCategoryRate(), xmasPromo.getPromoRate(), xmasPromo.getDefaultRate(), xmasPromo.getStartDate(), xmasPromo.getEndDate(), xmasPromo.getDisbursalDate(), mo3.a.o(xmasPromo.getCategoryEarnsCap()), mo3.a.o(xmasPromo.getPromoEarnsCap())) : null);
        } else {
            aVar2 = null;
        }
        a.c rewards = aVar.getRewards();
        if (rewards != null) {
            a.c.C0932a spendXEarnY = rewards.getSpendXEarnY();
            dVar = new d(spendXEarnY != null ? new c(spendXEarnY.getStartDate(), spendXEarnY.getEndDate(), spendXEarnY.getDisbursalDate(), mo3.a.o(spendXEarnY.getTotalSpends()), mo3.a.o(spendXEarnY.getTargetSpends()), mo3.a.o(spendXEarnY.getReward())) : null);
        }
        return new g(aVar2, dVar);
    }
}
