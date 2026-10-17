package zxb;

import com.revolut.feature.rev_points.impl.ui.transactions.details.RevPointsTransactionDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class g0 implements o0c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f326152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f326153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f326154c;
    public RevPointsTransactionDetailsScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ g0(e eVar, Object obj2, int i) {
        this.f326152a = i;
        this.f326153b = eVar;
        this.e = obj2;
    }

    @Override // o0c.a
    public final o0c.a D(RevPointsTransactionDetailsScreenContract$InputData revPointsTransactionDetailsScreenContract$InputData) {
        switch (this.f326152a) {
            case 0:
                revPointsTransactionDetailsScreenContract$InputData.getClass();
                this.d = revPointsTransactionDetailsScreenContract$InputData;
                break;
            default:
                revPointsTransactionDetailsScreenContract$InputData.getClass();
                this.d = revPointsTransactionDetailsScreenContract$InputData;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f326152a) {
            case 0:
                this.f326154c = viewController;
                break;
            default:
                this.f326154c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f326152a) {
            case 0:
                vc.s.h(this.f326154c, ViewController.class);
                vc.s.h(this.d, RevPointsTransactionDetailsScreenContract$InputData.class);
                return new h0(this.f326153b, (m) this.e, this.f326154c, this.d);
            default:
                vc.s.h(this.f326154c, ViewController.class);
                vc.s.h(this.d, RevPointsTransactionDetailsScreenContract$InputData.class);
                return new h0(this.f326153b, (f0) this.e, this.f326154c, this.d);
        }
    }
}
