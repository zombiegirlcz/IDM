package whc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.rev_points_earned.RentAndBillsRevPointsEarnedScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class w implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RentAndBillsRevPointsEarnedScreenContract$InputData f297605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f297606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f297607c;
    public final e4m.e d;

    public w(z zVar, ViewController viewController, RentAndBillsRevPointsEarnedScreenContract$InputData rentAndBillsRevPointsEarnedScreenContract$InputData) {
        this.f297605a = rentAndBillsRevPointsEarnedScreenContract$InputData;
        this.f297606b = e4m.b.b(e4m.c.a(viewController));
        int i = 2;
        this.f297607c = e4m.b.b(new t(zVar, this, 0, i));
        this.d = e4m.b.b(new t(zVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f297607c.get());
    }
}
