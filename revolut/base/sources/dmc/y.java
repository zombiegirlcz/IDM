package dmc;

import com.revolut.feature.robo.impl.ui.screen.risk_metrics.RiskMetricsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class y implements mnc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f116103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f116104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f116105c;
    public RiskMetricsScreenContract$InputData d;

    public y(r rVar, i iVar) {
        this.f116103a = rVar;
        this.f116104b = iVar;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        this.f116105c = baseScreen;
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        vc.s.h(this.f116105c, BaseScreen.class);
        vc.s.h(this.d, RiskMetricsScreenContract$InputData.class);
        return new z(this.f116103a, this.f116104b, this.f116105c, this.d);
    }

    @Override // mnc.a
    public final mnc.a j0(RiskMetricsScreenContract$InputData riskMetricsScreenContract$InputData) {
        this.d = riskMetricsScreenContract$InputData;
        return this;
    }
}
