package ms1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.bizum.impl.ui.transfer.review.BizumTransferReviewContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class u implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BizumTransferReviewContract$InputData f208597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f208598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f208599c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f208600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f208601h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f208602j;

    public u(j jVar, t tVar, BaseScreen baseScreen, BizumTransferReviewContract$InputData bizumTransferReviewContract$InputData) {
        this.f208598b = jVar;
        this.f208597a = bizumTransferReviewContract$InputData;
        this.f208599c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 26;
        this.d = e4m.b.b(new ld1.q(jVar, tVar, this, 2, i));
        this.e = e4m.b.b(new ld1.q(jVar, tVar, this, 1, i));
        this.f = e4m.b.b(new ld1.q(jVar, tVar, this, 0, i));
        this.f208600g = e4m.b.b(new ld1.q(jVar, tVar, this, 4, i));
        this.f208601h = e4m.b.b(new ld1.q(jVar, tVar, this, 3, i));
        this.i = e4m.b.b(new ld1.q(jVar, tVar, this, 6, i));
        this.f208602j = e4m.b.b(new ld1.q(jVar, tVar, this, 5, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f208601h.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
