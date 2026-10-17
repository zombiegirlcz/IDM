package vtc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.TransactionsDayNightLimitsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class z implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionsDayNightLimitsScreenContract$InputData f292097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f292098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f292099c;

    public z(t tVar, TransactionsDayNightLimitsScreenContract$InputData transactionsDayNightLimitsScreenContract$InputData) {
        this.f292098b = tVar;
        this.f292097a = transactionsDayNightLimitsScreenContract$InputData;
        this.f292099c = e4m.b.b(new n(tVar, this, 2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
