package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods_info.SigningMethodsInfoScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class m6 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SigningMethodsInfoScreenContract$InputData f119292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f119293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f119294c;
    public final g5 d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119296h;

    public m6(c1 c1Var, h4 h4Var, ViewController viewController, SigningMethodsInfoScreenContract$InputData signingMethodsInfoScreenContract$InputData) {
        this.f119293b = c1Var;
        this.f119292a = signingMethodsInfoScreenContract$InputData;
        this.f119294c = e4m.b.b(e4m.c.a(viewController));
        g5 g5Var = new g5(h4Var, this, 1, 14);
        this.d = g5Var;
        this.e = e4m.b.b(g5Var);
        this.f = e4m.b.b(new g5(h4Var, this, 0, 14));
        this.f119295g = e4m.b.b(this.d);
        this.f119296h = e4m.b.b(new g5(h4Var, this, 2, 14));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119295g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
