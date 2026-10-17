package nk7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance.impl.ui.cfac.claim.review_claim.CFACInsuranceReviewClaimScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACInsuranceReviewClaimScreenContract$InputData f216731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f216732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f216733c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f216734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f216735h;

    public v(q qVar, j jVar, BaseScreen baseScreen, CFACInsuranceReviewClaimScreenContract$InputData cFACInsuranceReviewClaimScreenContract$InputData) {
        this.f216732b = qVar;
        this.f216731a = cFACInsuranceReviewClaimScreenContract$InputData;
        this.f216733c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 5;
        this.d = e4m.b.b(new ned.h(qVar, jVar, this, 2, i));
        this.e = e4m.b.b(new ned.h(qVar, jVar, this, 1, i));
        this.f = e4m.b.b(new ned.h(qVar, jVar, this, 0, i));
        this.f216734g = e4m.b.b(new ned.h(qVar, jVar, this, 4, i));
        this.f216735h = e4m.b.b(new ned.h(qVar, jVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
