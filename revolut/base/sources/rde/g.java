package rde;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.support.impl.transfer_tracker.ui.estimation_result.TransferTrackerEstimationResultScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import r7d.o;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferTrackerEstimationResultScreenContract$InputData f253429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f253430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f253431c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f253432g;

    public g(h hVar, ViewController viewController, TransferTrackerEstimationResultScreenContract$InputData transferTrackerEstimationResultScreenContract$InputData) {
        this.f253429a = transferTrackerEstimationResultScreenContract$InputData;
        this.f253430b = e4m.b.b(e4m.c.a(viewController));
        int i = 5;
        this.f253431c = e4m.b.b(new o(hVar, this, 2, i));
        this.d = e4m.b.b(new o(hVar, this, 1, i));
        this.e = e4m.b.b(new o(hVar, this, 0, i));
        this.f = e4m.b.b(new o(hVar, this, 4, i));
        this.f253432g = e4m.b.b(new o(hVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
