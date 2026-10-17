package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pix.impl.flow.portability_details.screens.review.ReviewPortabilityInfoScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class a1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReviewPortabilityInfoScreenContract$InputData f233890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f233891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f233892c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f233893g;

    public a1(d0 d0Var, x0 x0Var, ViewController viewController, ReviewPortabilityInfoScreenContract$InputData reviewPortabilityInfoScreenContract$InputData) {
        this.f233891b = d0Var;
        this.f233890a = reviewPortabilityInfoScreenContract$InputData;
        this.f233892c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new m(d0Var, this, 2, 20));
        this.e = e4m.b.b(new m(d0Var, this, 1, 20));
        this.f = e4m.b.b(new m(d0Var, this, 0, 20));
        this.f233893g = e4m.b.b(new m(d0Var, this, 3, 20));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
