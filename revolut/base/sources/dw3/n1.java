package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.intro.CreditOfferTypeSelectionScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class n1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditOfferTypeSelectionScreenContract$InputData f119322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f119323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f119324c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119326h;

    public n1(c1 c1Var, q4 q4Var, ViewController viewController, CreditOfferTypeSelectionScreenContract$InputData creditOfferTypeSelectionScreenContract$InputData) {
        this.f119322a = creditOfferTypeSelectionScreenContract$InputData;
        this.f119323b = e4m.b.b(e4m.c.a(viewController));
        h1 h1Var = new h1(q4Var, this, 1, 4);
        this.f119324c = h1Var;
        this.d = e4m.b.b(h1Var);
        this.e = e4m.b.b(new h1(q4Var, this, 0, 4));
        this.f = e4m.b.b(this.f119324c);
        this.f119325g = e4m.b.b(new h1(q4Var, this, 3, 4));
        this.f119326h = e4m.b.b(new h1(q4Var, this, 2, 4));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
