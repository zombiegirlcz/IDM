package erj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.overview.GoalsOverviewScreenContract$InputData;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements vrj.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f128729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f128730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f128731c;
    public GoalsOverviewScreenContract$InputData d;

    public o(h hVar, i iVar) {
        this.f128729a = hVar;
        this.f128730b = iVar;
    }

    @Override // vrj.b
    public final vrj.b K(GoalsOverviewScreenContract$InputData goalsOverviewScreenContract$InputData) {
        this.d = goalsOverviewScreenContract$InputData;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f128731c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        s.h(this.f128731c, ViewController.class);
        s.h(this.d, GoalsOverviewScreenContract$InputData.class);
        return new p(this.f128729a, this.f128730b, this.d);
    }
}
