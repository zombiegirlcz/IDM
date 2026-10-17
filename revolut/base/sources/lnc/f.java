package lnc;

import com.revolut.feature.robo.impl.ui.screen.risk_metrics.RiskMetricsScreenContract$InputData;
import jki.i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends jki.g implements d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RiskMetricsScreenContract$InputData f197143p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final emc.e f197144q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final onc.c f197145r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final pnc.c f197146s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f197147t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g mapper, RiskMetricsScreenContract$InputData input, emc.e templatesInteractor, onc.c performanceWidgetScreenModelDelegate, pnc.c riskWidgetScreenModelDelegate) {
        super(mapper);
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(performanceWidgetScreenModelDelegate, "performanceWidgetScreenModelDelegate");
        Intrinsics.checkNotNullParameter(riskWidgetScreenModelDelegate, "riskWidgetScreenModelDelegate");
        this.f197143p = input;
        this.f197144q = templatesInteractor;
        this.f197145r = performanceWidgetScreenModelDelegate;
        this.f197146s = riskWidgetScreenModelDelegate;
        this.f197147t = new c(null);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.f197144q.d(this.f197143p.f85194a.f95706a), null, null, new le8.d(this, (Continuation) null, 24), 3);
    }

    @Override // jki.g
    public final i r2() {
        return this.f197147t;
    }
}
