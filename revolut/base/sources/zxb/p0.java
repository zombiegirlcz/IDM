package zxb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev_points.api.navigation.terms.RevPointsTermsReviewInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class p0 implements xki.c, m0c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsTermsReviewInputData f326240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f326241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f326242c = this;
    public final e4m.e d;

    public p0(o0 o0Var, RevPointsTermsReviewInputData revPointsTermsReviewInputData) {
        this.f326241b = o0Var;
        this.f326240a = revPointsTermsReviewInputData;
        this.d = e4m.b.b(new zu8.r(o0Var, this, 22));
    }

    @Override // m0c.b
    public final m0c.a b() {
        return new q0(this.f326241b, this.f326242c);
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
