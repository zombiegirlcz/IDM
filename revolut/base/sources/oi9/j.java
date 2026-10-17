package oi9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements xj9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayLaterKompotFeatureConfig.PaymentBreakdownNavigationDestination.InputData f225525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f225526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f225527c;

    public j(f fVar, PayLaterKompotFeatureConfig.PaymentBreakdownNavigationDestination.InputData inputData) {
        this.f225525a = inputData;
        this.f225526b = e4m.b.b(new i(fVar, this, 1));
        this.f225527c = e4m.b.b(new i(fVar, this, 0));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
