package zxb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev_points.impl.ui.challenges.details.RevPointsChallengeDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsChallengeDetailsScreenContract$InputData f326149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f326150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f326151c;
    public final e4m.e d;

    public g(e eVar, RevPointsChallengeDetailsScreenContract$InputData revPointsChallengeDetailsScreenContract$InputData) {
        this.f326149a = revPointsChallengeDetailsScreenContract$InputData;
        this.f326150b = e4m.b.b(new zpc.m(eVar, this, 1, 26));
        this.f326151c = e4m.b.b(new zpc.m(eVar, this, 0, 26));
        this.d = e4m.b.b(new zpc.m(eVar, this, 2, 26));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f326151c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
