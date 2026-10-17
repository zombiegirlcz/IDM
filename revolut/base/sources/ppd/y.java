package ppd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.CustomPeriodSelectContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomPeriodSelectContract$InputData f238577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f238578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f238579c;

    public y(n nVar, l lVar, CustomPeriodSelectContract$InputData customPeriodSelectContract$InputData) {
        this.f238577a = customPeriodSelectContract$InputData;
        this.f238578b = e4m.b.b(new j(nVar, lVar, this, 1, 2));
        this.f238579c = e4m.b.b(new j(nVar, lVar, this, 0, 2));
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
