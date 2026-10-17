package z0g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.experiences.impl.ui.screen.past_and_cancelled.TravelExperiencesPastAndCancelledScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesPastAndCancelledScreenContract$InputData f318400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f318401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f318402c;

    public l(b bVar, j jVar, TravelExperiencesPastAndCancelledScreenContract$InputData travelExperiencesPastAndCancelledScreenContract$InputData) {
        this.f318400a = travelExperiencesPastAndCancelledScreenContract$InputData;
        int i = 13;
        this.f318401b = e4m.b.b(new yre.a(bVar, this, 1, i));
        this.f318402c = e4m.b.b(new yre.a(bVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
