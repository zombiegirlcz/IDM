package dmc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.robo.impl.ui.screen.risk_metrics.RiskMetricsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class z implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116106a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RiskMetricsScreenContract$InputData f116107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f116108c;
    public final e4m.e d;
    public final e4m.e e;

    public z(r rVar, i iVar, BaseScreen baseScreen, RiskMetricsScreenContract$InputData riskMetricsScreenContract$InputData) {
        this.f116107b = riskMetricsScreenContract$InputData;
        this.f116108c = e4m.b.b(new db1.f(rVar, this, 1, 29));
        this.d = e4m.b.b(e4m.c.a(baseScreen));
        this.e = e4m.b.b(new db1.f(rVar, this, 0, 29));
    }

    public final lnc.d d() {
        switch (this.f116106a) {
        }
        return (lnc.d) this.e.get();
    }

    @Override // sji.b
    public final Set f() {
        switch (this.f116106a) {
        }
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        switch (this.f116106a) {
        }
        return ImmutableSet.of();
    }

    public z(r rVar, BaseScreen baseScreen, RiskMetricsScreenContract$InputData riskMetricsScreenContract$InputData) {
        this.f116107b = riskMetricsScreenContract$InputData;
        this.f116108c = e4m.b.b(new b0(rVar, this, 1, 0));
        this.d = e4m.b.b(e4m.c.a(baseScreen));
        this.e = e4m.b.b(new b0(rVar, this, 0, 0));
    }
}
