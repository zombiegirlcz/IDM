package zxb;

import com.revolut.feature.rev_points.impl.ui.transactions.details.RevPointsTransactionDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class i0 implements o0c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f326165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f326166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RevPointsTransactionDetailsScreenContract$InputData f326167c;

    public i0(e eVar) {
        this.f326165a = eVar;
    }

    @Override // o0c.a
    public final o0c.a D(RevPointsTransactionDetailsScreenContract$InputData revPointsTransactionDetailsScreenContract$InputData) {
        revPointsTransactionDetailsScreenContract$InputData.getClass();
        this.f326167c = revPointsTransactionDetailsScreenContract$InputData;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f326166b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f326166b, ViewController.class);
        vc.s.h(this.f326167c, RevPointsTransactionDetailsScreenContract$InputData.class);
        return new h0(this.f326165a, this.f326166b, this.f326167c);
    }
}
