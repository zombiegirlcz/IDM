package l1l;

import com.revolut.feature.payments.api.PaymentsToggles$PaymentsKillSwitch;
import com.revolut.feature.transfer.models.quotes.TransferAvailability;
import com.revolut.feature_exchange.api.ExchangeApi$Toggles$CurrencyPairKillswitch;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements yqi.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f191583b;

    public h(gte.a featureToggleInteractor, int i) {
        this.f191582a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                this.f191583b = featureToggleInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                this.f191583b = featureToggleInteractor;
                break;
        }
    }

    public yqi.d a(g validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        if (((jte.d) this.f191583b).c(ExchangeApi$Toggles$CurrencyPairKillswitch.f96817c) && Intrinsics.f(validationData.f191581a, Boolean.FALSE)) {
            return new yqi.d(validationData, u.c(i1l.f.f157648a));
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    public yqi.d b(p validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        TransferAvailability transferAvailability = validationData.f191592a;
        if (((jte.d) this.f191583b).c(PaymentsToggles$PaymentsKillSwitch.f79159c)) {
            if ((transferAvailability != null ? transferAvailability.f92276a : null) == nrf.b.UNAVAILABLE) {
                return new yqi.d(validationData, u.c(new i1l.i(transferAvailability.f92277b)));
            }
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ yqi.d validate(Object obj2) {
        switch (this.f191582a) {
            case 0:
                return a((g) obj2);
            default:
                return b((p) obj2);
        }
    }
}
