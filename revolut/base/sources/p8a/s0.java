package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pix.impl.flow.refund.screen.review.PixRefundReviewScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class s0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixRefundReviewScreenContract$InputData f234081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f234082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234083c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f234084g;

    public s0(d0 d0Var, r0 r0Var, ViewController viewController, PixRefundReviewScreenContract$InputData pixRefundReviewScreenContract$InputData) {
        this.f234081a = pixRefundReviewScreenContract$InputData;
        this.f234082b = e4m.b.b(e4m.c.a(viewController));
        this.f234083c = e4m.b.b(new m(d0Var, this, 2, 14));
        this.d = e4m.b.b(new m(d0Var, this, 1, 14));
        this.e = e4m.b.b(new m(d0Var, this, 0, 14));
        this.f = e4m.b.b(new m(d0Var, this, 4, 14));
        this.f234084g = e4m.b.b(new m(d0Var, this, 3, 14));
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
