package iwb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev_points.giftcards.api.navigation.descriptor.RevPointsGiftcardsCheckoutController$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsGiftcardsCheckoutController$InputData f169009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f169010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f169011c;
    public final e4m.e d;
    public final e4m.e e;

    public c(e eVar, RevPointsGiftcardsCheckoutController$InputData revPointsGiftcardsCheckoutController$InputData) {
        this.f169009a = revPointsGiftcardsCheckoutController$InputData;
        int i = 0;
        this.f169010b = e4m.b.b(new b(eVar, this, 1, i));
        this.f169011c = e4m.b.b(new b(eVar, this, 0, i));
        this.d = e4m.b.b(new b(eVar, this, 3, i));
        this.e = e4m.b.b(new b(eVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f169011c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
