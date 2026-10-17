package lvd;

import com.revolut.feature.staking.api.model.StakingInfo;
import com.revolut.feature.staking.api.model.StakingInterestRate;
import com.revolut.feature.staking.api.model.StakingModes;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import nwd.c;
import nwd.d;
import xi0.b;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static StakingModes a(d dVar) {
        StakingModes.Manual manual;
        c manual2 = dVar.getModes().getManual();
        StakingModes.Auto auto = null;
        if (manual2 != null) {
            BigDecimal rate = manual2.getRate();
            long warmUpPeriod = manual2.getWarmUpPeriod();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            manual = new StakingModes.Manual(rate, (int) timeUnit.toDays(warmUpPeriod), (int) timeUnit.toDays(manual2.getLockupPeriod()), (int) timeUnit.toDays(manual2.getPayoutPeriod()), mo3.a.o(manual2.getMinimumStakingAmount()), mo3.a.o(manual2.getMinimumTopupAmount()), mo3.a.o(manual2.getMaximumStakingAmount()), mo3.a.o(manual2.getMinimumWithdrawAmount()));
        } else {
            manual = null;
        }
        nwd.a auto2 = dVar.getModes().getAuto();
        if (auto2 != null) {
            BigDecimal rate2 = auto2.getRate();
            long warmUpPeriod2 = auto2.getWarmUpPeriod();
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            auto = new StakingModes.Auto(rate2, (int) timeUnit2.toDays(warmUpPeriod2), (int) timeUnit2.toDays(auto2.getPayoutPeriod()), auto2.getConsent());
        }
        return new StakingModes(manual, auto);
    }

    public static StakingInfo b(d dVar) {
        c manual = dVar.getModes().getManual();
        if (manual != null) {
            String id10 = dVar.getId();
            BigDecimal rate = manual.getRate();
            xi0.a aVar = b.Companion;
            String currency = dVar.getCurrency();
            aVar.getClass();
            StakingInterestRate stakingInterestRate = new StakingInterestRate(id10, rate, xi0.a.a(currency), vtd.a.APY);
            long warmUpPeriod = manual.getWarmUpPeriod();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return new StakingInfo(stakingInterestRate, (int) timeUnit.toDays(warmUpPeriod), (int) timeUnit.toDays(manual.getLockupPeriod()), (int) timeUnit.toDays(manual.getPayoutPeriod()), mo3.a.o(manual.getMinimumTopupAmount()), mo3.a.o(manual.getMinimumStakingAmount()), mo3.a.o(manual.getMinimumWithdrawAmount()), mo3.a.o(manual.getMaximumStakingAmount()), true, false, vtd.b.MANUAL, f0.f322471a, false);
        }
        nwd.a auto = dVar.getModes().getAuto();
        if (auto == null) {
            throw new IllegalArgumentException("At least one mode type must be present");
        }
        String id11 = dVar.getId();
        BigDecimal rate2 = auto.getRate();
        xi0.a aVar2 = b.Companion;
        String currency2 = dVar.getCurrency();
        aVar2.getClass();
        StakingInterestRate stakingInterestRate2 = new StakingInterestRate(id11, rate2, xi0.a.a(currency2), vtd.a.APY);
        long warmUpPeriod2 = auto.getWarmUpPeriod();
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        int days = (int) timeUnit2.toDays(warmUpPeriod2);
        int days2 = (int) timeUnit2.toDays(auto.getPayoutPeriod());
        dj0.d.Companion.getClass();
        dj0.d dVar2 = dj0.d.e;
        return new StakingInfo(stakingInterestRate2, days, 0, days2, dVar2, dVar2, dVar2, dVar2, false, false, vtd.b.AUTO, f0.f322471a, auto.getConsent());
    }
}
