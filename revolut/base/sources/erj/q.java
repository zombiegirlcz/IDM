package erj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.overview.GoalsOverviewScreenContract$InputData;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements vrj.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f128735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f128736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GoalsOverviewScreenContract$InputData f128737c;

    public q(h hVar) {
        this.f128735a = hVar;
    }

    @Override // vrj.b
    public final vrj.b K(GoalsOverviewScreenContract$InputData goalsOverviewScreenContract$InputData) {
        this.f128737c = goalsOverviewScreenContract$InputData;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f128736b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        s.h(this.f128736b, ViewController.class);
        s.h(this.f128737c, GoalsOverviewScreenContract$InputData.class);
        return new p(this.f128735a, this.f128737c);
    }
}
