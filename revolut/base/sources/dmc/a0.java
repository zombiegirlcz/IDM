package dmc;

import com.revolut.feature.robo.impl.ui.screen.risk_metrics.RiskMetricsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 implements mnc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f115915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseScreen f115916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RiskMetricsScreenContract$InputData f115917c;

    public a0(r rVar) {
        this.f115915a = rVar;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        this.f115916b = baseScreen;
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        vc.s.h(this.f115916b, BaseScreen.class);
        vc.s.h(this.f115917c, RiskMetricsScreenContract$InputData.class);
        return new z(this.f115915a, this.f115916b, this.f115917c);
    }

    @Override // mnc.a
    public final mnc.a j0(RiskMetricsScreenContract$InputData riskMetricsScreenContract$InputData) {
        this.f115917c = riskMetricsScreenContract$InputData;
        return this;
    }
}
