package qw7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_home.impl.ui.screen.product_summary.InsuranceProductSummaryScreenContract$InputData;
import java.util.Set;
import ql7.v1;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsuranceProductSummaryScreenContract$InputData f249819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f249820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f249821c;

    public g(e eVar, InsuranceProductSummaryScreenContract$InputData insuranceProductSummaryScreenContract$InputData) {
        this.f249819a = insuranceProductSummaryScreenContract$InputData;
        int i = 21;
        this.f249820b = e4m.b.b(new v1(eVar, this, 1, i));
        this.f249821c = e4m.b.b(new v1(eVar, this, 0, i));
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
